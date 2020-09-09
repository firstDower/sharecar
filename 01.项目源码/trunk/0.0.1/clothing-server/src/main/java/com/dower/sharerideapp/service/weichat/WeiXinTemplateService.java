package com.dower.sharerideapp.service.weichat;

import com.alibaba.fastjson.JSONObject;
import com.dower.sharerideapp.utils.HttpRequestUtil;
import com.dower.sharerideapp.utils.weichat.Message;
import com.thoughtworks.xstream.XStream;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.binary.Base64;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.servlet.http.HttpServletRequest;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.security.*;
import java.security.spec.InvalidParameterSpecException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @param
 * @Author: wangwei
 * @Description:
 * @Date: Created in 10:45   2019/9/9
 */
@Slf4j
@Service
public class WeiXinTemplateService {
    @Autowired
    private WeichatCommService weichatCommService;
    @Autowired
    private Environment env;
    /**
     * 微信下单发送模板消息
     * @param openId  用户openid
     * @param orderId 订单id
     * @return
     */
    public String sendTemplateMsg01(String userId,String openId,String orderId){
        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-HH");
        String dateNowStr = sdf.format(new Date());
        // 获取token
        String token = weichatCommService.getAccessTokenByCache();

        String postUrl = "https://api.weixin.qq.com/cgi-bin/message/template/send?access_token=" + token;

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("touser", openId);   // openid
        jsonObject.put("template_id", "A0c1vsHB5sH_AennPS7q2ODIiO-6t78HE2q9-bCPWZU");
        jsonObject.put("url", "http://pro.doweryouxia.com/clothing-server/weichat/goMyInfo?userId="+userId+"&openId="+openId);

        JSONObject data = new JSONObject();
        JSONObject first = new JSONObject();
        first.put("value", "订单状态变化提醒");
        first.put("color", "#173177");
        JSONObject keyword1 = new JSONObject();
        keyword1.put("value", orderId);
        keyword1.put("color", "#173177");
        JSONObject keyword2 = new JSONObject();
        keyword2.put("value", "订单预约成功");
        keyword2.put("color", "#173177");
        JSONObject keyword3 = new JSONObject();
        keyword3.put("value", dateNowStr);
        keyword3.put("color", "#173177");
        JSONObject remark = new JSONObject();
        remark.put("value", "请关注订单状态");
        remark.put("color", "#173177");

        data.put("first",first);
        data.put("keyword1",keyword1);
        data.put("keyword2",keyword2);
        data.put("keyword3",keyword3);
        data.put("remark",remark);

        jsonObject.put("data", data);
        String res = HttpRequestUtil.sendPostJsonStr(postUrl, jsonObject.toJSONString());
        JSONObject result = JSONObject.parseObject(res);
        int errcode = result.getIntValue("errcode");
        if(errcode == 0){
            // 发送成功
            System.out.println("发送成功");
        } else {
            // 发送失败
            System.out.println("发送失败");
        }
        return res;
    }


}
