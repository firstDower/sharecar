package com.dower.sharerideapp.service;

import com.dower.sharerideapp.core.serverdb.dao.*;
import com.dower.sharerideapp.core.serverdb.model.*;
import com.dower.sharerideapp.utils.Result;
import com.dower.sharerideapp.utils.ret.RetResponse;
import com.dower.sharerideapp.utils.ret.RetResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @param
 * @Author: wangwei
 * @Description:
 * @Date: Created in 16:26   2018/7/25
 */
@Slf4j
@Service
public class CommNewService {

    @Autowired
    ClFnGradeMapper clFnGradeMapper;
    @Autowired
    ClFnSchoolMapper clFnSchoolMapper;
    @Autowired
    ClFnModelMapper clFnModelMapper;
    @Autowired
    ClothingTypeMapper clothingTypeMapper;

    /**
     * 查询班级信息
     * @return
     */
    public RetResult getGradeList(){
        try{
            ClFnGradeExample example = new ClFnGradeExample();
            ClFnGradeExample.Criteria criteria = example.createCriteria();
            criteria.andNumIsDelEqualTo(Byte.parseByte("1"));
            example.setOrderByClause("NUM_SORT desc");
            List<ClFnGrade> clFnGrades = clFnGradeMapper.selectByExample(example);
            return RetResponse.makeOKRsp(clFnGrades);
        }catch (Exception e){
            e.printStackTrace();
            return RetResponse.makeErrRsp("查询班级信息异常！");
        }

    }
    /**
     * 查询学校信息
     * @return
     */
    public RetResult getSchoolList(){
        try{
            ClFnSchoolExample example = new ClFnSchoolExample();
            ClFnSchoolExample.Criteria criteria = example.createCriteria();
            criteria.andNumIsDelEqualTo(Byte.parseByte("1"));
            example.setOrderByClause("NUM_SORT desc");
            List<ClFnSchool> clFnSchools = clFnSchoolMapper.selectByExample(example);
            return RetResponse.makeOKRsp(clFnSchools);
        }catch (Exception e){
            e.printStackTrace();
            return RetResponse.makeErrRsp("查询学校信息异常！");
        }
    }

    /**
     * 查询款式信息
     * @return
     */
    public RetResult getModelList(){
        try{
            ClFnModelExample example = new ClFnModelExample();
            ClFnModelExample.Criteria criteria = example.createCriteria();
            criteria.andNumIsDelEqualTo(Byte.parseByte("1"));
            example.setOrderByClause("NUM_SORT desc");
            List<ClFnModel> clFnModels = clFnModelMapper.selectByExample(example);
            return RetResponse.makeOKRsp(clFnModels);
        }catch (Exception e){
            e.printStackTrace();
            return RetResponse.makeErrRsp("查询款式信息异常！");
        }
    }

    /**
     * 查询服装类型信息信息
     * @return
     */
    public RetResult getClouthTypeList(){
        ClothingTypeExample clothingTypeExample = new ClothingTypeExample();
        List<ClothingType> clothingTypes = clothingTypeMapper.selectByExample(clothingTypeExample);
        return RetResponse.makeOKRsp(clothingTypes);
    }
}
