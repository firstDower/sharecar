package com.dower.sharerideapp.core.serverdb.dao;

import com.dower.sharerideapp.core.serverdb.model.NntTransLog;
import com.dower.sharerideapp.core.serverdb.model.NntTransLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NntTransLogMapper {
    long countByExample(NntTransLogExample example);

    int deleteByExample(NntTransLogExample example);

    int deleteByPrimaryKey(Integer numTransLogId);

    int insert(NntTransLog record);

    int insertSelective(NntTransLog record);

    List<NntTransLog> selectByExample(NntTransLogExample example);

    NntTransLog selectByPrimaryKey(Integer numTransLogId);

    int updateByExampleSelective(@Param("record") NntTransLog record, @Param("example") NntTransLogExample example);

    int updateByExample(@Param("record") NntTransLog record, @Param("example") NntTransLogExample example);

    int updateByPrimaryKeySelective(NntTransLog record);

    int updateByPrimaryKey(NntTransLog record);
}