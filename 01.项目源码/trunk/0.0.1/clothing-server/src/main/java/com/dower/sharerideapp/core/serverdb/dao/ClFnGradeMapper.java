package com.dower.sharerideapp.core.serverdb.dao;

import com.dower.sharerideapp.core.serverdb.model.ClFnGrade;
import com.dower.sharerideapp.core.serverdb.model.ClFnGradeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClFnGradeMapper {
    long countByExample(ClFnGradeExample example);

    int deleteByExample(ClFnGradeExample example);

    int deleteByPrimaryKey(Long numId);

    int insert(ClFnGrade record);

    int insertSelective(ClFnGrade record);

    List<ClFnGrade> selectByExample(ClFnGradeExample example);

    ClFnGrade selectByPrimaryKey(Long numId);

    int updateByExampleSelective(@Param("record") ClFnGrade record, @Param("example") ClFnGradeExample example);

    int updateByExample(@Param("record") ClFnGrade record, @Param("example") ClFnGradeExample example);

    int updateByPrimaryKeySelective(ClFnGrade record);

    int updateByPrimaryKey(ClFnGrade record);
}