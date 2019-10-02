package com.ihandy.distribution.controller.weichat;

import com.alibaba.fastjson.JSONObject;
import com.ihandy.distribution.service.RespService;
import com.ihandy.distribution.service.weichat.WeichatCommService;
import com.ihandy.distribution.utils.CommUtil;
import com.ihandy.distribution.utils.HttpRequestUtil;
import com.ihandy.distribution.utils.Result;
import com.ihandy.distribution.utils.weichat.AccessTokenUtils;
import com.ihandy.distribution.utils.weichat.Message;
import com.ihandy.distribution.utils.weichat.SignUtil;
import com.ihandy.distribution.utils.weichat.WeiXinUtils;
import com.netflix.discovery.util.StringUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

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
    private WeichatCommService weichatCommService;
    @Autowired
    private RespService respService;

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
    //@RequestMapping(value = "/weChatSend/valid", method = RequestMethod.GET)
    public String doGetMethod(HttpServletRequest request, HttpServletResponse response) {
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


    @RequestMapping(value = "/weChatSend/valid")
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
                        Result relation = respService.createRelation(json.toJSONString());
                        log.info("//建立虚拟的上下级关系result:"+relation.getData());
                    }


                    Message message=new Message();
                    message.setFromUserName(ToUserName);
                    message.setToUserName(FromUserName);
                    message.setContent(WeiXinUtils.getSubscribMsg());
                    message.setMsgId(MsgId);
                    message.setMsgType("text");
                    message.setCreateTime(new Date().getTime());
                    //str=WeiXinUtils.objectToXml(message);
                }
            }
            log.info("自动回复消息="+str);
            out.print(str);
            out.close();
        }catch (Exception e){
            e.printStackTrace();
        }

    }


    @RequestMapping("/rediractHomeUrl")
    public String rediractHomeUrl(RedirectAttributes redirectAttributes, String code, String state, HttpServletRequest request, HttpServletResponse response) {
        // 将请求、响应的编码均设置为UTF-8（防止中文乱码）
        response.setCharacterEncoding("utf-8");
        String url = "index";
        try {

            // 调用核心业务类接收消息、处理消息
            log.info("code:" + code + ";state:" + state);
            JSONObject userinfo = getOpenId(code);
            log.info("userinfo==========" + userinfo.toJSONString());


            /*NntUsers nntUsers = new NntUsers();
            nntUsers.setVcOpenid(openId);
            NntUsers userInfo = usersService.selectUsersBuOpenid(nntUsers);
            Integer numState = userInfo.getNumState();*/

            JSONObject jsonObjectState = JSONObject.parseObject(state);
            String redictNo = jsonObjectState.getString("redictNo");
            /**
             *分销系统
             */
            if ("004".equals(redictNo)) {
                url = "redirect:gopersonals";
            } else if ("005".equals(redictNo)) {/** 个人中心扫码 */
                String pId = jsonObjectState.getString("pId");
                userinfo.put("pId",pId);
                url = "redirect:gopersonals";
            } else if ("006".equals(redictNo)) {/** 产品列表页 */
                //String rediUrl = "http://gongbaoti.tiancaibaoxian.com/ihandy.entrance/zhuanqu/views/index.html?saleChannelCode=HJWX001";
                String rediUrl = "http://hjcs.tiancaibaoxian.com/ihandy.entrance/tiancai/zhuanqu/views/index.html";
                String agentId = "0";
                try {
                    JSONObject json = new JSONObject();
                    json.put("openId",userinfo.getString("openid"));
                    //建立虚拟的上下级关系
                    log.info("根据openid获取agentid,params:"+json.toJSONString());
                    Result relation = respService.createRelation(json.toJSONString());
                    log.info("根据openid获取agentid,result:"+relation.getData());
                    JSONObject jsonObject = JSONObject.parseObject(relation.getData().toString());
                    agentId = jsonObject.getJSONObject("data").getJSONObject("msg").getString("agentId");
                    String isTemporary = jsonObject.getJSONObject("data").getJSONObject("msg").getString("isTemporary");
                    if ("1".equals(isTemporary)){//临时上下级关系
                        agentId = "0";
                    }
                }catch (Exception e){
                    e.printStackTrace();
                    agentId = "0";
                }


                Map<String,Object> map = new HashMap<>();
                map.put("agentId",agentId);
                String s = CommUtil.appendUrl(rediUrl, map);
                url = "redirect:"+s;
            }
            redirectAttributes.addAttribute("userinfo", userinfo.toJSONString());
            log.info("url:" + url);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return url;
    }

    /**
     * 获取openid
     *
     * @param code
     * @return
     */
    public JSONObject getOpenId(String code) {
        JSONObject userinfo = null;
        try {
            Map<String, String> params = new HashMap();
            params.put("secret", secret);
            params.put("appid", appid);
            params.put("grant_type", "authorization_code");
            params.put("code", code);
            //                                           https://api.weixin.qq.com/sns/userinfo?access_token=ACCESS_TOKEN&openid=OPENID&lang=zh_CN
            String result = HttpRequestUtil.request("https://api.weixin.qq.com/sns/oauth2/access_token", params, false);
            JSONObject jsonObject = JSONObject.parseObject(result);
            log.info("获取openid，jsonObject=" + jsonObject);
            String openid = jsonObject.get("openid").toString();
            String accessTokenByCache = weichatCommService.getAccessTokenByCache();
            userinfo = getUserinfo(openid, accessTokenByCache);
        } catch (Exception e) {
            log.error("获取openid异常！");
        }

        return userinfo;
    }

    /**
     * 获取用户基本信息
     */
    public JSONObject getUserinfo(String openId, String access_token) {
        //https://api.weixin.qq.com/cgi-bin/user/info?access_token=&openid=oHzIouCpR7Af6N1qrm28sCy0nIvw
        JSONObject resultJson = null;
        try {
            Map<String, String> params = new HashMap();
            params.put("access_token", access_token);
            params.put("openId", openId);
            String result = HttpRequestUtil.request("https://api.weixin.qq.com/cgi-bin/user/info", params, false);
            resultJson = JSONObject.parseObject(result);
            log.info("获取用户基本信息，jsonObject=" + resultJson);
        } catch (Exception e) {
            log.error("获取用户基本信息！");
        }
        return resultJson;
    }

    @ResponseBody
    @RequestMapping("/wxSignature")
    public Result wxSignature(String url) {
        log.info("接受参数url="+url);
        Result result = new Result();
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
            result.setCode(200);
            result.setData(data);
            return result;
        } catch (Exception e) {
            log.error("获取微信信息的错误", e);
            result.setCode(400);
            return result;
        }
    }

}
