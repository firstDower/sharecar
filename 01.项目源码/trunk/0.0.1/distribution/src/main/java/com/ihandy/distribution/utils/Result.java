package com.ihandy.distribution.utils;

import lombok.Data;

/**
 * 返回数据
 * @author wangwei
 *
 */
@Data
public class Result<T> {
	private Integer code;
	private String message;
	private T data;
}
