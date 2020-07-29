package com.dower.sharerideapp.controller.securityService;

import com.alibaba.fastjson.JSONObject;
import com.dower.sharerideapp.service.clothing.ClothingNewService;
import com.dower.sharerideapp.service.payment.PaymentService;
import com.dower.sharerideapp.utils.CommUtil;
import com.dower.sharerideapp.utils.ret.RetResponse;
import com.dower.sharerideapp.utils.ret.RetResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by wangwei on 2020/7/23.
 */

@Slf4j
@RestController
@RequestMapping("/securityService")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;


    @PostMapping("/weichatPayment")
    public RetResult getUserInfo(HttpServletRequest request){
        JSONObject param = CommUtil.getParamData(request);
        return paymentService.weichatPayment(param);
    }

}
