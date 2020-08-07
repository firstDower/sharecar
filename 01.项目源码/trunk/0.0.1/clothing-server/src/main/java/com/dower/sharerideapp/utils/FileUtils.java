package com.dower.sharerideapp.utils;

/**
 * Created by wangwei on 2020/8/7.
 */

import java.io.IOException;

import com.dower.sharerideapp.utils.ret.RetResponse;
import com.dower.sharerideapp.utils.ret.RetResult;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

/**
 * 文件上传工具包
 */
public class FileUtils {

    /**
     *
     * @param file 文件
     * @param path 静态文件路径
     * @param localPath 访问文件路径
     * @param fileName 源文件名
     * @return
     */
    public static RetResult upload(MultipartFile file, String path,String localPath, String fileName){

        // 生成新的文件名
        String newFileName = FileNameUtils.getFileName(fileName);
        String realPath = path + localPath + "/" + newFileName;

        //使用原文件名
        //String realPath = path + "/" + fileName;

        File dest = new File(realPath);

        //判断文件父目录是否存在
        if(!dest.getParentFile().exists()){
            dest.getParentFile().mkdir();
        }

        try {
            //保存文件
            file.transferTo(dest);
            return RetResponse.makeOKRsp(localPath + "/" + newFileName);
        } catch (IllegalStateException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return RetResponse.makeErrRsp(e.getMessage());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            return RetResponse.makeErrRsp(e.getMessage());
        }

    }
}

