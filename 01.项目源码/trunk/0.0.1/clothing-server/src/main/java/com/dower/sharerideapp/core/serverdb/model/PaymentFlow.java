package com.dower.sharerideapp.core.serverdb.model;

import java.util.Date;

public class PaymentFlow {
    private Integer numId;

    private String vcBankType;

    private String vcMchId;

    private String vcOpenid;

    private String vcOrderNo;

    private Byte numPayState;

    private Long numTotalFee;

    private Long numCashFee;

    private String vcTransactionId;

    private Date datCreatTime;

    public Integer getNumId() {
        return numId;
    }

    public void setNumId(Integer numId) {
        this.numId = numId;
    }

    public String getVcBankType() {
        return vcBankType;
    }

    public void setVcBankType(String vcBankType) {
        this.vcBankType = vcBankType == null ? null : vcBankType.trim();
    }

    public String getVcMchId() {
        return vcMchId;
    }

    public void setVcMchId(String vcMchId) {
        this.vcMchId = vcMchId == null ? null : vcMchId.trim();
    }

    public String getVcOpenid() {
        return vcOpenid;
    }

    public void setVcOpenid(String vcOpenid) {
        this.vcOpenid = vcOpenid == null ? null : vcOpenid.trim();
    }

    public String getVcOrderNo() {
        return vcOrderNo;
    }

    public void setVcOrderNo(String vcOrderNo) {
        this.vcOrderNo = vcOrderNo == null ? null : vcOrderNo.trim();
    }

    public Byte getNumPayState() {
        return numPayState;
    }

    public void setNumPayState(Byte numPayState) {
        this.numPayState = numPayState;
    }

    public Long getNumTotalFee() {
        return numTotalFee;
    }

    public void setNumTotalFee(Long numTotalFee) {
        this.numTotalFee = numTotalFee;
    }

    public Long getNumCashFee() {
        return numCashFee;
    }

    public void setNumCashFee(Long numCashFee) {
        this.numCashFee = numCashFee;
    }

    public String getVcTransactionId() {
        return vcTransactionId;
    }

    public void setVcTransactionId(String vcTransactionId) {
        this.vcTransactionId = vcTransactionId == null ? null : vcTransactionId.trim();
    }

    public Date getDatCreatTime() {
        return datCreatTime;
    }

    public void setDatCreatTime(Date datCreatTime) {
        this.datCreatTime = datCreatTime;
    }
}