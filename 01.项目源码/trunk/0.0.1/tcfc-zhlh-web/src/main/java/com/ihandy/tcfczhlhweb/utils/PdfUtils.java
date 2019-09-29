package com.ihandy.tcfczhlhweb.utils;


import com.itextpdf.text.pdf.*;

import java.io.*;
import java.util.HashMap;
import java.util.Map;


import com.itextpdf.text.Image;
import com.itextpdf.text.Rectangle;
import org.springframework.mock.web.MockMultipartFile;
import org.springframework.web.multipart.MultipartFile;

/**
 * @param
 * @Author: wangwei
 * @Description:
 * @Date: Created in 14:38   2019/6/21
 */

public class PdfUtils {


    public void testPDF() {
        generatePDF("G:/pdf/1.pdf", "G:/pdf/2.pdf", "G:/pdf/1.png");
    }


    /**
     * 编辑pdf
     *
     * @param pdfPath
     * @param newPDFPath
     * @param imagePath
     */
    public static void generatePDF(String pdfPath, String newPDFPath, String imagePath) {
        PdfReader reader = null;
        PdfStamper stamper = null;
        try {

            reader = new PdfReader(pdfPath);
            stamper = new PdfStamper(reader, new FileOutputStream(newPDFPath));
            AcroFields form = stamper.getAcroFields();


            BaseFont bfChinese = BaseFont.createFont("STSong-Light", "UniGB-UCS2-H", BaseFont.NOT_EMBEDDED);
            form.addSubstitutionFont(bfChinese);

            Map<String, Object> data = new HashMap<String, Object>();
            data.put("date", "2019-06-25");
            for (String key : data.keySet()) {
                form.setField(key, data.get(key).toString());
            }
            stamper.setFormFlattening(true);

            System.out.println("pdf ");
            int pageNo = form.getFieldPositions("sign").get(0).page;
            Rectangle signRect = form.getFieldPositions("sign").get(0).position;
            float x = signRect.getLeft();
            float y = signRect.getBottom();
            Image image = Image.getInstance(imagePath);
            PdfContentByte under = stamper.getOverContent(pageNo);
            image.scaleToFit(signRect.getWidth(), signRect.getHeight());
            image.setAbsolutePosition(x, y);
            under.addImage(image);
            stamper.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }
    }


    public static MultipartFile generatePDF(String newPDFPath, String dateStr, Image image) {
        PdfReader reader = null;
        PdfStamper stamper = null;
        MultipartFile multipartFile = null;
        try {
            //1.读取模板。
            InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("pdf/1.pdf");
            reader = new PdfReader(inputStream);

            //修改后的PDF将会存入bao

            ByteArrayOutputStream bao =new ByteArrayOutputStream();
            stamper =new PdfStamper(reader,bao);

            //stamper = new PdfStamper(reader, new FileOutputStream(newPDFPath));
            AcroFields form = stamper.getAcroFields();


            BaseFont bfChinese = BaseFont.createFont("STSong-Light", "UniGB-UCS2-H", BaseFont.NOT_EMBEDDED);
            form.addSubstitutionFont(bfChinese);


            Map<String, Object> data = new HashMap<String, Object>();
            data.put("date", dateStr);
            for (String key : data.keySet()) {
                form.setField(key, data.get(key).toString());
            }
            stamper.setFormFlattening(true);

            System.out.println("pdf ");
            int pageNo = form.getFieldPositions("sign").get(0).page;
            Rectangle signRect = form.getFieldPositions("sign").get(0).position;
            float x = signRect.getLeft();
            float y = signRect.getBottom();

            PdfContentByte under = stamper.getOverContent(pageNo);
            image.scaleToFit(signRect.getWidth(), signRect.getHeight());
            image.setAbsolutePosition(x, y);
            under.addImage(image);
            stamper.close();
            byte[] byteArray =bao.toByteArray();
            multipartFile =new MockMultipartFile("file", "pdf", "text/plain",bao.toByteArray());
            System.out.println("pdf生成完成！"+byteArray.length);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }
        return multipartFile;
    }

    public static byte[] toByteArray(InputStream input) throws IOException {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024 * 4];
        int n = 0;
        while (-1 != (n = input.read(buffer))) {
            output.write(buffer, 0, n);
        }
        return output.toByteArray();
    }


}