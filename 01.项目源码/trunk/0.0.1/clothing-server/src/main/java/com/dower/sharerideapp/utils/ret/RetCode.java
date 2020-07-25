package com.dower.sharerideapp.utils.ret;

/**
 * Created by wangwei on 2020/7/24.
 */
public enum RetCode {

    SUCCESS(200),//成功
    FAIL(400),//失败
    UNAUTHORIZED(401),//未认证（签名错误）
    SIGN_ERROR(601),//（签名错误）
    TOKEN_ERROR(602),//（token错误）
    TIMESTAMP_ERROR(603),//(时间戳验证不通过)
    NOT_FOUND(404),//接口不存在
    PARAMETER(600),//参数信息错误
    INTERNAL_SERVER_ERROR(500);//服务器内部错误
    public int code;

    RetCode(int code) {
        this.code = code;
    }
}
