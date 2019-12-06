package com.ihandy.distribution.controller.share;

import com.ihandy.distribution.service.IFileService;
import com.ihandy.distribution.utils.Base64Util;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author SJW
 * @date 2019/9/8 15:43
 */
@Controller
public class ShareController {
    @Value("${file-sav-name}")
    private String fileSavName;
    @Value("${file.display.security.key}")
    private String fileSavPasd;

    @Autowired
    private IFileService iFileService;

    @RequestMapping(value="/display-img/{node:.+}")
    public void displayImg(@PathVariable("node") String node,
                           HttpServletRequest request, HttpServletResponse response) {
        response.setContentType("image/jpeg; charset=UTF-8");
        String img = null;
        ServletOutputStream outputStream = null;
        FileInputStream inputStream = null;
        try {
            String sign = DigestUtils.md5Hex(fileSavName + fileSavPasd);//混合密钥md5
            img = iFileService.displayPic(fileSavName,sign,node);
            File picFile = Base64Util.decryptByBase64(img);

            outputStream = response.getOutputStream();
            inputStream = new FileInputStream(picFile);
            byte[] buffer = new byte[1024];
            int i = -1;
            while ((i = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, i);
            }
            outputStream.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                if(outputStream != null){
                    outputStream.close();
                }
                if(inputStream != null){
                    inputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
