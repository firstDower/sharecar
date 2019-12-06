package com.ihandy.tcfczhlhweb.biz.pay;

import okhttp3.*;
import okhttp3.Request.Builder;

import java.io.*;
import java.net.URLEncoder;
import java.util.Map;
import java.util.concurrent.TimeUnit;


public class HttpUtils {


	private static OkHttpClient client = null;

	public HttpUtils() {
	}

	public static OkHttpClient getInstance() {
		if (client == null) {
			synchronized (HttpUtils.class) {
				if (client == null) {
					client = new OkHttpClient();
				}
			}
		}
		return client;
	}

	/**
	 * Get请求
	 *
	 * @param url
	 * @param callback
	 */
	public static void doAnsyGet(String url, Callback callback) {
		Request request = new Builder().url(url).build();
		Call call = getInstance().newCall(request);
		call.enqueue(callback);
	}

	/**
	 * Post请求发送键值对数据
	 *
	 * @param url
	 * @param mapParams
	 * @param callback
	 */
	public static void doAnsyPost(String url, Map<String, String> mapParams,
			Callback callback) {
		FormBody.Builder builder = new FormBody.Builder();
		for (String key : mapParams.keySet()) {
			builder.add(key, mapParams.get(key));
		}
		Request request = new Builder().url(url).post(builder.build())
				.build();
		Call call = getInstance().newCall(request);
		call.enqueue(callback);
	}

	/**
	 * Post请求发送JSON数据
	 * 
	 * @param url
	 * @param jsonParams
	 * @param callback
	 */
	public static void doAnsyPost(String url, String jsonParams,
			Callback callback) {
		RequestBody body = RequestBody.create(
				MediaType.parse("application/json; charset=utf-8"), jsonParams);
		Request request = new Builder().url(url).post(body).build();
		Call call = getInstance().newCall(request);
		call.enqueue(callback);
	}

	public static Response doPost(String url, String jsonParams, String format)
			throws Exception {
		if (format == null || "".equals(format)) {
			format = "html";
		}
		RequestBody body = RequestBody.create(
				MediaType.parse("application/" + format + "; charset=utf-8"),
				jsonParams);
		Request request = new Builder().url(url).post(body).build();
		return getInstance().newCall(request).execute();
	}


	public static String doPost(String url, Map<String, String> mapParams)
			throws Exception {
		FormBody.Builder builder = new FormBody.Builder();
		for (String key : mapParams.keySet()) {
			builder.add(key, mapParams.get(key));
		}
		Request request = new Builder().url(url).post(builder.build())
				.build();
		Response _response = getInstance().newBuilder()
				.connectTimeout(5000, TimeUnit.SECONDS)
				.readTimeout(5000, TimeUnit.SECONDS).build().newCall(request)
				.execute();
		if (_response.code() == 404) {
			throw new Exception("404");
		}
		if (_response.code() == 500) {
			throw new Exception("500");
		}
		if (_response.code() == 501) {
			throw new Exception("501");
		}
		if (_response.code() == 502) {
			throw new Exception("502");
		}

		if (_response.code() == 200) {
			return _response.body().string();
		}
		return null;

	}
	
	public static String doPost(String url, Map<String, String> mapParams,int connectTimeout,int readTimeout)
			throws Exception {
		FormBody.Builder builder = new FormBody.Builder();
		for (String key : mapParams.keySet()) {
			builder.add(key, mapParams.get(key));
		}
		Request request = new Builder().url(url).post(builder.build())
				.build();
		Response _response = getInstance().newBuilder()
				.connectTimeout(connectTimeout, TimeUnit.SECONDS)
				.readTimeout(readTimeout, TimeUnit.SECONDS).build().newCall(request)
				.execute();
		if (_response.code() == 404) {
			throw new Exception("404");
		}
		if (_response.code() == 500) {
			throw new Exception("500");
		}
		if (_response.code() == 501) {
			throw new Exception("501");
		}
		if (_response.code() == 502) {
			throw new Exception("502");
		}

		if (_response.code() == 200) {
			return _response.body().string();
		}
		return null;

	}

	public static String doPost(String url, Map<String, String> mapParams,
			Map<String, String> headerParams) throws Exception {
		FormBody.Builder builder = new FormBody.Builder();
		for (String key : mapParams.keySet()) {
			builder.add(key, mapParams.get(key));
		}

		Builder reqbuilder = new Builder();
		for (String key : headerParams.keySet()) {
			reqbuilder.addHeader(key, headerParams.get(key));
		}
		Request request = reqbuilder.url(url).post(builder.build()).build();
		Response _response = getInstance().newBuilder()
				.connectTimeout(5000, TimeUnit.SECONDS)
				.readTimeout(5000, TimeUnit.SECONDS).build().newCall(request)
				.execute();
		if (_response.code() == 404) {
			throw new Exception("404");
		}
		if (_response.code() == 500) {
			throw new Exception("500");
		}
		if (_response.code() == 501) {
			throw new Exception("501");
		}
		if (_response.code() == 502) {
			throw new Exception("502");
		}

		if (_response.code() == 200) {
			return _response.body().string();
		}
		return null;

	}
	
