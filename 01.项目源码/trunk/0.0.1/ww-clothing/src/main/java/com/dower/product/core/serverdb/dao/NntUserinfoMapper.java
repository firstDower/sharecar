package com.dower.product.core.serverdb.dao;

import com.dower.product.core.serverdb.model.NntUserinfo;
import com.dower.product.core.serverdb.model.NntUserinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NntUserinfoMapper {
    long countByExample(NntUserinfoExample example);

    int deleteByExample(NntUserinfoExample example);

    int deleteByPrimaryKey(Integer numId);

    int insert(NntUserinfo record);

    int insertSelective(NntUserinfo record);

    List<NntUserinfo> selectByExample(NntUserinfoExample example);

    NntUserinfo selectByPrimaryKey(Integer numId);

    int updateByExampleSelective(@Param("record") NntUserinfo record, @Param("example") NntUserinfoExample example);

    int updateByExample(@Param("record") NntUserinfo record, @Param("example") NntUserinfoExample example);

    int updateByPrimaryKeySelective(NntUserinfo record);

    int updateByPrimaryKey(NntUserinfo record);
}