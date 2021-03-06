package com.dower.sharerideapp.service;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.dower.sharerideapp.core.repository.UsersDao;

import com.dower.sharerideapp.core.serverdb.dao.*;
import com.dower.sharerideapp.core.serverdb.model.*;
import com.dower.sharerideapp.domain.config.weixin.sdk.WXPayUtil;
import com.dower.sharerideapp.service.payment.CouponService;
import com.dower.sharerideapp.utils.Result;
import com.dower.sharerideapp.utils.ret.RetResponse;
import com.dower.sharerideapp.utils.ret.RetResult;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @param
 * @Author: wangwei
 * @Description:
 * @Date: Created in 14:04   2018/6/28
 */
@Slf4j
@Service
public class UsersService {
    private static final Logger LOGGER = LogManager.getLogger(UsersService.class);
    @Autowired
    private UsersDao insurDao;
    @Autowired
    private NntUsersMapper nntUsersMapper;
    @Autowired
    private NntUserinfoMapper nntUserinfoMapper;
    @Autowired
    private NntCarinfoMapper nntCarinfoMapper;
    @Autowired
    private NntCarOwnerInfoMapper nntCarOwnerInfoMapper;
    @Autowired
    private CouponService couponService;
    @Autowired
    private NntUserCouponsMapper nntUserCouponsMapper;

    /**
     * 获取用户唯一标识
     * @param openjson
     * @return
     */
    public NntUsers selectUsersByUnionid(JSONObject openjson){
        NntUsers nntUser = null;
        try{
            /*String nickName = openjson.getString("nickName");
            Base64.Encoder encode= Base64.getEncoder();  //加密
            String nickNameNew = encode.encodeToString(nickName.getBytes("UTF-8"));
            openjson.put("nickName",nickNameNew);*/
            String unionid = openjson.getString("unionid");
            NntUsersExample example = new NntUsersExample();
            NntUsersExample.Criteria criteria = example.createCriteria();
            criteria.andVcUnionidEqualTo(unionid);
            List<NntUsers> Users = nntUsersMapper.selectByExample(example);

            if(Users.size()==0){
                NntUsers nntUsers = new NntUsers();
                nntUsers.setVcUnionid(unionid);

                nntUsers.setNumUserId(WXPayUtil.MD5(unionid));
                nntUsers.setVcNickname(openjson.getString("nickName"));
                nntUsers.setVcHeadImgUrl(openjson.getString("avatarUrl"));
                nntUsers.setVcOpenid(openjson.getString("openid"));
                int i = nntUsersMapper.insertSelective(nntUsers);
                Users = nntUsersMapper.selectByExample(example);

                NntUserinfo record = new NntUserinfo();
                record.setNumUserId(nntUsers.getNumUserId());
                int i1 = nntUserinfoMapper.insertSelective(record);
                JSONObject jsonObject = new JSONObject();
                jsonObject.put("numUserId",nntUsers.getNumUserId());
                couponService.provideUseCoupon(jsonObject);
            }else{
                NntUsers nntUsers = Users.get(0);
                String vcHeadImgUrl = nntUsers.getVcHeadImgUrl();
                if(null==vcHeadImgUrl|| StringUtils.isBlank(vcHeadImgUrl)){
                    log.info("微信头像获取结果为：：{}",vcHeadImgUrl);
                    NntUsers users = new NntUsers();
                    users.setNumId(nntUsers.getNumId());
                    users.setNumUserId(WXPayUtil.MD5(unionid));
                    users.setVcOpenid(openjson.getString("openid"));
                    users.setVcHeadImgUrl(openjson.getString("avatarUrl"));
                    users.setVcNickname(openjson.getString("nickName"));
                    int i = nntUsersMapper.updateByPrimaryKeySelective(users);
                    log.info("微信头像昵称信息更新到数据库结果：：{}",i);
                }
                String numUserId = nntUsers.getNumUserId();
                if(null==numUserId|| StringUtils.isBlank(numUserId)){
                    log.info("微信获取numuserid结果为：：{}",numUserId);
                    NntUsers users = new NntUsers();
                    users.setNumId(nntUsers.getNumId());
                    users.setNumUserId(WXPayUtil.MD5(unionid));
                    int i = nntUsersMapper.updateByPrimaryKeySelective(users);
                    log.info("微信numuserid信息更新到数据库结果：：{}",i);
                }
                //根据用户id查询优惠券，如果没有任何优惠券，创建新用户优惠券
                NntUserCouponsExample nntUserCouponsExample = new NntUserCouponsExample();
                NntUserCouponsExample.Criteria criteriaNntUserCouponsExample = nntUserCouponsExample.createCriteria();
                criteriaNntUserCouponsExample.andNumUserIdEqualTo(nntUsers.getNumUserId());
                List<NntUserCoupons> nntUserCoupons = nntUserCouponsMapper.selectByExample(nntUserCouponsExample);
                if(nntUserCoupons.size()==0){
                    log.info("就用户初始化优惠券开始！");
                    JSONObject jsonObject = new JSONObject();
                    jsonObject.put("numUserId",nntUsers.getNumUserId());
                    RetResult retResult = couponService.provideUseCoupon(jsonObject);
                    if(retResult.code==200){
                        log.info("就用户初始化优惠券成功！");
                    }
                }

            }
            nntUser = Users.get(0);
            LOGGER.info("查询结果返回::{}",JSON.toJSONString(nntUser));
        }catch (Exception e){
            log.error("selectUsersByUnionid::{}",e);
        }

        return nntUser;
    }

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

