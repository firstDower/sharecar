package com.dower.sharerideapp.controller.weichat;

import com.alibaba.fastjson.JSONObject;
import com.dower.sharerideapp.core.serverdb.model.NntOrder;
import com.dower.sharerideapp.domain.config.weixin.MyConfig;
import com.dower.sharerideapp.domain.config.weixin.WeixinConfig;
import com.dower.sharerideapp.service.SeatExtService;
import com.dower.sharerideapp.utils.CommUtil;
import com.dower.sharerideapp.utils.Result;
import com.github.wxpay.sdk.WXPay;
import com.github.wxpay.sdk.WXPayConstants;
import com.github.wxpay.sdk.WXPayUtil;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * @param
 * @Author: wangwei
 * @Description:
 * @Date: Created in 16:52   2018/7/17
 */
@RestController
public class WXPayController {
    private static final Logger LOGGER = LogManager.getLogger(WXPayController.class);
    @Autowired
    SeatExtService seatService;
    @Autowired
    WeixinConfig weixinConfig;
    @RequestMapping("/notify")
    public String notify(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String result;//返回给微信的处理结果
        String inputLine;
        String notityXml = "";
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        response.setHeader("Access-Control-Allow-Origin", "*");
        //微信给返回的东西
        try {
            while ((inputLine = request.getReader().readLine()) != null) {
                notityXml += inputLine;
            }
            request.getReader().close();
        } catch (Exception e) {
            e.printStackTrace();
            result = setXml("fail","xml获取失败");
        }
        if (StringUtils.isEmpty(notityXml)) {
            result = setXml("fail","xml为空");
        }


        MyConfig config = new MyConfig();
        WXPay wxpay = new WXPay(config);
        LOGGER.info("微信支付异步回调 reqXml="+notityXml);
        Map<String, String> notifyMap = WXPayUtil.xmlToMap(notityXml);  // 转换成map
        String out_trade_no = notifyMap.get("out_trade_no");
        //微信支付订单号：transaction_id
        String transaction_id = notifyMap.get("transaction_id");
        LOGGER.info("微信支付异步回调:1、微信订单号："+transaction_id+"；2、商户订单号："+out_trade_no+";notifyMap="+notifyMap);
        if (wxpay.isPayResultNotifySignatureValid(notifyMap)) {
            LOGGER.info("微信支付异步回调签名验证成功！");
            //1、更新订单支付状态
            Result result1 = seatService.updatePayStatusByOrderId(out_trade_no);
            //2、生成支付流水

            Result payment = seatService.createPayment(notifyMap);

            result = setXml("SUCCESS", "OK");
        } else {
            LOGGER.info("微信支付异步回调签名验证失败！");
            result = setXml("fail", "签名不一致！");
        }



        LOGGER.info("----返回给微信的xml：" + result);

        return result;
    }

    @RequestMapping("/wxpay")
    public Map<String, String> wxpay(String openid,String userJourneyId,HttpServletRequest request, HttpServletResponse response) {
        Map<String, String> resp = new HashMap<>();
        Map<String, String> resultMap = new HashMap<String, String>();
        try {
            Map<String,Object> params = new HashMap<>();
            params.put("userJourneyId",userJourneyId);
            //根据userJourneyId，查询记录详情。
            Result result = seatService.getSeatDetailById(params);
            JSONObject seatDetail = (JSONObject) result.getResultInfo();

            String out_trade_no = seatDetail.getString("VC_ORDER_NO");
            //判断是否已经生成订单号
            if (out_trade_no==null){
                out_trade_no = CommUtil.getOrderNo(seatDetail);
            }
            LOGGER.info("微信支付模拟测试开始。openid="+openid);

            MyConfig config = new MyConfig();
            WXPay wxpay = new WXPay(config);

            Map<String, String> data = new HashMap<String, String>();
            data.put("body", weixinConfig.body);
            data.put("out_trade_no", out_trade_no);
            data.put("fee_type", weixinConfig.feeType);
            //data.put("total_fee", String.valueOf(seatDetail.getIntValue("NUM_UNIT_PRICE")*100));
            data.put("total_fee", "1");
            data.put("spbill_create_ip", weixinConfig.spbillCreateIp);
            data.put("notify_url", weixinConfig.notifyrl);
            data.put("trade_type", weixinConfig.tradeType);  // 此处指定为公众号支付
            data.put("openid", openid);

            resp = wxpay.unifiedOrder(data);


            if(resp.containsKey("return_code")){
                String return_code = String.valueOf(resp.get("return_code"));
                if ("SUCCESS".equals(return_code)){
                    resultMap.put("appId",config.getAppID());
                    resultMap.put("timeStamp",System.currentTimeMillis()/1000+"");
                    resultMap.put("nonceStr", WXPayUtil.generateNonceStr());
                    resultMap.put("package", "prepay_id="+resp.get("prepay_id"));
                    resultMap.put("signType", "MD5");
                    resultMap.put("paySign",  WXPayUtil.generateSignature(resultMap, config.getKey(), WXPayConstants.SignType.MD5));

                    NntOrder nntOrder = new NntOrder();
                    nntOrder.setNumId(seatDetail.getInteger("NUM_ORDER_ID"));
                    nntOrder.setVcOrderNo(out_trade_no);
                    nntOrder.setVcOpenid(openid);
                    Result updataSeatDetailResult = seatService.updataSeatDetail(nntOrder);
                }
            }else {
                throw new Exception(String.format(resp.toString()));
            }
            System.out.println("微信支付模拟resultMap="+resultMap);
        } catch (Exception e) {
            e.printStackTrace();
        }


        LOGGER.info("微信支付模拟测试结束。");
        return resultMap;
    }


    //通过xml 发给微信消息
    public static String setXml(String return_code, String return_msg) {
        SortedMap<String, String> parameters = new TreeMap<String, String>();
        parameters.put("return_code", return_code);
        parameters.put("return_msg", return_msg);
        return "<xml><return_code><![CDATA[" + return_code + "]]>" +
                "</return_code><return_msg><![CDATA[" + return_msg + "]]></return_msg></xml>";
    }

    public static void main(String[] args) throws Exception {



        MyConfig config = new MyConfig();
        WXPay wxpay = new WXPay(config);

        Map<String, String> data = new HashMap<String, String>();
        data.put("body", "王伟平车费用！");
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
