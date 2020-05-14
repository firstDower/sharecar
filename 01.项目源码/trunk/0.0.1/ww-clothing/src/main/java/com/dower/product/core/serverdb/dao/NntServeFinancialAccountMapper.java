package com.dower.product.core.serverdb.dao;

import com.dower.product.core.serverdb.model.NntServeFinancialAccount;
import com.dower.product.core.serverdb.model.NntServeFinancialAccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NntServeFinancialAccountMapper {
    long countByExample(NntServeFinancialAccountExample example);

    int deleteByExample(NntServeFinancialAccountExample example);

    int deleteByPrimaryKey(Integer numId);

    int insert(NntServeFinancialAccount record);

    int insertSelective(NntServeFinancialAccount record);

    List<NntServeFinancialAccount> selectByExample(NntServeFinancialAccountExample example);

    NntServeFinancialAccount selectByPrimaryKey(Integer numId);

    int updateByExampleSelective(@Param("record") NntServeFinancialAccount record, @Param("example") NntServeFinancialAccountExample example);

    int updateByExample(@Param("record") NntServeFinancialAccount record, @Param("example") NntServeFinancialAccountExample example);

    int updateByPrimaryKeySelective(NntServeFinancialAccount record);

    int updateByPrimaryKey(NntServeFinancialAccount record);
}