	public static String doGet(String url, Map<String, String> mapParams,Map<String, String> headerParams) throws Exception {
		
		StringBuilder sb = new StringBuilder();
		for (String key : mapParams.keySet()) {
			sb.append(key+"="+URLEncoder.encode(mapParams.get(key),"UTF-8")+"&");
		}

		Builder reqbuilder = new Builder();
		for (String key : headerParams.keySet()) {
			reqbuilder.addHeader(key, headerParams.get(key));
		}
		Request request = reqbuilder.url(url+"?"+sb.toString().substring(0, sb.toString().length()-1)).get().build();
		Response _response = getInstance().newBuilder()
				.connectTimeout(5000, TimeUnit.SECONDS)
				.readTimeout(5000, TimeUnit.SECONDS).build().newCall(request)
				.execute();
		if (_response.code() == 404) {
			throw new Exception("404");
		}
		if (_response.code() == 500) {
			throw new Exception("500");
		}
		if (_response.code() == 501) {
			throw new Exception("501");
		}
		if (_response.code() == 502) {
			throw new Exception("502");
		}

		if (_response.code() == 200) {
			return _response.body().string();
		}
		return null;

	}
	
	public static String doGet(String url,Map<String, String> headerParams) throws Exception {

		Builder reqbuilder = new Builder();
		for (String key : headerParams.keySet()) {
			reqbuilder.addHeader(key, headerParams.get(key));
		}
		Request request = reqbuilder.url(url).get().build();
		Response _response = getInstance().newBuilder()
				.connectTimeout(5000, TimeUnit.SECONDS)
				.readTimeout(5000, TimeUnit.SECONDS).build().newCall(request)
				.execute();
		if (_response.code() == 404) {
			throw new Exception("404");
		}
		if (_response.code() == 500) {
			throw new Exception("500");
		}
		if (_response.code() == 501) {
			throw new Exception("501");
		}
		if (_response.code() == 502) {
			throw new Exception("502");
		}

		if (_response.code() == 200) {
			return _response.body().string();
		}
		return null;

	}


	public static String doPost(String url, String body)
			throws Exception {
		RequestBody requestBody = RequestBody.create(
				MediaType.parse("application/json; charset=utf-8"), body);
		Request request = new Builder().url(url).post(requestBody)
				.build();
		Response _response = getInstance().newBuilder()
				.connectTimeout(5000, TimeUnit.SECONDS)
				.readTimeout(5000, TimeUnit.SECONDS).build().newCall(request)
				.execute();
		if (_response.code() == 404) {
			throw new Exception("404");
		}
		if (_response.code() == 500) {
			throw new Exception("500");
		}
		if (_response.code() == 501) {
			throw new Exception("501");
		}
		if (_response.code() == 502) {
			throw new Exception("502");
		}

		if (_response.code() == 200) {
			return _response.body().string();
		}
		return null;

	}
	
	
	public static String doPost(String url, String body,int connectTimeout,int readTimeout)
			throws Exception {
		RequestBody requestBody = RequestBody.create(
				MediaType.parse("application/json; charset=utf-8"), body);
		Request request = new Builder().url(url).post(requestBody)
				.build();
		Response _response = getInstance().newBuilder()
				.connectTimeout(connectTimeout, TimeUnit.SECONDS)
				.readTimeout(readTimeout, TimeUnit.SECONDS).build().newCall(request)
				.execute();
		if (_response.code() == 404) {
			throw new Exception("404");
		}
		if (_response.code() == 500) {
			throw new Exception("500");
		}
		if (_response.code() == 501) {
			throw new Exception("501");
		}
		if (_response.code() == 502) {
			throw new Exception("502");
		}

		if (_response.code() == 200) {
			return _response.body().string();
		}
		return null;

	}


