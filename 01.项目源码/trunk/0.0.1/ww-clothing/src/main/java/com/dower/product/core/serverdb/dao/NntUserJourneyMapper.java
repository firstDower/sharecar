package com.dower.product.core.serverdb.dao;

import com.dower.product.core.serverdb.model.NntUserJourney;
import com.dower.product.core.serverdb.model.NntUserJourneyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NntUserJourneyMapper {
    long countByExample(NntUserJourneyExample example);

    int deleteByExample(NntUserJourneyExample example);

    int deleteByPrimaryKey(Integer numNntUserJourneyId);

    int insert(NntUserJourney record);

    int insertSelective(NntUserJourney record);

    List<NntUserJourney> selectByExample(NntUserJourneyExample example);

    NntUserJourney selectByPrimaryKey(Integer numNntUserJourneyId);

    int updateByExampleSelective(@Param("record") NntUserJourney record, @Param("example") NntUserJourneyExample example);

    int updateByExample(@Param("record") NntUserJourney record, @Param("example") NntUserJourneyExample example);

    int updateByPrimaryKeySelective(NntUserJourney record);

    int updateByPrimaryKey(NntUserJourney record);
}