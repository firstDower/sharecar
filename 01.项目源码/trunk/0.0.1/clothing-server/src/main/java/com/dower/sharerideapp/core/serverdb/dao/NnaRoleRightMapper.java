package com.dower.sharerideapp.core.serverdb.dao;

import com.dower.sharerideapp.core.serverdb.model.NnaRoleRight;
import com.dower.sharerideapp.core.serverdb.model.NnaRoleRightExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NnaRoleRightMapper {
    long countByExample(NnaRoleRightExample example);

    int deleteByExample(NnaRoleRightExample example);

    int deleteByPrimaryKey(Integer numRoleRightId);

    int insert(NnaRoleRight record);

    int insertSelective(NnaRoleRight record);

    List<NnaRoleRight> selectByExample(NnaRoleRightExample example);

    NnaRoleRight selectByPrimaryKey(Integer numRoleRightId);

    int updateByExampleSelective(@Param("record") NnaRoleRight record, @Param("example") NnaRoleRightExample example);

    int updateByExample(@Param("record") NnaRoleRight record, @Param("example") NnaRoleRightExample example);

    int updateByPrimaryKeySelective(NnaRoleRight record);

    int updateByPrimaryKey(NnaRoleRight record);
}