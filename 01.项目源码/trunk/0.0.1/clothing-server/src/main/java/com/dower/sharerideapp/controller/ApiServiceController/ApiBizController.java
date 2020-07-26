package com.dower.sharerideapp.controller.ApiServiceController;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.dower.sharerideapp.service.annotation.PublicUrl;
import com.dower.sharerideapp.utils.CommUtil;
import com.dower.sharerideapp.utils.RSAUtil;
import com.dower.sharerideapp.utils.Result;
import com.dower.sharerideapp.utils.TokenProccessor;
import com.dower.sharerideapp.utils.ret.RetResponse;
import com.dower.sharerideapp.utils.ret.RetResult;
import io.jsonwebtoken.Claims;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
@RequestMapping("/apiService")
@PublicUrl(signValidate = true)
public class ApiBizController {
    /**
     * api 获取token
     * @param request
     * @param response
     * @return
     * @throws Exception
     */

    @PostMapping(value = "/getToken")
    public RetResult getToken ( HttpServletRequest request, HttpServletResponse response)  throws Exception{
        JSONObject jsonObject = CommUtil.getParamData(request);
        log.info("api 获取token获取参数param：：{}",jsonObject);

        String token = TokenProccessor.createJwtToken(jsonObject.getString("pro_name"));
        JSONObject result = new JSONObject();
        result.put("token",token);
        result.put("expires_in","7200");
        return RetResponse.makeOKRsp(result);
    }

    /**
     * api 验证token
     * @param request
     * @param response
     * @return
     * @throws Exception
     */
    @PostMapping(value = "/checkToken")
    public RetResult checkToken ( HttpServletRequest request, HttpServletResponse response)  throws Exception{
        JSONObject jsonObject = CommUtil.getParamData(request);
        log.info(" api 验证token获取参数param：：{}",jsonObject);
        String pro_name = jsonObject.getString("pro_name");
        String token = jsonObject.getString("token");

        Claims checkToken = TokenProccessor.parseJWT(token);
        log.info("checkToken::{}",token);
        JSONObject result = new JSONObject();
        result.put("token",token);
        result.put("expires_in","7200");
        return RetResponse.makeOKRsp(result);
    }
}
