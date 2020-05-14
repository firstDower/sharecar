package com.dower.product.core.serverdb.dao;

import com.dower.product.core.serverdb.model.NntJourney;
import com.dower.product.core.serverdb.model.NntJourneyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NntJourneyMapper {
    long countByExample(NntJourneyExample example);

    int deleteByExample(NntJourneyExample example);

    int deleteByPrimaryKey(Integer numRouteId);

    int insert(NntJourney record);

    int insertSelective(NntJourney record);

    List<NntJourney> selectByExample(NntJourneyExample example);

    NntJourney selectByPrimaryKey(Integer numRouteId);

    int updateByExampleSelective(@Param("record") NntJourney record, @Param("example") NntJourneyExample example);

    int updateByExample(@Param("record") NntJourney record, @Param("example") NntJourneyExample example);

    int updateByPrimaryKeySelective(NntJourney record);

    int updateByPrimaryKey(NntJourney record);
}