package com.dower.product.core.repository;

import java.util.Map;

/**
 * @param
 * @Author: wangwei
 * @Description:
 * @Date: Created in 14:26   2019/3/26
 */

public interface SeatExtDao {
    //获取座位详情
    public Map<String,Object> getTripRecordDetailById(Map<String,Object> params);

    //<!-- 根据商户订单id跟新支付状态 -->
    public Integer updatePayStateByOrderno(Map<String,Object> params);
}
