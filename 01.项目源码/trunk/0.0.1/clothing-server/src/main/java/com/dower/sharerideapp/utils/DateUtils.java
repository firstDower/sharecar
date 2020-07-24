package com.dower.sharerideapp.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @param
 * @Author: wangwei
 * @Description:
 * @Date: Created in 16:15   2019/4/12
 */

public class DateUtils {
    /**
     * 时间戳转换成日期格式字符串
     * @param seconds 精确到秒的字符串
     * @param format
     * @return
     */
    public static String timeStamp2Date(String seconds,String format) {
        if(seconds == null || seconds.isEmpty() || seconds.equals("null")){
            return "";
        }
        if(format == null || format.isEmpty()){
            format = "yyyy-MM-dd HH:mm:ss";
        }
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(new Date(Long.valueOf(seconds+"000")));
    }
    public static String getExpireTime() {
        String yyyyMMddHHmmss = DateUtils.timeStamp2Date(String.valueOf(System.currentTimeMillis()/1000+31536000), "yyyyMMddHHmmss");
        return yyyyMMddHHmmss;
    }


    public static void main(String[] args) {

        System.out.println(DateUtils.getExpireTime());
    }
}
