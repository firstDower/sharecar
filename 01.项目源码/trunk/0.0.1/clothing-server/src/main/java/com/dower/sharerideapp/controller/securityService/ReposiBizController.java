package com.dower.sharerideapp.controller.securityService;

import com.alibaba.fastjson.JSONObject;
import com.dower.sharerideapp.service.CommService;
import com.dower.sharerideapp.utils.CommUtil;
import com.dower.sharerideapp.utils.Result;
import com.dower.sharerideapp.utils.ret.RetResponse;
import com.dower.sharerideapp.utils.ret.RetResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by wangwei on 2020/7/24.
 */
@Slf4j
@RestController
@RequestMapping("/securityService")
public class ReposiBizController {
    @Autowired
    CommService commService;

    public RetResult testToken (HttpServletRequest request, HttpServletResponse response)  throws Exception{
        JSONObject param = CommUtil.getParamData(request);
        log.info("Controller获取参数dataStr：：{}",param);
        return RetResponse.makeOKRsp(param);
    }
    /**
     * 年级字典信息
     * @return
     */
    @RequestMapping("/getGradeList")
    public Result getGradeList(){
        return commService.getGradeList();
    }

    /**
     * 学校字典信息
     * @return
     */
    @RequestMapping("/getSchoolList")
    public Result getSchoolList(){
        return commService.getSchoolList();
    }

    /**
     * 款式字段信息
     * @return
     */
    @RequestMapping("/getModelList")
    public Result getModelList(){
        return commService.getModelList();
    }
}
