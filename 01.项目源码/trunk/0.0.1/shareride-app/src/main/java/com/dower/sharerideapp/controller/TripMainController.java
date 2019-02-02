package com.dower.sharerideapp.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.dower.sharerideapp.core.bean.req.NntJourneyReq;
import com.dower.sharerideapp.core.serverdb.model.NntJourney;
import com.dower.sharerideapp.service.JourneyExtService;
import com.dower.sharerideapp.utils.CommUtil;
import com.dower.sharerideapp.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

/**
 * @param
 * @Author: wangwei
 * @Description:
 * @Date: Created in 15:09   2018/7/27
 */
@RequestMapping("/journey")
@RestController
public class TripMainController {
    @Autowired
    JourneyExtService journeyExtService;

    /**
     * 预约行程
     * @param params
     * @return
     */
    @RequestMapping("/subscribeTrip")
    public Result subscribeTrip(String params){
        return journeyExtService.subscribeTrip(params);
    }

    @RequestMapping("/routeSearch")
    public List<HashMap<String, Object>> routeSearch(NntJourneyReq nntJourneyReq){
        return journeyExtService.routeSearch(nntJourneyReq);
    }
    /**
     * 获取我的行程列表
     * @param params
     * @return
     */
    @RequestMapping("/getMyJobs")
    public List<HashMap<String, Object>> getMyJobs(String params){
        return journeyExtService.getMyJobs(params);
    }

    /**
     * 查询我的坐车记录
     * @param params
     * @return
     */
    @RequestMapping("/getMyTripRecord")
    public List<HashMap<String, Object>> getMyTripRecord(String params){
        return journeyExtService.getMyTripRecord(params);
    }

    /**
     * 根据行程id获取行程详情
     * @param params
     * @return
     */
    @RequestMapping("/getRouteDetailById")
    public HashMap<String, Object> getRouteDetailById(String params){
        return journeyExtService.getRouteDetailById(params);
    }
}
