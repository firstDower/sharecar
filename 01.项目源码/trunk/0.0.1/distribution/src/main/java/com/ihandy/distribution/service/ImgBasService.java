package com.ihandy.distribution.service;

import com.ihandy.distribution.service.IFileService;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author SJW
 * @date 2019/9/8 15:43
 */

@Service
public class ImgBasService {

    @Value("${file-sav-name}")
    private String fileSavName;
    @Value("${file.display.security.key}")
    private String fileSavPasd;

    @Autowired
    private IFileService iFileService;

    public String imgBasePoi(String node){
        String imgstr = "";

        try {
            String sign = DigestUtils.md5Hex(fileSavName + fileSavPasd);//混合密钥md5
            imgstr = iFileService.displayPic(fileSavName,sign,node);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return "data:image/png;base64,"+imgstr;
    }
}
