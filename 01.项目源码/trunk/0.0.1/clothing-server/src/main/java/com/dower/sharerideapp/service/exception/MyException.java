package com.dower.sharerideapp.service.exception;

/**
 * Created by wangwei on 2020/7/23.
 */
public class MyException extends RuntimeException {

    public Integer code;

    public MyException() {
        super("系统异常");
    }

    public MyException(String message) {
        super(message);
    }
    public MyException(Integer code , String message) {
        super(message);
        this.code = code;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }
}
