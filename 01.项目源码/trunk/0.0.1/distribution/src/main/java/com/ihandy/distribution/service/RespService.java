package com.ihandy.distribution.service;

import com.ihandy.distribution.utils.Result;
import com.ihandy.distribution.utils.SignUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import javax.websocket.server.ServerEndpoint;

/**
 * Created by wangwei on 2019/9/26.
 */
@Slf4j
@Service
public class RespService {
    @Autowired
    IEsbService iEsbService;
    @Value("${appid}")
    private String appid;
    @Value("${pro-name}")
    private String proName;
    public Result createRelation(String params){
        Result result = new Result();
        try{
            String sign = SignUtil.getSign(params, appid);
            log.info("获取业务员信息params=" + params);
            long startTime = System.currentTimeMillis();
            result.setData(iEsbService.entrance("WD1000", params, proName, sign, "open"));
            long endTime = System.currentTimeMillis();
            log.info("获取业务员信息result=" + result);
            log.info("获取业务员信息耗时t=" + (endTime - startTime));
            result.setCode(200);
        }catch (Exception e){

        }
        return result;
    }
}
