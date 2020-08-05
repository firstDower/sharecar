package com.dower.sharerideapp.service.payment;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.dower.sharerideapp.core.serverdb.dao.*;
import com.dower.sharerideapp.core.serverdb.model.*;
import com.dower.sharerideapp.domain.config.weixin.WeixinConfig;
import com.dower.sharerideapp.domain.config.weixin.sdk.MyConfig;
import com.dower.sharerideapp.domain.config.weixin.sdk.WXPay;
import com.dower.sharerideapp.domain.config.weixin.sdk.WXPayConstants;
import com.dower.sharerideapp.domain.config.weixin.sdk.WXPayUtil;
import com.dower.sharerideapp.service.clothing.ClothingNewService;
import com.dower.sharerideapp.service.exception.MyException;
import com.dower.sharerideapp.utils.DateUtils;
import com.dower.sharerideapp.utils.ret.RetResponse;
import com.dower.sharerideapp.utils.ret.RetResult;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by wangwei on 2020/7/27.
 */
@Slf4j
@Service
public class PaymentService {
    @Autowired
    WeixinConfig weixinConfig;
    @Autowired
    private ClProductMapper clProductMapper;
    @Autowired
    private NntUserinfoMapper nntUserinfoMapper;
    @Autowired
    private NntUserCouponsMapper nntUserCouponsMapper;
    @Autowired
    private PaymentOrderRecordMapper paymentOrderRecordMapper;
    @Autowired
    private NntUserBalanceChangeRecodeMapper nntUserBalanceChangeRecodeMapper;
    @Autowired
    private PaymentFlowMapper paymentFlowMapper;
    @Autowired
    private NntPlatformCouponMapper nntPlatformCouponMapper;
    @Autowired
    private ClothingNewService clothingNewService;
    /**
     * 微信支付预支付通用接口
     * 1.订单id  numOrderId
     * 2.用户id  numUserId
     * 3.商品金额  numTotalFee
     * 4.实付金额  numCashFee
     * 5.优惠金额  numDiscountFee
     * 6.余额抵扣金额  useBalance
     * 7.优惠券id      useCouponId
     * 8.团购id       useGroupBuyId
     * 9.砍价id       useBargainId
     * 10.订单编号  vcOrderNo
     * @param jsonparams
     * @return
     */
    @Transactional(rollbackFor = {Exception.class, Error.class})
    public RetResult weichatPayment(JSONObject jsonparams){
        try {
            //获取订单详情
            RetResult clothing = clothingNewService.getClothing(jsonparams);
            //订单支付状态
            /**
             * 一.待支付状态,
             * 1.调取订单预支付接口生产预支付单
             * 2.调取微信统一下单接口
             * 3.生成微信支付流水
             * 4.更新订单状态为预支付状态
             * 二.预支付状态
             * 1.调取微信统一下单接口
             */
            if(clothing.code==200) {
                ClProduct cloth = (ClProduct) clothing.getData();
                Byte numPayState = cloth.getNumPayState();
                jsonparams.put("vcOrderNo",cloth.getVcOrderNo());
                jsonparams.put("numPayState",numPayState);
                if (numPayState == 1) {//待支付
                    RetResult retResult = this.AdvancePayment(jsonparams);
                    if (retResult.code==200){
                        long numCashFee = jsonparams.getLongValue("numCashFee");
                        if(numCashFee==0){
                            return this.updataPaymentResult(jsonparams);
                        }else{
                            return this.weiChatUnifiedOrder(jsonparams);
                        }
                    }else {
                        return retResult;
                    }
                } else if (numPayState == 2) {//预支付
                    //查询微信支付所需要的数据
                    RetResult perPaymentData = this.getPerPaymentData(jsonparams);
                    if(perPaymentData.code==200){
                        return this.weiChatUnifiedOrder(jsonparams);
                    }else {
                        return perPaymentData;
                    }
                } else {
                    throw new MyException("订单状态异常，支付失败！");
                }
            }else {
                return clothing;
            }
        }catch (Exception e){
            e.printStackTrace();
            throw e;
        }
    }

