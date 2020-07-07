package com.dower.sharerideapp.core.serverdb.dao;

import com.dower.sharerideapp.core.serverdb.model.ClProduct;
import com.dower.sharerideapp.core.serverdb.model.ClProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClProductMapper {
    long countByExample(ClProductExample example);

    int deleteByExample(ClProductExample example);

    int deleteByPrimaryKey(Long numId);

    int insert(ClProduct record);

    int insertSelective(ClProduct record);

    List<ClProduct> selectByExample(ClProductExample example);

    ClProduct selectByPrimaryKey(Long numId);

    int updateByExampleSelective(@Param("record") ClProduct record, @Param("example") ClProductExample example);

    int updateByExample(@Param("record") ClProduct record, @Param("example") ClProductExample example);

    int updateByPrimaryKeySelective(ClProduct record);

    int updateByPrimaryKey(ClProduct record);
}