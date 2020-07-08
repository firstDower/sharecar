package com.dower.sharerideapp.utils.weichat;

import com.alibaba.fastjson.JSONObject;
import com.thoughtworks.xstream.XStream;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.codec.binary.Base64;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import javax.servlet.http.HttpServletRequest;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.security.*;
import java.security.spec.InvalidParameterSpecException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @param
 * @Author: wangwei
 * @Description:
 * @Date: Created in 10:45   2019/9/9
 */
@Slf4j
public class WeiXinUtils {
    public static final String MESSAGE_TEXT = "text";
    public static final String MESSAGE_IMAGE = "image";
    public static final String MESSAGE_VOICE = "voice";
    public static final String MESSAGE_VIDEO = "video";
    public static final String MESSAGE_LINK = "link";
    public static final String MESSAGE_LOCATION = "location";
    public static final String MESSAGE_EVENT = "event";

    public static final String EVENT_SUB = "subscribe";
    public static final String EVENT_UNSUB = "unsubscribe";
    public static final String EVENT_CLICK = "CLICK";
    public static final String EVENT_VIEW = "VIEW";


    public static String SHA1(String decript) {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-1");
            digest.update(decript.getBytes());
            byte messageDigest[] = digest.digest();
            // Create Hex String
            StringBuffer hexString = new StringBuffer();
            // 字节数组转换为 十六进制 数
            for (int i = 0; i < messageDigest.length; i++) {
                String shaHex = Integer.toHexString(messageDigest[i] & 0xFF);
                if (shaHex.length() < 2) {
                    hexString.append(0);
                }
                hexString.append(shaHex);
            }
            return hexString.toString();

        } catch (NoSuchAlgorithmException e) {
            log.error("SHA1发生错误", e);
        }
        return "";
    }

    /*将xml格式转化为map*/
    public static Map<String,String> xmlToMap(HttpServletRequest request) throws Exception{
        Map<String,String> map=new HashMap<>();

        SAXReader reader=new SAXReader();
        InputStream inputStream=request.getInputStream();
        Document doc=reader.read(inputStream);
        Element root=doc.getRootElement();//得到根节点
        List<Element> list=root.elements();//根节点下的所有的节点
        for(Element e:list){
            map.put(e.getName(),e.getText());
        }

        inputStream.close();
        return  map;
    }

        /*将我们的消息内容转变为xml*/

    public static String objectToXml(Message message){
        XStream xStream=new XStream();
        xStream.alias("xml", message.getClass());
        return xStream.toXML(message);
    }

    public static String getSubscribMsg(){
        StringBuffer sb = new StringBuffer();
        sb.append("该公众号为天彩微分销测试公众号，目前系统处于封闭测试阶段，功能未全部开放，欢迎测试，并随时反馈系统问题，谢谢 ：）\n");
        sb.append("· 用户注册功能未开放，请联系管理员后台添加用户，游客仅能浏览\n");
        sb.append("· 保险超市中的产品均为天彩正式发售产品，可生成正式保单，请谨慎购买，另：目前购买后不累计个人积分\n" +
                  "· 所有注册用户默认归属到天彩总部渠道\n" +
                  "· 个人二维码增员功能测试阶段不开放\n" +
                  "· 目前所有分享的产品积分均设置为 0 ，正式发布前根据渠道政策另行配置\n" +
                  "· 测试服务器页面打开的速度较慢，正式发布后不会出现此问题\n" +
                  "· 测试数据在正式版本上线前会全部清空，请注意");
        return sb.toString();
    }

    /**
     * 解密小程序数据
     * 获取信息
     */
    public static JSONObject getUserInfo(String encryptedData, String sessionkey, String iv){
        // 被加密的数据
        byte[] dataByte = Base64.decodeBase64(encryptedData.getBytes());
        // 加密秘钥
        byte[] keyByte = Base64.decodeBase64(sessionkey.getBytes());
        // 偏移量
        byte[] ivByte = Base64.decodeBase64(iv.getBytes());
        try {
            // 如果密钥不足16位，那么就补足.  这个if 中的内容很重要
            int base = 16;
            if (keyByte.length % base != 0) {
                int groups = keyByte.length / base + (keyByte.length % base != 0 ? 1 : 0);
                byte[] temp = new byte[groups * base];
                Arrays.fill(temp, (byte) 0);
                System.arraycopy(keyByte, 0, temp, 0, keyByte.length);
                keyByte = temp;
            }
            // 初始化
            Security.addProvider(new BouncyCastleProvider());
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7Padding","BC");
            SecretKeySpec spec = new SecretKeySpec(keyByte, "AES");
            AlgorithmParameters parameters = AlgorithmParameters.getInstance("AES");
            parameters.init(new IvParameterSpec(ivByte));
            cipher.init(Cipher.DECRYPT_MODE, spec, parameters);// 初始化
            byte[] resultByte = cipher.doFinal(dataByte);
            if (null != resultByte && resultByte.length > 0) {
                String result = new String(resultByte, "UTF-8");
                return JSONObject.parseObject(result);
            }
        } catch (NoSuchAlgorithmException e) {
            log.info("NoSuchAlgorithmException{}" + e);
        } catch (NoSuchPaddingException e) {
            log.info("NoSuchPaddingException{}" + e);
        } catch (InvalidParameterSpecException e) {
            log.info("InvalidParameterSpecException{}" + e);
        } catch (IllegalBlockSizeException e) {
            log.info("IllegalBlockSizeException{}" + e);
        } catch (BadPaddingException e) {
            log.info("BadPaddingException{}" + e);
        } catch (UnsupportedEncodingException e) {
            log.info("UnsupportedEncodingException{}" + e);
        } catch (InvalidKeyException e) {
            log.info("InvalidKeyException{}" + e);
        } catch (InvalidAlgorithmParameterException e) {
            log.info("InvalidAlgorithmParameterException{}" + e);
        } catch (NoSuchProviderException e) {
            log.info("NoSuchProviderException{}" + e);
        }
        return null;
    }
}
