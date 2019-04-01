package com.dower.sharerideapp.core.repository;

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
}
