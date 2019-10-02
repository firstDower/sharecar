package com.ihandy.tcfczhlhweb.utils;

import com.alibaba.fastjson.JSON;
import org.apache.commons.codec.digest.DigestUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * @param
 * @Author: wangwei
 * @Description:
 * @Date: Created in 16:06   2019/7/23
 */

public class SignUtil {
    public static String getSign(String str) {
        String secret = "98063D19D58B8E93DF0760ED3A11713A";
        Map paramsMap = JSON.parseObject(str,Map.class);


        List<String> keys = new ArrayList<String>(paramsMap.keySet());
        keys.remove("sign");//排除sign参数
        Collections.sort(keys);//排序

        StringBuilder sb = new StringBuilder();
        for (String key : keys) {
            sb.append(key).append("=").append(paramsMap.get(key)).append("&");//拼接字符串
        }
        String linkString = sb.toString();
        linkString = org.apache.commons.lang.StringUtils.substring(linkString, 0, linkString.length() - 1);//去除最后一个'&'

        String sign = DigestUtils.md5Hex(linkString + secret);//混合密钥md5
        return sign;
    }

}
