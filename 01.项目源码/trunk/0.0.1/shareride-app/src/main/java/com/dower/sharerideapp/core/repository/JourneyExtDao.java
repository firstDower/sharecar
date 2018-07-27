package com.dower.sharerideapp.core.repository;

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
    public List<HashMap<String,Object>> getMyJobs(Map<String,String> paramMap);
}
