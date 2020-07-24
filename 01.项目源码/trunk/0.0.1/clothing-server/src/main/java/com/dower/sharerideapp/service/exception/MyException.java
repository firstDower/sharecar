package com.dower.sharerideapp.service.exception;

/**
 * Created by wangwei on 2020/7/23.
 */
public class MyException extends RuntimeException {
    public MyException() {
        super("系统异常");
    }

    public MyException(String message) {
        super(message);
    }
}
