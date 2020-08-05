package com.dower.sharerideapp.controller.securityService;

import com.alibaba.fastjson.JSONObject;
import com.dower.sharerideapp.service.CommNewService;
import com.dower.sharerideapp.service.CommService;
import com.dower.sharerideapp.service.annotation.PublicUrl;
import com.dower.sharerideapp.service.share.ShareService;
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
@PublicUrl(signValidate = true)
public class ReposiBizController {
    @Autowired
    CommNewService commNewService;
    @Autowired
    ShareService shareService;

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
    public RetResult getGradeList(){
        return commNewService.getGradeList();
    }

    /**
     * 学校字典信息
     * @return
     */
    @RequestMapping("/getSchoolList")
    public RetResult getSchoolList(){
        return commNewService.getSchoolList();
    }

    /**
     * 款式字段信息
     * @return
     */
    @RequestMapping("/getModelList")
    public RetResult getModelList(){
        return commNewService.getModelList();
    }


    /**
     * 用户获取自己的分享数据
     * @return
     */
    @RequestMapping("/selectUserShareOrderList")
    public RetResult selectUserShareOrderList(HttpServletRequest request){
        JSONObject param = CommUtil.getParamData(request);
        return shareService.selectUserShareOrderList(param);
    }
}
