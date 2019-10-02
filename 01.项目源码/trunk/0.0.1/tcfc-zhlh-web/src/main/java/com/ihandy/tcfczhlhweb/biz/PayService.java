package com.ihandy.tcfczhlhweb.biz;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.google.gson.Gson;
import com.ihandy.tcfczhlhweb.biz.pay.HttpUtils;
import com.ihandy.tcfczhlhweb.biz.pay.RSAKeysUtil;
import com.ihandy.tcfczhlhweb.utils.Result;
import org.apache.commons.codec.binary.Base64;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.Signature;
import java.util.HashMap;
import java.util.Map;

/**
 * @param
 * @Author: wangwei
 * @Description:
 * @Date: Created in 15:59   2019/7/24
 */
@Service
public class PayService {
    Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private Environment env;
    public Result paySer(String param){
        Result reuslt = new Result();
        String url = "";
        try {

            JSONObject paramJson = JSON.parseObject(param);

            String  PRIVATE_KEY_STRING = "MIIEvQIBADANBgkqhkiG9w0BAQEFAASCBKcwggSjAgEAAoIBAQC6PzLP74ndae4ThPxtlxcNTZfswo0IAbSoDzCcbtRfxuxBIWdI/2nv+EDNfgU1+IGYLN6smgmAO8F3KFNM+/lxJmm4ikmVMjJBsL1RZISpGZXh2q8itnQBpN0RDahCoIZuGyYTE7TiwPllTvYoE4wxwkyCdAXlgkxpIlniL7KnHiyZ8MhrUUP8Oxvn+KeiK3ftBha5Xxbewn0A3djQnb9Xl7Ynd5sSqiN1fr8Htz+bXh4YUeT/YXOMyuFbZqUJyDxxQBVPKzeBdbUJ2sVsfqLVhiKCYm1AP700oKT9QQTpKGo5EkCTIwlQrX+xFRXesO0pY7drTWQf+I7PWP4O9LFnAgMBAAECggEAJVJ2zz50RR9uKxEyOI/Xeb373OEbu+gDmM36cs6u1kaZn2+fL/ym8QSxj7xaNPeImMMdGD+B+eV/nm5BSyMPWIJXGzjzB+fYNFvDhGT9RJmw9GKLSAyB8LZl6n3vIvLiHXxpQ9dmHy6Gi6uoHl3UcUA7bsTrTZOv1j2g/3eJeH12tfJx2TdC3gkVD3W5knuHZRTuIMYIFZz7w66Exei0vbnX3GoTX30PX5gGGt6ksNsbsCvD+0rLW/XX2N8D4wEuwt4Ld3RoIIsEpvW3edOw7aMEit3Xfp9Hy6i98k3vcVetUGIInSy7mJnmcJ0q9IUMFG8n69BFOQCiX5nyzMiRaQKBgQDrXLCjS8Xykgh/GwDtpwy53fITe4Ehj4v3zqwKzIxTfYWK3ICZjJ+dgkclf3IcAA+vJZK3S5USNJEXagJiRunOOct6g1MmR70Iaab5h/ofUDOIJpNum7YBA9SqxTaXJW4WiuiOT1oNi7RFpqPvg20KNDviTklT4kNIBgsDL5Yf9QKBgQDKk/2opfcIuFh8PKqDumvW0ovjyTLzMQ5giVd5wmMfbmt+WNNWj16oPqqYF4c1gsnLEO6y/lfvw6+ghrC3cfjZE1vDpMNku+Rao6A6E0cdrv/fJrjTAjSo+MiD72meEABLJCp+4KM18vyPJ/s57vZy+yye7HmQ2Yl3+1Yovpg+awKBgDv++sAFlsYI18We2pO6G5Jds1GoD/jAIMvgkRaHodW+j4YgQ1/g6uc5yG0Umb/tfBIHn+i9iZiEcd/oFAd9UChTrzzhsRZ2/wbf98JwGSBWT2yLeNWfN7v2gAWwFARfdDqm2jU8oRYG4MNIgU2S0P7i5ckAb8zERqZbc/8x6DDpAoGBAMCxYtCABeqqh6itgDjLI/b00ZH7+VXwrM9Q9P9h0y27t844KdclixGYgmcnwjo5TT+2vIdQfk8YIcAdPo1QgTfjPR9tY1s3irBZAnkbi0MGCme2iopUh8jO1NUC78ElUVIoda+4eCdCGdEGY+cokg6vMzN8luocsrGJRtx8544/AoGAfvPkxge+WU9efITBd8p9tWOntJsxagONFdiWiGSoOvtWUDjoMW4JD774QHEhc1a4YS3ceg32iFNT6JGel2QsIP/PiaX2ZOt4uG+CYEcxncokdvCRmzIS3UEtS55ldo2XXzQ2LVZ/3rOZyQulNXEwd50wkfrto0PTRvgHzTJWAqo=";
            String  pubKey = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAuj8yz++J3WnuE4T8bZcXDU2X7MKNCAG0qA8wnG7UX8bsQSFnSP9p7/hAzX4FNfiBmCzerJoJgDvBdyhTTPv5cSZpuIpJlTIyQbC9UWSEqRmV4dqvIrZ0AaTdEQ2oQqCGbhsmExO04sD5ZU72KBOMMcJMgnQF5YJMaSJZ4i+ypx4smfDIa1FD/Dsb5/inoit37QYWuV8W3sJ9AN3Y0J2/V5e2J3ebEqojdX6/B7c/m14eGFHk/2FzjMrhW2alCcg8cUAVTys3gXW1CdrFbH6i1YYigmJtQD+9NKCk/UEE6ShqORJAkyMJUK1/sRUV3rDtKWO3a01kH/iOz1j+DvSxZwIDAQAB";
            Map<String,String> requestMap = new HashMap();
            requestMap.put("channelOrderNo",paramJson.getString("policySeq"));
            requestMap.put("productName",paramJson.getString("productName"));
            requestMap.put("productCode","ZHLHCP");
            requestMap.put("productDesc",paramJson.getString("productDesc"));
            requestMap.put("tradeAmount",paramJson.getString("tradeAmount"));
            PrivateKey privateKey = RSAKeysUtil.getPrivateKeyStr(PRIVATE_KEY_STRING);
            Signature signature = Signature.getInstance("SHA256WITHRSA");
            signature.initSign(privateKey);
            Gson gs = new Gson();
            String temp1 = gs.toJson(requestMap);
            String biz_content = new String(RSAKeysUtil.encrtypt(temp1,privateKey));
            Map<String,String> payRequestMap = new HashMap();
            payRequestMap.put("merchantCode","ZHLH");
            payRequestMap.put("format","json");
            payRequestMap.put("charset","utf-8");
            payRequestMap.put("sign_type","RSA2");
            payRequestMap.put("version","1.0");
            payRequestMap.put("frontUrl",env.getProperty("pay.frontUrl"));/*前台回调地址*/
            payRequestMap.put("notifyUrl",env.getProperty("pay.notifyUrl"));/*后台回调地址*/
            payRequestMap.put("bizContent",biz_content);
            payRequestMap.put("auto","1");
            String sign1 = RSAKeysUtil.scort(payRequestMap,"utf-8");
            byte[] temp = sign1.getBytes("UTF-8");
            signature.update(temp);
            byte[] signBytes  = signature.sign();
            String sign = new String(org.apache.commons.codec.binary.Base64.encodeBase64(signBytes));
            PublicKey publicKey = RSAKeysUtil.getPublicKeyStr(pubKey);
            Signature psignature = Signature.getInstance("SHA256WITHRSA");
            psignature.initVerify(publicKey);
            byte[] byteDate = Base64.decodeBase64(sign);
            psignature.update(temp);
            try{
                if (!psignature.verify(byteDate)) {
                    //"错误";
                }
            }catch(Exception e){
                e.printStackTrace();
            }
            payRequestMap.put("sign",sign);
            String result = "";
            String ret_code="";
            String ret_msg="";
            gs = new Gson();
            url = HttpUtils.doPost("https://pay.tiancaibaoxian.com/api/pay",gs.toJson(payRequestMap));
            logger.info("支付返回结果："+url);
            JSONObject jsonObject = JSON.parseObject(url);
            String code = jsonObject.getString("code");
            if("0".equals(code)){
                String payUrl = jsonObject.getString("payUrl");
                logger.info("payUrl="+payUrl);
                Map<String,Object> resultMap = new HashMap<>();
                resultMap.put("payUrl",payUrl);
                reuslt.setData(resultMap);
            }else {
                logger.info("支付返回结果code="+code+";msg="+jsonObject.getString("msg"));
            }

        }catch (Exception e){
            logger.error("支付返回结果异常！");
            reuslt.setCode("400");
            reuslt.setMessage("支付返回数据结果异常！");
        }

        return reuslt;
    }
}
