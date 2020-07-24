package com.dower.sharerideapp.service.exception;

/**
 * Created by wangwei on 2020/7/23.
 */
public class SignException extends RuntimeException {
    public SignException() {
        super("系统异常");
    }

    public SignException(String message) {
        super(message);
    }
}
