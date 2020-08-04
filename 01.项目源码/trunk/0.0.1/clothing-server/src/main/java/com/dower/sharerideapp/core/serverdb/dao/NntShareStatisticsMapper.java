package com.dower.sharerideapp.core.serverdb.dao;

import com.dower.sharerideapp.core.serverdb.model.NntShareStatistics;
import com.dower.sharerideapp.core.serverdb.model.NntShareStatisticsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NntShareStatisticsMapper {
    long countByExample(NntShareStatisticsExample example);

    int deleteByExample(NntShareStatisticsExample example);

    int deleteByPrimaryKey(Long numId);

    int insert(NntShareStatistics record);

    int insertSelective(NntShareStatistics record);

    List<NntShareStatistics> selectByExample(NntShareStatisticsExample example);

    NntShareStatistics selectByPrimaryKey(Long numId);

    int updateByExampleSelective(@Param("record") NntShareStatistics record, @Param("example") NntShareStatisticsExample example);

    int updateByExample(@Param("record") NntShareStatistics record, @Param("example") NntShareStatisticsExample example);

    int updateByPrimaryKeySelective(NntShareStatistics record);

    int updateByPrimaryKey(NntShareStatistics record);
}