    /**
     * 微信预支付service
     * params
     * 1.是否使用余额  useBalance 0:不使用；或者使用金额；
     * 2.使用优惠券id  useCouponId  0:不使用；或者对应优惠券id
     * 3.团购记录id （验证团购）useGroupBuyId   0:没有；或者团购id
     * 4.砍价记录id  （验证砍价，修改状态未结束砍价） useBargainId 0:没有；或者砍价记录id
     *
     *1.订单id  numOrderId
     * 2.用户id  numUserId
     * 3.商品金额  numTotalFee
     * 4.实付金额  numCashFee
     * 5.优惠金额  numDiscountFee
     * 6.余额抵扣金额  useBalance
     * 7.优惠券id      useCouponId
     * 8.团购id       useGroupBuyId
     * 9.砍价id       useBargainId
     * 流程
     * 1.查询订单支付数据
     * 2.验证余额
     * 3.验证优惠券
     * 4.验证团购
     * 5.验证砍价
     *
     * @return
     */
    public RetResult AdvancePayment(JSONObject jsonparams){
        try{
            JSONObject resultJson = new JSONObject();

            //1.查询订单支付数据（这一步不用）
            log.info("微信预支付service，param：：{}",jsonparams);
            //RetResult orderPaymentData = this.getOrderPaymentData(jsonparams);
            //2.验证余额
            long useBalance = jsonparams.getLong("useBalance");
            if(useBalance!=0){
                RetResult retResultcheckUseBalance = this.checkUseBalance(jsonparams);
                if(retResultcheckUseBalance.code!=200){
                    return retResultcheckUseBalance;
                }else {
                    resultJson.put("useBalance",useBalance);
                }
            }
            //3.验证优惠券
            long useCouponId = jsonparams.getLong("useCouponId");
            if(useCouponId!=0){
                RetResult retResultCheckUseCoupon = this.checkUseCoupon(jsonparams);
                if(retResultCheckUseCoupon.code!=200){
                    return retResultCheckUseCoupon;
                }else {
                    long numDiscountNumber = Long.parseLong(retResultCheckUseCoupon.getData().toString());
                    resultJson.put("numDiscountNumber",numDiscountNumber);
                }
            }else {
                resultJson.put("numDiscountNumber",0);
            }
            //4.验证团购
            //5.验证砍价

            //*验证后台优惠金额和页面传参的优惠金额是否匹配
            RetResult retResult = this.checkOrderFee(jsonparams, resultJson);
            if(retResult.code!=200){
                return retResult;
            }
            //6.锁定余额
            if(useBalance!=0){
                RetResult lockUseBalance = this.lockUseBalance(jsonparams);
                if(lockUseBalance.code==200){
                    NntUserBalanceChangeRecode nntUserBalanceChangeRecode = (NntUserBalanceChangeRecode) lockUseBalance.getData();
                    jsonparams.put("numUserMoneyLogId",nntUserBalanceChangeRecode.getNumId());
                }else {
                    return lockUseBalance;
                }
            }else {
                jsonparams.put("numUserMoneyLogId",0);
            }

            //7.锁定优惠券
            if(useCouponId!=0){
                RetResult lockUseCoupon = this.lockUseCoupon(jsonparams);
                if(lockUseCoupon.code!=200){
                    return lockUseCoupon;
                }
            }

            //8.订单支付记录表生产预支付单
            RetResult paymentOrderRecord = this.createPaymentOrderRecord(jsonparams);
            if(paymentOrderRecord.code!=200){
                return paymentOrderRecord;
            }

            //9.正确返回，去支付
            return RetResponse.makeOKRsp();
        }catch (Exception e){
            e.printStackTrace();
            throw e;
        }
    }

