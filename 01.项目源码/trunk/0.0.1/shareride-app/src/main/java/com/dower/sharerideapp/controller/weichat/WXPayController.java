package com.dower.sharerideapp.controller.weichat;

import com.dower.sharerideapp.domain.config.weixin.MyConfig;
import com.dower.sharerideapp.utils.Result;
import com.github.wxpay.sdk.WXPay;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

/**
 * @param
 * @Author: wangwei
 * @Description:
 * @Date: Created in 16:52   2018/7/17
 */
@RestController
public class WXPayController {
    private static final Logger LOGGER = LogManager.getLogger(WXPayController.class);

    @RequestMapping("/wxpay")
    public Map<String, String> wxpay(HttpServletRequest request, HttpServletResponse response) {
        Map<String, String> resp = new HashMap<>();
        try {
            LOGGER.info("微信支付模拟测试开始。");

            MyConfig config = new MyConfig();
            WXPay wxpay = new WXPay(config);

            Map<String, String> data = new HashMap<String, String>();
            data.put("body", "wangweiwangwei");
            data.put("out_trade_no", "2016090910595900000012");
            data.put("fee_type", "CNY");
            data.put("total_fee", "1");
            data.put("spbill_create_ip", "59.110.243.138");
            data.put("notify_url", "http://demo.doweryouxia.com/shareride-app/");
            data.put("trade_type", "JSAPI");  // 此处指定为公众号支付
            data.put("openid", "o_1At0Te0Bq3R0VDOkGV6qrOay60");

            resp = wxpay.unifiedOrder(data);
            System.out.println("微信支付模拟resp="+resp);
        } catch (Exception e) {
            e.printStackTrace();
        }


        LOGGER.info("微信支付模拟测试结束。");




        return resp;
    }

    public static void main(String[] args) throws Exception {

        MyConfig config = new MyConfig();
        WXPay wxpay = new WXPay(config);

        Map<String, String> data = new HashMap<String, String>();
        data.put("body", "wangweiwangwei");
        data.put("out_trade_no", "2016090910595900000012");
        data.put("device_info", "");
        data.put("fee_type", "CNY");
        data.put("total_fee", "1");
        data.put("spbill_create_ip", "59.110.243.138");
        data.put("notify_url", "http://demo.doweryouxia.com/shareride-app/");
        data.put("trade_type", "JSAPI");  // 此处指定为公众号支付
        data.put("openid", "o_1At0Te0Bq3R0VDOkGV6qrOay60");

        try {
            Map<String, String> resp = wxpay.unifiedOrder(data);
            System.out.println(resp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
