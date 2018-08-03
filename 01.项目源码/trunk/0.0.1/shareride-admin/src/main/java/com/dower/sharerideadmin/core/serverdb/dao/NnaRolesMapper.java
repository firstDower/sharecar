package com.dower.sharerideadmin.core.serverdb.dao;

import com.dower.sharerideadmin.core.serverdb.model.NnaRoles;
import com.dower.sharerideadmin.core.serverdb.model.NnaRolesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NnaRolesMapper {
    long countByExample(NnaRolesExample example);

    int deleteByExample(NnaRolesExample example);

    int deleteByPrimaryKey(Integer numRoleId);

    int insert(NnaRoles record);

    int insertSelective(NnaRoles record);

    List<NnaRoles> selectByExample(NnaRolesExample example);

    NnaRoles selectByPrimaryKey(Integer numRoleId);

    int updateByExampleSelective(@Param("record") NnaRoles record, @Param("example") NnaRolesExample example);

    int updateByExample(@Param("record") NnaRoles record, @Param("example") NnaRolesExample example);

    int updateByPrimaryKeySelective(NnaRoles record);

    int updateByPrimaryKey(NnaRoles record);
}