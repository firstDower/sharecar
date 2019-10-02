package com.ihandy.tcfczhlhweb.web;

import com.ihandy.tcfczhlhweb.biz.PayService;
import com.ihandy.tcfczhlhweb.utils.Result;
import com.ihandy.tcfczhlhweb.utils.SignUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @param
 * @Author: wangwei
 * @Description:
 * @Date: Created in 15:58   2019/7/24
 */
@RequestMapping("/pay")
@RestController
public class PayController {
    Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    PayService payService;
    /**
     * 收银台支付
     * tradeAmount ：金额
     * productName ：名称
     * productDesc ：描述
     * @param params
     * @return
     */
    @RequestMapping(value = "/CashierPay")
    public Result CashierPay(String params){
        logger.info("收银台支付params="+params);
        long startTime = System.currentTimeMillis();
        Result result = payService.paySer(params);
        long endTime = System.currentTimeMillis();
        logger.info("收银台支付result="+result.toString());
        logger.info("收银台支付t="+(endTime-startTime));
        return result;
    }
}
