package com.dower.sharerideapp.core.repository;

import com.dower.sharerideapp.core.bean.req.NntJourneyReq;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @param
 * @Author: wangwei
 * @Description:
 * @Date: Created in 14:38   2018/7/27
 */

public interface JourneyExtDao {

    /**
     * 司机查询发布的行程
     * @param paramMap
     * @return
     */
    public List<HashMap<String,Object>> getMyJobs(Map<String,String> paramMap);

    /**
     * 行程搜索
     * @param paramMap
     * @return
     */
    public List<HashMap<String,Object>> routeSearch(NntJourneyReq nntJourneyReq);

    /**
     * 根据行程id查询行程详情
     * @param paramMap
     * @return
     */
    public HashMap<String,Object> getRouteDetailById(Map<String,String> paramMap);
}
