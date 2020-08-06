package com.dower.sharerideapp.core.serverdb.model;

import java.util.Date;

public class NntShareStatisticsSettlement {
    private Long numId;

    private String vcUserNo;

    private Byte numSettlementState;

    private Date datCreatTime;

    private Byte numIsDel;

    public Long getNumId() {
        return numId;
    }

    public void setNumId(Long numId) {
        this.numId = numId;
    }

    public String getVcUserNo() {
        return vcUserNo;
    }

    public void setVcUserNo(String vcUserNo) {
        this.vcUserNo = vcUserNo == null ? null : vcUserNo.trim();
    }

    public Byte getNumSettlementState() {
        return numSettlementState;
    }

    public void setNumSettlementState(Byte numSettlementState) {
        this.numSettlementState = numSettlementState;
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