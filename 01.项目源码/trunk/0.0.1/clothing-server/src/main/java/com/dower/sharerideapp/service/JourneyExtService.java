package com.dower.sharerideapp.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.dower.sharerideapp.core.bean.req.NntJourneyReq;
import com.dower.sharerideapp.core.repository.JourneyExtDao;
import com.dower.sharerideapp.core.serverdb.dao.NntOrderMapper;
import com.dower.sharerideapp.core.serverdb.dao.NntUserJourneyMapper;
import com.dower.sharerideapp.core.serverdb.model.NntJourney;
import com.dower.sharerideapp.core.serverdb.model.NntOrder;
import com.dower.sharerideapp.core.serverdb.model.NntUserJourney;
import com.dower.sharerideapp.utils.CommUtil;
import com.dower.sharerideapp.utils.Result;
import org.apache.ibatis.annotations.Options;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
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
    @Autowired
    private NntUserJourneyMapper nntUserJourneyMapper;
    @Autowired
    private NntOrderMapper nntOrderMapper;
    /**
     * 行程搜索
     * @param
     * @return
     */
    public List<HashMap<String, Object>> routeSearch(NntJourneyReq nntJourneyReq){
        List<HashMap<String, Object>> myJobs = journeyExtDao.routeSearch(nntJourneyReq);
        return myJobs;
    }

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
     * 查询我的坐车记录
     * @param params
     * @return
     */
    public List<HashMap<String, Object>> getMyTripRecord(String params){
        JSONObject jsonparams = com.alibaba.fastjson.JSON.parseObject(params);
        Map<String,String> paramMap = new HashMap<String,String>();
        paramMap.put("numUserId",jsonparams.getString("numUserId"));
        List<HashMap<String, Object>> getMyTripRecord = journeyExtDao.getMyTripRecord(paramMap);
        return getMyTripRecord;
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

    //预约座位
    public Result subscribeTrip(String params) {
        Result result = new Result(false,"预约异常！");
        try{
            JSONObject jsonparams = JSON.parseObject(params);
            NntUserJourney nntUserJourney = new NntUserJourney();
            nntUserJourney.setNumUserId(jsonparams.getInteger("numUserId"));
            nntUserJourney.setNumRouteId(jsonparams.getInteger("numRouteId"));
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
            nntUserJourney.setDatCreatDate(new Date());
            int re = nntUserJourneyMapper.insertSelective(nntUserJourney);
            //插入订单附表
            Integer numNntUserJourneyId = nntUserJourney.getNumNntUserJourneyId();
            NntOrder nntOrder = new NntOrder();
            nntOrder.setNumNntUserJourneyId(numNntUserJourneyId);
            nntOrder.setDatCreatDate(new Date());
            //nntOrder.setVcOrderNo(CommUtil.getOrderNo(jsonparams.getString("numRouteId")));
            int insertOrder = nntOrderMapper.insertSelective(nntOrder);
            LOGGER.info("预约行程结果：orderId="+nntOrder.getNumId()+";numRouteId="+jsonparams.getString("numRouteId")+";numNntUserJourneyId="+numNntUserJourneyId);
            result.setSuccess(true);
            result.setMsg("预约行程成功！");
        }catch (Exception e){
            e.printStackTrace();
            LOGGER.error("预约行程异常！");
        }
        return result;

    }
}
