package com.ihandy.tcfczhlhweb.biz;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.ihandy.tcfczhlhweb.biz.file.FileInter;
import com.ihandy.tcfczhlhweb.biz.pay.HttpUtils;
import com.ihandy.tcfczhlhweb.biz.pay.RSAKeysUtil;
import com.ihandy.tcfczhlhweb.utils.PdfUtils;
import com.ihandy.tcfczhlhweb.utils.Result;
import com.ihandy.tcfczhlhweb.utils.SignUtil;
import com.itextpdf.text.Image;
import feign.Response;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.binary.Hex;
import org.apache.commons.codec.binary.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static org.bouncycastle.crypto.tls.HashAlgorithm.md5;

/**
 * @param
 * @Author: wangwei
 * @Description:
 * @Date: Created in 15:59   2019/7/24
 */
@Service
public class PdfService {
    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private Environment env;


    @Autowired
    IEsbService iEsbService;

    @Autowired
    FileInter fileInter;


    public Result composePdf(String params){
        Result result = new Result();
        try {
            JSONObject paramJson = JSON.parseObject(params);
            String policySeq = paramJson.getString("policySeq");
            String dateStr = paramJson.getString("dateStr");
            String imgDir = "";
            if(paramJson.containsKey("imgDir")){
                imgDir = paramJson.getString("imgDir");
            }else {
                //获取签名地址
                Result signUrlServer = getSignUrlServer(params);
                if("200".equals(signUrlServer.getCode())){
                    imgDir = String.valueOf(signUrlServer.getData());
                }else {
                    imgDir = "";
                    result.setCode("400");
                    result.setMessage("获取签名失败！");
                    logger.error("获取签名失败！");
                }

            }
            //下载签名文件
            Image instance = downloadSignImge(imgDir);
            //合成告知书
            MultipartFile multipartFile = PdfUtils.generatePDF("G:/pdf/2.pdf", dateStr, instance);
            //文件上传
            Result resultuploadFile = uploadFile(multipartFile);
            if("200".equals(resultuploadFile.getCode())){
                String fileDir = String.valueOf(resultuploadFile.getData());
                //更新数据库
                String s = updataPdfUrl(policySeq, fileDir);
                JSONObject updataPdfUrlJson = JSON.parseObject(s);
                String updataPdfUrlCode = updataPdfUrlJson.getString("code");
                if("200".equals(updataPdfUrlCode)){
                    result.setCode("200");
                    result.setMessage("生成健康告知书成功！");
                    result.setData(fileDir);
                }else{
                    result.setCode("400");
                    result.setMessage(updataPdfUrlJson.getString("message"));
                }
            }else{
                result.setCode("400");
                result.setMessage("健康告知书上传文件服务失败！");
                logger.error("健康告知书上传文件服务失败！");
            }
        }catch (Exception e){
            result.setCode("400");
            result.setMessage("生成告知书pdf文件异常！");
            e.printStackTrace();
        }
        return result;
    }

    /**
     * 上传文件，上传告知书
     * @return
     */
    private Result uploadFile(MultipartFile multipartFile){
        Result result = new Result();
        try{
            String identity = "zhlh";
            String storagekey = env.getProperty("file.storage.security.key");
            String veristoragekey = identity+storagekey;
            String verimd5storagekey = DigestUtils.md5DigestAsHex(veristoragekey.getBytes());
            logger.info("告知书pdf文件上传开始。");
            long startTime = System.currentTimeMillis();
            Map<String, Object> uplctive =  (Map<String, Object>)fileInter.uplctive(identity, verimd5storagekey, multipartFile);
            long endTime = System.currentTimeMillis();
            JSONObject jsonObject = new JSONObject(uplctive);
            logger.info("告知书pdf文件上传结束。result="+jsonObject.toString());
            logger.info("告知书pdf文件上传耗时 t="+(endTime-startTime));
            String code2 = jsonObject.getString("code");
            if("200".equals(code2)) {
                JSONObject dataJson = jsonObject.getJSONObject("data");
                String fileDir = dataJson.getString("fileDir");
                result.setData(fileDir);
            }else{
                result.setCode("400");
                result.setMessage("告知书pdf文件上传异常！");
                logger.error("告知书pdf文件上传异常！");
            }
        }catch (Exception e){
            e.printStackTrace();;
            logger.error("上传文件，上传告知书上传告知书异常！");
        }
        return result;
    }

    /**
     * 下载签名图片
     * @return
     */
    private Image downloadSignImge(String imgDir){
        Image result = null;
        try{
            String downloadkey = env.getProperty("file.download.security.key");
            String identity = "zhlh";
            String veridownloadkey = identity+downloadkey;
            String verimd5 = DigestUtils.md5DigestAsHex(veridownloadkey.getBytes());
            //文件下载
            logger.info("下载签名图片开始");
            long startTime = System.currentTimeMillis();
            Response download = fileInter.download(identity, verimd5, imgDir);
            long endTime = System.currentTimeMillis();
            logger.info("下载签名图片结束。");
            logger.info("下载签名图片耗时 t="+(endTime-startTime));
            InputStream inputStream = download.body().asInputStream();
            byte[] bytes = PdfUtils.toByteArray(inputStream);
            logger.info("下载签名图片bytes="+bytes.length);

            result = Image.getInstance(bytes);
        }catch (Exception e){

        }
        return result;
    }

    /**
     * 获取签名图片地址
     * @param params
     * @return
     */
    private Result getSignUrlServer(String params){
        Result result = new Result();
        try{
            String sign = SignUtil.getSign(params);
            logger.info("获取签名地址params="+params);
            long startTime = System.currentTimeMillis();
            String getSignUrl = iEsbService.getSignUrl(params, "zhlh", sign);
            long endTime = System.currentTimeMillis();
            logger.info("获取签名地址result="+getSignUrl);
            logger.info("获取签名地址耗时 t="+(endTime-startTime));
            JSONObject getSignUrlJson = JSON.parseObject(getSignUrl);
            String code = getSignUrlJson.getString("code");
            if("200".equals(code)){
                result.setData(getSignUrlJson.getJSONObject("data").getString("imgDri"));
            }else {
                result.setCode("400");
                result.setMessage("获取签名地址！");
                logger.error("获取签名地址！");
            }
        }catch(Exception e){
            e.printStackTrace();
            logger.error("获取签名图片地址异常！");
        }
        return result;
    }

    /**
     *更新告知书地址
     * @param seq
     * @param pdfUrl
     * @return
     */
    private String updataPdfUrl(String seq,String pdfUrl){
        JSONObject paramJson = new JSONObject();
        paramJson.put("policySeq",seq);
        paramJson.put("pdfPath",pdfUrl);
        String param = paramJson.toString();
        String sign = SignUtil.getSign(param);
        logger.info("更新告知书地址params="+param);
        long startTime = System.currentTimeMillis();
        String zhlh = iEsbService.updataPdfBySeq(param, "zhlh", sign);
        long endTime = System.currentTimeMillis();
        logger.info("更新告知书地址result="+zhlh);
        logger.info("更新告知书地址耗时 t="+(endTime-startTime));
        return zhlh;
    }

}
