package com.dower.sharerideapp.core.serverdb.dao;

import com.dower.sharerideapp.core.serverdb.model.NntCarOwnerInfo;
import com.dower.sharerideapp.core.serverdb.model.NntCarOwnerInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NntCarOwnerInfoMapper {
    long countByExample(NntCarOwnerInfoExample example);

    int deleteByExample(NntCarOwnerInfoExample example);

    int deleteByPrimaryKey(Integer numId);

    int insert(NntCarOwnerInfo record);

    int insertSelective(NntCarOwnerInfo record);

    List<NntCarOwnerInfo> selectByExample(NntCarOwnerInfoExample example);

    NntCarOwnerInfo selectByPrimaryKey(Integer numId);

    int updateByExampleSelective(@Param("record") NntCarOwnerInfo record, @Param("example") NntCarOwnerInfoExample example);

    int updateByExample(@Param("record") NntCarOwnerInfo record, @Param("example") NntCarOwnerInfoExample example);

    int updateByPrimaryKeySelective(NntCarOwnerInfo record);

    int updateByPrimaryKey(NntCarOwnerInfo record);
}