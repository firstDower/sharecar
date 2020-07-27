package com.dower.sharerideapp.core.serverdb.model;

import java.util.Date;

public class NntPlatformCoupon {
    private Long numId;

    private String vcCouponName;

    private Integer numIssueTotal;

    private Byte numDiscountType;

    private Integer numDiscountNumber;

    private String vcDiscountStr;

    private Byte numHasDiscountLimit;

    private Integer numLimitPrice;

    private Byte numMember;

    private Byte numUserLimitNum;

    private Byte numLimitDateType;

    private Integer numAvailableDays;

    private Long numAvailableGoods;

    private String vcInstructions;

    private Date datCreatDate;

    private Date datStartDate;

    private Date datEndDate;

    private Long numCreatAdminUserId;

    public Long getNumId() {
        return numId;
    }

    public void setNumId(Long numId) {
        this.numId = numId;
    }

    public String getVcCouponName() {
        return vcCouponName;
    }

    public void setVcCouponName(String vcCouponName) {
        this.vcCouponName = vcCouponName == null ? null : vcCouponName.trim();
    }

    public Integer getNumIssueTotal() {
        return numIssueTotal;
    }

    public void setNumIssueTotal(Integer numIssueTotal) {
        this.numIssueTotal = numIssueTotal;
    }

    public Byte getNumDiscountType() {
        return numDiscountType;
    }

    public void setNumDiscountType(Byte numDiscountType) {
        this.numDiscountType = numDiscountType;
    }

    public Integer getNumDiscountNumber() {
        return numDiscountNumber;
    }

    public void setNumDiscountNumber(Integer numDiscountNumber) {
        this.numDiscountNumber = numDiscountNumber;
    }

    public String getVcDiscountStr() {
        return vcDiscountStr;
    }

    public void setVcDiscountStr(String vcDiscountStr) {
        this.vcDiscountStr = vcDiscountStr == null ? null : vcDiscountStr.trim();
    }

    public Byte getNumHasDiscountLimit() {
        return numHasDiscountLimit;
    }

    public void setNumHasDiscountLimit(Byte numHasDiscountLimit) {
        this.numHasDiscountLimit = numHasDiscountLimit;
    }

    public Integer getNumLimitPrice() {
        return numLimitPrice;
    }

    public void setNumLimitPrice(Integer numLimitPrice) {
        this.numLimitPrice = numLimitPrice;
    }

    public Byte getNumMember() {
        return numMember;
    }

    public void setNumMember(Byte numMember) {
        this.numMember = numMember;
    }

    public Byte getNumUserLimitNum() {
        return numUserLimitNum;
    }

    public void setNumUserLimitNum(Byte numUserLimitNum) {
        this.numUserLimitNum = numUserLimitNum;
    }

    public Byte getNumLimitDateType() {
        return numLimitDateType;
    }

    public void setNumLimitDateType(Byte numLimitDateType) {
        this.numLimitDateType = numLimitDateType;
    }

    public Integer getNumAvailableDays() {
        return numAvailableDays;
    }

    public void setNumAvailableDays(Integer numAvailableDays) {
        this.numAvailableDays = numAvailableDays;
    }

    public Long getNumAvailableGoods() {
        return numAvailableGoods;
    }

    public void setNumAvailableGoods(Long numAvailableGoods) {
        this.numAvailableGoods = numAvailableGoods;
    }

    public String getVcInstructions() {
        return vcInstructions;
    }

    public void setVcInstructions(String vcInstructions) {
        this.vcInstructions = vcInstructions == null ? null : vcInstructions.trim();
    }

    public Date getDatCreatDate() {
        return datCreatDate;
    }

    public void setDatCreatDate(Date datCreatDate) {
        this.datCreatDate = datCreatDate;
    }

    public Date getDatStartDate() {
        return datStartDate;
    }

    public void setDatStartDate(Date datStartDate) {
        this.datStartDate = datStartDate;
    }

    public Date getDatEndDate() {
        return datEndDate;
    }

    public void setDatEndDate(Date datEndDate) {
        this.datEndDate = datEndDate;
    }

    public Long getNumCreatAdminUserId() {
        return numCreatAdminUserId;
    }

    public void setNumCreatAdminUserId(Long numCreatAdminUserId) {
        this.numCreatAdminUserId = numCreatAdminUserId;
    }
}