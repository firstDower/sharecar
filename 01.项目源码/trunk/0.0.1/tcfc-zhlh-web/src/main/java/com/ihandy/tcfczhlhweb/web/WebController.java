package com.ihandy.tcfczhlhweb.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @param
 * @Author: wangwei
 * @Description:
 * @Date: Created in 19:03   2019/6/20
 */

@Controller
public class WebController {
    Logger logger = LoggerFactory.getLogger(getClass());
    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/")
    public String synthesis(){
        return "Synthesis";
    }

    @RequestMapping("/Health")
    public String Health(){
        return "Health";
    }

    @RequestMapping("/Message")
    public String Message(){
        return "Message";
    }

    @RequestMapping(value="/test")
    public String test(){
        return "test";
    }

    /**
     * 支付成功页面回调
     * @param
     * @return
     */
    @RequestMapping(value = "/pay.frontUrl")
    public String successPay(String payStatus){
        //String payStatus = "";
        logger.info("支付页面回调参数payStatus："+payStatus);
        if("y".equalsIgnoreCase(payStatus)){
            return "successPay";
        }else if("n".equalsIgnoreCase(payStatus)){
            return "errorPay";
        }else{
            return "errorPay";
        }
    }


    /**
     * 支付失败页面回调
     * @param
     * @return
     */
    @RequestMapping(value = "/errorPay")
    public String errorPay(){
        return "errorPay";
    }
}
