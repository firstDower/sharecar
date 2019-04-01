package com.dower.sharerideapp.core.serverdb.dao;

import com.dower.sharerideapp.core.serverdb.model.NntConsumeFinancialAccount;
import com.dower.sharerideapp.core.serverdb.model.NntConsumeFinancialAccountExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NntConsumeFinancialAccountMapper {
    long countByExample(NntConsumeFinancialAccountExample example);

    int deleteByExample(NntConsumeFinancialAccountExample example);

    int deleteByPrimaryKey(Integer numId);

    int insert(NntConsumeFinancialAccount record);

    int insertSelective(NntConsumeFinancialAccount record);

    List<NntConsumeFinancialAccount> selectByExample(NntConsumeFinancialAccountExample example);

    NntConsumeFinancialAccount selectByPrimaryKey(Integer numId);

    int updateByExampleSelective(@Param("record") NntConsumeFinancialAccount record, @Param("example") NntConsumeFinancialAccountExample example);

    int updateByExample(@Param("record") NntConsumeFinancialAccount record, @Param("example") NntConsumeFinancialAccountExample example);

    int updateByPrimaryKeySelective(NntConsumeFinancialAccount record);

    int updateByPrimaryKey(NntConsumeFinancialAccount record);
}