    /**
     * params
     * 1.订单id  numOrderId
     * 2.用户id  numUserId
     * 3.余额抵扣金额  useBalance
     * 4.余额日志 id
     * 5.优惠券id      useCouponId
     * 6.团购id       useGroupBuyId
     * 7.砍价id       useBargainId
     * 8.openId  openId
     *
     * 获取订单支付数据
     * 1.查询订单商品金额
     * 2.查询用户余额
     * 3.查询用户可用优惠券
     * 4.查询是否有订单团购记录(暂无)
     * 5.查询是否有砍价记录(暂无)
     * @return
     */
    public RetResult getOrderPaymentData(JSONObject jsonparams){
        try{
            log.info("获取订单支付数据service，param：：{}",jsonparams);
            //1.查询订单商品金额金额
            Map<String,Object> param = new HashMap<>();
            param.put("numId",jsonparams.getString("numId"));
            ClProduct clProduct = clProductMapper.selectByPrimaryKey(jsonparams.getLong("numId"));
            long numPrice = clProduct.getNumPrice();
            //2.查询用户余额
            NntUserinfoExample nntUserinfoExample = new NntUserinfoExample();
            NntUserinfoExample.Criteria criteria = nntUserinfoExample.createCriteria();
            criteria.andNumUserIdEqualTo(jsonparams.getString("numUserId"));
            List<NntUserinfo> nntUserinfos = nntUserinfoMapper.selectByExample(nntUserinfoExample);
            NntUserinfo nntUserinfo = nntUserinfos.get(0);
            long numUserMoney = nntUserinfo.getNumUserMoney();
            //3.查询用户可用优惠券
            NntUserCouponsExample nntUserCouponsExample = new NntUserCouponsExample();
            NntUserCouponsExample.Criteria criteria1 = nntUserCouponsExample.createCriteria();
            criteria1.andNumUserIdEqualTo(jsonparams.getString("numUserId"));
            List<NntUserCoupons> nntUserCoupons = nntUserCouponsMapper.selectByExample(nntUserCouponsExample);
            //4.查询团购记录
            //5.查询砍价记录
            Map result = new HashMap();
            result.put("numPrice",numPrice);
            result.put("numUserMoney",numUserMoney);
            result.put("nntUserCoupons",nntUserCoupons);
            return RetResponse.makeOKRsp(result);
        }catch (Exception e){
            e.printStackTrace();
            throw new MyException("获取订单支付数据异常！");
        }
    }

    /**
     * 更新支付结果service
     * params
     *  vcOrderNo  订单编号
     *  transaction_id  微信交易流水号
     * @return
     */
    @Transactional(rollbackFor = {Exception.class, Error.class})
    public RetResult updataPaymentResult(JSONObject params){
        try{
            PaymentOrderRecordExample example = new PaymentOrderRecordExample();
            PaymentOrderRecordExample.Criteria criteria2 = example.createCriteria();
            criteria2.andVcOrderNoEqualTo(params.getString("vcOrderNo"));
            List<PaymentOrderRecord> paymentOrderRecords = paymentOrderRecordMapper.selectByExample(example);
            if(paymentOrderRecords.size()==1){
                PaymentOrderRecord paymentOrderRecord = paymentOrderRecords.get(0);
                Byte numPayState = paymentOrderRecord.getNumPayState();
                if(numPayState==1){
                    //1.更新微信支付流水
                    PaymentFlow record = new PaymentFlow();
                    record.setVcTransactionId(params.getString("transaction_id"));
                    record.setNumPayState(Byte.parseByte("2"));
                    //int i = paymentFlowMapper.updateByPrimaryKeySelective(record);
                    //** 流水的id没有放到 订单支付记录id
                    //改为根据订单号更新
                    PaymentFlowExample examplePaymentFlowExample = new PaymentFlowExample();
                    PaymentFlowExample.Criteria criteriaPaymentFlowExample = examplePaymentFlowExample.createCriteria();
                    criteriaPaymentFlowExample.andVcOrderNoEqualTo(params.getString("vcOrderNo"));
                    int i = paymentFlowMapper.updateByExampleSelective(record,examplePaymentFlowExample);
                    log.info("支付回调，更新支付流水结果：：{}",i);
                    //2.更新余额变动日志表
                    long numUserMoneyLogId = paymentOrderRecord.getNumUserMoneyLogId();
                    if(numUserMoneyLogId>0){
                        NntUserBalanceChangeRecode record1 = new NntUserBalanceChangeRecode();
                        record1.setNumId(paymentOrderRecord.getNumUserMoneyLogId());
                        record1.setNumMoneyState(Byte.parseByte("2"));
                        nntUserBalanceChangeRecodeMapper.updateByPrimaryKeySelective(record1);
                    }
                    //3.更新优惠券状态
                    long numUserCouponId = paymentOrderRecord.getNumUserCouponId();
                    if(numUserCouponId!=0){
                        NntUserCoupons recordNntUserCoupons = new NntUserCoupons();
                        recordNntUserCoupons.setNumId(numUserCouponId);
                        recordNntUserCoupons.setNumState(Byte.parseByte("3"));
                        nntUserCouponsMapper.updateByPrimaryKeySelective(recordNntUserCoupons);
                    }
                    //4.根据vcoderno,更新支付状态
                    //修改订单状态
                    ClProduct recordClProduct = new ClProduct();
                    recordClProduct.setNumPayState(Byte.parseByte("3"));
                    ClProductExample exampleClProductExample = new ClProductExample();
                    ClProductExample.Criteria criteriaClProductExample = exampleClProductExample.createCriteria();
                    criteriaClProductExample.andVcOrderNoEqualTo(params.getString("vcOrderNo"));
                    int i1 = clProductMapper.updateByExampleSelective(recordClProduct, exampleClProductExample);
                    //5.更新订单支付记录表
                    PaymentOrderRecord recordupdateByPrimaryKeySelective = new PaymentOrderRecord();
                    recordupdateByPrimaryKeySelective.setNumId(paymentOrderRecord.getNumId());
                    recordupdateByPrimaryKeySelective.setNumPayState(Byte.parseByte("2"));
                    paymentOrderRecordMapper.updateByPrimaryKeySelective(recordupdateByPrimaryKeySelective);
                    return RetResponse.makeOKRsp("支付结果入库成功！");
                }else {
                    throw new MyException("微信支付结果更新服务，该订单数据已经更新过！");
                }
            }else {
                throw new MyException("微信支付结果更新服务，数据异常！");
            }

        }catch (Exception e){
            e.printStackTrace();
            throw new MyException("支付结果入库异常！");
        }
    }

