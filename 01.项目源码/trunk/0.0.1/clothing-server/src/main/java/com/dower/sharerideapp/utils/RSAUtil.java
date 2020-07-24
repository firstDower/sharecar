package com.dower.sharerideapp.utils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.dower.sharerideapp.domain.config.weixin.sdk.WXPayConstants;
import com.dower.sharerideapp.domain.config.weixin.sdk.WXPayUtil;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang3.StringUtils;
import sun.misc.BASE64Encoder;

import javax.crypto.Cipher;
import java.io.ByteArrayOutputStream;
import java.security.*;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by wangwei on 2020/7/23.
 */
public class RSAUtil {

    /**
     * RSA最大加密明文大小
     */
    private static final int MAX_ENCRYPT_BLOCK = 117;

    /**
     * RSA最大解密密文大小
     */
    private static final int MAX_DECRYPT_BLOCK = 128;
    /**
     * 编码
     */
    private static String charset = "utf-8";

    /**
     * 获取密钥对
     *
     * @return 密钥对
     */
    public static KeyPair getKeyPair() throws Exception {
        KeyPairGenerator generator = KeyPairGenerator.getInstance("RSA");
        generator.initialize(1024);
        return generator.generateKeyPair();
    }

    /**
     * 获取私钥
     *
     * @param privateKey 私钥字符串
     * @return
     */
    public static PrivateKey getPrivateKey(String privateKey) throws Exception {
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        byte[] decodedKey = Base64.decodeBase64(privateKey.getBytes(charset));
        PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(decodedKey);
        return keyFactory.generatePrivate(keySpec);
    }

    /**
     * 获取公钥
     *
     * @param publicKey 公钥字符串
     * @return
     */
    public static PublicKey getPublicKey(String publicKey) throws Exception {
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        byte[] decodedKey = Base64.decodeBase64(publicKey.getBytes(charset));
        X509EncodedKeySpec keySpec = new X509EncodedKeySpec(decodedKey);
        return keyFactory.generatePublic(keySpec);
    }

