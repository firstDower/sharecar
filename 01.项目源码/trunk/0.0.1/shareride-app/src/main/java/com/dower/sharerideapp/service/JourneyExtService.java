package com.dower.sharerideapp.service;

import com.alibaba.fastjson.JSONObject;
import com.dower.sharerideapp.core.repository.JourneyExtDao;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @param
 * @Author: wangwei
 * @Description:
 * @Date: Created in 14:39   2018/7/27
 */
@Service
public class JourneyExtService {
    private static final Logger LOGGER = LogManager.getLogger(JourneyExtService.class);
    @Autowired
    private JourneyExtDao journeyExtDao;

    /**
     * 根据userid获取我的行程列表
     * @param params
     * @return
     */
    public List<HashMap<String, Object>> getMyJobs(String params){
        JSONObject jsonparams = com.alibaba.fastjson.JSON.parseObject(params);
        Map<String,String> paramMap = new HashMap<String,String>();
        paramMap.put("numUserId",jsonparams.getString("numUserId"));
        List<HashMap<String, Object>> myJobs = journeyExtDao.getMyJobs(paramMap);
        return myJobs;
    }

    /**
     * 根据routeId获取行程详情
     * @param params
     * @return
     */
    public HashMap<String, Object> getRouteDetailById(String params){
        JSONObject jsonparams = com.alibaba.fastjson.JSON.parseObject(params);
        Map<String,String> paramMap = new HashMap<String,String>();
        paramMap.put("numRouteId",jsonparams.getString("numRouteId"));
        HashMap<String, Object> myJobs = journeyExtDao.getRouteDetailById(paramMap);
        return myJobs;
    }
}