    /**
     * 检验余额是否合格
     * @return
     */
    public RetResult checkUseBalance(JSONObject params){
        try{
            //1.查询订单支付数据
            log.info("微信预支付service，param：：{}",params);
            NntUserinfoExample nntUserinfoExample = new NntUserinfoExample();
            NntUserinfoExample.Criteria criteria = nntUserinfoExample.createCriteria();
            criteria.andNumUserIdEqualTo(params.getString("numUserId"));
            List<NntUserinfo> nntUserinfos = nntUserinfoMapper.selectByExample(nntUserinfoExample);
            NntUserinfo nntUserinfo = nntUserinfos.get(0);
            long numUserMoney = nntUserinfo.getNumUserMoney();
            long useBalance = params.getLong("useBalance");
            if(useBalance<=numUserMoney){
                return RetResponse.makeOKRsp();
            }else {
                throw new MyException("余额验证失败！");
            }

        }catch (Exception e){
            e.printStackTrace();
            throw new MyException("余额验证异常！");
        }
    }

    /**
     * 检验优惠券是否合格
     * @return
     */
    public RetResult checkUseCoupon(JSONObject params){
        try{
            //1.查询订单支付数据
            log.info("检验优惠券是否合格service，param：：{}",params);
            NntUserCouponsExample nntUserCouponsExample = new NntUserCouponsExample();
            NntUserCouponsExample.Criteria criteria1 = nntUserCouponsExample.createCriteria();
            criteria1.andNumUserIdEqualTo(params.getString("numUserId"));
            criteria1.andNumIdEqualTo(params.getLong("useCouponId"));
            List<NntUserCoupons> nntUserCoupons = nntUserCouponsMapper.selectByExample(nntUserCouponsExample);
            if(nntUserCoupons.size()==1){
                NntUserCoupons nntUserCoupons1 = nntUserCoupons.get(0);
                //时间不需要验证
                Date datEndDate = nntUserCoupons1.getDatEndDate();
                Byte numState = nntUserCoupons1.getNumState();
                long numPlatformCouponId = nntUserCoupons1.getNumPlatformCouponId();
                if(numState==1){
                    NntPlatformCoupon nntPlatformCoupon = nntPlatformCouponMapper.selectByPrimaryKey(numPlatformCouponId);
                    Integer numDiscountNumber = nntPlatformCoupon.getNumDiscountNumber();
                    Integer numLimitPrice = nntPlatformCoupon.getNumLimitPrice();
                    Integer numTotalFee = params.getInteger("numTotalFee");
                    if(numTotalFee>=numLimitPrice){
                        return RetResponse.makeOKRsp(numDiscountNumber);
                    }else {
                        throw new MyException("优惠券不可用！");
                    }

                }else if(numState==2){
                    throw new MyException("优惠券验证失败！");
                }else if(numState==3){
                    throw new MyException("优惠券已使用！");
                }else {
                    throw new MyException("优惠券已过期！");
                }
                //之后可能有优惠券相关商品验证
            }else {
                throw new MyException("优惠券验证失败！");
            }

        }catch (Exception e){
            e.printStackTrace();
            throw new MyException("优惠券验证失败！");
        }
    }

