package com.dower.sharerideapp.core.serverdb.dao;

import com.dower.sharerideapp.core.serverdb.model.NntCustomClouthUsers;
import com.dower.sharerideapp.core.serverdb.model.NntCustomClouthUsersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NntCustomClouthUsersMapper {
    long countByExample(NntCustomClouthUsersExample example);

    int deleteByExample(NntCustomClouthUsersExample example);

    int deleteByPrimaryKey(Long numCustomClouthUserId);

    int insert(NntCustomClouthUsers record);

    int insertSelective(NntCustomClouthUsers record);

    List<NntCustomClouthUsers> selectByExample(NntCustomClouthUsersExample example);

    NntCustomClouthUsers selectByPrimaryKey(Long numCustomClouthUserId);

    int updateByExampleSelective(@Param("record") NntCustomClouthUsers record, @Param("example") NntCustomClouthUsersExample example);

    int updateByExample(@Param("record") NntCustomClouthUsers record, @Param("example") NntCustomClouthUsersExample example);

    int updateByPrimaryKeySelective(NntCustomClouthUsers record);

    int updateByPrimaryKey(NntCustomClouthUsers record);
}