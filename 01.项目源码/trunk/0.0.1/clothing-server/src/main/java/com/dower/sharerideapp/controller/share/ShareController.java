package com.dower.sharerideapp.controller.share;


import com.alibaba.fastjson.JSONObject;
import com.dower.sharerideapp.controller.weichat.WeichatMainController;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.net.URLEncoder;

/**
 *
 */
@Controller
@Slf4j
public class ShareController {
    @Value("${weixin.appid}")
    private String appid;

    @Autowired
    WeichatMainController weichatMainController;
    @RequestMapping(value = "/weiChatShare/{userId}")
    public String share(@PathVariable("userId") String userId,HttpServletRequest request, HttpServletResponse response) throws Exception {
        log.info("进入分享页面==========");

        StringBuffer url = request.getRequestURL();
        String contextPath = request.getContextPath();
        String tempContextUrl = url.delete(url.length() - request.getRequestURI().length(), url.length()).append("/").toString();
        String redirect_uri = URLEncoder.encode(tempContextUrl + contextPath + "/posterUrl/" + userId );


        String strUrl = "https://open.weixin.qq.com/connect/oauth2/authorize?appid=" + appid + "&redirect_uri=" + redirect_uri + "&response_type=code&scope=snsapi_userinfo&state=123#wechat_redirect";
        String productUrl = "/weichat/goMakeCloth";
        String ua = request.getHeader("User-Agent").toLowerCase();
        if (ua.indexOf("micromessenger") > 0) {// 是微信浏览器
            log.info("进入分享页面==========end::{}",strUrl);
            return "redirect:" + strUrl;
        } else {
            return "redirect:" + productUrl;
        }
    }

    /**
     * 被分享用户获取系统用户id
     * @param shareUserId
     * @param redirectAttributes
     * @param code
     * @param state
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/posterUrl/{userId}")
    public String posterUrl(@PathVariable("userId") String shareUserId, RedirectAttributes redirectAttributes, String code, String state,
                            HttpServletRequest request, HttpServletResponse response) {
        log.info("获取用户Openid");
        /*StringBuffer url = request.getRequestURL();
        String tempContextUrl = url.delete(url.length() - request.getRequestURI().length(), url.length()).append("/").toString();
        //String productUrl = tempContextUrl + "v/" + adverPage + "?agentId=" + agentId;*/
        JSONObject userInfo = weichatMainController.getUserId(code);
        String userId = userInfo.getString("userId");
        String openid = userInfo.getString("openid");
        redirectAttributes.addAttribute("userId", userId);
        redirectAttributes.addAttribute("openId", openid);
        redirectAttributes.addAttribute("shareUserId", shareUserId);
        String url = "redirect:/weichat/goMakeCloth";
        log.info("被分享用户获取系统用户id，userId：：{}；openId：：{}；shareUserId：：{}；url::{}；",userId,openid,shareUserId,url);
        return url;
    }


}