    /**
     * 检验支付价格是否正确
     * @return
     */
    public RetResult checkOrderFee(JSONObject params,JSONObject selfSerPar){
        try{
            //1.查询订单支付数据
            log.info("检验支付价格是否正确service，param：：{};selfSerPar::{}",params,selfSerPar);
            //余额
            //long useBalance = selfSerPar.getLong("useBalance");
            long useBalance = params.getLong("useBalance");
            //优惠券减免
            long numDiscountNumber = selfSerPar.getLong("numDiscountNumber");
            //商品总价
            long numTotalFee = params.getLong("numTotalFee");
            //支付价格
            long numCashFee = params.getLong("numCashFee");
            //减免金额
            long numDiscountFee =  params.getLong("numDiscountFee");
            //优惠金额=优惠券减免
            if(numDiscountFee==numDiscountNumber){
                //商品总价-余额-优惠券减免=支付金额
                if(numTotalFee-useBalance-numDiscountNumber==numCashFee){
                    return RetResponse.makeOKRsp();
                }else{
                    throw new MyException("实际支付金额有误！");
                }
            }else {
                throw new MyException("优惠券减免金额有误！");
            }

        }catch (Exception e){
            e.printStackTrace();
            throw new MyException("检验支付价格是否正确异常！");
        }
    }

    /**
     * 用户余额锁定
     * @return
     */
    public RetResult lockUseBalance(JSONObject params){
        try{
            //1.用户余额减去待使用余额
            NntUserinfoExample nntUserinfoExample = new NntUserinfoExample();
            NntUserinfoExample.Criteria criteria = nntUserinfoExample.createCriteria();
            criteria.andNumUserIdEqualTo(params.getString("numUserId"));
            List<NntUserinfo> nntUserinfos = nntUserinfoMapper.selectByExample(nntUserinfoExample);
            NntUserinfo nntUserinfo1 = nntUserinfos.get(0);
            NntUserinfo nntUserinfo = new NntUserinfo();
            nntUserinfo.setNumUserinfoId(nntUserinfo1.getNumUserinfoId());
            nntUserinfo.setNumUserMoney(nntUserinfo1.getNumUserMoney()-params.getLong("useBalance"));
            int i = nntUserinfoMapper.updateByPrimaryKeySelective(nntUserinfo);
            //2.用户余额变动日志表插入记录
            NntUserBalanceChangeRecode nntUserBalanceChangeRecode = new NntUserBalanceChangeRecode();
            nntUserBalanceChangeRecode.setDatCreateTime(new Date());
            nntUserBalanceChangeRecode.setNumAmount(params.getLong("useBalance"));
            nntUserBalanceChangeRecode.setNumOrderNo(params.getString("vcOrderNo"));
            nntUserBalanceChangeRecode.setNumUserBalanceId(params.getString("numUserId"));
            nntUserBalanceChangeRecode.setNumSourceType(Byte.valueOf("1"));//下单支付;2:退货
            nntUserBalanceChangeRecode.setNumMoneyState(Byte.valueOf("1"));
            int insert = nntUserBalanceChangeRecodeMapper.insertSelective(nntUserBalanceChangeRecode);
            return RetResponse.makeOKRsp(nntUserBalanceChangeRecode);
        }catch (Exception e){
            e.printStackTrace();
            throw new MyException("余额锁定异常！");
        }
    }

    /**
     * 用户优惠券锁定
     * @return
     */
    public RetResult lockUseCoupon(JSONObject params){
        try{
            //1.用户优惠券锁定
            NntUserCoupons record = new NntUserCoupons();
            record.setNumId(params.getLong("useCouponId"));
            record.setNumState(Byte.parseByte("2"));
            int i = nntUserCouponsMapper.updateByPrimaryKeySelective(record);
            if(i==1){
                return RetResponse.makeOKRsp();
            }else {
                throw new MyException("用户优惠券锁定异常！");
            }
        }catch (Exception e){
            e.printStackTrace();
            throw new MyException("用户优惠券锁定异常！");
        }
    }

