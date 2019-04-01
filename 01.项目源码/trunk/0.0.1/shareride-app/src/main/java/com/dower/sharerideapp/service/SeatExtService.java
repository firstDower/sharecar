package com.dower.sharerideapp.service;

import com.alibaba.fastjson.JSONObject;
import com.dower.sharerideapp.core.repository.SeatExtDao;
import com.dower.sharerideapp.core.serverdb.dao.NntOrderMapper;
import com.dower.sharerideapp.core.serverdb.model.NntOrder;
import com.dower.sharerideapp.utils.Result;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * @param
 * @Author: wangwei
 * @Description:
 * @Date: Created in 13:35   2019/3/26
 */
@Service
public class SeatExtService {
    private static final Logger LOGGER = LogManager.getLogger(SeatExtService.class);
    @Autowired
    private SeatExtDao seatExtDao;
    @Autowired
    private NntOrderMapper nntOrderMapper;

    /**
     * 商户订单id更新到数据库
     */
    public Result updataSeatDetail(NntOrder nntOrder){
        Result result = new Result(false,"更新座位详情异常！");
        try{
            int i = nntOrderMapper.updateByPrimaryKeySelective(nntOrder);
            LOGGER.info("查询seat详情成功！result="+i);
            result.setSuccess(true);
            result.setMsg("查询seat详情成功！");
        }catch (Exception e){
            e.printStackTrace();
            LOGGER.error("更新座位详情异常！");
        }
        return result;
    }


    /**
     * 根据userJourneyId，查询seat详情。
     * @return
     */
    public Result getSeatDetailById(Map<String,Object> params){
        Result result = new Result(false,"查询seat详情异常！");
        try{
            Map<String, Object> tripRecordDetail = seatExtDao.getTripRecordDetailById(params);
            JSONObject jsonObject = new JSONObject(tripRecordDetail);
            LOGGER.info("查询seat详情成功！");
            result.setSuccess(true);
            result.setMsg("查询seat详情成功！");
            result.setResultInfo(jsonObject);
        }catch (Exception e){
            e.printStackTrace();
            LOGGER.error("查询seat详情异常！");
        }
        return result;
    }




}
