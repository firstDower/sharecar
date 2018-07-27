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
    @RequestMapping("/getMyJobs")
    public List<HashMap<String, Object>> getMyJobs(String params){
        return journeyExtService.getMyJobs(params);
    }
}
