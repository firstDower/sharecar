package com.ihandy.distribution.utils.weichat;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.ihandy.distribution.service.scheduled.ScheduledService;
import com.ihandy.distribution.utils.HttpRequestUtil;
import com.thoughtworks.xstream.XStream;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpRequest;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.data.redis.core.RedisTemplate;

import javax.servlet.http.HttpServletRequest;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
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
            MessageDigest digest = java.security.MessageDigest.getInstance("SHA-1");
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

}
