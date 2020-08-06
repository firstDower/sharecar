package com.dower.sharerideapp.core.serverdb.dao;

import com.dower.sharerideapp.core.serverdb.model.NntShareStatisticsSettlement;
import com.dower.sharerideapp.core.serverdb.model.NntShareStatisticsSettlementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NntShareStatisticsSettlementMapper {
    long countByExample(NntShareStatisticsSettlementExample example);

    int deleteByExample(NntShareStatisticsSettlementExample example);

    int deleteByPrimaryKey(Long numId);

    int insert(NntShareStatisticsSettlement record);

    int insertSelective(NntShareStatisticsSettlement record);

    List<NntShareStatisticsSettlement> selectByExample(NntShareStatisticsSettlementExample example);

    NntShareStatisticsSettlement selectByPrimaryKey(Long numId);

    int updateByExampleSelective(@Param("record") NntShareStatisticsSettlement record, @Param("example") NntShareStatisticsSettlementExample example);

    int updateByExample(@Param("record") NntShareStatisticsSettlement record, @Param("example") NntShareStatisticsSettlementExample example);

    int updateByPrimaryKeySelective(NntShareStatisticsSettlement record);

    int updateByPrimaryKey(NntShareStatisticsSettlement record);
}