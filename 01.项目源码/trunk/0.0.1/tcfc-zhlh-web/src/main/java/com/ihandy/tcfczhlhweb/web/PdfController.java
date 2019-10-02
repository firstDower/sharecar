package com.ihandy.tcfczhlhweb.web;

import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSONObject;
import com.ihandy.tcfczhlhweb.biz.IEsbService;
import com.ihandy.tcfczhlhweb.biz.PdfService;
import com.ihandy.tcfczhlhweb.utils.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.*;

import com.itextpdf.text.Image;
import com.itextpdf.text.Rectangle;
import com.itextpdf.text.pdf.AcroFields;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfStamper;

/**
 * @param
 * @Author: wangwei
 * @Description:
 * @Date: Created in 10:59   2019/6/25
 */
@RestController
public class PdfController {
    Logger logger = LoggerFactory.getLogger(getClass());
    @Autowired
    PdfService pdfService;
    public void viwePdf(){
        try {
             ResourceUtils.getFile(ResourceUtils.CLASSPATH_URL_PREFIX + "static/images/user.png");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * pdf合成
     */
    @RequestMapping(value={"/composePdf"})
    public Result composePdf(String params){
        logger.info("生成pdf健康告知 params="+params);
        long startTime = System.currentTimeMillis();
        Result result = pdfService.composePdf(params);
        long endTime = System.currentTimeMillis();
        logger.info("生成pdf健康告知 result="+result.toString());
        logger.info("生成pdf健康告知耗时 t="+(endTime-startTime));
        return result;
    }
}
