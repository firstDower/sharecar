package com.dower.sharerideapp.controller.weichat;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.dower.sharerideapp.core.serverdb.model.NntUsers;
import com.dower.sharerideapp.service.UsersService;
import com.dower.sharerideapp.service.weichat.WeichatCommService;
import com.dower.sharerideapp.utils.HttpRequestUtil;
import com.dower.sharerideapp.utils.Result;
import com.dower.sharerideapp.utils.weichat.Message;
import com.dower.sharerideapp.utils.weichat.SignUtil;
import com.dower.sharerideapp.utils.weichat.WeiXinUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

/**
 * @param
 * @Author: wangwei
 * @Description:
 * @Date: Created in 17:02   2018/7/10
 */
@Slf4j
@Controller
@RequestMapping("/weichat")
public class WeichatMainController {
    @Value("${weixin.appid}")
    private String appid;
    @Value("${weixin.secret}")
    private String secret;
    @Autowired
    UsersService usersService;
    @Autowired
    private WeichatCommService weichatCommService;


    @RequestMapping("/rediractHomeUrl")
    public String rediractHomeUrl(RedirectAttributes redirectAttributes, String code, String state, HttpServletRequest request, HttpServletResponse response)   {
        // 将请求、响应的编码均设置为UTF-8（防止中文乱码）
        response.setCharacterEncoding("utf-8");
        String url = "index";
        try {
            log.info("code:"+code+";state:"+state);
            String userId = getUserId(code);
            log.info("userId=========="+userId);
            JSONObject jsonObjectState = JSONObject.parseObject(state);
            String redictNo = jsonObjectState.getString("redictNo");
            if("1".equals(redictNo)){
                url = "redirect:/weichat/goMakeCloth";
            }else if("2".equals(redictNo)){
                url = "redirect:/weichat/goMyInfo";
            }else if("003".equals(redictNo)){
                url = "redirect:goMyInfo";
            }
            redirectAttributes.addAttribute("userId",userId);
            log.info("url:"+url);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return url;
    }

    /**
     * 获取openid,登录自己的服务
     * @param code
     * @return
     */
    public String getUserId(String code){
        String resultStr = "";
        try{
            Map<String, String> params = new HashMap();
            params.put("secret", secret);
            params.put("appid", appid);
            params.put("grant_type", "authorization_code");
            params.put("code", code);
            String result = HttpRequestUtil.request("https://api.weixin.qq.com/sns/oauth2/access_token", params,false);
            JSONObject jsonObject = JSONObject.parseObject(result);
            log.info("获取openid，jsonObject="+jsonObject);
            String openid = jsonObject.get("openid").toString();
            String access_token = jsonObject.getString("access_token");
            JSONObject param = new JSONObject();
            param.put("openid",openid);
            param.put("access_token",access_token);
            String userinfoByWeixin = weichatCommService.getUserinfoByWeixin(param);
            JSONObject object = JSONObject.parseObject(userinfoByWeixin);
            //unionid
            param.put("unionid", object.getString("unionid"));
            //性别
            param.put("gender", object.getString("sex"));
            //头像
            param.put("avatarUrl", object.getString("headimgurl"));
            //昵称
            param.put("nickName", object.getString("nickname"));
            NntUsers nntUsers = usersService.selectUsersByUnionid(param);
            resultStr = nntUsers.getNumUserId().toString();
        }catch (Exception e){
            log.error("获取openid异常！{}",e);
        }
        return resultStr;
    }

    /**
     * 小程序根据code获取openId
     * @param param
     * @return
     */
    //@ResponseBody
    //@RequestMapping("/getOpenIdByCode")
    public Result getOpenIdByCode(@RequestBody String param){
        Result result = new Result(false,"根据code获取openId异常！");
        try{
            log.info("根据code获取openId,param:{}",param);
            JSONObject jsonparams = JSON.parseObject(param);
            Map<String, String> params = new HashMap();
            params.put("secret", jsonparams.getString("secret"));
            params.put("appid", jsonparams.getString("appid"));
            params.put("grant_type", "authorization_code");
            params.put("js_code", jsonparams.getString("code"));
            String res = HttpRequestUtil.request("https://api.weixin.qq.com/sns/jscode2session", params,false);
            JSONObject jsonObject = JSONObject.parseObject(res);
            log.info("根据code获取openId,result:{}",res);
            String openid = jsonObject.get("openid").toString();
            result.setSuccess(true);
            result.setResultInfo(res);
        }catch (Exception e){
            log.error("获取openid异常！");
        }

        return result;
    }

    @ResponseBody
    @RequestMapping("/wxSignature")
    public Result wxSignature(String url) {
        log.info("接受参数url="+url);
        Result result = new Result(false,"js签名异常！");
        try {
            String accessTokenByCache = weichatCommService.getAccessTokenByCache();
            String jsapiTicket = weichatCommService.getJSAPITicketByCache();
            //3、时间戳和随机字符串  
            String noncestr = UUID.randomUUID().toString().replace("-", "").substring(0, 16);//随机字符串  
            String timestamp = String.valueOf(System.currentTimeMillis() / 1000);//时间戳  


            //5、将参数排序并拼接字符串  
            String str = "jsapi_ticket=" + jsapiTicket + "&noncestr=" + noncestr + "&timestamp=" + timestamp + "&url=" + url;
            log.info("参数拼接的字符串：" + str);
            //6、将字符串进行sha1加密  
            String signature = WeiXinUtils.SHA1(str);
            log.info("签名：" + signature);
            Map<String, Object> data = new HashMap<>();
            data.put("timestamp", timestamp);
            data.put("nonceStr", noncestr);
            data.put("signature", signature);
            data.put("accessToken", accessTokenByCache);
            data.put("appId", appid);
            result.setSuccess(true);
            result.setResultInfo(data);

        } catch (Exception e) {
            log.error("获取微信信息的错误", e);
            result.setSuccess(false);
        }
        return result;
    }
}
