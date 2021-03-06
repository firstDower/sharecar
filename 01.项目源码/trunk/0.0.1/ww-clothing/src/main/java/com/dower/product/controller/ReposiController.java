package com.dower.product.controller;

import com.dower.product.core.serverdb.model.NntTravelCity;
import com.dower.product.core.serverdb.model.NntUsers;
import com.dower.product.service.CommService;
import com.dower.product.service.TripService;
import com.dower.product.service.UsersService;
import com.dower.product.utils.Result;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @param
 * @Author: wangwei
 * @Description:
 * @Date: Created in 14:13   2018/6/28
 */
@RequestMapping("/reposi")
@RestController
public class ReposiController {
    private static final Logger LOGGER = LogManager.getLogger(ReposiController.class);
    @Autowired
    UsersService usersService;
    @Autowired
    CommService commService;
    @Autowired
    TripService tripService;


    /**
     * 创建行程
     * @param params
     * @return
     */
    @RequestMapping("/creatTrip")
    public Result creatTrip(String params){
        return tripService.creatTrip(params);
    }

    /**
     * 修改行程状态
     * @param params
     * @return
     */
    @RequestMapping("/updateRouteStatus")
    public Result updateRouteStatus(String params){
        return tripService.updateRouteStatus(params);
    }

    /**
     * 修改行程
     * @param params
     * @return
     */
    @RequestMapping("/updateTrip")
    public Result updateTrip(String params){
        return tripService.updateTrip(params);
    }

    /**
     * 获取城市列表
     * @return
     */
    @RequestMapping("/getTravelCityList")
    public List<NntTravelCity> getTravelCityList(){
        return commService.getTravelCity();
    }

    /**
     * 编辑用户扩展信息
     * @param params
     * @param request
     * @param response
     * @return
     */
    @RequestMapping("/editPersionExtraInfo")
    public Result editPersionExtraInfo(String params,HttpServletRequest request, HttpServletResponse response) {
        return usersService.editPersionExtraInfo(params);
    }

    /**
     * 编辑用户基本信息
     * @param params
     * @param request
     * @param response
     * @return
     */
    @RequestMapping("/editUserInfo")
    public Result editUserInfo(String params,HttpServletRequest request, HttpServletResponse response) {
        return usersService.editUserInfo(params);
    }
    /**
     * 测试：获取用户信息
     */
    @RequestMapping("/getUserInfo")
    public Result getInsurInfo(String params,HttpServletRequest request, HttpServletResponse response) {

        return usersService.getInsureInfo();
    }

    /*
     *根据openid获取用户信息，新用户插入用户信息
     */
    @RequestMapping("/getUserInfoByOpenid")
    public NntUsers getUserInfoByOpenid(String params,HttpServletRequest request, HttpServletResponse response) {
        NntUsers nntUsers = new NntUsers();
        nntUsers.setVcOpenid(params);
        NntUsers userInfo = usersService.selectUsersBuOpenid(nntUsers);
        return userInfo;
    }

}
