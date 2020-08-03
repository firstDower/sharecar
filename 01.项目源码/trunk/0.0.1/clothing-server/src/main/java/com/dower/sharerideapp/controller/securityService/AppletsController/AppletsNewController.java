package com.dower.sharerideapp.controller.securityService.AppletsController;

import com.alibaba.fastjson.JSONObject;
import com.dower.sharerideapp.core.serverdb.model.NntUsers;
import com.dower.sharerideapp.service.UsersService;
import com.dower.sharerideapp.service.annotation.PublicUrl;
import com.dower.sharerideapp.service.weichat.WeichatCommService;
import com.dower.sharerideapp.utils.CommUtil;
import com.dower.sharerideapp.utils.Result;
import com.dower.sharerideapp.utils.ret.RetResponse;
import com.dower.sharerideapp.utils.ret.RetResult;
import com.dower.sharerideapp.utils.weichat.Message;
import com.dower.sharerideapp.utils.weichat.SignUtil;
import com.dower.sharerideapp.utils.weichat.WeiXinUtils;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.Date;
import java.util.Map;

/**
 * @param
 * @Author: wangwei
 * @Description:
 * @Date: Created in 17:02   2018/7/10
 */
@Slf4j
@Controller
@RequestMapping("/securityService")
@PublicUrl(signValidate = true)
public class AppletsNewController {
    @Value("${weixin.appid}")
    private String appid;
    @Value("${weixin.secret}")
    private String secret;
    @Autowired
    UsersService usersService;
    @Autowired
    private WeichatCommService weichatCommService;
    /**
     * 小程序登录
     */
    @ResponseBody
    @RequestMapping("/loginApplets")
    public RetResult loginPhone(HttpServletRequest request) {
        JSONObject dataObj = CommUtil.getParamData(request);
        log.info("小程序登录参数param:：{}",dataObj);
        try {
            JSONObject openjson  = weichatCommService.getSessionKey(dataObj);

            dataObj.put("openid", openjson.get("openid"));
            dataObj.put("unionid", openjson.get("unionid"));
            dataObj.put("gender", openjson.get("gender"));
            dataObj.put("avatarUrl", openjson.get("avatarUrl"));
            dataObj.put("nickName", openjson.get("nickName"));

            NntUsers nntUsers = usersService.selectUsersByUnionid(dataObj);
            nntUsers.setVcOpenid(openjson.getString("openid"));
            return RetResponse.makeOKRsp("小程序登录成功！",nntUsers);
        } catch (Exception e) {
            log.error("小程序登录异常 {}", e);
            e.printStackTrace();
            return RetResponse.makeErrRsp("小程序登录异常！");
        }
    }




}
