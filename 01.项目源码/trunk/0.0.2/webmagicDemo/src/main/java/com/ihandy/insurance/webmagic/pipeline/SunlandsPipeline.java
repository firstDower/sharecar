package com.ihandy.insurance.webmagic.pipeline;

import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.Pipeline;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * Created by wangwei on 2020/4/27.
 */
public class ChangbaPipeline implements Pipeline {
    //抓取结果进行处理
    public void process(ResultItems resultItems, Task task) {
        String fileName = resultItems.get("title");
        File filePath = new File("G:/music/pk2/");
        if(!filePath.exists()){
            if(fileName != null && !fileName.equals("null")){
                filePath.mkdirs();
            }
        }

        //视频地址
        String videoUrl = resultItems.get("videoUrl");
        //保存视频目录
        File videoFile = new File(filePath + "/" + fileName + ".mp3");
        if(videoFile.exists()){
            videoFile = new File(filePath + "/" + fileName + "1.mp3");
        }
        if(videoFile.exists()){
            videoFile = new File(filePath + "/" + fileName + "11.mp3");
        }
        try {
            //去除空文件
            if((videoUrl != null && fileName != null) && (!videoUrl.equals("null") && !fileName.equals("null"))){
                //保存视频
                saveVideo(videoFile, videoUrl);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //将视频保存到本地
    public static void saveVideo(File file, String videoUrl) throws Exception{
        HttpURLConnection con;
        FileOutputStream fs = null;
        InputStream is;
        BufferedInputStream bs = null;

        //创建文件
        file.createNewFile();

        try {
            con = (HttpURLConnection) new URL(videoUrl).openConnection();
            con.setRequestProperty("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/78.0.3904.70 Safari/537.36");
            con.setRequestProperty("Cookie", "***********************************************");
            //输入流
            is = con.getInputStream();
            bs = new BufferedInputStream(is);
            //outStream
            fs = new FileOutputStream(file);
            byte [] bytes = new byte[1024];
            int line ;
            //write
            while((line = bs.read(bytes))!= -1){
                fs.write(bytes, 0, line);
                fs.flush();
            }
        } catch (Exception e) {
            file.delete();
            e.printStackTrace();
        } finally{
            //close
            if(fs!= null){
                try {
                    fs.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(bs!=null){
                try {
                    bs.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
