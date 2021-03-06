package com.dower.sharerideapp.utils;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.HTTP;
import org.apache.http.util.EntityUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;


/**
 * http请求工具类
 * @author NiuXueJun
 * 2015-7-31 下午3:22:08
 */
@Slf4j
public class HttpRequestUtil {

	/**
	 * 以jsonString形式发送HttpPost的Json请求，String形式返回响应结果
	 *
	 * @param url
	 * @param jsonString
	 * @return
	 */
	public static String sendPostJsonStr(String url, String jsonString){

		String resp = "";
		StringEntity entityStr = new StringEntity(jsonString,
				ContentType.create("text/plain", "UTF-8"));
		CloseableHttpClient httpClient = HttpClients.createDefault();
		HttpPost httpPost = new HttpPost(url);
		httpPost.setEntity(entityStr);
		CloseableHttpResponse response = null;
		try {
			response = httpClient.execute(httpPost);
			HttpEntity entity = response.getEntity();
			resp = EntityUtils.toString(entity, "UTF-8");
			EntityUtils.consume(entity);
		} catch (ClientProtocolException e) {
			log.error(e.getMessage());
		} catch (IOException e) {
			log.error(e.getMessage());
		} finally {
			if (response != null) {
				try {
					response.close();
				} catch (IOException e) {
					log.error(e.getMessage());
				}
			}
		}
		if (resp == null || resp.equals("")) {
			return "";
		}
		return resp;
	}


