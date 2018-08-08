package com.dower.sharerideadmin.core.serverdb.dao;

import com.dower.sharerideadmin.core.serverdb.model.NnaAccounting;
import com.dower.sharerideadmin.core.serverdb.model.NnaAccountingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NnaAccountingMapper {
    long countByExample(NnaAccountingExample example);

    int deleteByExample(NnaAccountingExample example);

    int deleteByPrimaryKey(Integer numAccountingId);

    int insert(NnaAccounting record);

    int insertSelective(NnaAccounting record);

    List<NnaAccounting> selectByExample(NnaAccountingExample example);

    NnaAccounting selectByPrimaryKey(Integer numAccountingId);

    int updateByExampleSelective(@Param("record") NnaAccounting record, @Param("example") NnaAccountingExample example);

    int updateByExample(@Param("record") NnaAccounting record, @Param("example") NnaAccountingExample example);

    int updateByPrimaryKeySelective(NnaAccounting record);

    int updateByPrimaryKey(NnaAccounting record);
}