package com.ihandy.distribution.controller;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;

/**
 * Created by wangwei on 2019/9/26.
 */
@Slf4j
public class Test {
    public static void main(String[] args) {
        String s = StringUtils.substringAfter("qrscene_123123", "qrscene_");
        String ss = StringUtils.substringAfter("123123", "qrscene_");
        if(StringUtils.isBlank(ss)){
            ss = "123123";
        }
        log.info("==========="+s);
        log.info("==========="+ss);
    }
}
