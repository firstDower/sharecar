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
public class WeichatMainController {
    @Value("${weixin.appid}")
    private String appid;
    @Value("${weixin.secret}")
    private String secret;
    @Autowired
    UsersService usersService;
    @Autowired
    private WeichatCommService weichatCommService;
    /*****
     * 确认请求来自微信服务器
     *
     *  signature  微信加密签名
     *  timestamp   时间戳
     *  nonce  随机数
     *  echostr  随机字符串
     * @return
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/weChatSend/valid", method = RequestMethod.GET)
    public String doGetMethod(HttpServletRequest request, HttpServletResponse response){
        String signature = request.getParameter("signature");
        String timestamp = request.getParameter("timestamp");
        String nonce = request.getParameter("nonce");
        String echostr = request.getParameter("echostr");
        if (signature != null && timestamp != null && nonce != null) {
            if (SignUtil.checkSignature(signature, timestamp, nonce)) {
                return echostr;
            }
        }
        return null;
    }

    @RequestMapping(value = "/weChatSend/valid", method = RequestMethod.POST)
    public void cathcMessage(HttpServletRequest request, HttpServletResponse response){



        String str = "";
        try {

            request.setCharacterEncoding("UTF-8");
            response.setCharacterEncoding("UTF-8");
            PrintWriter out = response.getWriter();
            Map<String, String> map = WeiXinUtils.xmlToMap(request);
            log.info("接受到的微信消息map"+map.toString());


            //从集合中，获取XML各个节点的内容

            String ToUserName = map.get("ToUserName");

            String FromUserName = map.get("FromUserName");

            String CreateTime = map.get("CreateTime");

            String MsgType = map.get("MsgType");

            String Content = map.get("Content");

            String MsgId = map.get("MsgId");

            String Event = map.get("Event");
            log.info("接受到的微信消息Content="+Content);
            //这里只处理文本消息
            if (MsgType.equalsIgnoreCase("text")){

                Message message=new Message();
                message.setFromUserName(ToUserName);
                message.setToUserName(FromUserName);
                message.setContent("您发送的消息是text文本消息"+Content);
                message.setMsgId(MsgId);
                message.setMsgType("text");
                message.setCreateTime(new Date().getTime());

                //str=WeiXinUtils.objectToXml(message);
            }else if(MsgType.equalsIgnoreCase("event")){
                if(Event.equalsIgnoreCase("subscribe")||Event.equalsIgnoreCase("scan")){
                    String EventKey = map.get("EventKey");
                    if(StringUtils.isNotBlank(EventKey)){
                        String qrscene_ = StringUtils.substringAfter(EventKey, "qrscene_");
                        if(StringUtils.isBlank(qrscene_)){
                            qrscene_ = EventKey;
                        }
                        String openId = FromUserName;
                        JSONObject json = new JSONObject();
                        json.put("openId",openId);
                        json.put("pId",qrscene_);
                        //建立虚拟的上下级关系
                        log.info("//建立虚拟的上下级关系params:"+json.toJSONString());
                    }


                    Message message=new Message();
                    message.setFromUserName(ToUserName);
                    message.setToUserName(FromUserName);
                    message.setContent(WeiXinUtils.getSubscribMsg());
                    message.setMsgId(MsgId);
                    message.setMsgType("text");
                    message.setCreateTime(new Date().getTime());
                    //str=WeiXinUtils.objectToXml(message);
                }else if(Event.equalsIgnoreCase("unsubscribe")){
                    //用户取消关注，删除用户数据
                    log.info("//建立虚拟的上下级关系result:");
                }
            }
            log.info("自动回复消息="+str);
            out.print(str);
            out.close();

        }catch (Exception e){
            e.printStackTrace();
        }
        //return str;
    }

    @RequestMapping("/rediractHomeUrl")
    public String rediractHomeUrl(RedirectAttributes redirectAttributes, String code, String state, HttpServletRequest request, HttpServletResponse response)   {
        // 将请求、响应的编码均设置为UTF-8（防止中文乱码）
        response.setCharacterEncoding("utf-8");
        String url = "index";
        try {
            log.info("code:"+code+";state:"+state);
            String openId = getOpenId(code);
            log.info("openId=========="+openId);


            JSONObject jsonObjectState = JSONObject.parseObject(state);
            String redictNo = jsonObjectState.getString("redictNo");
            if("001".equals(redictNo)){
                url = "redirect:goMakeCloth";
            }else if("002".equals(redictNo)){
                url = "redirect:goMyInfo";
            }else if("003".equals(redictNo)){
                url = "redirect:goMyInfo";
            }
            redirectAttributes.addAttribute("openId",openId);
            log.info("url:"+url);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return url;
    }

    /**
     * 获取openid
     * @param code
     * @return
     */
    public String getOpenId(String code){
        String openid = "";
        try{
            Map<String, String> params = new HashMap();
            params.put("secret", secret);
            params.put("appid", appid);
            params.put("grant_type", "authorization_code");
            params.put("code", code);
            String result = HttpRequestUtil.request("https://api.weixin.qq.com/sns/oauth2/access_token", params,false);
            JSONObject jsonObject = JSONObject.parseObject(result);
            log.info("获取openid，jsonObject="+jsonObject);
            openid = jsonObject.get("openid").toString();
        }catch (Exception e){
            log.error("获取openid异常！");
        }

        return openid;
    }

    /**
     * 小程序登录
     */
    @ResponseBody
    //@RequestMapping("/login")
    public Result loginPhone(@RequestBody String param) {
        Result result = new Result(false, "小程序登录异常！");
        log.info("小程序登录参数param:：{}",param);
        try {
            JSONObject dataObj = JSONObject.parseObject(param);
            JSONObject openjson  = weichatCommService.getSessionKey(dataObj);

            dataObj.put("openid", openjson.get("openid"));
            dataObj.put("unionid", openjson.get("unionid"));

            NntUsers nntUsers = usersService.selectUsersByUnionid(dataObj);
            nntUsers.setVcOpenid(openjson.getString("openid"));
            result.setSuccess(true);
            result.setMsg("小程序登录成功！");
            result.setResultInfo(nntUsers);
        } catch (Exception e) {
            log.error("小程序登录异常 {}", e);
            e.printStackTrace();
        }
        return result;
    }



    /**
     * 小程序根据code获取openId
     * @param param
     * @return
     */
    @ResponseBody
    @RequestMapping("/getOpenIdByCode")
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
