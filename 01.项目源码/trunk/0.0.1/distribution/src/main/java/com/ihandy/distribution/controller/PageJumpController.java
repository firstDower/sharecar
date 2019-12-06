package com.ihandy.distribution.controller;

import com.ihandy.distribution.service.IEsbService;
import com.ihandy.distribution.service.ImgBasService;
import com.ihandy.distribution.utils.SignUtil;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.WebApplicationContext;
import sun.misc.BASE64Decoder;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * 通用页面跳转控制器
 * @author SJW
 *
 */
@Slf4j
@Controller
public class PageJumpController {

	private org.slf4j.Logger LOGGER = LoggerFactory.getLogger(getClass());
	@Value("${appid}")
	private String appid;
	@Value("${pro-name}")
	private String proName;

	@Autowired
	private IEsbService iEsbService;
	@Autowired
	private ImgBasService www;

	/**
	 *
	 * @param page  跳转页面
	 * @param method  预处理方法，类名|方法名, 无预处理方法传-
	 * @param layer 页面所在层 多及层用|分隔，无层传-
	 * @param parameter 预处理方法参数,无预处理方法参数传-
	 * @return
	 */
	@RequestMapping(value="/jump/{method}/{layer}/{parameter}/{page}")
	public String greeting(@PathVariable("method") String method,@PathVariable("layer") String layer,
						   @PathVariable("parameter") String parameter, @PathVariable("page") String page,Model model) {

		System.out.println("===============================");
		LOGGER.info("----跳转页面::method="+method+"  ::layer="+layer+"   ::page="+page+"  ::parameter="+parameter);

		try {
			if(!"-".equals(method) && method.indexOf("|")>0){
				String[] clMe = method.split("\\|");
				String className = clMe[0];
				String methodName = clMe[1];
				WebApplicationContext wac = WebApplicationContextLocator.getCurrentWebApplicationContext();
				Class cls = wac.getBean(className).getClass();
				Method md = null;
				//parameter = aesEncryptUtil.desEncrypt(parameter);
				Object reMp = null;
				if(!"-".equals(parameter)){
					//parameter = getFromBase64(parameter);
					//parameter = DESUtil.decryption(parameter, configUtil.getPageParamKey());
					//parameter = java.net.URLDecoder.decode(parameter,"UTF-8");
					md = cls.getDeclaredMethod(methodName,String.class);
					reMp = md.invoke(wac.getBean(className),parameter);
				}else{
					md = cls.getDeclaredMethod(methodName);
					reMp = md.invoke(wac.getBean(className));
				}
				model.addAttribute("instData", reMp);
			}
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String rePage = page;
		String arg = "";
		try {
			if(page.indexOf("|")>0) {
				String[] clMe = page.split("\\|");
				if(clMe.length>0){
					rePage = clMe[0];
				}
				if(clMe.length>1){
					arg= clMe[1];
				}
				//byte[] userNameByte = Base64.decodeBase64(arg.getBytes("UTF-8"));
				model.addAttribute("instArg", getFromBase64(arg));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(!"-".equals(layer)){
			layer = layer.replace("|", "/");
			rePage = layer+"/"+rePage;
		}

		return rePage;
	}


	private static String getFromBase64(String str) {
        if (str == null) {
            return "";
        }
        BASE64Decoder decoder = new BASE64Decoder();
        try {
            byte[] b = decoder.decodeBuffer(str);
            return new String(b,"utf-8");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "";
    }

	/**
	 * 获取数据
	 * @param node  ESB接口节点
	 * @param params 参数集
	 * @param model
	 * @param <E>
	 * @return
	 */
	@RequestMapping(value="/obtainData/{node}")
	@ResponseBody
	public <E> String greeting(@PathVariable("node") String node,
												 String params, Model model) {
		log.info("esb"+node+"请求参数param="+params);
		String sign = SignUtil.getSign(params,appid);
		String reJson = iEsbService.entrance(node,params,proName,sign,"open");
		log.info("esb"+node+"请求结果result="+reJson);
		return reJson;
	}





}
