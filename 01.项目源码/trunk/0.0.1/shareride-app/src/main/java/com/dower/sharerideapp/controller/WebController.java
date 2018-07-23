package com.dower.sharerideapp.controller;

import com.alibaba.fastjson.JSON;
import com.dower.sharerideapp.core.serverdb.model.NntUsers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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

    @RequestMapping("/orderList")
    public String index1() {
        return "order/orderList";
    }
    @RequestMapping("/goMyTrip")
    public String goMyTrip(ModelMap modelMap) {
        NntUsers users = new NntUsers();
        users.setVcOpenid("123123");
        users.setNumState(1);
        users.setNumLevel(1);
        String s = JSON.toJSONString(users);
        modelMap.addAttribute("users",s);

        return "person/myTrip";
    }

}
