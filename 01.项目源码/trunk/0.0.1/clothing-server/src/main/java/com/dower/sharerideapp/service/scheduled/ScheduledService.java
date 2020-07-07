package com.dower.sharerideapp.service.scheduled;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.dower.sharerideapp.service.weichat.WeichatCommService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @param
 * @Author: wangwei
 * @Description:
 * @Date: Created in 18:38   2019/9/6
 */

@Slf4j
@Component
public class ScheduledService {
    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private WeichatCommService weichatCommService;

    @Scheduled(initialDelay = 1000, fixedDelay = 7100*1000)
    public void scheduled() {
        try {
            String accessToken = weichatCommService.getAccessToken();
            JSONObject jsonObject = JSON.parseObject(accessToken);
            if(jsonObject.getString("access_token")!=null){
                try {
                    JSONObject json = new JSONObject();
                    json.put("access_token",jsonObject.getString("access_token"));
                    redisTemplate.opsForHash().put("distribution", "weixin.access_token", json);


                    String jsapiTicket = weichatCommService.getJSAPITicket(jsonObject.getString("access_token"));
                    log.info("更新Jsapi_ticket，微信返回数据："+jsapiTicket);
                    redisTemplate.opsForHash().put("distribution", "weixin.jsapiTicket", jsapiTicket);

                } catch(Exception e){
                    e.printStackTrace();
                } finally {

                }
            }
            else{
                log.info("定时刷新access_token失败，微信返回的信息是"+jsonObject.toJSONString());
            }
        }
        catch (Exception e){
            log.info("更新access_token的过程当中发生了异常，异常的信息是"+e.getMessage());
        }
    }

}