    /**
     * 订单支付记录表生成预支付单
     * @return
     */
    public RetResult createPaymentOrderRecord(JSONObject params){
        try{
            //1.查询订单支付数据
            log.info("订单支付记录表生成预支付单service，param：：{}",params);
            PaymentOrderRecord record = new PaymentOrderRecord();
            //创建时间
            record.setDatCreatTime(new Date());
            //订单编号
            record.setVcOrderNo(params.getString("vcOrderNo"));
            //用户余额变动记录id
            record.setNumUserMoneyLogId(params.getLong("numUserMoneyLogId"));
            record.setNumUserCouponId(params.getLong("useCouponId"));
            record.setNumPayState(Byte.parseByte("1"));
            int insert = paymentOrderRecordMapper.insertSelective(record);
            return RetResponse.makeOKRsp(record);
        }catch (Exception e){
            e.printStackTrace();
            throw new MyException("订单支付记录表生成预支付单异常！");
        }
    }

    /**
     * 获取预支付数据
     * @param params
     * @return
     */
    public RetResult getPerPaymentData(JSONObject params){
        try{
            log.info("微信获取预支付数据service，param：：{}",params);
            //商品总价
            long numTotalFee = params.getLong("numTotalFee");
            //支付价格
            long numCashFee = params.getLong("numCashFee");
            //减免金额
            long numDiscountFee =  params.getLong("numDiscountFee");
            long useBalance =  params.getLong("useBalance");
            if (numCashFee+numDiscountFee+useBalance == numTotalFee){
                return RetResponse.makeOKRsp();
            }else {
                throw new MyException("订单支付金额异常！");
            }

        }catch (Exception e){
            e.printStackTrace();
            throw new MyException("后台生成微信支付流水异常！");
        }
    }

    /**
     * 后台生成微信支付流水
     * @param params
     * @return
     */
    public RetResult createPaymentFlow(JSONObject params){
        try{
            log.info("微信预支付service，param：：{}",params);
            PaymentFlow paymentFlow = new PaymentFlow();
            paymentFlow.setDatCreatTime(new Date());
            paymentFlow.setNumCashFee(params.getLong("numCashFee"));
            paymentFlow.setNumPayState(Byte.parseByte("1"));
            paymentFlow.setNumTotalFee(params.getLong("numCashFee"));
            paymentFlow.setVcBankType("WEIXIN");
            paymentFlow.setVcMchId(params.getString("mchId"));
            paymentFlow.setVcOpenid(params.getString("openId"));
            //预支付交易会话标识   微信统一下单返回
            //paymentFlow.setVcTransactionId(params.getString("prepay_id"));
            paymentFlow.setVcOrderNo(params.getString("vcOrderNo"));
            //过期时间
            paymentFlow.setVcExpireTime(params.getString("time_expire"));
            int i = paymentFlowMapper.insertSelective(paymentFlow);
            long numPaymentFlowId = paymentFlow.getNumId();
            params.put("numPaymentFlowId",numPaymentFlowId);
            return RetResponse.makeOKRsp(paymentFlow);
        }catch (Exception e){
            e.printStackTrace();
            throw new MyException("后台生成微信支付流水异常！");
        }
    }

