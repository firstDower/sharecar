package com.ihandy.distribution.utils;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Base64;
import java.util.UUID;

import sun.misc.BASE64Encoder;

/**
 * @author SJW
 * @date 2019/2/19
 */
public class Base64Util {
    /**
     * 将一张网络图片转化成Base64字符串
     * @param imgURL
     * @return
     */
    public static String GetImageStrFromUrl(String imgURL) {
        ByteArrayOutputStream data = new ByteArrayOutputStream();
        try {
            // 创建URL
            URL url = new URL(imgURL);
            byte[] by = new byte[1024];
            // 创建链接
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setConnectTimeout(5000);
            InputStream is = conn.getInputStream();
            // 将内容读取内存中
            int len = -1;
            while ((len = is.read(by)) != -1) {
                data.write(by, 0, len);
            }
            // 关闭流
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 对字节数组Base64编码
        BASE64Encoder encoder = new BASE64Encoder();
        return encoder.encode(data.toByteArray());
    }

    public static File decryptByBase64(String base64) {
        if (base64 == null) {
            return null;
        }
        try {
            String filePath = System.getProperty("user.dir")+"/temporary.png";
            Path path  = Files.write(Paths.get(filePath), Base64.getDecoder().decode(base64),StandardOpenOption.CREATE);
            return path.toFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void base64ToFile(String base64, String fileName) {
        File file = null;
        //创建文件目录
        String filePath="D:\\image";
        File  dir=new File(filePath);
        if (!dir.exists() && !dir.isDirectory()) {
            dir.mkdirs();
        }
        BufferedOutputStream bos = null;
        java.io.FileOutputStream fos = null;
        try {
            byte[] bytes = Base64.getDecoder().decode(base64);
            file=new File(filePath+"\\"+fileName);
            fos = new java.io.FileOutputStream(file);
            bos = new BufferedOutputStream(fos);
            bos.write(bytes);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        String filePath = "https://www.baidu.com/369270f.jpg";//待处理的图片
        System.out.println(GetImageStrFromUrl(filePath));
    }
}

