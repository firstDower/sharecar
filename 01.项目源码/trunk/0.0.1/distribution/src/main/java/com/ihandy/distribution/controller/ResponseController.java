package com.ihandy.distribution.controller;


import com.ihandy.distribution.service.IEsbService;
import com.ihandy.distribution.utils.SignUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @param
 * @Author: wangwei
 * @Description:
 * @Date: Created in 10:59   2019/9/2
 */
@Slf4j
@RequestMapping("esbServer")
@RestController
public class ResponseController {

    @Autowired
    IEsbService iEsbService;
    @Autowired
    private Environment env;
    @Value("${appid}")
    private String appid;
    @Value("${pro-name}")
    private String proName;

    /**
     * 获取业务员信息
     *
     * @param params
     * @return
     */
    @RequestMapping("getUserInfoByOpenid")
    public String getUserInfoByOpenid(String params) {
        String result = "";
        String sign = SignUtil.getSign(params, appid);
        log.info("获取业务员信息params=" + params);
        long startTime = System.currentTimeMillis();
        result = iEsbService.entrance("WD1000", params, proName, sign, "open");
        long endTime = System.currentTimeMillis();
        log.info("获取业务员信息result=" + result);
        log.info("获取业务员信息耗时t=" + (endTime - startTime));
        return result;
    }

    /**
     * 下级业务员名单（我的伙伴）
     *
     * @param params
     * @return
     */
    @RequestMapping("getSubSalesman")
    public String getSubSalesman(String params) {
        String result = "";
        String sign = SignUtil.getSign(params, appid);
        log.info("获取下级业务员名单params=" + params);
        long startTime = System.currentTimeMillis();
        result = iEsbService.entrance("WD1001", params, proName, sign, "open");
        long endTime = System.currentTimeMillis();
        log.info("获取下级业务员名单result=" + result);
        log.info("获取下级业务员名单耗时t=" + (endTime - startTime));
        return result;

    }

    /**
     * WD1003
     * 获取分享详情（列表）
     */
    @RequestMapping("getShareInfo")
    public String getShareInfo(String params) {
        String result = "";
        String sign = SignUtil.getSign(params, appid);
        log.info("获取分享详情（列表）params=" + params);
        long startTime = System.currentTimeMillis();
        result = iEsbService.entrance("WD1003", params, proName, sign, "open");
        long endTime = System.currentTimeMillis();
        log.info("获取分享详情（列表）result=" + result);
        log.info("获取分享详情（列表）t=" + (endTime - startTime));
        return result;
    }


    /**
     * 获取验证码
     * @param params
     * @return
     */
    @RequestMapping("getPhoneCode")
    public String getPhoneCode(String params) {
        String result = "";
        String sign = SignUtil.getSign(params, appid);
        log.info("获取验证码params=" + params);
        long startTime = System.currentTimeMillis();
        result = iEsbService.entrance("QS1002", params, proName, sign, "open");
        long endTime = System.currentTimeMillis();
        log.info("获取验证码result=" + result);
        log.info("获取验证码t=" + (endTime - startTime));
        return result;
    }

    /**
     * 验证验证码
     * @param params
     * @return
     */
    @RequestMapping("checkPhoneCode")
    public String checkPhoneCode(String params) {
        String result = "";
        String sign = SignUtil.getSign(params, appid);
        log.info("验证验证码params=" + params);
        long startTime = System.currentTimeMillis();
        result = iEsbService.entrance("QS1003", params, proName, sign, "open");
        long endTime = System.currentTimeMillis();
        log.info("验证验证码result=" + result);
        log.info("验证验证码t=" + (endTime - startTime));
        return result;
    }
}