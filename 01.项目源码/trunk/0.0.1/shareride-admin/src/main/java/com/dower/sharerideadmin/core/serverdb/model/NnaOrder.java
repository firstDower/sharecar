package com.dower.sharerideadmin.core.serverdb.model;

import java.math.BigDecimal;
import java.util.Date;

public class NnaOrder {
    private Integer numOrderId;

    private String vcOrderName;

    private String vcOrderNo;

    private BigDecimal numPurchasePrice;

    private BigDecimal numPrice;

    private BigDecimal numPrepaid;

    private BigDecimal numActualPayment;

    private BigDecimal numTailPayment;

    private BigDecimal numFreight;

    private BigDecimal numInstallFee;

    private BigDecimal numOtherFee;

    private Integer numStatus;

    private Integer numIsdel;

    private String vcProductDesc;

    private Date datStartDate;

    private Date datTailPaymentDate;

    private Date datEndDate;

    private Date datCreateDate;

    private String vcOrderDesc;

    private String vcClientName;

    private String vcClientPhone;

    public Integer getNumOrderId() {
        return numOrderId;
    }

    public void setNumOrderId(Integer numOrderId) {
        this.numOrderId = numOrderId;
    }

    public String getVcOrderName() {
        return vcOrderName;
    }

    public void setVcOrderName(String vcOrderName) {
        this.vcOrderName = vcOrderName == null ? null : vcOrderName.trim();
    }

    public String getVcOrderNo() {
        return vcOrderNo;
    }

    public void setVcOrderNo(String vcOrderNo) {
        this.vcOrderNo = vcOrderNo == null ? null : vcOrderNo.trim();
    }

    public BigDecimal getNumPurchasePrice() {
        return numPurchasePrice;
    }

    public void setNumPurchasePrice(BigDecimal numPurchasePrice) {
        this.numPurchasePrice = numPurchasePrice;
    }

    public BigDecimal getNumPrice() {
        return numPrice;
    }

    public void setNumPrice(BigDecimal numPrice) {
        this.numPrice = numPrice;
    }

    public BigDecimal getNumPrepaid() {
        return numPrepaid;
    }

    public void setNumPrepaid(BigDecimal numPrepaid) {
        this.numPrepaid = numPrepaid;
    }

    public BigDecimal getNumActualPayment() {
        return numActualPayment;
    }

    public void setNumActualPayment(BigDecimal numActualPayment) {
        this.numActualPayment = numActualPayment;
    }

    public BigDecimal getNumTailPayment() {
        return numTailPayment;
    }

    public void setNumTailPayment(BigDecimal numTailPayment) {
        this.numTailPayment = numTailPayment;
    }

    public BigDecimal getNumFreight() {
        return numFreight;
    }

    public void setNumFreight(BigDecimal numFreight) {
        this.numFreight = numFreight;
    }

    public BigDecimal getNumInstallFee() {
        return numInstallFee;
    }

    public void setNumInstallFee(BigDecimal numInstallFee) {
        this.numInstallFee = numInstallFee;
    }

    public BigDecimal getNumOtherFee() {
        return numOtherFee;
    }

    public void setNumOtherFee(BigDecimal numOtherFee) {
        this.numOtherFee = numOtherFee;
    }

    public Integer getNumStatus() {
        return numStatus;
    }

    public void setNumStatus(Integer numStatus) {
        this.numStatus = numStatus;
    }

    public Integer getNumIsdel() {
        return numIsdel;
    }

    public void setNumIsdel(Integer numIsdel) {
        this.numIsdel = numIsdel;
    }

    public String getVcProductDesc() {
        return vcProductDesc;
    }

    public void setVcProductDesc(String vcProductDesc) {
        this.vcProductDesc = vcProductDesc == null ? null : vcProductDesc.trim();
    }

    public Date getDatStartDate() {
        return datStartDate;
    }

    public void setDatStartDate(Date datStartDate) {
        this.datStartDate = datStartDate;
    }

    public Date getDatTailPaymentDate() {
        return datTailPaymentDate;
    }

    public void setDatTailPaymentDate(Date datTailPaymentDate) {
        this.datTailPaymentDate = datTailPaymentDate;
    }

    public Date getDatEndDate() {
        return datEndDate;
    }

    public void setDatEndDate(Date datEndDate) {
        this.datEndDate = datEndDate;
    }

    public Date getDatCreateDate() {
        return datCreateDate;
    }

    public void setDatCreateDate(Date datCreateDate) {
        this.datCreateDate = datCreateDate;
    }

    public String getVcOrderDesc() {
        return vcOrderDesc;
    }

    public void setVcOrderDesc(String vcOrderDesc) {
        this.vcOrderDesc = vcOrderDesc == null ? null : vcOrderDesc.trim();
    }

    public String getVcClientName() {
        return vcClientName;
    }

    public void setVcClientName(String vcClientName) {
        this.vcClientName = vcClientName == null ? null : vcClientName.trim();
    }

    public String getVcClientPhone() {
        return vcClientPhone;
    }

    public void setVcClientPhone(String vcClientPhone) {
        this.vcClientPhone = vcClientPhone == null ? null : vcClientPhone.trim();
    }
}