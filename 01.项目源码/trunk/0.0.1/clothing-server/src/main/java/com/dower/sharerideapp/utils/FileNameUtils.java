package com.dower.sharerideapp.utils;

import java.util.UUID;

/**
 * Created by wangwei on 2020/8/7.
 */
public class FileNameUtils {
    /**
     * 获取文件后缀
     * @param fileName
     * @return
     */
    public static String getSuffix(String fileName){
        return fileName.substring(fileName.lastIndexOf("."));
    }

    /**
     * 生成新的文件名
     * @param fileOriginName 源文件名
     * @return
     */
    public static String getFileName(String fileOriginName){
        return UUID.randomUUID().toString().replace("-", "") + FileNameUtils.getSuffix(fileOriginName);
    }
}
