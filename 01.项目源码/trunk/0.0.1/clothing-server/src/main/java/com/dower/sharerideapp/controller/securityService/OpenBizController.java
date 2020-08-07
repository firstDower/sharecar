package com.dower.sharerideapp.controller.securityService;

import com.alibaba.fastjson.JSONObject;
import com.dower.sharerideapp.service.clothing.ClothingNewService;
import com.dower.sharerideapp.service.clothing.ClothingService;
import com.dower.sharerideapp.utils.CommUtil;
import com.dower.sharerideapp.utils.Result;
import com.dower.sharerideapp.utils.ret.RetResponse;
import com.dower.sharerideapp.utils.ret.RetResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by wangwei on 2020/7/23.
 */

@Slf4j
@RestController
@RequestMapping("/securityService")
public class OpenBizController {


    @PostMapping(value = "/testToken")
    //@PublicUrl(tokenValidate = true)
    public RetResult testToken (HttpServletRequest request, HttpServletResponse response)  throws Exception{
        JSONObject param = CommUtil.getParamData(request);
        return RetResponse.makeOKRsp(param);
    }

    @Autowired
    ClothingNewService clothingNewService;

    //getUserInfo
    @PostMapping("/getUserInfo")
    public RetResult getUserInfo(HttpServletRequest request){
        JSONObject param = CommUtil.getParamData(request);
        return clothingNewService.getUserInfo(param);
    }

    //取消订单


    @PostMapping("/creatProduct")
    public RetResult creatProduct(HttpServletRequest request){
        JSONObject param = CommUtil.getParamData(request);
        return clothingNewService.creatProduct(param);
    }

    @PostMapping("/queryProductPage")
    public RetResult queryProductPage(HttpServletRequest request){
        JSONObject param = CommUtil.getParamData(request);
        return clothingNewService.queryProductPage2(param);
    }
    
    @PostMapping("/updateProduct")
    public RetResult updateProduct(HttpServletRequest request){
        JSONObject param = CommUtil.getParamData(request);
        return clothingNewService.updateProduct(param);
    }

    @PostMapping("/getOrderDetail")
    public RetResult getOrderDetail(HttpServletRequest request){
        JSONObject param = CommUtil.getParamData(request);
        return clothingNewService.getOrderDetail(param);
    }
}
