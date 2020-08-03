package com.dower.sharerideapp.controller.admin;

import com.alibaba.fastjson.JSONObject;
import com.dower.sharerideapp.service.payment.CouponService;
import com.dower.sharerideapp.utils.CommUtil;
import com.dower.sharerideapp.utils.Result;
import com.dower.sharerideapp.utils.ret.RetResponse;
import com.dower.sharerideapp.utils.ret.RetResult;
import lombok.extern.slf4j.Slf4j;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationException;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by wangwei on 2020/7/7.
 */
@Slf4j
@RestController
@RequestMapping("/adminServer")
public class CouponServerController {

    @Autowired
    CouponService couponService;
    /**
     * 查询平台优惠券列表
     * @param request
     * @return
     */
    @RequestMapping("/queryPlatformCouponPage")
    public RetResult queryPlatformCouponPage(HttpServletRequest request) {
        JSONObject dataObj = CommUtil.getParamData(request);
        return couponService.platformCouponList(dataObj);
    }
}