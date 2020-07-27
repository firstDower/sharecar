package com.dower.sharerideapp.core.serverdb.dao;

import com.dower.sharerideapp.core.serverdb.model.NntUserCoupons;
import com.dower.sharerideapp.core.serverdb.model.NntUserCouponsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NntUserCouponsMapper {
    long countByExample(NntUserCouponsExample example);

    int deleteByExample(NntUserCouponsExample example);

    int deleteByPrimaryKey(Long numId);

    int insert(NntUserCoupons record);

    int insertSelective(NntUserCoupons record);

    List<NntUserCoupons> selectByExample(NntUserCouponsExample example);

    NntUserCoupons selectByPrimaryKey(Long numId);

    int updateByExampleSelective(@Param("record") NntUserCoupons record, @Param("example") NntUserCouponsExample example);

    int updateByExample(@Param("record") NntUserCoupons record, @Param("example") NntUserCouponsExample example);

    int updateByPrimaryKeySelective(NntUserCoupons record);

    int updateByPrimaryKey(NntUserCoupons record);
}