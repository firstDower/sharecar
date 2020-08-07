package com.dower.sharerideapp.controller.upload;

import com.dower.sharerideapp.utils.FileUtils;
import com.dower.sharerideapp.utils.ret.RetResponse;
import com.dower.sharerideapp.utils.ret.RetResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

/**
 * Created by wangwei on 2020/8/7.
 */
@Slf4j
@RestController
@RequestMapping("/upload")
public class UploadImgController {
    @Value("${resourceLocations}")
    private String resourceLocations;
    @Value("${web.upload-path}")
    private String localPath;

    /**
     *
     * @param file 要上传的文件
     * @return
     */
    @RequestMapping("/imgUpload")
    public RetResult upload(@RequestParam("fileName") MultipartFile file, Map<String, Object> map){
        String localFilePath = resourceLocations.substring(5);
        return FileUtils.upload(file, localFilePath,localPath, file.getOriginalFilename());
    }
}
