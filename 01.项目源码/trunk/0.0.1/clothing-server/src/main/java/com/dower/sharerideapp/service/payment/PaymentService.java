package com.dower.sharerideapp.service.payment;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.dower.sharerideapp.core.serverdb.dao.*;
import com.dower.sharerideapp.core.serverdb.model.*;
import com.dower.sharerideapp.service.clothing.ClothingService;
import com.dower.sharerideapp.utils.ret.RetResponse;
import com.dower.sharerideapp.utils.ret.RetResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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
    ClothingService clothingService;
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



    /**
     * 微信预支付service
     * params
     * 1.是否使用余额  useBalance 0:不使用；或者使用金额；
     * 2.使用优惠券id  useCouponId  0:不使用；或者对应优惠券id
     * 3.团购记录id （验证团购）useGroupBuyId   0:没有；或者团购id
     * 4.砍价记录id  （验证砍价，修改状态未结束砍价） useBargainId 0:没有；或者砍价记录id
     *
     * 流程
     * 1.查询订单支付数据
     * 2.验证余额
     * 3.验证优惠券
     * 4.验证团购
     * 5.验证砍价
     *
     * @return
     */
    public RetResult AdvancePayment(String params){
        try{
            JSONObject jsonparams = JSON.parseObject(params);
            //1.查询订单支付数据（这一步不用）
            log.info("微信预支付service，param：：{}",params);
            RetResult orderPaymentData = this.getOrderPaymentData(params);
            //2.验证余额
            Long useBalance = jsonparams.getLong("useBalance");
            if(useBalance!=0){
                RetResult retResultcheckUseBalance = this.checkUseBalance(jsonparams);
                if(retResultcheckUseBalance.code!=200){
                    return retResultcheckUseBalance;
                }
            }
            //3.验证优惠券
            Long useCouponId = jsonparams.getLong("useCouponId");
            if(useCouponId!=0){
                RetResult retResultcheckUseCoupon = this.checkUseCoupon(jsonparams);
                if(retResultcheckUseCoupon.code!=200){
                    return retResultcheckUseCoupon;
                }
            }
            //4.验证团购
            //5.验证砍价

            //*验证后台优惠金额和页面传参的优惠金额是否匹配

            //6.锁定余额
            RetResult lockUseBalance = this.lockUseBalance(jsonparams);
            if(lockUseBalance.code==200){
                NntUserBalanceChangeRecode nntUserBalanceChangeRecode = (NntUserBalanceChangeRecode) lockUseBalance.getData();
                jsonparams.put("numUserMoneyLogId",nntUserBalanceChangeRecode.getNumId());
            }else {
                return lockUseBalance;
            }
            //7.锁定优惠券
            RetResult lockUseCoupon = this.lockUseCoupon(jsonparams);
            if(lockUseCoupon.code!=200){
                return lockUseCoupon;
            }
            //8.订单支付记录表生产预支付单
            RetResult paymentOrderRecord = this.createPaymentOrderRecord(jsonparams);
            if(paymentOrderRecord.code!=200){
                return paymentOrderRecord;
            }
            //9.正确返回，去支付

        }catch (Exception e){
            e.printStackTrace();
        }


        return null;
    }

    /**
     * params
     * 1.订单id
     * 2.用户id
     *
     * 获取订单支付数据
     * 1.查询订单商品金额
     * 2.查询用户余额
     * 3.查询用户可用优惠券
     * 4.查询是否有订单团购记录(暂无)
     * 5.查询是否有砍价记录(暂无)
     * @return
     */
    public RetResult getOrderPaymentData(String params){
        try{
            log.info("获取订单支付数据service，param：：{}",params);
            JSONObject jsonparams = JSON.parseObject(params);
            //1.查询订单商品金额金额
            Map<String,Object> param = new HashMap<>();
            param.put("numId",jsonparams.getString("numId"));
            ClProduct clProduct = clProductMapper.selectByPrimaryKey(jsonparams.getLong("numId"));
            Long numPrice = clProduct.getNumPrice();
            //2.查询用户余额
            NntUserinfoExample nntUserinfoExample = new NntUserinfoExample();
            NntUserinfoExample.Criteria criteria = nntUserinfoExample.createCriteria();
            criteria.andNumUserIdEqualTo(jsonparams.getString("numUserId"));
            List<NntUserinfo> nntUserinfos = nntUserinfoMapper.selectByExample(nntUserinfoExample);
            NntUserinfo nntUserinfo = nntUserinfos.get(0);
            Long numUserMoney = nntUserinfo.getNumUserMoney();
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
            return RetResponse.makeErrRsp("获取订单支付数据异常！");
        }
    }

    /**
     * 更新支付结果service
     * params
     * 1.是否使用余额  useBalance 1:使用；2，不使用；
     * 2.使用优惠券id  useCouponId  0:不使用；或者对应优惠券id
     * 3.团购记录id （验证团购）useGroupBuyId   0:没有；或者团购id
     * 4.砍价记录id  （验证砍价，修改状态未结束砍价） useBargainId 0:没有；或者砍价记录id
     *
     * 流程
     * 1.添加银联支付流水记录
     * 2.添加订单支付详情记录
     * 3.更新锁定的余额日志表记录
     * 4.更新优惠券状态（锁定变为已使用）
     * 5.更新订单支付状态
     * 6.更新团购明细为已支付
     * 7.更新砍价明细为已支付
     * @return
     */
    public RetResult updataPaymentResult(String params){
        try{
            //1.查询订单支付数据
            log.info("微信预支付service，param：：{}",params);
            RetResult orderPaymentData = this.getOrderPaymentData(params);
            //2.验证余额
            //3.验证优惠券
            //4.验证团购
            //5.验证砍价
            //6.锁定余额
            //7.锁定优惠券
            //8.正确返回，去支付

        }catch (Exception e){
            e.printStackTrace();
        }


        return null;
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
            Long numUserMoney = nntUserinfo.getNumUserMoney();
            Long useBalance = params.getLong("useBalance");
            if(useBalance<=numUserMoney){
                return RetResponse.makeOKRsp();
            }else {
                return RetResponse.makeErrRsp("余额验证失败！");
            }

        }catch (Exception e){
            e.printStackTrace();
            return RetResponse.makeErrRsp("余额验证异常！");
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
                Date datEndDate = nntUserCoupons1.getDatEndDate();
                Byte numState = nntUserCoupons1.getNumState();
                Long numPlatformCouponId = nntUserCoupons1.getNumPlatformCouponId();
                if(numState==1){
                    return RetResponse.makeOKRsp();
                }else if(numState==2){
                    return RetResponse.makeErrRsp("优惠券验证失败！");
                }else if(numState==3){
                    return RetResponse.makeErrRsp("优惠券已使用！");
                }else {
                    return RetResponse.makeErrRsp("优惠券已过期！");
                }
                //之后可能有优惠券相关商品验证
            }else {
                return RetResponse.makeErrRsp("优惠券验证失败！");
            }

        }catch (Exception e){
            e.printStackTrace();
            return RetResponse.makeErrRsp("优惠券验证失败！");
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
            nntUserBalanceChangeRecode.setNumOrderNo(params.getLong("numOrderId"));
            nntUserBalanceChangeRecode.setNumUserBalanceId(params.getString("numUserId"));
            nntUserBalanceChangeRecode.setNumSourceType(Byte.valueOf("1"));//下单支付
            int insert = nntUserBalanceChangeRecodeMapper.insertSelective(nntUserBalanceChangeRecode);
            return RetResponse.makeOKRsp(nntUserBalanceChangeRecode);
        }catch (Exception e){
            e.printStackTrace();
            return RetResponse.makeErrRsp("余额锁定异常！");
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
                return RetResponse.makeErrRsp("用户优惠券锁定异常！");
            }
        }catch (Exception e){
            e.printStackTrace();
            return RetResponse.makeErrRsp("用户优惠券锁定异常！");
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
            return RetResponse.makeErrRsp("订单支付记录表生成预支付单异常！");
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
            paymentFlow.setNumTotalFee(params.getLong("numTotalFee"));
            paymentFlow.setVcBankType("WEIXIN");
            paymentFlow.setVcMchId(params.getString("vcMchId"));
            paymentFlow.setVcOpenid(params.getString("openId"));
            //预支付交易会话标识   微信统一下单返回
            paymentFlow.setVcTransactionId(params.getString("prepay_id"));
            paymentFlow.setVcOrderNo(params.getString("vcOrderNo"));
            //过期时间
            int i = paymentFlowMapper.insertSelective(paymentFlow);
            return RetResponse.makeOKRsp();
        }catch (Exception e){
            e.printStackTrace();
            return RetResponse.makeErrRsp("后台生成微信支付流水异常！");
        }
    }
}
