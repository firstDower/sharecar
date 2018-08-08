package com.dower.sharerideadmin.core.serverdb.dao;

import com.dower.sharerideadmin.core.serverdb.model.NnaOrder;
import com.dower.sharerideadmin.core.serverdb.model.NnaOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NnaOrderMapper {
    long countByExample(NnaOrderExample example);

    int deleteByExample(NnaOrderExample example);

    int deleteByPrimaryKey(Integer numOrderId);

    int insert(NnaOrder record);

    int insertSelective(NnaOrder record);

    List<NnaOrder> selectByExample(NnaOrderExample example);

    NnaOrder selectByPrimaryKey(Integer numOrderId);

    int updateByExampleSelective(@Param("record") NnaOrder record, @Param("example") NnaOrderExample example);

    int updateByExample(@Param("record") NnaOrder record, @Param("example") NnaOrderExample example);

    int updateByPrimaryKeySelective(NnaOrder record);

    int updateByPrimaryKey(NnaOrder record);
}