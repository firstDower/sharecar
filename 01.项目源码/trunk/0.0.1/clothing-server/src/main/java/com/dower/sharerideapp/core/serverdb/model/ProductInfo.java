package com.dower.sharerideapp.core.serverdb.model;

import java.util.Date;

public class ProductInfo {
    private Integer productId;

    private String productCore;

    private String productName;

    private Short categoryId;

    private Integer numSchoolId;

    private Long numModelId;

    private Long numClouthTypeId;

    private Byte publishStatus;

    private Byte auditStatus;

    private String descript;

    private String introduction;

    private String shareIntroduction;

    private String productUrl;

    private String productShareUrl;

    private Byte isShare;

    private Date indate;

    private Date modifiedTime;

    private String picUrl;

    private String picUrl2;

    private String picUrl3;

    private Byte numState;

    private Byte numIsDel;

    private Integer numProductPrice;

    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    public String getProductCore() {
        return productCore;
    }

    public void setProductCore(String productCore) {
        this.productCore = productCore == null ? null : productCore.trim();
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    public Short getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Short categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getNumSchoolId() {
        return numSchoolId;
    }

    public void setNumSchoolId(Integer numSchoolId) {
        this.numSchoolId = numSchoolId;
    }

    public Long getNumModelId() {
        return numModelId;
    }

    public void setNumModelId(Long numModelId) {
        this.numModelId = numModelId;
    }

    public Long getNumClouthTypeId() {
        return numClouthTypeId;
    }

    public void setNumClouthTypeId(Long numClouthTypeId) {
        this.numClouthTypeId = numClouthTypeId;
    }

    public Byte getPublishStatus() {
        return publishStatus;
    }

    public void setPublishStatus(Byte publishStatus) {
        this.publishStatus = publishStatus;
    }

    public Byte getAuditStatus() {
        return auditStatus;
    }

    public void setAuditStatus(Byte auditStatus) {
        this.auditStatus = auditStatus;
    }

    public String getDescript() {
        return descript;
    }

    public void setDescript(String descript) {
        this.descript = descript == null ? null : descript.trim();
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    public String getShareIntroduction() {
        return shareIntroduction;
    }

    public void setShareIntroduction(String shareIntroduction) {
        this.shareIntroduction = shareIntroduction == null ? null : shareIntroduction.trim();
    }

    public String getProductUrl() {
        return productUrl;
    }

    public void setProductUrl(String productUrl) {
        this.productUrl = productUrl == null ? null : productUrl.trim();
    }

    public String getProductShareUrl() {
        return productShareUrl;
    }

    public void setProductShareUrl(String productShareUrl) {
        this.productShareUrl = productShareUrl == null ? null : productShareUrl.trim();
    }

    public Byte getIsShare() {
        return isShare;
    }

    public void setIsShare(Byte isShare) {
        this.isShare = isShare;
    }

    public Date getIndate() {
        return indate;
    }

    public void setIndate(Date indate) {
        this.indate = indate;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl == null ? null : picUrl.trim();
    }

    public String getPicUrl2() {
        return picUrl2;
    }

    public void setPicUrl2(String picUrl2) {
        this.picUrl2 = picUrl2 == null ? null : picUrl2.trim();
    }

    public String getPicUrl3() {
        return picUrl3;
    }

    public void setPicUrl3(String picUrl3) {
        this.picUrl3 = picUrl3 == null ? null : picUrl3.trim();
    }

    public Byte getNumState() {
        return numState;
    }

    public void setNumState(Byte numState) {
        this.numState = numState;
    }

    public Byte getNumIsDel() {
        return numIsDel;
    }

    public void setNumIsDel(Byte numIsDel) {
        this.numIsDel = numIsDel;
    }

    public Integer getNumProductPrice() {
        return numProductPrice;
    }

    public void setNumProductPrice(Integer numProductPrice) {
        this.numProductPrice = numProductPrice;
    }
}