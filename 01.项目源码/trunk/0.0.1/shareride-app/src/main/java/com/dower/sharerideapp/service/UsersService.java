package com.dower.sharerideapp.service;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.dower.sharerideapp.core.repository.UsersDao;

import com.dower.sharerideapp.core.serverdb.dao.NntUserinfoMapper;
import com.dower.sharerideapp.core.serverdb.dao.NntUsersMapper;
import com.dower.sharerideapp.core.serverdb.model.NntUserinfo;
import com.dower.sharerideapp.core.serverdb.model.NntUserinfoExample;
import com.dower.sharerideapp.core.serverdb.model.NntUsers;
import com.dower.sharerideapp.core.serverdb.model.NntUsersExample;
import com.dower.sharerideapp.utils.Result;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @param
 * @Author: wangwei
 * @Description:
 * @Date: Created in 14:04   2018/6/28
 */
@Service
public class UsersService {
    private static final Logger LOGGER = LogManager.getLogger(UsersService.class);
    @Autowired
    private UsersDao insurDao;
    @Autowired
    private NntUsersMapper nntUsersMapper;
    @Autowired
    private NntUserinfoMapper nntUserinfoMapper;
    public NntUsers selectUsersBuOpenid(NntUsers nntUsers){
        NntUsersExample example = new NntUsersExample();
        NntUsersExample.Criteria criteria = example.createCriteria();
        criteria.andVcOpenidEqualTo(nntUsers.getVcOpenid());
        List<NntUsers> Users = nntUsersMapper.selectByExample(example);
        LOGGER.info("查询结果返回="+Users);
        if(Users.size()==0){
            int i = nntUsersMapper.insertSelective(nntUsers);
            Users = nntUsersMapper.selectByExample(example);
        }
        return Users.get(0);
    }

    public Result getInsureInfo(){
        Result result = new Result();
        try {
            Map<String,Object> resultMap = new HashMap<String,Object>();
            resultMap.put("insurList",insurDao.queryUserList());
            result.setResultInfo(resultMap);
            result.setSuccess(true);
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }

    public Result queryUser(){
        Result result = new Result();
        try {
            Map<String,Object> resultMap = new HashMap<String,Object>();
            resultMap.put("insurList",insurDao.queryUser());
            result.setResultInfo(resultMap);
            result.setSuccess(true);
        }catch (Exception e){
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 根据openid获取用户信息
     * @return
     */
    public HashMap<String,Object> queryUserinfoByOpenid(Map<String,Object> param){
        HashMap<String, Object> userInfo = insurDao.queryUserinfoByOpenid(param);

        return userInfo;
    }

    public Result editUserInfo(String params) {
        Result result = new Result(false,"用户信息跟新失败");
        try {
            JSONObject jsonparams = JSON.parseObject(params);
            NntUsers users = new NntUsers();
            users.setNumUserId(jsonparams.getInteger("numUserId"));
            users.setVcRealName(jsonparams.getString("vcRealName"));
            users.setVcPhone(jsonparams.getString("vcPhone"));
            users.setNumState(jsonparams.getInteger("numState"));
            int i = nntUsersMapper.updateByPrimaryKeySelective(users);
            LOGGER.info("跟新用户信息结果："+i);
            result.setSuccess(true);
            result.setMsg("跟新成功！");
        }catch (Exception e){
            LOGGER.error("跟新用户信息异常");
        }
        return result;
    }

    public Result editPersionExtraInfo(String params) {
        Result result = new Result(false,"用户扩展信息跟新失败");
        try {
            JSONObject jsonparams = JSON.parseObject(params);
            NntUsers users = new NntUsers();
            users.setNumUserId(jsonparams.getInteger("numUserId"));
            users.setNumState(jsonparams.getInteger("numState"));
            int i = nntUsersMapper.updateByPrimaryKeySelective(users);

            NntUserinfoExample example = new NntUserinfoExample();
            NntUserinfoExample.Criteria criteria = example.createCriteria();
            criteria.andNumUserIdEqualTo(jsonparams.getInteger("numUserId"));
            List<NntUserinfo> nntUserinfos = nntUserinfoMapper.selectByExample(example);
            if(nntUserinfos.size()==0){
                NntUserinfo nntUserinfo = new NntUserinfo();
                nntUserinfo.setNumUserId(jsonparams.getInteger("numUserId"));
                nntUserinfo.setVcBackCardNumber(jsonparams.getString("vcBackCardNumber"));
                nntUserinfo.setVcIdcardNumber(jsonparams.getString("vcIdcardNumber"));
                int i1 = nntUserinfoMapper.insertSelective(nntUserinfo);
            }else {
                NntUserinfo nntUserinfo = nntUserinfos.get(0);
                nntUserinfo.setNumUserId(jsonparams.getInteger("numUserId"));
                nntUserinfo.setVcBackCardNumber(jsonparams.getString("vcBackCardNumber"));
                nntUserinfo.setVcIdcardNumber(jsonparams.getString("vcIdcardNumber"));
                nntUserinfoMapper.updateByPrimaryKeySelective(nntUserinfo);
            }

            LOGGER.info("跟新用户扩展信息结果："+i);
            result.setSuccess(true);
            result.setMsg("用户扩展信息跟新成功！");
        }catch (Exception e){
            LOGGER.error("跟新用户扩展信息异常");
        }
        return result;
    }
}
