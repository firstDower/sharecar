package com.dower.sharerideapp.core.serverdb.model;

import java.util.Date;

public class PaymentOrderRecord {
    private Long numId;

    private String vcOrderNo;

    private Long numUserMoneyLogId;

    private Long numUserCouponId;

    private Long numGroupBuyDetailsId;

    private Long numBargainBizLogId;

    private Long numPayFlowId;

    private Date datCreatTime;

    private Byte numPayState;

    private Byte numIsDel;

    public Long getNumId() {
        return numId;
    }

    public void setNumId(Long numId) {
        this.numId = numId;
    }

    public String getVcOrderNo() {
        return vcOrderNo;
    }

    public void setVcOrderNo(String vcOrderNo) {
        this.vcOrderNo = vcOrderNo == null ? null : vcOrderNo.trim();
    }

    public Long getNumUserMoneyLogId() {
        return numUserMoneyLogId;
    }

    public void setNumUserMoneyLogId(Long numUserMoneyLogId) {
        this.numUserMoneyLogId = numUserMoneyLogId;
    }

    public Long getNumUserCouponId() {
        return numUserCouponId;
    }

    public void setNumUserCouponId(Long numUserCouponId) {
        this.numUserCouponId = numUserCouponId;
    }

    public Long getNumGroupBuyDetailsId() {
        return numGroupBuyDetailsId;
    }

    public void setNumGroupBuyDetailsId(Long numGroupBuyDetailsId) {
        this.numGroupBuyDetailsId = numGroupBuyDetailsId;
    }

    public Long getNumBargainBizLogId() {
        return numBargainBizLogId;
    }

    public void setNumBargainBizLogId(Long numBargainBizLogId) {
        this.numBargainBizLogId = numBargainBizLogId;
    }

    public Long getNumPayFlowId() {
        return numPayFlowId;
    }

    public void setNumPayFlowId(Long numPayFlowId) {
        this.numPayFlowId = numPayFlowId;
    }

    public Date getDatCreatTime() {
        return datCreatTime;
    }

    public void setDatCreatTime(Date datCreatTime) {
        this.datCreatTime = datCreatTime;
    }

    public Byte getNumPayState() {
        return numPayState;
    }

    public void setNumPayState(Byte numPayState) {
        this.numPayState = numPayState;
    }

    public Byte getNumIsDel() {
        return numIsDel;
    }

    public void setNumIsDel(Byte numIsDel) {
        this.numIsDel = numIsDel;
    }
}