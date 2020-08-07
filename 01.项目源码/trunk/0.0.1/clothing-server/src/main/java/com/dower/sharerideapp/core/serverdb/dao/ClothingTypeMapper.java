package com.dower.sharerideapp.core.serverdb.dao;

import com.dower.sharerideapp.core.serverdb.model.ClothingType;
import com.dower.sharerideapp.core.serverdb.model.ClothingTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClothingTypeMapper {
    long countByExample(ClothingTypeExample example);

    int deleteByExample(ClothingTypeExample example);

    int deleteByPrimaryKey(Long numId);

    int insert(ClothingType record);

    int insertSelective(ClothingType record);

    List<ClothingType> selectByExample(ClothingTypeExample example);

    ClothingType selectByPrimaryKey(Long numId);

    int updateByExampleSelective(@Param("record") ClothingType record, @Param("example") ClothingTypeExample example);

    int updateByExample(@Param("record") ClothingType record, @Param("example") ClothingTypeExample example);

    int updateByPrimaryKeySelective(ClothingType record);

    int updateByPrimaryKey(ClothingType record);
}