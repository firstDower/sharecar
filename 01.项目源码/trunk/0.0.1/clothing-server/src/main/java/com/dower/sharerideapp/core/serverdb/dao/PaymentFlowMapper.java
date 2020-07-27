package com.dower.sharerideapp.core.serverdb.dao;

import com.dower.sharerideapp.core.serverdb.model.PaymentFlow;
import com.dower.sharerideapp.core.serverdb.model.PaymentFlowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaymentFlowMapper {
    long countByExample(PaymentFlowExample example);

    int deleteByExample(PaymentFlowExample example);

    int deleteByPrimaryKey(Integer numId);

    int insert(PaymentFlow record);

    int insertSelective(PaymentFlow record);

    List<PaymentFlow> selectByExample(PaymentFlowExample example);

    PaymentFlow selectByPrimaryKey(Integer numId);

    int updateByExampleSelective(@Param("record") PaymentFlow record, @Param("example") PaymentFlowExample example);

    int updateByExample(@Param("record") PaymentFlow record, @Param("example") PaymentFlowExample example);

    int updateByPrimaryKeySelective(PaymentFlow record);

    int updateByPrimaryKey(PaymentFlow record);
}