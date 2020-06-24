package com.dower.sharerideapp.core.serverdb.model;

import java.util.Date;

public class NntCarOwnerInfo {
    private Integer numId;

    private Integer numUserId;

    private String vcDrivingLicensePhotoAddress;

    private String vcDrivingLicenseNo;

    private Date datCertificationStartDate;

    private Date datCertificationEndDate;

    private String vcRealName;

    private String vcIdentityNo;

    private String vcInviteCode;

    private Date datCreatDate;

    private Date datUpdateDate;

    public Integer getNumId() {
        return numId;
    }

    public void setNumId(Integer numId) {
        this.numId = numId;
    }

    public Integer getNumUserId() {
        return numUserId;
    }

    public void setNumUserId(Integer numUserId) {
        this.numUserId = numUserId;
    }

    public String getVcDrivingLicensePhotoAddress() {
        return vcDrivingLicensePhotoAddress;
    }

    public void setVcDrivingLicensePhotoAddress(String vcDrivingLicensePhotoAddress) {
        this.vcDrivingLicensePhotoAddress = vcDrivingLicensePhotoAddress == null ? null : vcDrivingLicensePhotoAddress.trim();
    }

    public String getVcDrivingLicenseNo() {
        return vcDrivingLicenseNo;
    }

    public void setVcDrivingLicenseNo(String vcDrivingLicenseNo) {
        this.vcDrivingLicenseNo = vcDrivingLicenseNo == null ? null : vcDrivingLicenseNo.trim();
    }

    public Date getDatCertificationStartDate() {
        return datCertificationStartDate;
    }

    public void setDatCertificationStartDate(Date datCertificationStartDate) {
        this.datCertificationStartDate = datCertificationStartDate;
    }

    public Date getDatCertificationEndDate() {
        return datCertificationEndDate;
    }

    public void setDatCertificationEndDate(Date datCertificationEndDate) {
        this.datCertificationEndDate = datCertificationEndDate;
    }

    public String getVcRealName() {
        return vcRealName;
    }

    public void setVcRealName(String vcRealName) {
        this.vcRealName = vcRealName == null ? null : vcRealName.trim();
    }

    public String getVcIdentityNo() {
        return vcIdentityNo;
    }

    public void setVcIdentityNo(String vcIdentityNo) {
        this.vcIdentityNo = vcIdentityNo == null ? null : vcIdentityNo.trim();
    }

    public String getVcInviteCode() {
        return vcInviteCode;
    }

    public void setVcInviteCode(String vcInviteCode) {
        this.vcInviteCode = vcInviteCode == null ? null : vcInviteCode.trim();
    }

    public Date getDatCreatDate() {
        return datCreatDate;
    }

    public void setDatCreatDate(Date datCreatDate) {
        this.datCreatDate = datCreatDate;
    }

    public Date getDatUpdateDate() {
        return datUpdateDate;
    }

    public void setDatUpdateDate(Date datUpdateDate) {
        this.datUpdateDate = datUpdateDate;
    }
}