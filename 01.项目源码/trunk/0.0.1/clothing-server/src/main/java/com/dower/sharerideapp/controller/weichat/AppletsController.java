package com.dower.sharerideapp.controller.weichat;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.dower.sharerideapp.core.serverdb.model.NntUsers;
import com.dower.sharerideapp.service.UsersService;
import com.dower.sharerideapp.service.weichat.WeichatCommService;
import com.dower.sharerideapp.utils.CommUtil;
import com.dower.sharerideapp.utils.HttpRequestUtil;
import com.dower.sharerideapp.utils.Result;
import com.dower.sharerideapp.utils.weichat.Message;
import com.dower.sharerideapp.utils.weichat.SignUtil;
import com.dower.sharerideapp.utils.weichat.WeiXinUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
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
public class AppletsController {
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
    /**
     * 小程序登录
     */
    @ResponseBody
    @RequestMapping("/login")
    public Result loginPhone(HttpServletRequest request) {
        Result result = new Result(false, "小程序登录异常！");
        JSONObject dataObj = CommUtil.getParamData(request);
        log.info("小程序登录参数param:：{}",dataObj);
        try {
            JSONObject openjson  = weichatCommService.getSessionKey(dataObj);

            dataObj.put("openid", openjson.get("openid"));
            dataObj.put("unionid", openjson.get("unionid"));
            dataObj.put("gender", openjson.get("gender"));
            dataObj.put("avatarUrl", openjson.get("avatarUrl"));
            dataObj.put("nickName", openjson.get("nickName"));

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




}
