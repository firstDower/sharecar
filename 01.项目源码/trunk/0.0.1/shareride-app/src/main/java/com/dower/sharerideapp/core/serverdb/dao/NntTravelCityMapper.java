package com.dower.sharerideapp.core.serverdb.dao;

import com.dower.sharerideapp.core.serverdb.model.NntTravelCity;
import com.dower.sharerideapp.core.serverdb.model.NntTravelCityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NntTravelCityMapper {
    long countByExample(NntTravelCityExample example);

    int deleteByExample(NntTravelCityExample example);

    int deleteByPrimaryKey(Integer numTravelCityId);

    int insert(NntTravelCity record);

    int insertSelective(NntTravelCity record);

    List<NntTravelCity> selectByExample(NntTravelCityExample example);

    NntTravelCity selectByPrimaryKey(Integer numTravelCityId);

    int updateByExampleSelective(@Param("record") NntTravelCity record, @Param("example") NntTravelCityExample example);

    int updateByExample(@Param("record") NntTravelCity record, @Param("example") NntTravelCityExample example);

    int updateByPrimaryKeySelective(NntTravelCity record);

    int updateByPrimaryKey(NntTravelCity record);
}