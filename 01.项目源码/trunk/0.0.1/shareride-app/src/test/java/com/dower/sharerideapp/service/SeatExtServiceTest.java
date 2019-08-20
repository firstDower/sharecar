package com.dower.sharerideapp.service;

import com.dower.sharerideapp.controller.weichat.WXPayController;
import com.dower.sharerideapp.utils.Result;
import com.github.wxpay.sdk.WXPayUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Map;

import static org.junit.Assert.*;

/**
 * @param
 * @Author: wangwei
 * @Description:
 * @Date: Created in 20:35   2019/4/17
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SeatExtServiceTest {
    private final Logger LOGGER = LogManager.getLogger(this.getClass());
    @Autowired
    SeatExtService seatService;
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void createPayment() throws Exception {
        /*String notityXml = "<xml><appid><![CDATA[wxee4726bdcff75c74]]></appid><bank_type><![CDATA[CFT]]></bank_type><cash_fee><![CDATA[1]]></cash_fee><fee_type><![CDATA[CNY]]></fee_type><is_subscribe><![CDATA[Y]]></is_subscribe><mch_id><![CDATA[1509974851]]></mch_id><nonce_str><![CDATA[d6218c5681704cff82e21e7e1bc52691]]></nonce_str><openid><![CDATA[o_1At0Te0Bq3R0VDOkGV6qrOay60]]></openid><out_trade_no><![CDATA[PC000027000024002007000249746]]></out_trade_no><result_code><![CDATA[SUCCESS]]></result_code><return_code><![CDATA[SUCCESS]]></return_code><sign><![CDATA[A36AB4E42D2EC82D691779BA8CD81A5F]]></sign><time_end><![CDATA[20190417160417]]></time_end><total_fee>1</total_fee><trade_type><![CDATA[JSAPI]]></trade_type><transaction_id><![CDATA[4200000312201904177442469195]]></transaction_id></xml>";
        Map<String, String> notifyMap = WXPayUtil.xmlToMap(notityXml);
        Result payment = seatService.createPayment(notifyMap);*/
    }

}