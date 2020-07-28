package com.dower.sharerideapp.core.serverdb.model;

import java.util.Date;

public class NntUserBalanceChangeRecode {
    private Long numId;

    private String numUserBalanceId;

    private Byte numSourceType;

    private String numOrderNo;

    private Date datCreateTime;

    private Long numAmount;

    private Byte numIsDel;

    private Byte numMoneyState;

    public Long getNumId() {
        return numId;
    }

    public void setNumId(Long numId) {
        this.numId = numId;
    }

    public String getNumUserBalanceId() {
        return numUserBalanceId;
    }

    public void setNumUserBalanceId(String numUserBalanceId) {
        this.numUserBalanceId = numUserBalanceId == null ? null : numUserBalanceId.trim();
    }

    public Byte getNumSourceType() {
        return numSourceType;
    }

    public void setNumSourceType(Byte numSourceType) {
        this.numSourceType = numSourceType;
    }

    public String getNumOrderNo() {
        return numOrderNo;
    }

    public void setNumOrderNo(String numOrderNo) {
        this.numOrderNo = numOrderNo == null ? null : numOrderNo.trim();
    }

    public Date getDatCreateTime() {
        return datCreateTime;
    }

    public void setDatCreateTime(Date datCreateTime) {
        this.datCreateTime = datCreateTime;
    }

    public Long getNumAmount() {
        return numAmount;
    }

    public void setNumAmount(Long numAmount) {
        this.numAmount = numAmount;
    }

    public Byte getNumIsDel() {
        return numIsDel;
    }

    public void setNumIsDel(Byte numIsDel) {
        this.numIsDel = numIsDel;
    }

    public Byte getNumMoneyState() {
        return numMoneyState;
    }

    public void setNumMoneyState(Byte numMoneyState) {
        this.numMoneyState = numMoneyState;
    }
}