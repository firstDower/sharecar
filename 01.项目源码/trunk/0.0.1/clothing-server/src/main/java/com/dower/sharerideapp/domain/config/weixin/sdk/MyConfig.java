package com.dower.sharerideapp.domain.config.weixin.sdk;



import org.springframework.beans.factory.annotation.Value;

import java.io.*;

public class MyConfig extends WXPayConfig {



    /**
     * 获取 App ID
     *
     * @return App ID
     */
    public String getAppID() {
        return "wx9e9b0787da65bc0f";
    }
    /**
     * 获取 Mch ID
     *
     * @return Mch ID
     */
    public String getMchID() {
        return "1601077297";
    }
    /**
     * 获取 API 密钥
     *
     * @return API密钥
     */
    public String getKey() {
        return "0E9AE3842B9431D9E8E88847D4871444";
    }
    /**
     * 获取商户证书内容
     * 这里是读取resources根目录下面的证书文件
     * @return 商户证书内容
     */
    public InputStream getCertStream() {
        InputStream certStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("apiclient_cert.p12");
        return certStream;
    }
    /**
     * 获取WXPayDomain, 用于多域名容灾自动切换
     * 实现这个接口
     * @return
     */
    public IWXPayDomain getWXPayDomain() {
        IWXPayDomain iwxPayDomain = new IWXPayDomain() {
            public void report(String domain, long elapsedTimeMillis, Exception ex) {
            }
            public DomainInfo getDomain(WXPayConfig config) {
                return new IWXPayDomain.DomainInfo(WXPayConstants.DOMAIN_API, true);
            }
        };
        return iwxPayDomain;
    }
}