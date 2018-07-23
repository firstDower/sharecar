package com.dower.sharerideapp.core.serverdb.dao;

import com.dower.sharerideapp.core.serverdb.model.NntUserinfo;
import com.dower.sharerideapp.core.serverdb.model.NntUserinfoExample;
import com.dower.sharerideapp.core.serverdb.model.NntUserinfoWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NntUserinfoMapper {
    long countByExample(NntUserinfoExample example);

    int deleteByExample(NntUserinfoExample example);

    int deleteByPrimaryKey(Integer numId);

    int insert(NntUserinfoWithBLOBs record);

    int insertSelective(NntUserinfoWithBLOBs record);

    List<NntUserinfoWithBLOBs> selectByExampleWithBLOBs(NntUserinfoExample example);

    List<NntUserinfo> selectByExample(NntUserinfoExample example);

    NntUserinfoWithBLOBs selectByPrimaryKey(Integer numId);

    int updateByExampleSelective(@Param("record") NntUserinfoWithBLOBs record, @Param("example") NntUserinfoExample example);

    int updateByExampleWithBLOBs(@Param("record") NntUserinfoWithBLOBs record, @Param("example") NntUserinfoExample example);

    int updateByExample(@Param("record") NntUserinfo record, @Param("example") NntUserinfoExample example);

    int updateByPrimaryKeySelective(NntUserinfoWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(NntUserinfoWithBLOBs record);

    int updateByPrimaryKey(NntUserinfo record);
}