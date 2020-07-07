package com.dower.sharerideapp.core.serverdb.dao;

import com.dower.sharerideapp.core.serverdb.model.NnaUsers;
import com.dower.sharerideapp.core.serverdb.model.NnaUsersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NnaUsersMapper {
    long countByExample(NnaUsersExample example);

    int deleteByExample(NnaUsersExample example);

    int deleteByPrimaryKey(Integer numUserId);

    int insert(NnaUsers record);

    int insertSelective(NnaUsers record);

    List<NnaUsers> selectByExample(NnaUsersExample example);

    NnaUsers selectByPrimaryKey(Integer numUserId);

    int updateByExampleSelective(@Param("record") NnaUsers record, @Param("example") NnaUsersExample example);

    int updateByExample(@Param("record") NnaUsers record, @Param("example") NnaUsersExample example);

    int updateByPrimaryKeySelective(NnaUsers record);

    int updateByPrimaryKey(NnaUsers record);
}