	public static String sendPostTest(String url, JSONObject json) {
		String result = "";// 返回的结果
		BufferedReader in = null;// 读取响应输入流
		PrintWriter out = null;
		String params = "";// 编码之后的参数
		try {
// 编码请求参数
			params = json.toString();
// 创建URL对象
			java.net.URL connURL = new java.net.URL(url);
// 打开URL连接
			java.net.HttpURLConnection httpConn = (java.net.HttpURLConnection) connURL.openConnection();
// 设置通用属性
			httpConn.setRequestProperty("Accept", "*/*");
			httpConn.setRequestProperty("Connection", "Keep-Alive");
			httpConn.setRequestProperty("User-Agent", "Mozilla/4.0 (compatible; MSIE 8.0; Windows NT 6.1)");
// 设置POST方式
			httpConn.setDoInput(true);
			httpConn.setDoOutput(true);
// 获取HttpURLConnection对象对应的输出流
			out = new PrintWriter(httpConn.getOutputStream());
// 发送请求参数
			out.write(params);
// flush输出流的缓冲
			out.flush();
// 定义BufferedReader输入流来读取URL的响应，设置编码方式
			in = new BufferedReader(new InputStreamReader(httpConn.getInputStream(), "UTF-8"));
			String line;
// 读取返回的内容
			while ((line = in.readLine()) != null) {
				result += line;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (out != null) {
					out.close();
				}
				if (in != null) {
					in.close();
				}
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		return result;
	}
	/**
	 * HTTP带参数请求
	 * @param url 请求地址
	 * @param param 参数
	 * @param ispost post/get请求
	 * @return String
	 */
	public static String request(String url, Map<String, String> param,
			boolean ispost) {
		if (ispost) {
			return postData(url, param);
		} else {
			return getData(url, param);
		}
	}
	
	/**
	 * HTTP带参数请求
	 * @param url 请求地址
	 * @param param 参数
	 * @param ispost post/get请求
	 * @return String
	 */
	public static String request(String url, Map<String, String> param,
			boolean ispost, int timeOut) {
		if (ispost) {
			return postData(url, param, timeOut);
		} else {
			return getData(url, param);
		}
	}
	
	/**
	 * 获取HTTP请求返回结果
	 * @param url 请求地址
	 * @param param 参数
	 * @return HttpEntity
	 */
	public static HttpEntity getEntityData(String url, Map<String, String> param) {
		try{
			url = url + getParamStrByMap(param);
			HttpGet httpRequest = new HttpGet(url);
			// 取得HttpClient对象
			HttpClient httpclient = new DefaultHttpClient();
			// 请求HttpClient，取得HttpResponse
			HttpResponse httpResponse = httpclient.execute(httpRequest);
			// 请求成功
			if (httpResponse.getStatusLine().getStatusCode() == HttpStatus.SC_OK){
				return httpResponse.getEntity();
			}
		}catch (Exception e){
		}
		return null;
	}

	/**
	 * HTTP发送post请求
	 * @param url 请求地址
	 * @param content 请求内容
	 * @return String
	 */
	public static String postDataStr(String url, String content) {
		try {
			HttpPost httppost = new HttpPost(url);
			// 添加参数
			httppost.setEntity(new StringEntity(content, HTTP.UTF_8));
			// 设置编码
			HttpResponse response = new DefaultHttpClient().execute(httppost);
			// 发送Post,并返回一个HttpResponse对象
			if (response.getStatusLine().getStatusCode() == 200) {// 如果状态码为200,就是正常返回
				// 得到返回的字符串
				String result = EntityUtils.toString(response.getEntity());
				return result;
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("请求失败:" + url, e);
		}
		return null;
	}

	/**
	 * 获取HTTP发送get请求返回结果
	 * @param url 请求地址
	 * @param param 参数
	 * @return String
	 */
	private static String getData(String url, Map<String, String> param) {
		try{
			url = url + getParamStrByMap(param);
			HttpGet httpRequest = new HttpGet(url);
			// 取得HttpClient对象
			HttpClient httpclient = new DefaultHttpClient();
			// 请求HttpClient，取得HttpResponse
			HttpResponse httpResponse = httpclient.execute(httpRequest);
			// 请求成功
			if (httpResponse.getStatusLine().getStatusCode() == HttpStatus.SC_OK){
				// 取得返回的字符串
				String strResult = EntityUtils.toString(httpResponse.getEntity(), HTTP.UTF_8);
				return strResult;
			}
		}catch (Exception e){
		}
		return null;
	}

	/**
	 * 获取HTTP发送post请求返回结果
	 * @param url 请求地址
	 * @param param 参数
	 * @return String
	 */
	private static String postData(String url, Map<String, String> param) {
		try {
			HttpPost httppost = new HttpPost(url);
			// 建立HttpPost对象
			List<NameValuePair> params = getParamListByMap(param);
			// 添加参数
			httppost.setEntity(new UrlEncodedFormEntity(params, HTTP.UTF_8));
			// 设置编码
			HttpResponse response = new DefaultHttpClient().execute(httppost);
			// 发送Post,并返回一个HttpResponse对象
			if (response.getStatusLine().getStatusCode() == 200) {// 如果状态码为200,就是正常返回
				// 得到返回的字符串
				String result = EntityUtils.toString(response.getEntity(), HTTP.UTF_8);
				return result;
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("请求失败:" + url, e);
		}
		return null;
	}
	
	/**
	 * 获取HTTP发送post请求返回结果
	 * @param url 请求地址
	 * @param param 参数
	 * @return String
	 */
	private static String postData(String url, Map<String, String> param, int timeOut) {
		try {
			HttpPost httppost = new HttpPost(url);
			// 建立HttpPost对象
			List<NameValuePair> params = getParamListByMap(param);
			// 添加参数
			httppost.setEntity(new UrlEncodedFormEntity(params, HTTP.UTF_8));
			// 设置编码
			HttpClient client = new DefaultHttpClient();
			HttpParams httpParams = client.getParams();
			HttpConnectionParams.setConnectionTimeout(httpParams, timeOut);
			HttpConnectionParams.setSoTimeout(httpParams, timeOut);
			HttpResponse response = client.execute(httppost);
			// 发送Post,并返回一个HttpResponse对象
			if (response.getStatusLine().getStatusCode() == 200) {// 如果状态码为200,就是正常返回
				// 得到返回的字符串
				String result = EntityUtils.toString(response.getEntity(), HTTP.UTF_8);
				return result;
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("请求失败:" + url, e);
		}
		return null;
	}

	/**
	 * 将map参数转化成HTTP请求参数
	 * @param paramMap
	 * @return String
	 */
	private static String getParamStrByMap(Map<String, String> paramMap) {
		StringBuffer result = new StringBuffer();
		result.append("?");
		for (String paramName : paramMap.keySet()) {
			result.append("&").append(paramName).append("=").append(paramMap.get(paramName));
		}

		return result.toString();
	}

	private static List<NameValuePair> getParamListByMap(Map<String, String> paramMap) {
		List<NameValuePair> params = new ArrayList<NameValuePair>();
		for (String paramName : paramMap.keySet()) {
			params.add(new BasicNameValuePair(paramName, paramMap.get(paramName)));
		}
		return params;
	}
}