	public static String doPost(String url, Map<String, String> mapParams,
			Map<String, String> headerParams,int connectTimeout,int readTimeout) throws Exception {
	
		FormBody.Builder builder = new FormBody.Builder();
		for (String key : mapParams.keySet()) {
			builder.add(key, mapParams.get(key));
		}

		Builder reqbuilder = new Builder();
		for (String key : headerParams.keySet()) {
			reqbuilder.addHeader(key, headerParams.get(key));
		}
		Request request = reqbuilder.url(url).post(builder.build()).build();
		Response _response = getInstance().newBuilder()
				.connectTimeout(connectTimeout, TimeUnit.SECONDS)
				.readTimeout(readTimeout, TimeUnit.SECONDS).build().newCall(request)
				.execute();
		if (_response.code() == 404) {
			throw new Exception("404");
		}
		if (_response.code() == 500) {
			throw new Exception("500");
		}
		if (_response.code() == 501) {
			throw new Exception("501");
		}
		if (_response.code() == 502) {
			throw new Exception("502");
		}

		if (_response.code() == 200) {
			return _response.body().string();
		}
		return null;

	}

	/*public static void main(String[] args) throws Exception {
		*//*
		 * Response _response =
		 * HttpUtils.doPost("http://test.huanlebaoxian.cn/admin/security/login2.jsp"
		 * , "",null); System.out.println(_response.code());
		 * System.out.println(_response.body().string());
		 *//*
		*//*
		 * String s = HttpUtils.createSocket("127.0.0.1", 9999, "as", "GBK");
		 * System.out.println(s);
		 *//*
		*//*
		 * Map<String, Object> requestMap = new HashMap<String, Object>(); List
		 * list = new ArrayList(); Map<String, String> membersMap = new
		 * HashMap<String, String>(); membersMap.put("name", "张三");
		 * membersMap.put("address", "北京"); membersMap.put("identitycard",
		 * "121211123"); membersMap.put("identitytype", "1");
		 * membersMap.put("memberid", "1"); list.add(membersMap);
		 * membersMap.put("chid", "1"); membersMap.put("chinsuranceid", "1");
		 * requestMap.put("members", list); Response _response =
		 * HttpUtils.doPost("http://123.56.3.50:8089/api/addmember",
		 * JSONObject.fromObject(requestMap).toString(),null);
		 * System.out.println(_response.body().string());
		 *//*

		String temp = readFileByLines("E:\\报春北分\\英大黑龙江\\11.txt");

	*//*	String s = HttpUtils.createSocket("211.160.75.141", 6518, new String(
				temp.getBytes("GBK"), "GBK"), "GBK");

		System.out.println("=========" + s);*//*
	}*/

	public static String readFileByLines(String fileName) {
		File file = new File(fileName);
		BufferedReader reader = null;
		StringBuffer sb = new StringBuffer();
		try {
			System.out.println("以行为单位读取文件内容，一次读一整行：");
			reader = new BufferedReader(new FileReader(file));
			String tempString = null;
			int line = 1;
			// 一次读入一行，直到读入null为文件结束

			while ((tempString = reader.readLine()) != null) {
				// 显示行号
				System.out.println("line " + line + ": "
						+ new String(tempString.getBytes("UTF-8"), "GBK"));
				sb.append(tempString);
				line++;
			}
			reader.close();

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e1) {
				}
			}
		}
		return sb.toString();
	}
	
	
	public static String doPost(String url, String body,Map<String, String> headerParams) throws Exception {

		Builder reqbuilder = new Builder();
		for (String key : headerParams.keySet()) {
			reqbuilder.addHeader(key, headerParams.get(key));
		}
		
		RequestBody requestBody = RequestBody.create(
				MediaType.parse("application/json; charset=utf-8"), body);
		Request request = reqbuilder.url(url).post(requestBody).build();
		
		Response _response = getInstance().newBuilder()
				.connectTimeout(15, TimeUnit.SECONDS)
				.readTimeout(15, TimeUnit.SECONDS).build().newCall(request)
				.execute();
		if (_response.code() == 404) {
			throw new Exception("404");
		}
		if (_response.code() == 500) {
			throw new Exception("500");
		}
		if (_response.code() == 501) {
			throw new Exception("501");
		}
		if (_response.code() == 502) {
			throw new Exception("502");
		}

		if (_response.code() == 200) {
			return _response.body().string();
		}
		return null;

	}
	
	
	public static InputStream doPostInputStream(String url, String body)
			throws Exception {
		RequestBody requestBody = RequestBody.create(
				MediaType.parse("application/json; charset=utf-8"), body);
		Request request = new Builder().url(url).post(requestBody)
				.build();
		Response _response = getInstance().newBuilder()
				.connectTimeout(5000, TimeUnit.SECONDS)
				.readTimeout(5000, TimeUnit.SECONDS).build().newCall(request)
				.execute();
		if (_response.code() == 404) {
			throw new Exception("404");
		}
		if (_response.code() == 500) {
			throw new Exception("500");
		}
		if (_response.code() == 501) {
			throw new Exception("501");
		}
		if (_response.code() == 502) {
			throw new Exception("502");
		}

		if (_response.code() == 200) {
			return _response.body().byteStream();
		}
		return null;

	}



}
