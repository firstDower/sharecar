package com.dower.sharerideapp.controller;

import com.alibaba.fastjson.JSON;
import com.dower.sharerideapp.core.serverdb.model.NntUsers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

/**
 * @param
 * @Author: wangwei
 * @Description:
 * @Date: Created in 10:39   2018/6/12
 */
@Controller

public class WebController {
    @RequestMapping("/index")
    public String index() {
        return "person/myInfo";
    }

    @RequestMapping("/testPay")
    public String testPay() {
        return "testPay";
    }

    /**
     *注册成车主页面
     * */
    @RequestMapping("/goForCarOwner")
    public String goForCarOwner() {
        return "person/forCarOwner";
    }
    @RequestMapping("/goSetPersonInfo")
    public String goSetPersonInfo() {
        return "person/setPerInfo";
    }
    @RequestMapping("/goMyInfo")
    public String goMyInfo() {
        return "person/myInfo";
    }
@RequestMapping("/goCarSearch")
    public String goCarSearch() {
        return "mainPro/carSearch";
    }
@RequestMapping("/goTestPay")
    public String goTestPay() {
        return "testPay";
    }

}
