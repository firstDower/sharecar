package com.ihandy.tcfczhlhweb.biz.file;


import feign.Response;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import feign.codec.Encoder;
import feign.form.spring.SpringFormEncoder;

import java.io.IOException;

import static org.springframework.http.MediaType.MULTIPART_FORM_DATA_VALUE;

/**
 * @author SJW
 * @date 2019/7/8 15:43
 */
@FeignClient(value = "file-cret", configuration = {FileFeignConfig.class})
public interface FileInter {


    /**
     * 上传存储文件
     * @param file  MultipartFile类型
     * @param identity esb身份
     * @param veri 当前请求验证串
     * @return
     * @throws IOException
     */
    @PostMapping(value = "/file/upfile", consumes = MULTIPART_FORM_DATA_VALUE)
    public Object uplctive(@RequestHeader("identity") String identity, @RequestHeader("veri") String veri,
                           @RequestPart(value = "file") MultipartFile file) throws IOException;


    /**
     * 下载文件
     *  fileDir 文件路径
     * @param identity esb身份
     * @param veri 当前请求验证串
     * @return
     * @throws IOException
     */
    @GetMapping(value = "/file/download")
    Response download(@RequestHeader("identity") String identity,
                      @RequestHeader("veri") String veri, @RequestParam("node") String node) throws IOException;


    /**
     * 图片显示
     *  fileDir 文件路径
     * @param identity esb身份
     * @param veri 当前请求验证串
     * @return base64
     */
    @GetMapping(value = "/file/display-pic")
    public String displayPic(@RequestHeader("identity") String identity,
                             @RequestHeader("veri") String veri, @RequestParam("node") String node) throws IOException;

    /**
     * 引用配置类MultipartSupportConfig.并且实例化
     */
    class MultipartSupportConfig {
        @Bean
        public Encoder feignFormEncoder() {
            return new SpringFormEncoder();
        }
    }



}
