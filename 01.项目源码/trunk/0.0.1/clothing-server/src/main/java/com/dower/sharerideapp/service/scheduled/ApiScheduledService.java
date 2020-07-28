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
public class ApiScheduledService {
    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private WeichatCommService weichatCommService;

    /**
     * 定时任务刷新优惠券过期状态
     */
    //@Scheduled(initialDelay = 1000, fixedDelay = 7100*1000)
    public void scheduled() {
        try {

        }catch (Exception e){
            log.info("更新access_token的过程当中发生了异常，异常的信息是"+e.getMessage());
        }
    }

}
