package com.dower.sharerideapp.utils;

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

        System.out.println(CommUtil.getVcRouteNo());
    }
}
