package com.dower.sharerideapp.service.exception;

/**
 * Created by wangwei on 2020/7/23.
 */
public class TokenException extends RuntimeException {
    public TokenException() {
        super("token异常");
    }

    public TokenException(String message) {
        super(message);
    }
}
