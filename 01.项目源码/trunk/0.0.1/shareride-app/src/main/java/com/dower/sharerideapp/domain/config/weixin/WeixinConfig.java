package com.dower.sharerideapp.domain.config.weixin;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource({"classpath:weixin/weixin.properties"})
@ConfigurationProperties(prefix = "weixin.pay")
public class WeixinConfig {
    /**
     * 费用名称
     */
    @Value("${weixin.pay.body}")
    public String body;

    /**
     * 货币类型
     */
    @Value("${weixin.pay.feeType}")
    public String feeType;

    /**
     * 访问ip
     */
    @Value("${weixin.pay.spbillCreateIp}")
    public String spbillCreateIp;

    /**
     * 回调url
     */
    @Value("${weixin.pay.notifyrl}")
    public String notifyrl;

    /**
     * 请求类型
     */
    @Value("${weixin.pay.tradeType}")
    public String tradeType;

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getFeeType() {
        return feeType;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }

    public String getSpbillCreateIp() {
        return spbillCreateIp;
    }

    public void setSpbillCreateIp(String spbillCreateIp) {
        this.spbillCreateIp = spbillCreateIp;
    }

    public String getTradeType() {
        return tradeType;
    }

    public void setTradeType(String tradeType) {
        this.tradeType = tradeType;
    }

    public String getNotifyrl() {
        return notifyrl;
    }

    public void setNotifyrl(String notifyrl) {
        this.notifyrl = notifyrl;
    }
}
