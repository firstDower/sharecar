package com.dower.product.core.serverdb.model;

import java.util.Date;

public class NntOrder {
    private Integer numId;

    private Integer numNntUserJourneyId;

    private String vcOrderNo;

    private Date datCreatDate;

    private Date datUpdateDate;

    private String vcObjectDesc;

    private String vcDetail;

    private String vcDiscountSign;

    private Integer numTradeType;

    private String vcOpenid;

    private String vcAccath;

    public Integer getNumId() {
        return numId;
    }

    public void setNumId(Integer numId) {
        this.numId = numId;
    }

    public Integer getNumNntUserJourneyId() {
        return numNntUserJourneyId;
    }

    public void setNumNntUserJourneyId(Integer numNntUserJourneyId) {
        this.numNntUserJourneyId = numNntUserJourneyId;
    }

    public String getVcOrderNo() {
        return vcOrderNo;
    }

    public void setVcOrderNo(String vcOrderNo) {
        this.vcOrderNo = vcOrderNo == null ? null : vcOrderNo.trim();
    }

    public Date getDatCreatDate() {
        return datCreatDate;
    }

    public void setDatCreatDate(Date datCreatDate) {
        this.datCreatDate = datCreatDate;
    }

    public Date getDatUpdateDate() {
        return datUpdateDate;
    }

    public void setDatUpdateDate(Date datUpdateDate) {
        this.datUpdateDate = datUpdateDate;
    }

    public String getVcObjectDesc() {
        return vcObjectDesc;
    }

    public void setVcObjectDesc(String vcObjectDesc) {
        this.vcObjectDesc = vcObjectDesc == null ? null : vcObjectDesc.trim();
    }

    public String getVcDetail() {
        return vcDetail;
    }

    public void setVcDetail(String vcDetail) {
        this.vcDetail = vcDetail == null ? null : vcDetail.trim();
    }

    public String getVcDiscountSign() {
        return vcDiscountSign;
    }

    public void setVcDiscountSign(String vcDiscountSign) {
        this.vcDiscountSign = vcDiscountSign == null ? null : vcDiscountSign.trim();
    }

    public Integer getNumTradeType() {
        return numTradeType;
    }

    public void setNumTradeType(Integer numTradeType) {
        this.numTradeType = numTradeType;
    }

    public String getVcOpenid() {
        return vcOpenid;
    }

    public void setVcOpenid(String vcOpenid) {
        this.vcOpenid = vcOpenid == null ? null : vcOpenid.trim();
    }

    public String getVcAccath() {
        return vcAccath;
    }

    public void setVcAccath(String vcAccath) {
        this.vcAccath = vcAccath == null ? null : vcAccath.trim();
    }
}