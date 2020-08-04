package com.dower.sharerideapp.core.serverdb.model;

import java.util.Date;

public class NntShareStatistics {
    private Long numId;

    private String vcShareUserId;

    private String vcOrderNo;

    private String vcUserId;

    private Date datCreatTime;

    private Byte numIsDel;

    public Long getNumId() {
        return numId;
    }

    public void setNumId(Long numId) {
        this.numId = numId;
    }

    public String getVcShareUserId() {
        return vcShareUserId;
    }

    public void setVcShareUserId(String vcShareUserId) {
        this.vcShareUserId = vcShareUserId == null ? null : vcShareUserId.trim();
    }

    public String getVcOrderNo() {
        return vcOrderNo;
    }

    public void setVcOrderNo(String vcOrderNo) {
        this.vcOrderNo = vcOrderNo == null ? null : vcOrderNo.trim();
    }

    public String getVcUserId() {
        return vcUserId;
    }

    public void setVcUserId(String vcUserId) {
        this.vcUserId = vcUserId == null ? null : vcUserId.trim();
    }

    public Date getDatCreatTime() {
        return datCreatTime;
    }

    public void setDatCreatTime(Date datCreatTime) {
        this.datCreatTime = datCreatTime;
    }

    public Byte getNumIsDel() {
        return numIsDel;
    }

    public void setNumIsDel(Byte numIsDel) {
        this.numIsDel = numIsDel;
    }
}