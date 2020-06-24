package com.dower.sharerideapp.core.serverdb.model;

import java.math.BigDecimal;
import java.util.Date;

public class ClProduct {
    private Long numId;

    private String vcHight;

    private String vcWight;

    private String vcName;

    private String vcPhone;

    private Byte numType;

    private Byte numNum;

    private Byte numState;

    private Date datCreatTime;

    private Date datUpdateTime;

    private BigDecimal numPrice;

    private String vcUserId;

    private String vcOpenId;

    private Date datConfirmTime;

    private String vcNotes;

    public Long getNumId() {
        return numId;
    }

    public void setNumId(Long numId) {
        this.numId = numId;
    }

    public String getVcHight() {
        return vcHight;
    }

    public void setVcHight(String vcHight) {
        this.vcHight = vcHight == null ? null : vcHight.trim();
    }

    public String getVcWight() {
        return vcWight;
    }

    public void setVcWight(String vcWight) {
        this.vcWight = vcWight == null ? null : vcWight.trim();
    }

    public String getVcName() {
        return vcName;
    }

    public void setVcName(String vcName) {
        this.vcName = vcName == null ? null : vcName.trim();
    }

    public String getVcPhone() {
        return vcPhone;
    }

    public void setVcPhone(String vcPhone) {
        this.vcPhone = vcPhone == null ? null : vcPhone.trim();
    }

    public Byte getNumType() {
        return numType;
    }

    public void setNumType(Byte numType) {
        this.numType = numType;
    }

    public Byte getNumNum() {
        return numNum;
    }

    public void setNumNum(Byte numNum) {
        this.numNum = numNum;
    }

    public Byte getNumState() {
        return numState;
    }

    public void setNumState(Byte numState) {
        this.numState = numState;
    }

    public Date getDatCreatTime() {
        return datCreatTime;
    }

    public void setDatCreatTime(Date datCreatTime) {
        this.datCreatTime = datCreatTime;
    }

    public Date getDatUpdateTime() {
        return datUpdateTime;
    }

    public void setDatUpdateTime(Date datUpdateTime) {
        this.datUpdateTime = datUpdateTime;
    }

    public BigDecimal getNumPrice() {
        return numPrice;
    }

    public void setNumPrice(BigDecimal numPrice) {
        this.numPrice = numPrice;
    }

    public String getVcUserId() {
        return vcUserId;
    }

    public void setVcUserId(String vcUserId) {
        this.vcUserId = vcUserId == null ? null : vcUserId.trim();
    }

    public String getVcOpenId() {
        return vcOpenId;
    }

    public void setVcOpenId(String vcOpenId) {
        this.vcOpenId = vcOpenId == null ? null : vcOpenId.trim();
    }

    public Date getDatConfirmTime() {
        return datConfirmTime;
    }

    public void setDatConfirmTime(Date datConfirmTime) {
        this.datConfirmTime = datConfirmTime;
    }

    public String getVcNotes() {
        return vcNotes;
    }

    public void setVcNotes(String vcNotes) {
        this.vcNotes = vcNotes == null ? null : vcNotes.trim();
    }
}