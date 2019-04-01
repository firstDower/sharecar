package com.dower.sharerideapp.core.serverdb.dao;

import com.dower.sharerideapp.core.serverdb.model.NntOrder;
import com.dower.sharerideapp.core.serverdb.model.NntOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NntOrderMapper {
    long countByExample(NntOrderExample example);

    int deleteByExample(NntOrderExample example);

    int deleteByPrimaryKey(Integer numId);

    int insert(NntOrder record);

    int insertSelective(NntOrder record);

    List<NntOrder> selectByExample(NntOrderExample example);

    NntOrder selectByPrimaryKey(Integer numId);

    int updateByExampleSelective(@Param("record") NntOrder record, @Param("example") NntOrderExample example);

    int updateByExample(@Param("record") NntOrder record, @Param("example") NntOrderExample example);

    int updateByPrimaryKeySelective(NntOrder record);

    int updateByPrimaryKey(NntOrder record);
}