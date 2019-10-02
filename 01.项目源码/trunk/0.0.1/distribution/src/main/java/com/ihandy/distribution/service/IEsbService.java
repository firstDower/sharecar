package com.ihandy.distribution.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

/**
 * 获取产品信息cicp/ZH2001
 * @param
 * @Author: wangwei
 * @Description:
 * @Date: Created in 10:26   2019/6/21
 */
@FeignClient("esb")
@Service
public interface IEsbService {

    @RequestMapping(value="/esb/entrance",method= RequestMethod.POST)
    String entrance(@RequestParam("node") String node, @RequestBody String str,
                    @RequestHeader("pro-name") String proName,
                    @RequestHeader("sign") String sign,
                    @RequestHeader("pro-pass") String proPass);
}
