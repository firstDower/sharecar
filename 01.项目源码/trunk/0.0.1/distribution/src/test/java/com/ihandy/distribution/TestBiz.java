package com.ihandy.distribution;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * @param
 * @Author: wangwei
 * @Description:
 * @Date: Created in 16:07   2019/9/6
 */

public class TestBiz{
    @Autowired
    private RedisTemplate<String, Object> redisTemplate;
    @Test
    public void test(){
        redisTemplate.opsForValue().set("test", "我是地瓜");
        System.out.println(redisTemplate.opsForValue().get("test"));

    }


}
