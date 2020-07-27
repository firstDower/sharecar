package com.dower.sharerideapp.core.serverdb.dao;

import com.dower.sharerideapp.core.serverdb.model.NntPlatformCoupon;
import com.dower.sharerideapp.core.serverdb.model.NntPlatformCouponExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NntPlatformCouponMapper {
    long countByExample(NntPlatformCouponExample example);

    int deleteByExample(NntPlatformCouponExample example);

    int deleteByPrimaryKey(Long numId);

    int insert(NntPlatformCoupon record);

    int insertSelective(NntPlatformCoupon record);

    List<NntPlatformCoupon> selectByExample(NntPlatformCouponExample example);

    NntPlatformCoupon selectByPrimaryKey(Long numId);

    int updateByExampleSelective(@Param("record") NntPlatformCoupon record, @Param("example") NntPlatformCouponExample example);

    int updateByExample(@Param("record") NntPlatformCoupon record, @Param("example") NntPlatformCouponExample example);

    int updateByPrimaryKeySelective(NntPlatformCoupon record);

    int updateByPrimaryKey(NntPlatformCoupon record);
}