package com.dower.product.core.serverdb.model;

import java.math.BigDecimal;
import java.util.Date;

public class NntTransLog {
    private Integer numTransLogId;

    private Integer numOrderId;

    private Date datTransTime;

    private BigDecimal numTransMoneySum;

    private Integer numUserId;

    private Integer numStauts;

    private Date datCreateTime;

    private Integer numIsDel;

    private Date datLastUpdataTime;

    private String vcOrderNo;

    public Integer getNumTransLogId() {
        return numTransLogId;
    }

    public void setNumTransLogId(Integer numTransLogId) {
        this.numTransLogId = numTransLogId;
    }

    public Integer getNumOrderId() {
        return numOrderId;
    }

    public void setNumOrderId(Integer numOrderId) {
        this.numOrderId = numOrderId;
    }

    public Date getDatTransTime() {
        return datTransTime;
    }

    public void setDatTransTime(Date datTransTime) {
        this.datTransTime = datTransTime;
    }

    public BigDecimal getNumTransMoneySum() {
        return numTransMoneySum;
    }

    public void setNumTransMoneySum(BigDecimal numTransMoneySum) {
        this.numTransMoneySum = numTransMoneySum;
    }

    public Integer getNumUserId() {
        return numUserId;
    }

    public void setNumUserId(Integer numUserId) {
        this.numUserId = numUserId;
    }

    public Integer getNumStauts() {
        return numStauts;
    }

    public void setNumStauts(Integer numStauts) {
        this.numStauts = numStauts;
    }

    public Date getDatCreateTime() {
        return datCreateTime;
    }

    public void setDatCreateTime(Date datCreateTime) {
        this.datCreateTime = datCreateTime;
    }

    public Integer getNumIsDel() {
        return numIsDel;
    }

    public void setNumIsDel(Integer numIsDel) {
        this.numIsDel = numIsDel;
    }

    public Date getDatLastUpdataTime() {
        return datLastUpdataTime;
    }

    public void setDatLastUpdataTime(Date datLastUpdataTime) {
        this.datLastUpdataTime = datLastUpdataTime;
    }

    public String getVcOrderNo() {
        return vcOrderNo;
    }

    public void setVcOrderNo(String vcOrderNo) {
        this.vcOrderNo = vcOrderNo == null ? null : vcOrderNo.trim();
    }
}