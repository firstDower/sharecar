package com.dower.sharerideapp.core.serverdb.model;

import java.util.Date;

public class NntUserCoupons {
    private Long numId;

    private Long numPlatformCouponId;

    private Date datCreatDate;

    private Date datEndDate;

    private Byte numState;

    private String numUserId;

    public Long getNumId() {
        return numId;
    }

    public void setNumId(Long numId) {
        this.numId = numId;
    }

    public Long getNumPlatformCouponId() {
        return numPlatformCouponId;
    }

    public void setNumPlatformCouponId(Long numPlatformCouponId) {
        this.numPlatformCouponId = numPlatformCouponId;
    }

    public Date getDatCreatDate() {
        return datCreatDate;
    }

    public void setDatCreatDate(Date datCreatDate) {
        this.datCreatDate = datCreatDate;
    }

    public Date getDatEndDate() {
        return datEndDate;
    }

    public void setDatEndDate(Date datEndDate) {
        this.datEndDate = datEndDate;
    }

    public Byte getNumState() {
        return numState;
    }

    public void setNumState(Byte numState) {
        this.numState = numState;
    }

    public String getNumUserId() {
        return numUserId;
    }

    public void setNumUserId(String numUserId) {
        this.numUserId = numUserId == null ? null : numUserId.trim();
    }
}