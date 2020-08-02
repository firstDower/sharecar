package com.dower.sharerideapp.service.payment;

import com.alibaba.fastjson.JSONObject;
import com.dower.sharerideapp.core.serverdb.dao.NntPlatformCouponMapper;
import com.dower.sharerideapp.core.serverdb.dao.NntUserCouponsMapper;
import com.dower.sharerideapp.core.serverdb.model.NntUserCoupons;
import com.dower.sharerideapp.service.exception.MyException;
import com.dower.sharerideapp.utils.ret.RetResponse;
import com.dower.sharerideapp.utils.ret.RetResult;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.time.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by 13060 on 2020/8/1.
 */
@Slf4j
@Service
public class CouponService {
    @Autowired
    private NntUserCouponsMapper nntUserCouponsMapper;
    @Autowired
    private NntPlatformCouponMapper nntPlatformCouponMapper;
    /**
     * 用户优惠券锁定
     * @return
     */
    public RetResult provideUseCoupon(JSONObject params){
            try {
                NntUserCoupons nntUserCoupons = new NntUserCoupons();
                nntUserCoupons.setNumState(Byte.parseByte("1"));
                nntUserCoupons.setNumUserId(params.getString("numUserId"));
                Date now = new Date();
                Date endDate = DateUtils.addDays(now, -30);
                nntUserCoupons.setDatCreatDate(now);
                nntUserCoupons.setDatEndDate(endDate);
                nntUserCoupons.setNumPlatformCouponId(Long.parseLong("1"));
                nntUserCouponsMapper.insertSelective(nntUserCoupons);
                nntUserCoupons.setNumPlatformCouponId(Long.parseLong("2"));
                nntUserCouponsMapper.insertSelective(nntUserCoupons);
                nntUserCoupons.setNumPlatformCouponId(Long.parseLong("3"));
                nntUserCouponsMapper.insertSelective(nntUserCoupons);
                nntUserCoupons.setNumPlatformCouponId(Long.parseLong("4"));
                nntUserCouponsMapper.insertSelective(nntUserCoupons);
                nntUserCoupons.setNumPlatformCouponId(Long.parseLong("5"));
                nntUserCouponsMapper.insertSelective(nntUserCoupons);
                nntUserCoupons.setNumPlatformCouponId(Long.parseLong("6"));
                nntUserCouponsMapper.insertSelective(nntUserCoupons);
                nntUserCoupons.setNumPlatformCouponId(Long.parseLong("7"));
                nntUserCouponsMapper.insertSelective(nntUserCoupons);
                log.info("新用户添加优惠券成功！");
                return RetResponse.makeOKRsp(nntUserCoupons.getNumId());
            }catch (Exception e){
                e.printStackTrace();
                throw e;
            }

    }
}
