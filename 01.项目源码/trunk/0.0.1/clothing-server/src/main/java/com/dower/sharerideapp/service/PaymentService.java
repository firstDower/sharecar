package com.dower.sharerideapp.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.dower.sharerideapp.core.serverdb.dao.ClProductMapper;
import com.dower.sharerideapp.core.serverdb.dao.NntCarinfoMapper;
import com.dower.sharerideapp.core.serverdb.dao.NntUserCouponsMapper;
import com.dower.sharerideapp.core.serverdb.dao.NntUserinfoMapper;
import com.dower.sharerideapp.core.serverdb.model.*;
import com.dower.sharerideapp.service.clothing.ClothingService;
import com.dower.sharerideapp.utils.ret.RetResponse;
import com.dower.sharerideapp.utils.ret.RetResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
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
    /**
     * 微信预支付service
     * params
     * 1.是否使用余额  useBalance 1:使用；2，不使用；
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
}
