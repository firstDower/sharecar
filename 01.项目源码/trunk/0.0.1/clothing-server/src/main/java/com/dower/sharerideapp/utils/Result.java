package com.dower.sharerideapp.utils;

import com.alibaba.fastjson.JSON;

import java.text.SimpleDateFormat;
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
		//System.out.println(new Date());

		String result = "";
		// 保留num的位数
		// 0 代表前面补充0
		// num 代表长度为4
		// d 代表参数为正数型
		result = String.format("%0" + 3 + "d", Integer.parseInt("21"));
		int length = result.length();
		if(length>=3) {
			result = result.substring(length - 3, length);
		}
		System.out.println(result);
	}

    private static void printInfo(int num){
		 System.out.println(num);
		 System.out.println(Integer.toBinaryString(num));
	}
}
