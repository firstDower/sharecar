package com.dower.sharerideapp.controller.securityService;

import com.alibaba.fastjson.JSON;
import com.dower.sharerideapp.service.annotation.PublicUrl;
import com.dower.sharerideapp.utils.RSAUtil;
import com.dower.sharerideapp.utils.Result;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

/**
 * Created by wangwei on 2020/7/23.
 */

@Slf4j
@RestController
@RequestMapping("/adminService")
public class AdminBizController {



    @PostMapping(value = "/testToken")
    @PublicUrl(tokenValidate = true)
    public Result testToken (HttpServletRequest request, HttpServletResponse response)  throws Exception{
        String dataStr = request.getParameter("dataStr");
        //String decryptData = RSAUtil.decrypt(dataStr, RSAUtil.getPrivateKey(priKey));
        //log.info("解密后内容:" + decryptData);
        Map paramsMap = JSON.parseObject(dataStr,Map.class);

        
        Result result = new Result();
        return result;
    }
}