    /**
     * 微信统一下单
     * @param params
     * @return
     */
    public RetResult weiChatUnifiedOrder(JSONObject params){

        try{
            Map<String, String> resultMap = new HashMap<String, String>();
            log.info("微信统一下单service，param：：{}",params);

            MyConfig config = new MyConfig();
            if(params.containsKey("appId")&& StringUtils.isNotBlank(params.getString("appId"))){
                config.setAppId(params.getString("appId"));
            }
            WXPay wxpay = new WXPay(config);




            /**
             * 微信支付需要参数
             * 1.订单编号  vcOrderNo
             * 2.实际支付金额  numCashFee
             * 3.微信支付（页面传过来）  openId
             * 4.微信支付订单失效时间  timeExpire
             */
            String vcOrderNo = params.getString("vcOrderNo");
            String numCashFee = params.getString("numCashFee");
            String openId = params.getString("openId");
            Byte numPayState = params.getByte("numPayState");
            Map<String, String> data = new HashMap<String, String>();
            data.put("body", weixinConfig.body);
            data.put("out_trade_no", vcOrderNo);
            data.put("fee_type", weixinConfig.feeType);
            data.put("total_fee", numCashFee);
            //data.put("total_fee", "1");
            data.put("spbill_create_ip", weixinConfig.spbillCreateIp);
            data.put("notify_url", weixinConfig.notifyrl);
            data.put("trade_type", weixinConfig.tradeType);  // 此处指定为公众号支付
            data.put("openid", openId);


            if(numPayState==1){
                //待支付插入支付过期时间
                String expireTime = DateUtils.getExpireTime();
                data.put("time_expire", expireTime);

                params.put("time_expire", expireTime);
                params.put("mchId",config.getMchID());
                RetResult paymentFlow = this.createPaymentFlow(params);
                if(paymentFlow.code!=200){
                    return paymentFlow;
                }
            }
            //附加数据
            JSONObject attach = new JSONObject();
            attach.put("numUserId",params.getString("numUserId"));
            attach.put("useBalance",params.getString("useBalance"));
            attach.put("useCouponId",params.getString("useCouponId"));
            attach.put("useGroupBuyId",params.getString("useGroupBuyId"));
            attach.put("useBargainId",params.getString("useBargainId"));
            attach.put("numPaymentFlowId",params.getString("numPaymentFlowId"));
            //data.put("attach",attach.toJSONString());
            Map<String, String> unifiedOrder = wxpay.unifiedOrder(data);
            log.info("微信支付模拟resultMap:：{}",JSONObject.toJSON(unifiedOrder) );
            //return RetResponse.makeOKRsp();
            if(unifiedOrder.containsKey("return_code")){
                String return_code = String.valueOf(unifiedOrder.get("return_code"));
                if ("SUCCESS".equals(return_code)){
                    String result_code = String.valueOf(unifiedOrder.get("result_code"));
                    if ("SUCCESS".equals(result_code)){
                        //生成微信支付流水
                        if(numPayState==1){
                            //修改订单状态
                            JSONObject updOrderParam = new JSONObject();
                            updOrderParam.put("NUM_ID",params.getString("numOrderId"));
                            updOrderParam.put("NUM_PAY_STATE",2);
                            RetResult retResult = clothingNewService.updateProduct(updOrderParam);
                            if(retResult.code==200){
                            }else {
                                return retResult;
                            }
                        }
                        resultMap.put("appId",config.getAppID());
                        resultMap.put("nonceStr", WXPayUtil.generateNonceStr());
                        resultMap.put("timeStamp",System.currentTimeMillis()/1000+"");
                        resultMap.put("package", "prepay_id="+unifiedOrder.get("prepay_id"));
                        resultMap.put("signType", "HMAC-SHA256");
                        resultMap.put("paySign",  WXPayUtil.generateSignature(resultMap, config.getKey(), WXPayConstants.SignType.HMACSHA256));
                        log.info("微信支付统一下单返回结果：：{}", JSON.toJSONString(resultMap));
                        return RetResponse.makeOKRsp(resultMap);

                    }else {
                        throw new MyException(String.valueOf(unifiedOrder.get("err_code_des")));
                    }
                }else {
                    throw new MyException(String.valueOf(unifiedOrder.get("return_msg")));
                }
            }else {
                throw new MyException("微信支付统一下单接口异常！");
            }
        }catch (Exception e){
            e.printStackTrace();
            throw new MyException("微信统一下单异常！");
        }
    }

