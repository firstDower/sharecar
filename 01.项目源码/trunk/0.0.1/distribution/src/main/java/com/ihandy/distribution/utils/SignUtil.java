package com.ihandy.distribution.utils;

import com.alibaba.fastjson.JSON;
import org.apache.commons.codec.digest.DigestUtils;

import java.security.MessageDigest;
import java.util.*;

/**
 * @param
 * @Author: wangwei
 * @Description:
 * @Date: Created in 16:06   2019/7/23
 */

public class SignUtil {

    public static String getSign(String str,String secret) {
        //String secret = "1B33D1953353C395B690EF537490532B";
        Map paramsMap = JSON.parseObject(str,Map.class);


        List<String> keys = new ArrayList<String>(paramsMap.keySet());
        keys.remove("sign");//排除sign参数
        Collections.sort(keys);//排序

        StringBuilder sb = new StringBuilder();
        for (String key : keys) {
            sb.append(key).append("=").append(paramsMap.get(key)).append("&");//拼接字符串
        }
        String linkString = sb.toString();
        linkString = linkString.substring( 0, linkString.length() - 1);//去除最后一个'&'

        String sign = DigestUtils.md5Hex(linkString + secret);//混合密钥md5
        return sign;
    }

    /**
     * @Comment SHA1实现
     * @Author Ron
     * @Date 2017年9月13日 下午3:30:36
     * @return
     */
    public static String shaEncode(String inStr) throws Exception {
        MessageDigest sha = null;
        try {
            sha = MessageDigest.getInstance("SHA");
        } catch (Exception e) {
            System.out.println(e.toString());
            e.printStackTrace();
            return "";
        }

        byte[] byteArray = inStr.getBytes("UTF-8");
        byte[] md5Bytes = sha.digest(byteArray);
        StringBuffer hexValue = new StringBuffer();
        for (int i = 0; i < md5Bytes.length; i++) {
            int val = ((int) md5Bytes[i]) & 0xff;
            if (val < 16) {
                hexValue.append("0");
            }
            hexValue.append(Integer.toHexString(val));
        }
        return hexValue.toString();
    }
    public static String getRandomString(int length){
        String str="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random=new Random();
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<length;i++){
            int number=random.nextInt(62);
            sb.append(str.charAt(number));
        }
        return sb.toString();
    }

    public static String getOpenid(){
        String string = null;
        try {
            string = shaEncode(getRandomString(28)).substring(0,28);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return string;
    }

    public static void main(String args[]) throws Exception {
        System.out.println("string:"+getOpenid());
    }
}
