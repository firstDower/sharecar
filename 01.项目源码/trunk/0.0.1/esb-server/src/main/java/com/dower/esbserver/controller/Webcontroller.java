package com.dower.esbserver.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;


/**
 * @param
 * @Author: wangwei
 * @Description:
 * @Date: Created in 11:43   2019/8/29
 */
@Slf4j
@Controller
public class Webcontroller {

    /**
     * 个人中心页
     */

    @RequestMapping("/gopersonals")
    public String gopersonals(Model model, HttpServletRequest
            request, HttpServletResponse response ) throws UnsupportedEncodingException {

            response.setCharacterEncoding("utf-8");
        String userinfo = "{\"subscribe\":1,\"openid\":\"oHzIouCpR7Af6N1qrm28sCy0nIvw\",\"nickname\":\"王伟\",\"sex\":1,\"language\":\"zh_CN\",\"city\":\"石景山\",\"province\":\"北京\",\"country\":\"中国\",\"headimgurl\":\"http://thirdwx.qlogo.cn/mmopen/2gzwq39YbN3Xqq6gUGia80CUdIic80bN4owt82k3xwWgI5no303FkNEgqoXugqhG1M1BuDiaZOKhRdIibmUgOPCN6ibHw67tWHhSE/132\",\"subscribe_time\":1566983446,\"remark\":\"\",\"groupid\":0,\"tagid_list\":[],\"subscribe_scene\":\"ADD_SCENE_QR_CODE\",\"qr_scene\":0,\"qr_scene_str\":\"\"}";
        JSONObject json = JSON.parseObject(userinfo);
        log.info("json==="+userinfo);
        model.addAttribute("userinfo",userinfo);
        return "views/personals";
    }

    @RequestMapping("/rediractUrl")
    public String rediractHomeUrl( String url,HttpServletResponse response) {
        // 将请求、响应的编码均设置为UTF-8（防止中文乱码）
        response.setCharacterEncoding("utf-8");
        log.info("rediractUrl==================url=="+url);
        return "redirect:"+url;
    }
    @RequestMapping("/gotest")
    public String gotest() {
        return "person/test";
    }

    @RequestMapping("/go404")
    public String go404() {
        return "error/404";
    }
}
