package com.dower.sharerideapp.core.serverdb.dao;

import com.dower.sharerideapp.core.serverdb.model.ClFnModel;
import com.dower.sharerideapp.core.serverdb.model.ClFnModelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClFnModelMapper {
    long countByExample(ClFnModelExample example);

    int deleteByExample(ClFnModelExample example);

    int deleteByPrimaryKey(Long numId);

    int insert(ClFnModel record);

    int insertSelective(ClFnModel record);

    List<ClFnModel> selectByExample(ClFnModelExample example);

    ClFnModel selectByPrimaryKey(Long numId);

    int updateByExampleSelective(@Param("record") ClFnModel record, @Param("example") ClFnModelExample example);

    int updateByExample(@Param("record") ClFnModel record, @Param("example") ClFnModelExample example);

    int updateByPrimaryKeySelective(ClFnModel record);

    int updateByPrimaryKey(ClFnModel record);
}