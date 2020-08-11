package com.dower.sharerideapp.controller.weichat;

import com.alibaba.fastjson.JSON;
import com.dower.sharerideapp.service.weichat.WeichatCommService;
import com.dower.sharerideapp.utils.HttpRequestUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by wangwei on 2019/9/25.
 */
@Slf4j
@RestController
@RequestMapping("/weichat")
public class WeichatCustomRightController {
    @Autowired
    private WeichatCommService weichatCommService;
    @Autowired
    private Environment env;
    @RequestMapping("/createMenu")
    public String createMenu(HttpServletRequest request){
        String result = "";
        try {
            String serverName = request.getServerName();//返回服务器的主机名 WEIXIN.APPID是 SERVERNAME
            String appId = env.getProperty("weixin.appid");
            //log.info("本机域名："+serverName);
            String accessTokenByCache = weichatCommService.getAccessTokenByCache();
            String menuJsonStr = env.getProperty("menuJsonStr");
            menuJsonStr = StringUtils.replace(menuJsonStr, "WEIXIN.APPID", appId);
            menuJsonStr = StringUtils.replace(menuJsonStr, "SERVERNAME", serverName);
            log.info("自定义菜单param;menuJsonStr="+menuJsonStr);
            String url = "https://api.weixin.qq.com/cgi-bin/menu/create?access_token="+accessTokenByCache;
            result = HttpRequestUtil.sendPostTest(url, JSON.parseObject(menuJsonStr));
            log.info("自定义菜单返回result="+result);
        }catch (Exception e){

        }
        return result;
    }

    /**
     * 根据代理人id获取我的二维码
     * @param agentId
     * @return
     */
    @ResponseBody
    @RequestMapping("/createQrcode")
    public String createQrcode(String agentId){
        String result = "";
        try {
            log.info("根据代理人id获取我的二维码agentId:"+agentId);
            result = weichatCommService.createQrcode(agentId);
            log.info("根据代理人id获取我的二维码result:"+result);
        }catch (Exception e){

        }
        return result;
    }


}
