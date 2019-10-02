package com.ihandy.distribution.controller;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @param
 * @Author: wangwei
 * @Description:
 * @Date: Created in 11:32   2019/8/28
 */

@Slf4j
@RequestMapping(value="/test")
@RestController
public class TestC {
    @Value("${server.port}")
    private String port;
    @RequestMapping(value="/getReport")
    public String getreport(){
        log.info(port);

        return port;
    }

}
