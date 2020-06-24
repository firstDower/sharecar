package com.dower.sharerideapp.service;

import com.alibaba.fastjson.JSONObject;
import com.dower.sharerideapp.core.repository.SeatExtDao;
import com.dower.sharerideapp.core.serverdb.dao.NntOrderMapper;
import com.dower.sharerideapp.core.serverdb.dao.NntTransLogMapper;
import com.dower.sharerideapp.core.serverdb.model.NntOrder;
import com.dower.sharerideapp.core.serverdb.model.NntTransLog;
import com.dower.sharerideapp.utils.Result;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
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
    @Autowired
    private NntTransLogMapper nntTransLogMapper;
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
     * 根据商户订单id跟新支付状态
     */

    public Result updatePayStatusByOrderId(String orderNo){
        Result result = new Result(false,"根据商户订单id跟新支付状态异常！");
        try {
            Map<String,Object> params = new HashMap<>();
            params.put("orderNo",orderNo);
            Integer i = seatExtDao.updatePayStateByOrderno(params);
            LOGGER.info("根据商户订单id跟新支付状态result="+result);
            result.setSuccess(true);
        }catch (Exception e){
            LOGGER.error("根据商户订单id跟新支付状态异常！");
            result.setSuccess(false);
        }
        return result;
    }

    /**
     * 根据商户订单id查询订单（座位）详情
     */
    public Result getSeatDetailByOrderNo(String orderNo){
        Result result = new Result(false,"根据商户订单id查询订单（座位）详情异常！");
        try {
            Map<String,Object> params = new HashMap<>();
            params.put("orderNo",orderNo);
            Map<String, Object> tripRecordDetailById = seatExtDao.getTripRecordDetailById(params);
            result.setSuccess(true);
            result.setResultInfo(tripRecordDetailById);
        }catch (Exception e){
            LOGGER.error("根据商户订单id查询订单（座位）详情异常！");
            result.setSuccess(false);
        }
        return result;
    }


    /**
     * 生成支付流水
     */
    public Result createPayment(Map<String,String> notifyMap){
        Result result = new Result(false,"生成支付流水异常！");
        try {
            String out_trade_no = notifyMap.get("out_trade_no");
            Result getSeatDetailByOrderNo = this.getSeatDetailByOrderNo(out_trade_no);
            Map<String,Object> resultInfo = (Map<String,Object>)getSeatDetailByOrderNo.getResultInfo();
            NntTransLog record = new NntTransLog();
            record.setDatCreateTime(new Date());
            record.setDatLastUpdataTime(new Date());
            DateFormat format = new SimpleDateFormat("yyyyMMddHHmmss");
            record.setDatTransTime(format.parse(notifyMap.get("time_end")));
            Object num_order_id = resultInfo.get("NUM_ORDER_ID");
            Integer integernum_order_id = Integer.valueOf(num_order_id.toString());
            record.setNumOrderId(integernum_order_id);
            record.setVcOrderNo(out_trade_no);
            String cash_fee = notifyMap.get("cash_fee");
            BigDecimal rransMoney = new BigDecimal(Double.toString(Double.parseDouble(cash_fee) / 100));
            record.setNumTransMoneySum(rransMoney);
            record.setNumUserId(Integer.parseInt(resultInfo.get("NUM_USER_ID").toString()));
            int i = nntTransLogMapper.insertSelective(record);
            LOGGER.info("生成支付流水成功！");
        }catch (Exception e){
            e.printStackTrace();
            LOGGER.error("生成支付流水异常！");
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
