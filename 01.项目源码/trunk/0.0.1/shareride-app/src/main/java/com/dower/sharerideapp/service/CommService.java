package com.dower.sharerideapp.service;

import com.dower.sharerideapp.core.repository.UsersDao;
import com.dower.sharerideapp.core.serverdb.dao.NntTravelCityMapper;
import com.dower.sharerideapp.core.serverdb.model.NntTravelCity;
import com.dower.sharerideapp.core.serverdb.model.NntTravelCityExample;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @param
 * @Author: wangwei
 * @Description:
 * @Date: Created in 16:26   2018/7/25
 */
@Service
public class CommService {
    private static final Logger LOGGER = LogManager.getLogger(CommService.class);
    @Autowired
    private NntTravelCityMapper nntTravelCityMapper;
    public List<NntTravelCity> getTravelCity(){
        NntTravelCityExample example = new NntTravelCityExample();
        NntTravelCityExample.Criteria criteria = example.createCriteria();
        criteria.andNumIsDelEqualTo(1);
        example.setOrderByClause("NUM_SORT desc");
        List<NntTravelCity> nntTravelCities = nntTravelCityMapper.selectByExample(example);
        return nntTravelCities;
    }

}
