package com.dower.sharerideapp.config;

import com.dower.sharerideapp.service.exception.SignException;
import com.dower.sharerideapp.service.exception.TokenException;
import com.dower.sharerideapp.utils.ret.RetCode;
import com.dower.sharerideapp.utils.ret.RetMesage;
import com.dower.sharerideapp.utils.ret.RetResponse;
import com.dower.sharerideapp.utils.ret.RetResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * Created by wangwei on 2020/7/24.
 */
//全局异常处理器
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(TokenException.class)
    @ResponseBody
    public RetResult handleTokenException(Exception exception) {
        return RetResponse.makeRsp(RetCode.TOKEN_ERROR.code,exception.getMessage());
    }

    @ExceptionHandler(SignException.class)
    @ResponseBody
    public RetResult handleSignException(Exception exception) {
        return RetResponse.makeRsp(RetCode.SIGN_ERROR.code,RetMesage.SIGN_ERROR.code);
    }
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public RetResult handleException(Exception exception) {
        return RetResponse.makeRsp(RetCode.INTERNAL_SERVER_ERROR.code,exception.getMessage());
    }
}
