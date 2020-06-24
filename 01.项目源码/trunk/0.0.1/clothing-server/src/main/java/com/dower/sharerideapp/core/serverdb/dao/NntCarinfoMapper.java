package com.dower.sharerideapp.core.serverdb.dao;

import com.dower.sharerideapp.core.serverdb.model.NntCarinfo;
import com.dower.sharerideapp.core.serverdb.model.NntCarinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NntCarinfoMapper {
    long countByExample(NntCarinfoExample example);

    int deleteByExample(NntCarinfoExample example);

    int deleteByPrimaryKey(Integer numId);

    int insert(NntCarinfo record);

    int insertSelective(NntCarinfo record);

    List<NntCarinfo> selectByExample(NntCarinfoExample example);

    NntCarinfo selectByPrimaryKey(Integer numId);

    int updateByExampleSelective(@Param("record") NntCarinfo record, @Param("example") NntCarinfoExample example);

    int updateByExample(@Param("record") NntCarinfo record, @Param("example") NntCarinfoExample example);

    int updateByPrimaryKeySelective(NntCarinfo record);

    int updateByPrimaryKey(NntCarinfo record);
}