package com.dower.sharerideapp.core.serverdb.dao;

import com.dower.sharerideapp.core.serverdb.model.PaymentOrderRecord;
import com.dower.sharerideapp.core.serverdb.model.PaymentOrderRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PaymentOrderRecordMapper {
    long countByExample(PaymentOrderRecordExample example);

    int deleteByExample(PaymentOrderRecordExample example);

    int deleteByPrimaryKey(Long numId);

    int insert(PaymentOrderRecord record);

    int insertSelective(PaymentOrderRecord record);

    List<PaymentOrderRecord> selectByExample(PaymentOrderRecordExample example);

    PaymentOrderRecord selectByPrimaryKey(Long numId);

    int updateByExampleSelective(@Param("record") PaymentOrderRecord record, @Param("example") PaymentOrderRecordExample example);

    int updateByExample(@Param("record") PaymentOrderRecord record, @Param("example") PaymentOrderRecordExample example);

    int updateByPrimaryKeySelective(PaymentOrderRecord record);

    int updateByPrimaryKey(PaymentOrderRecord record);
}