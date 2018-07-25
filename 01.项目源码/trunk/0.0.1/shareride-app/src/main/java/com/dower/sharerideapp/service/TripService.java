package com.dower.sharerideapp.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.dower.sharerideapp.core.serverdb.dao.NntJourneyMapper;
import com.dower.sharerideapp.core.serverdb.dao.NntTravelCityMapper;
import com.dower.sharerideapp.core.serverdb.model.NntJourney;
import com.dower.sharerideapp.core.serverdb.model.NntTravelCity;
import com.dower.sharerideapp.core.serverdb.model.NntTravelCityExample;
import com.dower.sharerideapp.utils.CommUtil;
import com.dower.sharerideapp.utils.Result;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * @param
 * @Author: wangwei
 * @Description:
 * @Date: Created in 16:26   2018/7/25
 */
@Service
public class TripService {
    private static final Logger LOGGER = LogManager.getLogger(TripService.class);
    @Autowired
    private NntJourneyMapper nntJourneyMapper;
    public Result creatTrip(String params){
        Result result = new Result(false,"创建行程异常！");
        try{
            JSONObject jsonparams = JSON.parseObject(params);
            NntJourney nntJourney = new NntJourney();
            nntJourney.setNumUserId(jsonparams.getInteger("numUserId"));
            nntJourney.setNumStartTravelCityId(jsonparams.getInteger("resPlace"));
            nntJourney.setNumEndTravelCityId(jsonparams.getInteger("tarPlace"));
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            nntJourney.setDatDepartDate(sdf.parse(jsonparams.getString("startTime")));
            nntJourney.setNumMaxPassengers(jsonparams.getInteger("passengers"));
            nntJourney.setNumUnitPrice(new BigDecimal(jsonparams.getString("unitPrice")));
            nntJourney.setNumMannedType(jsonparams.getInteger("mannedType"));
            nntJourney.setVcRouteNo(CommUtil.getVcRouteNo());
            nntJourney.setDatCreatDate(new Date());
            int i = nntJourneyMapper.insertSelective(nntJourney);
            result.setSuccess(true);
            result.setMsg("创建行程成功！");
        }catch (Exception e){
            e.printStackTrace();
            LOGGER.error("创建行程异常！");
        }
        return result;
    }

}
