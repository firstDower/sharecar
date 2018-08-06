package com.dower.sharerideadmin.controller;

import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @param
 * @Author: wangwei
 * @Description:
 * @Date: Created in 16:43   2018/8/3
 */
@Controller
public class WebController {
    private org.slf4j.Logger LOGGER = LoggerFactory.getLogger(getClass());
    /**
     *
     * @param page  跳转页面
     * @param method  预处理方法，类名|方法名, 无预处理方法传-
     * @param layer 页面所在层 多及层用|分隔，无层传-
     * @param parameter 预处理方法参数,无预处理方法参数传-
     * @return
     */
    @RequestMapping(value="/index")
    public String greeting() {
        return "index";
    }
    @RequestMapping(value="/jump/{layer}/{page}")
    public String greeting(@PathVariable("layer") String layer,@PathVariable("page") String page) {
        LOGGER.info("----跳转页面::layer="+layer+"   ::page="+page+"  :");
        String rePage = page;
        try {
            rePage = rePage.substring(0,rePage.length()-5);
        } catch (Exception e) {
        }
        if(!"-".equals(layer)){
            layer = layer.replace("|", "/");
            rePage = layer+"/"+rePage;
        }

        return rePage;
    }

}
