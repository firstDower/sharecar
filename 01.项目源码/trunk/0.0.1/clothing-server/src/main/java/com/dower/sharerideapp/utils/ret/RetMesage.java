package com.dower.sharerideapp.utils.ret;

/**
 * 响应码枚举，参考HTTP状态码的语义
 * @author SJW
 */
public enum RetMesage {
    ISTRUE("true"),//成功
    ISFALSE("false"),//
    SUCCESS("成功"),//成功
    FAIL("失败"),//失败
    UNAUTHORIZED("未认证（签名错误）"),//未认证（签名错误）
    SIGN_ERROR("签名错误"),//签名错误）
    TOKEN_ERROR("token错误"),//token错误
    NOT_FOUND("接口不存在"),//接口不存在
    PARAMETER("参数信息错误"),//参数信息错误
    UPGRADE("系统升级中请稍后重试！"),
    INTERNAL_SERVER_ERROR("服务器内部错误");//服务器内部错误

    public String code;

    RetMesage(String code) {
        this.code = code;
    }
}
