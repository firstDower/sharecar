package com.dower.sharerideadmin.core.serverdb.model;

import java.math.BigDecimal;
import java.util.Date;

public class NnaAccounting {
    private Integer numAccountingId;

    private String vcAccountingName;

    private String vcAccountingDesc;

    private BigDecimal numAmount;

    private Date datCreatDate;

    private Date datMakeDate;

    private Integer numStatus;

    private String vcImgeUrl;

    public Integer getNumAccountingId() {
        return numAccountingId;
    }

    public void setNumAccountingId(Integer numAccountingId) {
        this.numAccountingId = numAccountingId;
    }

    public String getVcAccountingName() {
        return vcAccountingName;
    }

    public void setVcAccountingName(String vcAccountingName) {
        this.vcAccountingName = vcAccountingName == null ? null : vcAccountingName.trim();
    }

    public String getVcAccountingDesc() {
        return vcAccountingDesc;
    }

    public void setVcAccountingDesc(String vcAccountingDesc) {
        this.vcAccountingDesc = vcAccountingDesc == null ? null : vcAccountingDesc.trim();
    }

    public BigDecimal getNumAmount() {
        return numAmount;
    }

    public void setNumAmount(BigDecimal numAmount) {
        this.numAmount = numAmount;
    }

    public Date getDatCreatDate() {
        return datCreatDate;
    }

    public void setDatCreatDate(Date datCreatDate) {
        this.datCreatDate = datCreatDate;
    }

    public Date getDatMakeDate() {
        return datMakeDate;
    }

    public void setDatMakeDate(Date datMakeDate) {
        this.datMakeDate = datMakeDate;
    }

    public Integer getNumStatus() {
        return numStatus;
    }

    public void setNumStatus(Integer numStatus) {
        this.numStatus = numStatus;
    }

    public String getVcImgeUrl() {
        return vcImgeUrl;
    }

    public void setVcImgeUrl(String vcImgeUrl) {
        this.vcImgeUrl = vcImgeUrl == null ? null : vcImgeUrl.trim();
    }
}