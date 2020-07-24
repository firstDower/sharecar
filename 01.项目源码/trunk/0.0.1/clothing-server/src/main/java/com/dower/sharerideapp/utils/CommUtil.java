package com.dower.sharerideapp.utils;

import com.alibaba.fastjson.JSONObject;

import javax.servlet.http.HttpServletRequest;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;

/**
 * @param
 * @Author: wangwei
 * @Description:
 * @Date: Created in 21:55   2018/7/25
 */

public class CommUtil {
    public synchronized static String getVcRouteNo(){

        return "RN"+System.currentTimeMillis();
    }

    public  static void main(String[] args) {
        Object o = "10";
        System.out.println(Integer.parseInt(o.toString()));
        System.out.println(getLast3S("1"));
        System.out.println(getLast3S("22"));
        System.out.println(getLast3S("333"));
        System.out.println(getLast3S("4444"));
    }

    /**
     * 生成商户订单编号
     * @return
     */
    public static String getOrderNo(JSONObject seatDetail){


        //订单id（用户座位关系id一一对应）
        //String NUM_ORDER_ID = seatDetail.getString("NUM_ORDER_ID");
        //用户座位关系id
        String NUM_NNT_USER_JOURNEY_ID = seatDetail.getString("NUM_NNT_USER_JOURNEY_ID");
        //司机发布的行程id
        String NUM_ROUTE_ID = seatDetail.getString("NUM_ROUTE_ID");
        //开始城市id
        String start_city_id = seatDetail.getString("start_city_id");
        //结束城市id
        String end_city_id = seatDetail.getString("end_city_id");
        //司机用户id
        String NUM_USER_ID = seatDetail.getString("NUM_USER_ID");

        String orderNo = "PC"+autoGenericCode(NUM_NNT_USER_JOURNEY_ID,6)
                +autoGenericCode(NUM_ROUTE_ID,6)
                +autoGenericCode(start_city_id,3)
                +autoGenericCode(end_city_id,3)
                +autoGenericCode(NUM_USER_ID,4)
                +String.valueOf(System.currentTimeMillis()).substring(8);
        return orderNo;
    }

    /**
     * 不够位数的在前面补0，保留num的长度位数字
     * @param code
     * @return
     */
    public static String autoGenericCode(String code, int num) {
        String result = "";
        result = String.format("%0" + num + "d", Integer.parseInt(code) + 1);

        return result;
    }

    public static String getLast3S(String num){
        String result = String.format("%0" + 3 + "d", Integer.parseInt(num));
        int length = result.length();
        if(length>=3) {
            result = result.substring(length - 3, length);
        }
        return result;
    }

    /**
     *判断时间戳是否在一分钟内
     **/
    public static boolean checkTimeStamp(long ts)
    {
        if (Math.abs(ts - System.currentTimeMillis() / 1000) > 60)
        {
            return false;
        }
        return true;
    }

    public static JSONObject getParamData(HttpServletRequest request){

        JSONObject jsonObject = new JSONObject();

        Map<String, String[]> parameterMap = request.getParameterMap();
        Iterator<String> iter = parameterMap.keySet().iterator();
        String key = "";
        while(iter.hasNext()){
            key=iter.next();
            jsonObject.put(key,request.getParameter(key));

        }
        return jsonObject;
    }
}