    /**
     * 取消订单更新
     * params
     *  vcOrderNo  订单编号
     *  transaction_id  微信交易流水号
     * @return
     */
    @Transactional(rollbackFor = {Exception.class, Error.class})
    public RetResult updataOrderStatusResult(JSONObject params){
        try{

            //4.根据vcoderno,更新支付状态
            //修改订单状态   4，取消支付
            ClProduct recordClProduct = new ClProduct();
            recordClProduct.setNumPayState(Byte.parseByte("4"));
            recordClProduct.setNumState(Byte.parseByte("3"));
            ClProductExample exampleClProductExample = new ClProductExample();
            ClProductExample.Criteria criteriaClProductExample = exampleClProductExample.createCriteria();
            criteriaClProductExample.andVcOrderNoEqualTo(params.getString("vcOrderNo"));
            int i1 = clProductMapper.updateByExampleSelective(recordClProduct, exampleClProductExample);
            //获取订单用户no
            List<ClProduct> clProducts = clProductMapper.selectByExample(exampleClProductExample);
            ClProduct clProduct = clProducts.get(0);
            log.info("取消订单更新订单状态");
            PaymentOrderRecordExample example = new PaymentOrderRecordExample();
            PaymentOrderRecordExample.Criteria criteria2 = example.createCriteria();
            criteria2.andVcOrderNoEqualTo(params.getString("vcOrderNo"));
            List<PaymentOrderRecord> paymentOrderRecords = paymentOrderRecordMapper.selectByExample(example);
            if(paymentOrderRecords.size()==1){
                PaymentOrderRecord paymentOrderRecord = paymentOrderRecords.get(0);
                Byte numPayState = paymentOrderRecord.getNumPayState();
                if(numPayState==1){

                    //1.更新微信支付流水
                    PaymentFlow record = new PaymentFlow();
                    record.setVcTransactionId(params.getString("transaction_id"));
                    record.setNumPayState(Byte.parseByte("3"));
                    //int i = paymentFlowMapper.updateByPrimaryKeySelective(record);
                    //** 流水的id没有放到 订单支付记录id
                    //改为根据订单号更新
                    PaymentFlowExample examplePaymentFlowExample = new PaymentFlowExample();
                    PaymentFlowExample.Criteria criteriaPaymentFlowExample = examplePaymentFlowExample.createCriteria();
                    criteriaPaymentFlowExample.andVcOrderNoEqualTo(params.getString("vcOrderNo"));
                    int i = paymentFlowMapper.updateByExampleSelective(record,examplePaymentFlowExample);
                    log.info("支付回调，更新支付流水结果：：{}",i);
                    //2.更新余额变动日志表
                    long numUserMoneyLogId = paymentOrderRecord.getNumUserMoneyLogId();
                    if(numUserMoneyLogId>0){
                        NntUserBalanceChangeRecode record1 = new NntUserBalanceChangeRecode();
                        record1.setNumId(numUserMoneyLogId);
                        record1.setNumMoneyState(Byte.parseByte("3"));
                        nntUserBalanceChangeRecodeMapper.updateByPrimaryKeySelective(record1);
                        String vcUserId = clProduct.getVcUserId();
                        NntUserBalanceChangeRecode nntUserBalanceChangeRecode = nntUserBalanceChangeRecodeMapper.selectByPrimaryKey(numUserMoneyLogId);
                        Long numAmount = nntUserBalanceChangeRecode.getNumAmount();
                        //1.用户余额减去待使用余额
                        NntUserinfoExample nntUserinfoExample = new NntUserinfoExample();
                        NntUserinfoExample.Criteria criteria = nntUserinfoExample.createCriteria();
                        criteria.andNumUserIdEqualTo(vcUserId);
                        List<NntUserinfo> nntUserinfos = nntUserinfoMapper.selectByExample(nntUserinfoExample);
                        NntUserinfo nntUserinfo1 = nntUserinfos.get(0);
                        NntUserinfo nntUserinfo = new NntUserinfo();
                        nntUserinfo.setNumUserinfoId(nntUserinfo1.getNumUserinfoId());
                        nntUserinfo.setNumUserMoney(nntUserinfo1.getNumUserMoney()+numAmount);
                        nntUserinfoMapper.updateByPrimaryKeySelective(nntUserinfo);
                        log.info("取消订单，更新余额变动，变动前余额{}，变动余额{}，变动后余额{}",nntUserinfo1.getNumUserMoney(),numAmount,nntUserinfo1.getNumUserMoney()+numAmount);
                    }
                    //3.更新优惠券状态
                    long numUserCouponId = paymentOrderRecord.getNumUserCouponId();
                    if(numUserCouponId!=0){
                        NntUserCoupons recordNntUserCoupons = new NntUserCoupons();
                        recordNntUserCoupons.setNumId(numUserCouponId);
                        recordNntUserCoupons.setNumState(Byte.parseByte("1"));
                        nntUserCouponsMapper.updateByPrimaryKeySelective(recordNntUserCoupons);
                    }

                    //5.更新订单支付记录表
                    PaymentOrderRecord recordupdateByPrimaryKeySelective = new PaymentOrderRecord();
                    recordupdateByPrimaryKeySelective.setNumId(paymentOrderRecord.getNumId());
                    recordupdateByPrimaryKeySelective.setNumPayState(Byte.parseByte("3"));
                    paymentOrderRecordMapper.updateByPrimaryKeySelective(recordupdateByPrimaryKeySelective);
                    return RetResponse.makeOKRsp("支付结果入库成功！");
                }else {
                    throw new MyException("微信支付结果更新服务，该订单数据已经更新过！");
                }
            }else {
                log.info("取消订单：：没有支付记录！");
                return RetResponse.makeOKRsp("取消订单成功！");
            }

        }catch (Exception e){
            e.printStackTrace();
            throw new MyException("支付结果入库异常！");
        }
    }
}
