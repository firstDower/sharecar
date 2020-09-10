package com.dower.sharerideapp.service.weichat;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.dower.sharerideapp.service.redis.RedisService;
import com.dower.sharerideapp.utils.HttpRequestUtil;
import com.dower.sharerideapp.utils.weichat.WeiXinUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wangwei on 2019/9/25.
 */
@Slf4j
@Service
public class WeichatCommService {
    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private Environment env;
    @Autowired
    RedisService redisService;

    /**
     * 小程序获取sessionkey
     */

    public JSONObject getSessionKey(JSONObject infodata) {
        Map<String, String> params = new HashMap();
        params.put("secret", infodata.getString("secret"));
        params.put("appid", infodata.getString("appid"));
        params.put("grant_type", "authorization_code");
        params.put("js_code", infodata.getString("code"));
        String res = HttpRequestUtil.request("https://api.weixin.qq.com/sns/jscode2session", params,false);
        log.info("小程序获取code返回结果resp：：{}",res);
        JSONObject oppidObj = JSONObject.parseObject(res);
        String openid = (String) oppidObj.get("openid");
        String session_key = (String) oppidObj.get("session_key");
        oppidObj.put("openid", openid);
        oppidObj.put("session_key", session_key);

        String encryptedData=infodata.getString("encryptedData");
        String iv=infodata.getString("iv");
        JSONObject object = WeiXinUtils.getUserInfo(encryptedData,session_key,iv);
        log.info("再次获取unionid==用户信息=====>>>>{}",object);
        oppidObj.put("unionid", object.getString("unionId"));
        //性别
        oppidObj.put("gender", object.getString("gender"));
        //头像
        oppidObj.put("avatarUrl", object.getString("avatarUrl"));
        //昵称
        oppidObj.put("nickName", object.getString("nickName"));
        return oppidObj;
    }

    /**
     * 公众号生成带参二维码（临时）
     * @return
     */
    public String createQrcode(String agentId){
        String result = "";
        try{
            String accessTokenByCache = getAccessTokenByCache();
            String menuJsonStr = "{\"expire_seconds\": 2592000, \"action_name\": \"QR_STR_SCENE\", \"action_info\": {\"scene\": {\"scene_str\": \""+agentId+"\"}}}";
            String url = "https://api.weixin.qq.com/cgi-bin/qrcode/create?access_token="+accessTokenByCache;
            String httpResult = HttpRequestUtil.sendPostTest(url, JSON.parseObject(menuJsonStr));

            log.info("公众号生成带参二维码httpResult="+httpResult);
            JSONObject jsonObject = JSONObject.parseObject(httpResult);
            result = jsonObject.getString("ticket");
        }catch (Exception e){
            log.error("公众号生成带参二维码异常！");
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 从redis缓存获取accesstoken
     * @return
     */
    public String getAccessTokenByCache(){
        String access_token = "";
        try {
            Object distribution = redisTemplate.opsForHash().get("distribution", "weixin.access_token");
            //1、获取AccessToken jsapi_ticket
            String access_tokenJson = String.valueOf(redisTemplate.opsForHash().get("distribution", "weixin.access_token"));
            access_token = JSONObject.parseObject(access_tokenJson).getString("access_token");
        }catch (Exception e){
            e.printStackTrace();
        }
        return access_token;
    }

    /**
     * 从redis缓存获取jsapi_ticket
     * @return
     */
    public String getJSAPITicketByCache(){
        String jsapiTicket = "";
        try {
            Object distribution = redisTemplate.opsForHash().get("distribution", "weixin.access_token");
            //1、获取AccessToken jsapi_ticket
            jsapiTicket = String.valueOf(redisTemplate.opsForHash().get("distribution", "weixin.jsapiTicket"));
        }catch (Exception e){
            e.printStackTrace();
        }
        return jsapiTicket;
    }
    /**
     * access_token是公众号的全局唯一接口调用凭据
     * */
    public String getAccessToken(){

        String accessToken = "";
        try {
            Map<String, String> params = new HashMap();
            params.put("secret", env.getProperty("weixin.secret"));
            params.put("appid", env.getProperty("weixin.appid"));
            params.put("grant_type", "client_credential");
            log.info("获取公众号的全局唯一接口调用凭据，params::{}",params);
            String result = HttpRequestUtil.request("https://api.weixin.qq.com/cgi-bin/token", params,false);
            JSONObject jsonObject = JSONObject.parseObject(result);
            log.info("获取公众号的全局唯一接口调用凭据，result::{}",result);
            accessToken = result;
        }catch (Exception e){

        }

        return accessToken;
    }

    /**
     * jsapi_ticket是公众号用于调用微信JS接口的临时票据,获得jsapi_ticket之后，就可以生成JSSDK权限验证的签名了
     * 参与签名的字段包括noncestr（随机字符串）, 有效的jsapi_ticket, timestamp（时间戳）, url（当前网页的URL，不包含#及其后面部分）
     * @param
     * @return
     */
    public String getJSAPITicket(String access_token) {
        //String distribution = String.valueOf(redisTemplate.opsForHash().get("distribution", "weixin.access_token"));
        String url = "https://api.weixin.qq.com/cgi-bin/ticket/getticket";
        Map<String, String> params = new HashMap();
        params.put("type", "jsapi");
        params.put("access_token", access_token);
        params.put("grant_type", "client_credential");
        log.info("获取公众号用于调用微信JS接口的临时票据，params::{}",params);
        String result = HttpRequestUtil.request(url, params,false);
        log.info("获取公众号用于调用微信JS接口的临时票据，result::{}",result);
        JSONObject jsonObject = JSONObject.parseObject(result);
        return jsonObject.getString("ticket");
    }

    /**
     * 获取用户基本信息(UnionID机制)
     * @param openid
     * @return
     */
    public String getUserinfoByOpenid(String openid){
        String accessTokenByCache = getAccessTokenByCache();
        String url = "https://api.weixin.qq.com/cgi-bin/user/info";
        Map<String, String> params = new HashMap();
        params.put("access_token",accessTokenByCache);
        params.put("openid",openid);
        params.put("lang", "zh_CN");
        log.info("获取用户基本信息(UnionID机制)，params::{}",params);
        String result = HttpRequestUtil.request(url, params,false);
        log.info("获取用户基本信息(UnionID机制)，result::{}",result);
        return result;
    }

    /**
     * 公众号拉取用户信息(需scope为 snsapi_userinfo)
     * @return
     */
    public String getUserinfoByWeixin(JSONObject param){
        String url = "https://api.weixin.qq.com/sns/userinfo";
        Map<String, String> params = new HashMap();
        params.put("access_token",param.getString("access_token"));
        params.put("openid", param.getString("openid"));
        params.put("lang", "zh_CN");
        log.info("公众号拉取用户信息，params::{}",params);
        String result = HttpRequestUtil.request(url, params,false);
        log.info("公众号拉取用户信息，result::{}",result);
        return result;
    }

}
