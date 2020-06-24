package com.dower.sharerideapp.utils;

import com.alibaba.fastjson.JSON;

import java.util.Date;

/**
 * 返回数据
 * @author wangwei
 *
 */
public class Result {
	
	public Result(){}
	
	public Result(boolean success, String msg) {
		super();
		this.success = success;
		this.msg = msg;
	}

	public Result(boolean success, String msg, Object resultInfo) {
		super();
		this.success = success;
		this.msg = msg;
		this.resultInfo = resultInfo;
	}

	public boolean success;//是否成功
	
	public String msg;//消息描述
	
	public Object resultInfo;//返回内容

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Object getResultInfo() {
		return resultInfo;
	}

	public void setResultInfo(Object resultInfo) {
		this.resultInfo = resultInfo;
	}

	@Override
	public String toString() {
		return JSON.toJSONString(this);
	}

	public static void main(String args[]){
//		int a = -33;
//		printInfo(a);
//		printInfo(a>>1);
//		int b = a + (a>>1);
//		printInfo(b);
		System.out.println(new Date());


	}

    private static void printInfo(int num){
		 System.out.println(num);
		 System.out.println(Integer.toBinaryString(num));
	}
}
