package com.ihandy.distribution.controller;

import com.ihandy.distribution.BaseTest;
import com.ihandy.distribution.service.scheduled.ScheduledService;
import com.ihandy.distribution.utils.SignUtil;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

import static org.junit.Assert.*;

/**
 * @param
 * @Author: wangwei
 * @Description:
 * @Date: Created in 10:18   2019/9/4
 */
@Slf4j
public class ResponseControllerTest extends BaseTest {
@Autowired
private ScheduledService scheduledService;

    @Test
    public void scheduledServicetest(){
        scheduledService.scheduled();
    }
    @Test
    public void set() {
    }

    /**
     * 插入数据
     * @throws Exception
     */
    @Test
    public void putTestData() throws Exception {
        int numError = 0;
        long startTime = System.currentTimeMillis();
        for (int i = 0 ; i<= 100 ;i++){
            try {
                MvcResult mvcResult= mvc.perform(MockMvcRequestBuilders.get("/esbServer/getUserInfoByOpenid")
                        .param("params","{\"openId\":\""+SignUtil.getOpenid()+"\",\"pId\":\"500\"}")
                        .accept(MediaType.TEXT_HTML_VALUE)).andDo(MockMvcResultHandlers.print())
                        .andReturn();
            }catch (Exception e){
                numError++;
                log.error("异常===========================================");
            }

        }
        long endTime = System.currentTimeMillis();
        log.error("异常===========================================numError="+numError);
        log.info("获取下级业务员名单耗时t="+(endTime-startTime));
    }

    /**
     * 获取用户信息
     * @throws Exception
     */
    @Test
    public void getUserInfoByOpenid() throws Exception {
        MvcResult mvcResult= mvc.perform(MockMvcRequestBuilders.get("/esbServer/getUserInfoByOpenid")
                .param("params","{\"openId\":\"oHzIouCpR7Af6N1qrm28sCy0nIvw\"}")
                .accept(MediaType.TEXT_HTML_VALUE))
                // .andExpect(MockMvcResultMatchers.status().isOk())             //等同于Assert.assertEquals(200,status);
                // .andExpect(MockMvcResultMatchers.content().string("hello lvgang"))    //等同于 Assert.assertEquals("hello lvgang",content);
                .andDo(MockMvcResultHandlers.print())
                .andReturn();
        int status=mvcResult.getResponse().getStatus();                 //得到返回代码
        String content=mvcResult.getResponse().getContentAsString();    //得到返回结果
        log.info(content);
        Assert.assertEquals(200,status);                        //断言，判断返回代码是否正确
    }

    /**
     * 获取下级业务员
     * @throws Exception
     */
    @Test
    public void getSubSalesman() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/esbServer/getSubSalesman")
                .param("params","{\"agentId\":\"500\",\"pageNo\":\"1\",\"pageSize\":\"10\"}")
                .accept(MediaType.TEXT_HTML_VALUE));
    }

    /**
     * 获取分享详情
     * @throws Exception
     */
    @Test
    public void getShareInfo() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/esbServer/getShareInfo")
                .param("params","{\"agentId\":\"500\",\"pageNo\":\"1\",\"pageSize\":\"10\"}")
                .accept(MediaType.TEXT_HTML_VALUE));
    }

    /**
     * 获取验证码
     * @throws Exception
     */
    @Test
    public void getPhoneCode() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/esbServer/getPhoneCode")
                .param("params","{\"mobile\":\"15901122886\",\"verLength\":\"6\"}")
                .accept(MediaType.TEXT_HTML_VALUE));
    }

    /**
     * 验证验证码
     * @throws Exception
     */
    @Test
    public void checkPhoneCode() throws Exception {
        mvc.perform(MockMvcRequestBuilders.get("/esbServer/checkPhoneCode")
                .param("params","{\"mobile\":\"15901122886\",\"verCode\":\"1efirp\"}")
                .accept(MediaType.TEXT_HTML_VALUE));
    }

    @Resource
    private StringRedisTemplate stringRedisTemplate;
    @Test
    public void test(){
        stringRedisTemplate.convertAndSend("messageQueue","hello world");
    }
}