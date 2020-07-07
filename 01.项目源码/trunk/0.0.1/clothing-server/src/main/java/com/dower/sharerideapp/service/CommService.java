package com.dower.sharerideapp.service;

import com.dower.sharerideapp.core.repository.UsersDao;
import com.dower.sharerideapp.core.serverdb.dao.ClFnGradeMapper;
import com.dower.sharerideapp.core.serverdb.dao.ClFnModelMapper;
import com.dower.sharerideapp.core.serverdb.dao.ClFnSchoolMapper;
import com.dower.sharerideapp.core.serverdb.dao.NntTravelCityMapper;
import com.dower.sharerideapp.core.serverdb.model.*;
import com.dower.sharerideapp.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
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
public class CommService {
    @Autowired
    private NntTravelCityMapper nntTravelCityMapper;

    @Autowired
    ClFnGradeMapper clFnGradeMapper;
    @Autowired
    ClFnSchoolMapper clFnSchoolMapper;
    @Autowired
    ClFnModelMapper clFnModelMapper;

    /**
     * 获取城市列表
     * @return
     */
    public List<NntTravelCity> getTravelCity(){
        NntTravelCityExample example = new NntTravelCityExample();
        NntTravelCityExample.Criteria criteria = example.createCriteria();
        criteria.andNumIsDelEqualTo(1);
        example.setOrderByClause("NUM_SORT desc");
        List<NntTravelCity> nntTravelCities = nntTravelCityMapper.selectByExample(example);
        return nntTravelCities;
    }

    /**
     * 查询班级信息
     * @return
     */
    public Result getGradeList(){
        Result result = new Result(false,"查询班级信息异常！");
        try{
            ClFnGradeExample example = new ClFnGradeExample();
            ClFnGradeExample.Criteria criteria = example.createCriteria();
            criteria.andNumIsDelEqualTo(Byte.parseByte("1"));
            example.setOrderByClause("NUM_SORT desc");
            List<ClFnGrade> clFnGrades = clFnGradeMapper.selectByExample(example);
            result.setSuccess(true);
            result.setResultInfo(clFnGrades);
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }
    /**
     * 查询学校信息
     * @return
     */
    public Result getSchoolList(){
        Result result = new Result(false,"查询学校信息异常！");
        try{
            ClFnSchoolExample example = new ClFnSchoolExample();
            ClFnSchoolExample.Criteria criteria = example.createCriteria();
            criteria.andNumIsDelEqualTo(Byte.parseByte("1"));
            example.setOrderByClause("NUM_SORT desc");
            List<ClFnSchool> clFnSchools = clFnSchoolMapper.selectByExample(example);
            result.setSuccess(true);
            result.setResultInfo(clFnSchools);
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 查询款式信息
     * @return
     */
    public Result getModelList(){
        Result result = new Result(false,"查询款式信息异常！");
        try{
            ClFnModelExample example = new ClFnModelExample();
            ClFnModelExample.Criteria criteria = example.createCriteria();
            criteria.andNumIsDelEqualTo(Byte.parseByte("1"));
            example.setOrderByClause("NUM_SORT desc");
            List<ClFnModel> clFnModels = clFnModelMapper.selectByExample(example);
            result.setSuccess(true);
            result.setResultInfo(clFnModels);
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }
}
