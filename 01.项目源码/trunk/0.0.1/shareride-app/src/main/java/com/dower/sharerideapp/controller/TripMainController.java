package com.dower.sharerideapp.controller;

import com.dower.sharerideapp.service.JourneyExtService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
     * 获取我的行程列表
     * @param params
     * @return
     */
    @RequestMapping("/getMyJobs")
    public List<HashMap<String, Object>> getMyJobs(String params){
        return journeyExtService.getMyJobs(params);
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