    /**
     * RSA加密
     *
     * @param data 待加密数据
     * @param publicKey 公钥
     * @return
     */
    public static String encrypt(String data, PublicKey publicKey) throws Exception {
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.ENCRYPT_MODE, publicKey);
        int inputLen = data.getBytes(charset).length;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int offset = 0;
        byte[] cache;
        int i = 0;
        // 对数据分段加密
        while (inputLen - offset > 0) {
            if (inputLen - offset > MAX_ENCRYPT_BLOCK) {
                cache = cipher.doFinal(data.getBytes(charset), offset, MAX_ENCRYPT_BLOCK);
            } else {
                cache = cipher.doFinal(data.getBytes(charset), offset, inputLen - offset);
            }
            out.write(cache, 0, cache.length);
            i++;
            offset = i * MAX_ENCRYPT_BLOCK;
        }
        byte[] encryptedData = out.toByteArray();
        out.close();
        // 获取加密内容使用base64进行编码,并以UTF-8为标准转化成字符串
        // 加密后的字符串
        return Base64.encodeBase64String(encryptedData);
    }

    /**
     * RSA解密
     *
     * @param data 待解密数据
     * @param privateKey 私钥
     * @return
     */
    public static String decrypt(String data, PrivateKey privateKey) throws Exception {
        Cipher cipher = Cipher.getInstance("RSA");
        cipher.init(Cipher.DECRYPT_MODE, privateKey);
        byte[] dataBytes = Base64.decodeBase64(data);
        int inputLen = dataBytes.length;
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        int offset = 0;
        byte[] cache;
        int i = 0;
        // 对数据分段解密
        while (inputLen - offset > 0) {
            if (inputLen - offset > MAX_DECRYPT_BLOCK) {
                cache = cipher.doFinal(dataBytes, offset, MAX_DECRYPT_BLOCK);
            } else {
                cache = cipher.doFinal(dataBytes, offset, inputLen - offset);
            }
            out.write(cache, 0, cache.length);
            i++;
            offset = i * MAX_DECRYPT_BLOCK;
        }
        byte[] decryptedData = out.toByteArray();
        out.close();
        // 解密后的内容
        return new String(decryptedData, "UTF-8");
    }

    /**
     * 签名
     *
     * @param data 待签名数据
     * @param privateKey 私钥
     * @return 签名
     */
    public static String sign(String data, PrivateKey privateKey) throws Exception {
        byte[] keyBytes = privateKey.getEncoded();
        PKCS8EncodedKeySpec keySpec = new PKCS8EncodedKeySpec(keyBytes);
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        PrivateKey key = keyFactory.generatePrivate(keySpec);
        Signature signature = Signature.getInstance("MD5withRSA");
        signature.initSign(key);
        signature.update(data.getBytes(charset));
        return new String(Base64.encodeBase64(signature.sign()),charset);
    }

    /**
     * 验签
     *
     * @param srcData 原始字符串
     * @param publicKey 公钥
     * @param sign 签名
     * @return 是否验签通过
     */
    public static boolean verify(String srcData, PublicKey publicKey, String sign) throws Exception {
        byte[] keyBytes = publicKey.getEncoded();
        X509EncodedKeySpec keySpec = new X509EncodedKeySpec(keyBytes);
        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        PublicKey key = keyFactory.generatePublic(keySpec);
        Signature signature = Signature.getInstance("MD5withRSA");
        signature.initVerify(key);
        signature.update(srcData.getBytes(charset));
        return signature.verify(Base64.decodeBase64(sign.getBytes(charset)));
    }

    public static void main(String[] args) {
        try {
            KeyPair keyPair = getKeyPair();
            String privateKey = new String(Base64.encodeBase64(keyPair.getPrivate().getEncoded()));
            String publicKey = new String(Base64.encodeBase64(keyPair.getPublic().getEncoded()));
            System.out.println("私钥:" + privateKey);
            System.out.println("公钥:" + publicKey);
            // 生成密钥对
            //KeyPair keyPair = getKeyPair();
            //String privateKey = new String(Base64.encodeBase64(keyPair.getPrivate().getEncoded()));
            //String publicKey = new String(Base64.encodeBase64(keyPair.getPublic().getEncoded()));
            //System.out.println("私钥:" + privateKey);
            //System.out.println("公钥:" + publicKey);
            // RSA加密
            /*
            String publicKey = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCIDV8I1zpoazcFmv3VNtG/E9/QC14gDhBoW9Yq6o9UNLaOZC41yoGa7hjHqjuPOcmPJ61Wmv7i5UbB5BceGRl2i0pSyOzeAeYpoY5cNRStfQlXFlwV1Ig1P081rxBcCgkWZvhodsWp9yRdKOTTHUCj0FpgD94/2QhvqkxOaW9vAwIDAQAB";
            String privateKey = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAIgNXwjXOmhrNwWa/dU20b8T39ALXiAOEGhb1irqj1Q0to5kLjXKgZruGMeqO485yY8nrVaa/uLlRsHkFx4ZGXaLSlLI7N4B5imhjlw1FK19CVcWXBXUiDU/TzWvEFwKCRZm+Gh2xan3JF0o5NMdQKPQWmAP3j/ZCG+qTE5pb28DAgMBAAECgYBihmxgFp0xqRL7eDaCBWT3nwjhvJm5VPYE3RzHj32kWVgq3dmpErGw5OQFE/51xj908CLTKQOUhL0tBGTJYxvQci8y9c0Ajt+epQt8wfe1pGJ/ORFP8AAFttMUYRqvjWX+kE+nmnM9jYe2Zqnj7PeUbNFCjwdUEhEeRDflYubzQQJBAMgsI6mWFJ4X7uS+hIemme5hgPQDg8aeoubdSOFYb34Em3wZO7lPHa/Y0UNFsmgE2NAfVuoWx7TNg/A2EbPhx6sCQQCt/zHV6nZNFcR5vfI60L7vd3cNAR4IY55C/n9TXZpihLT3WjOyo1yGyWDiD1o8Y4HKik8/JHeNK3Lv176EbD4JAkEAhYLrRnGTzt6nuGpaex/kC9t850Rw4Elu3g06TxNtSeBI1Lz/2NmsM12qNfSGylpxQl+k2P3Ytf9dwRpPNGujgQJAThhXXuMQXALkH5xQp3Nf741YQt74gt1rgDhIH7vIemWD7+1tfMVz1w91y6EGaEplS+oOLZIJkrQor1vPKBKJOQJAFRSzcW4F+GznqXVZ43o9UnyyqnZbEnDX+lssZdg3q5bJhvk1vjUTRq+uBLfNZX/x9kfVXAm6zn1YNMFXwEsRSg==";
            String data = "12312aawevrdgr312332312312312";
            String encryptData = encrypt(data, getPublicKey(publicKey));
            System.out.println("加密后内容:" + encryptData);
            // RSA解密
            String decryptData = decrypt(encryptData, getPrivateKey(privateKey));
            System.out.println("解密后内容:" + decryptData);

            // RSA签名
            //String sign = sign(data, getPrivateKey(privateKey));
            String sign = sign(data, getPrivateKey(privateKey));
            System.out.println("RSA签名内容:" + sign);
            // RSA验签
            boolean result = verify(data, getPublicKey(publicKey), sign);
            System.out.print("验签结果:" + result);
*/

          /*  String publicKey = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCIDV8I1zpoazcFmv3VNtG/E9/QC14gDhBoW9Yq6o9UNLaOZC41yoGa7hjHqjuPOcmPJ61Wmv7i5UbB5BceGRl2i0pSyOzeAeYpoY5cNRStfQlXFlwV1Ig1P081rxBcCgkWZvhodsWp9yRdKOTTHUCj0FpgD94/2QhvqkxOaW9vAwIDAQAB";
            String privateKey = "MIICdgIBADANBgkqhkiG9w0BAQEFAASCAmAwggJcAgEAAoGBAIgNXwjXOmhrNwWa/dU20b8T39ALXiAOEGhb1irqj1Q0to5kLjXKgZruGMeqO485yY8nrVaa/uLlRsHkFx4ZGXaLSlLI7N4B5imhjlw1FK19CVcWXBXUiDU/TzWvEFwKCRZm+Gh2xan3JF0o5NMdQKPQWmAP3j/ZCG+qTE5pb28DAgMBAAECgYBihmxgFp0xqRL7eDaCBWT3nwjhvJm5VPYE3RzHj32kWVgq3dmpErGw5OQFE/51xj908CLTKQOUhL0tBGTJYxvQci8y9c0Ajt+epQt8wfe1pGJ/ORFP8AAFttMUYRqvjWX+kE+nmnM9jYe2Zqnj7PeUbNFCjwdUEhEeRDflYubzQQJBAMgsI6mWFJ4X7uS+hIemme5hgPQDg8aeoubdSOFYb34Em3wZO7lPHa/Y0UNFsmgE2NAfVuoWx7TNg/A2EbPhx6sCQQCt/zHV6nZNFcR5vfI60L7vd3cNAR4IY55C/n9TXZpihLT3WjOyo1yGyWDiD1o8Y4HKik8/JHeNK3Lv176EbD4JAkEAhYLrRnGTzt6nuGpaex/kC9t850Rw4Elu3g06TxNtSeBI1Lz/2NmsM12qNfSGylpxQl+k2P3Ytf9dwRpPNGujgQJAThhXXuMQXALkH5xQp3Nf741YQt74gt1rgDhIH7vIemWD7+1tfMVz1w91y6EGaEplS+oOLZIJkrQor1vPKBKJOQJAFRSzcW4F+GznqXVZ43o9UnyyqnZbEnDX+lssZdg3q5bJhvk1vjUTRq+uBLfNZX/x9kfVXAm6zn1YNMFXwEsRSg==";

            Map param = new HashMap();
            param.put("nonce_str","1DIP9ylGvfZe1YYB");
            param.put("appid","wx9e9b0787da65bc0f");
            param.put("err_code","ORDERPAID");
            param.put("return_msg","OK");
            param.put("result_code","FAIL");
            param.put("err_code_des","该订单已支付");
            param.put("mch_id","1601077297");
            param.put("return_code","SUCCESS");
            String token="sM4AOVdWfPE4DxkXGEs8VH_Gg2PFtNIo8PjyIISBNbOSdIxVDnaUvEE65KxQskZFi6FiKUxt5oDIjrqtvpf-LA";
            String timeStamp=System.currentTimeMillis()/1000+"";
            param.put("token",token);
            param.put("timeStamp",timeStamp);
            String sign = WXPayUtil.generateSignature(param, publicKey, WXPayConstants.SignType.MD5);
            param.put("sign",sign);
            String jsonParamStr = JSONObject.toJSONString(param);
            String encryptData = encrypt(jsonParamStr, getPublicKey(publicKey));
            System.out.println("加密后内容:" + encryptData);
            // RSA解密
            String decryptData = decrypt(encryptData, getPrivateKey(privateKey));
            System.out.println("解密后内容:" + decryptData);
            Map paramsMap = JSON.parseObject(decryptData,Map.class);
            boolean signatureValid = WXPayUtil.isSignatureValid(paramsMap, publicKey, WXPayConstants.SignType.MD5);
            System.out.println("签名验证结果:：" + signatureValid);
            String timeStamp2 = String.valueOf(paramsMap.get("timeStamp"));

            System.out.println("时间戳获取:：" + timeStamp2);
            boolean b = CommUtil.checkTimeStamp(Long.valueOf(timeStamp2));
            System.out.println("时间戳验证结果:：" + b);
            String token2 = String.valueOf(paramsMap.get("token"));

            System.out.println("token获取:：" + token2);*/
        } catch (Exception e) {
            e.printStackTrace();
            System.out.print("加解密异常");
        }
    }

}
