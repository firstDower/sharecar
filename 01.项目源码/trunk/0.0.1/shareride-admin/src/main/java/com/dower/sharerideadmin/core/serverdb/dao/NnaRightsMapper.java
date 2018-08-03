package com.dower.sharerideadmin.core.serverdb.dao;

import com.dower.sharerideadmin.core.serverdb.model.NnaRights;
import com.dower.sharerideadmin.core.serverdb.model.NnaRightsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NnaRightsMapper {
    long countByExample(NnaRightsExample example);

    int deleteByExample(NnaRightsExample example);

    int deleteByPrimaryKey(Integer numRightId);

    int insert(NnaRights record);

    int insertSelective(NnaRights record);

    List<NnaRights> selectByExample(NnaRightsExample example);

    NnaRights selectByPrimaryKey(Integer numRightId);

    int updateByExampleSelective(@Param("record") NnaRights record, @Param("example") NnaRightsExample example);

    int updateByExample(@Param("record") NnaRights record, @Param("example") NnaRightsExample example);

    int updateByPrimaryKeySelective(NnaRights record);

    int updateByPrimaryKey(NnaRights record);
}