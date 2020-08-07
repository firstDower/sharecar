package com.dower.sharerideapp.controller;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.WebApplicationContext;
import java.lang.reflect.Method;
import java.util.HashMap;


/**
 * 通用页面跳转控制器
 * @author SJW
 *
 */
@Slf4j
@Controller
public class PageJumpController {

	@Autowired
	private WebApplicationContext wac;


	/**
	 *
	 * @param page  跳转页面
	 * @param layer 页面所在层 多及层用|分隔，无层传-
	 * @return
	 */
	@RequestMapping(value="/jump/{layer}/{page}")
	public String greeting(@PathVariable("layer") String layer, @PathVariable("page") String page,Model model) {

		//System.out.println("===============================");
		log.info("----跳转页面::layer="+layer+"   ::page="+page);
		String rePage = page;
		if(!"-".equals(layer)){
			layer = layer.replace("|", "/");
			rePage = layer+"/"+rePage;
		}

		return rePage;
	}





}
