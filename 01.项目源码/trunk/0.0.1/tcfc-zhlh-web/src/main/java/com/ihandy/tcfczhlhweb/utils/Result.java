package com.ihandy.tcfczhlhweb.utils;

/**
 * 返回数据
 * @author wangwei
 *
 */
public class Result {
	


	public String code;//是否成功
	
	public String message;//消息描述
	
	public Object data;//返回内容

	public Result() {
		this.code = "200";
		this.message = "成功！";
	}

	@Override
	public String toString() {
		return "Result{" +
				"code='" + code + '\'' +
				", message='" + message + '\'' +
				", data=" + data +
				'}';
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
}
