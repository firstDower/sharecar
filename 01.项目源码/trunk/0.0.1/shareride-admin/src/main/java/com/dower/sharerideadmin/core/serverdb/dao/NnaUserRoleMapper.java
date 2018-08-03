package com.dower.sharerideadmin.core.serverdb.dao;

import com.dower.sharerideadmin.core.serverdb.model.NnaUserRole;
import com.dower.sharerideadmin.core.serverdb.model.NnaUserRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NnaUserRoleMapper {
    long countByExample(NnaUserRoleExample example);

    int deleteByExample(NnaUserRoleExample example);

    int deleteByPrimaryKey(Integer numUserRoleId);

    int insert(NnaUserRole record);

    int insertSelective(NnaUserRole record);

    List<NnaUserRole> selectByExample(NnaUserRoleExample example);

    NnaUserRole selectByPrimaryKey(Integer numUserRoleId);

    int updateByExampleSelective(@Param("record") NnaUserRole record, @Param("example") NnaUserRoleExample example);

    int updateByExample(@Param("record") NnaUserRole record, @Param("example") NnaUserRoleExample example);

    int updateByPrimaryKeySelective(NnaUserRole record);

    int updateByPrimaryKey(NnaUserRole record);
}