package com.dower.sharerideapp.core.serverdb.dao;

import com.dower.sharerideapp.core.serverdb.model.NntUserBalanceChangeRecode;
import com.dower.sharerideapp.core.serverdb.model.NntUserBalanceChangeRecodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NntUserBalanceChangeRecodeMapper {
    long countByExample(NntUserBalanceChangeRecodeExample example);

    int deleteByExample(NntUserBalanceChangeRecodeExample example);

    int deleteByPrimaryKey(Long numId);

    int insert(NntUserBalanceChangeRecode record);

    int insertSelective(NntUserBalanceChangeRecode record);

    List<NntUserBalanceChangeRecode> selectByExample(NntUserBalanceChangeRecodeExample example);

    NntUserBalanceChangeRecode selectByPrimaryKey(Long numId);

    int updateByExampleSelective(@Param("record") NntUserBalanceChangeRecode record, @Param("example") NntUserBalanceChangeRecodeExample example);

    int updateByExample(@Param("record") NntUserBalanceChangeRecode record, @Param("example") NntUserBalanceChangeRecodeExample example);

    int updateByPrimaryKeySelective(NntUserBalanceChangeRecode record);

    int updateByPrimaryKey(NntUserBalanceChangeRecode record);
}