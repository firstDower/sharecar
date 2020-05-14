package com.dower.product.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.dower.product.core.serverdb.dao.NntJourneyMapper;
import com.dower.product.core.serverdb.model.NntJourney;
import com.dower.product.utils.CommUtil;
import com.dower.product.utils.Result;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

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

    /**
     * 创建行程
     * @param params
     * @return
     */
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

    public Result updateRouteStatus(String params){
        Result result = new Result(false,"修改行程状态异常！");
        try{
            JSONObject jsonparams = JSON.parseObject(params);
            NntJourney nntJourney = new NntJourney();
            nntJourney.setNumRouteId(jsonparams.getInteger("numRouteId"));
            nntJourney.setDatUpdataDate(new Date());
            nntJourney.setNumRouteState(jsonparams.getInteger("routeState"));
            int i = nntJourneyMapper.updateByPrimaryKeySelective(nntJourney);
            result.setSuccess(true);
            result.setMsg("修改行程成功！");
        }catch (Exception e){
            e.printStackTrace();
            LOGGER.error("修改行程状态异常！");
        }
        return result;
    }

    /**
     * 修改行程
     * @param params
     * @return
     */
    public Result updateTrip(String params){
        Result result = new Result(false,"修改行程异常！");
        try{
            JSONObject jsonparams = JSON.parseObject(params);
            NntJourney nntJourney = new NntJourney();
            nntJourney.setNumRouteId(jsonparams.getInteger("numRouteId"));
            nntJourney.setNumUserId(jsonparams.getInteger("numUserId"));
            nntJourney.setNumStartTravelCityId(jsonparams.getInteger("resPlace"));
            nntJourney.setNumEndTravelCityId(jsonparams.getInteger("tarPlace"));
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            nntJourney.setDatDepartDate(sdf.parse(jsonparams.getString("startTime")));
            nntJourney.setNumMaxPassengers(jsonparams.getInteger("passengers"));
            nntJourney.setNumUnitPrice(new BigDecimal(jsonparams.getString("unitPrice")));
            nntJourney.setNumMannedType(jsonparams.getInteger("mannedType"));
            nntJourney.setDatUpdataDate(new Date());
            int i = nntJourneyMapper.updateByPrimaryKeySelective(nntJourney);
            result.setSuccess(true);
            result.setMsg("修改行程成功！");
        }catch (Exception e){
            e.printStackTrace();
            LOGGER.error("修改行程异常！");
        }
        return result;
    }
}
