package com.dower.sharerideapp.core.serverdb.dao;

import com.dower.sharerideapp.core.serverdb.model.NntUsers;
import com.dower.sharerideapp.core.serverdb.model.NntUsersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NntUsersMapper {
    long countByExample(NntUsersExample example);

    int deleteByExample(NntUsersExample example);

    int deleteByPrimaryKey(Integer numId);

    int insert(NntUsers record);

    int insertSelective(NntUsers record);

    List<NntUsers> selectByExample(NntUsersExample example);

    NntUsers selectByPrimaryKey(Integer numId);

    int updateByExampleSelective(@Param("record") NntUsers record, @Param("example") NntUsersExample example);

    int updateByExample(@Param("record") NntUsers record, @Param("example") NntUsersExample example);

    int updateByPrimaryKeySelective(NntUsers record);

    int updateByPrimaryKey(NntUsers record);
}