package com.dower.sharerideapp.controller.clothing;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @param
 * @Author: wangwei
 * @Description:
 * @Date: Created in 10:39   2018/6/12
 */
@Slf4j
@RequestMapping("/weichat")
@Controller
public class WebClothingWeichatController {


    @RequestMapping("/goMyInfo")
    public String goMyInfo() {
        return "weichat/personalCenter";
    }

    @RequestMapping("/goModify")
    public String goModify() {
        return "weichat/modify";
    }

      /**
     * 定制衣服页面
     */

    @RequestMapping("/goMakeCloth")
    public String goMakeCloth() {
        return "weichat/index";
    }
}

