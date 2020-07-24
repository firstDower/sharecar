package com.dower.sharerideapp.service.interceptor;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.dower.sharerideapp.domain.config.weixin.sdk.WXPayConstants;
import com.dower.sharerideapp.domain.config.weixin.sdk.WXPayUtil;
import com.dower.sharerideapp.service.annotation.PublicUrl;
import com.dower.sharerideapp.service.exception.MyException;
import com.dower.sharerideapp.service.exception.SignException;
import com.dower.sharerideapp.service.exception.TokenException;
import com.dower.sharerideapp.utils.*;
import com.dower.sharerideapp.utils.ret.RetMesage;
import com.dower.sharerideapp.utils.ret.RetResponse;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.ExpiredJwtException;
import io.jsonwebtoken.SignatureException;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.web.servlet.error.BasicErrorController;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by wangwei on 2020/7/23.
 */
@Slf4j
public class SafeHandlerInterceptor implements HandlerInterceptor {
    @Value("${pro_name}")
    String pro_name;

    @Value("${pro_pass}")
    String pro_pass;


    @Autowired
    private MyProperties properties;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {

        //暂时不用 ， 用于验证token是否有效
        String pro_name = request.getHeader("pro_name");
        String sign = request.getHeader("sign");
        String token = request.getHeader("token");

        JSONObject jsonObject = CommUtil.getParamData(request);
        log.info("拦截器请求参数jsonParam：：{}",jsonObject);
        jsonObject.put("sign",sign);

        log.info("拦截器请求参数jsonParam：：{}",jsonObject);

        //String token = jsonObject.getString("token");
        //String sign = jsonObject.getString("sign");
        String timeStamp = jsonObject.getString("timeStamp");
        log.info("pro_name::{},拦截器请求参数token={}\n,sign={}\n,timeStamp={}",pro_name,token,sign,timeStamp);


        try {
            //验证timeStamp
            boolean b = CommUtil.checkTimeStamp(Long.parseLong(timeStamp));
            log.info("验证timeStamp结果：：{}",b);
            if(!b){
                throw new TokenException("非法请求！");
            }
        }catch (Exception e){
            throw new TokenException("非法请求！");
        }



        if (handler instanceof HandlerMethod) {
            HandlerMethod handlerMethod = (HandlerMethod) handler;
            if (handlerMethod.getBean() instanceof BasicErrorController) {//exclude frame BasicErrorController
                return true;
            }
            ValidateResponse validateResponse = new ValidateResponse(true, null);
            //validate controller method annotation to judge token or params whether or not validate
            PublicUrl publicUrl = handlerMethod.getMethodAnnotation(PublicUrl.class);
            if (null != publicUrl) {
                if (publicUrl.signValidate() == true) {
                    validateResponse = paramSignValidate(request, jsonObject);
                }
                if (validateResponse.isValidate() && publicUrl.tokenValidate() == true) {
                    validateResponse = tokenValidate(request, jsonObject);
                }
            } else {
                //validate controller class annotation to judge token or params whether or not validate
                publicUrl = handlerMethod.getBean().getClass().getAnnotation(PublicUrl.class);
                if (null != publicUrl) {
                    if (publicUrl.signValidate() == true) {
                        validateResponse = paramSignValidate(request, jsonObject);
                    }
                    if (validateResponse.isValidate() && publicUrl.tokenValidate() == true) {
                        validateResponse = tokenValidate(request, jsonObject);
                    }
                } else {
                    validateResponse = validate(request, jsonObject);
                }
            }

            if (!validateResponse.isValidate()) {
                throw validateResponse.getException();
            }

        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) {    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {    }

    

    /**
     * 全局校验
     *
     * @param request
     * @return
     */
    private ValidateResponse validate(HttpServletRequest request, JSONObject jsonObject) throws Exception{
        ValidateResponse validateResponse = paramSignValidate(request, jsonObject);
        if (validateResponse.isValidate()) {
            validateResponse = tokenValidate(request, jsonObject);
        }
        return validateResponse;
    }

    /**
     * 签名校验
     *
     * @param request
     * @return
     */
    private ValidateResponse paramSignValidate(HttpServletRequest request, JSONObject jsonObject) {
        //验证sign
        boolean signatureValid;
        try {
            signatureValid = WXPayUtil.isSignatureValid(JSON.parseObject(jsonObject.toString(), Map.class), pro_pass, WXPayConstants.SignType.MD5);
            if(!signatureValid){
                return new ValidateResponse(false,new SignException("签名错误！"));
            }
        } catch (Exception e) {
            e.printStackTrace();
            return new ValidateResponse(false,new SignException("签名错误！"));
        }

        return new ValidateResponse(signatureValid, null);
    }

    /**
     * token校验
     *
     * @param request
     * @return
     */
    private ValidateResponse tokenValidate(HttpServletRequest request, JSONObject jsonObject) {
        try{

            String pro_name = request.getHeader("pro_name");
            String token = request.getHeader("token");
            //验证token
            Claims claims = TokenProccessor.parseJWT(token);
            log.info("验证token结果claims：：{}",claims);
        }catch (ExpiredJwtException e) {
            return new ValidateResponse(false, new TokenException("token失效！"));
        } catch (SignatureException e) {
            return new ValidateResponse(false, new TokenException("token签名错误，重新获取！"));
        } catch (Exception e) {
            return new ValidateResponse(false, new TokenException("token校验失败！"));
        }

        return new ValidateResponse(true, null);
    }

    /**
     * 校验返回对象
     */
    private static class ValidateResponse {
        private boolean validate;
        private Exception exception;

        public ValidateResponse(boolean validate, Exception exception) {
            this.validate = validate;
            this.exception = exception;
        }

        public boolean isValidate() {
            return validate;
        }

        public Exception getException() {
            return exception;
        }
    }
}

