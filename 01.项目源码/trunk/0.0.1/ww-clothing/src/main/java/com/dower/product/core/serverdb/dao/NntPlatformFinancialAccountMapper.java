package com.dower.product.core.serverdb.dao;

import com.dower.product.core.serverdb.model.NntPlatformFinancialAccount;
import com.dower.product.core.serverdb.model.NntPlatformFinancialAccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NntPlatformFinancialAccountMapper {
    long countByExample(NntPlatformFinancialAccountExample example);

    int deleteByExample(NntPlatformFinancialAccountExample example);

    int deleteByPrimaryKey(Integer numId);

    int insert(NntPlatformFinancialAccount record);

    int insertSelective(NntPlatformFinancialAccount record);

    List<NntPlatformFinancialAccount> selectByExample(NntPlatformFinancialAccountExample example);

    NntPlatformFinancialAccount selectByPrimaryKey(Integer numId);

    int updateByExampleSelective(@Param("record") NntPlatformFinancialAccount record, @Param("example") NntPlatformFinancialAccountExample example);

    int updateByExample(@Param("record") NntPlatformFinancialAccount record, @Param("example") NntPlatformFinancialAccountExample example);

    int updateByPrimaryKeySelective(NntPlatformFinancialAccount record);

    int updateByPrimaryKey(NntPlatformFinancialAccount record);
}