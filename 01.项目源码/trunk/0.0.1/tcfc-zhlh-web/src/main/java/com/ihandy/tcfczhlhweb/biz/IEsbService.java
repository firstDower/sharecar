package com.ihandy.tcfczhlhweb.biz;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

/**
 * 获取产品信息cicp/ZH2001
 * @param
 * @Author: wangwei
 * @Description:
 * @Date: Created in 10:26   2019/6/21
 */
@FeignClient(value = "esb")
public interface IEsbService {
    /*创建投保单*/
    @PostMapping(value = "/esb/cicp/ZH2001")
    String creatOrderSer(@RequestBody String str,@RequestHeader("proName") String proName,@RequestHeader("sign") String sign);
    /*获取行业、职业*/
    @PostMapping(value = "/esb/cicp/ZH1001")
    String professionMessageSer(@RequestBody String str,@RequestHeader("proName") String proName,@RequestHeader("sign") String sign);
    /*获取产品信息*/
    @PostMapping(value = "/esb/cicp/ZH1000")
    String getProductInfoSer(@RequestBody String str,@RequestHeader("proName") String proName,@RequestHeader("sign") String sign);
    /*图片保存*/
    @PostMapping(value = "/esb/cicp/ZH3002")
    String savePictureSer(@RequestBody String str,@RequestHeader("proName") String proName,@RequestHeader("sign") String sign);
    /*支付状态修改*/
    @PostMapping(value = "/esb/cicp/ZH3001")
    String orderStateEditSer(@RequestBody String str,@RequestHeader("proName") String proName,@RequestHeader("sign") String sign);
    /*获取签名图片dir*/
    @PostMapping(value = "/esb/cicp/ZH1003")
    String getSignUrl(@RequestBody String str,@RequestHeader("proName") String proName,@RequestHeader("sign") String sign);
    /*健康告知PDF文件更新*/
    @PostMapping(value = "/esb/cicp/ZH2002")
    String updataPdfBySeq(@RequestBody String str,@RequestHeader("proName") String proName,@RequestHeader("sign") String sign);


}
