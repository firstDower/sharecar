package com.dower.sharerideapp.core.serverdb.dao;

import com.dower.sharerideapp.core.serverdb.model.ClFnSchool;
import com.dower.sharerideapp.core.serverdb.model.ClFnSchoolExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClFnSchoolMapper {
    long countByExample(ClFnSchoolExample example);

    int deleteByExample(ClFnSchoolExample example);

    int deleteByPrimaryKey(Long numId);

    int insert(ClFnSchool record);

    int insertSelective(ClFnSchool record);

    List<ClFnSchool> selectByExample(ClFnSchoolExample example);

    ClFnSchool selectByPrimaryKey(Long numId);

    int updateByExampleSelective(@Param("record") ClFnSchool record, @Param("example") ClFnSchoolExample example);

    int updateByExample(@Param("record") ClFnSchool record, @Param("example") ClFnSchoolExample example);

    int updateByPrimaryKeySelective(ClFnSchool record);

    int updateByPrimaryKey(ClFnSchool record);
}