    /*public Result queryUser(){
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
    }*/

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
            users.setNumId(jsonparams.getInteger("numId"));
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

    //@Transactional
    public Result editPersionExtraInfo(String params) {
        Result result = new Result(false,"用户扩展信息跟新失败");
        try {
            JSONObject jsonparams = JSON.parseObject(params);
            NntUsers users = new NntUsers();
            users.setNumId(jsonparams.getInteger("numId"));
            users.setNumState(jsonparams.getInteger("numState"));
            int i = nntUsersMapper.updateByPrimaryKeySelective(users);

            //车辆信息
            NntCarinfo nntCarinfo = new NntCarinfo();
            nntCarinfo.setNumUserId(jsonparams.getInteger("numUserId"));
            nntCarinfo.setVcCarNo(jsonparams.getString("vcCarNo"));
            nntCarinfo.setVcBrand(jsonparams.getString("vcBrand"));
            nntCarinfo.setVcCarColor(jsonparams.getString("vcCarColor"));

            Integer updCarInfoResult = updateCarInfo(nntCarinfo);
            //车主信息
            NntCarOwnerInfo nntCarOwnerInfo = new NntCarOwnerInfo();
            nntCarOwnerInfo.setNumUserId(jsonparams.getInteger("numUserId"));
            nntCarOwnerInfo.setVcRealName(jsonparams.getString("vcRealName"));
            nntCarOwnerInfo.setVcIdentityNo(jsonparams.getString("vcIdentityNo"));
            Integer updCarOwnerInfoResult = updateCarOwnerInfo(nntCarOwnerInfo);


            LOGGER.info("跟新用户扩展信息结果："+i);
            result.setSuccess(true);
            result.setMsg("用户扩展信息跟新成功！");
        }catch (Exception e){
            e.printStackTrace();
            LOGGER.error("跟新用户扩展信息异常");
        }
        return result;
    }

    /**
     * 插入更新车辆信息
     * @return
     */
    public Integer updateCarInfo(NntCarinfo nntCarinfo){
        Integer result = 0;
        try {
            NntCarinfoExample example = new NntCarinfoExample();
            NntCarinfoExample.Criteria criteria = example.createCriteria();
            criteria.andNumUserIdEqualTo(nntCarinfo.getNumUserId());
            List<NntCarinfo> nntCarinfos = nntCarinfoMapper.selectByExample(example);

            if(nntCarinfos.size()==0){
                result = nntCarinfoMapper.insertSelective(nntCarinfo);
            }else {
                result = nntCarinfoMapper.updateByPrimaryKeySelective(nntCarinfo);
            }
            LOGGER.info("插入更新车辆信息结果result="+result);
        }catch (Exception e){
            e.printStackTrace();
            LOGGER.error("插入更新车辆信息异常");
        }

        return result;
    }

    /**
     * 插入更新车主信息
     * @return
     */
    public Integer updateCarOwnerInfo(NntCarOwnerInfo nntCarOwnerInfo){
        Integer result = 0;
        try {
            NntCarOwnerInfoExample example = new NntCarOwnerInfoExample();
            NntCarOwnerInfoExample.Criteria criteria = example.createCriteria();
            criteria.andNumUserIdEqualTo(nntCarOwnerInfo.getNumUserId());
            List<NntCarOwnerInfo> nntCarOwnerInfos = nntCarOwnerInfoMapper.selectByExample(example);

            if(nntCarOwnerInfos.size()==0){
                result = nntCarOwnerInfoMapper.insertSelective(nntCarOwnerInfo);
            }else {
                result = nntCarOwnerInfoMapper.updateByPrimaryKeySelective(nntCarOwnerInfo);
            }
            LOGGER.info("插入更新车主信息结果result="+result);
        }catch (Exception e){
            e.printStackTrace();
            LOGGER.error("插入更新车主信息异常");
        }

        return result;
    }


}
