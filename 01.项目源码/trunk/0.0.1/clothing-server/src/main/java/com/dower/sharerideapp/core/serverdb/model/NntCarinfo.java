package com.dower.sharerideapp.core.serverdb.model;

import java.util.Date;

public class NntCarinfo {
    private Integer numId;

    private Integer numUserId;

    private String vcCarNo;

    private String vcBrand;

    private String vcCarColor;

    private String vcCarBodyPhotoAddress;

    private String vcDrivingLicensePhotoAddress;

    private String vcEngineNo;

    private String vcVinNo;

    private Date datRegistDate;

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

    public String getVcCarNo() {
        return vcCarNo;
    }

    public void setVcCarNo(String vcCarNo) {
        this.vcCarNo = vcCarNo == null ? null : vcCarNo.trim();
    }

    public String getVcBrand() {
        return vcBrand;
    }

    public void setVcBrand(String vcBrand) {
        this.vcBrand = vcBrand == null ? null : vcBrand.trim();
    }

    public String getVcCarColor() {
        return vcCarColor;
    }

    public void setVcCarColor(String vcCarColor) {
        this.vcCarColor = vcCarColor == null ? null : vcCarColor.trim();
    }

    public String getVcCarBodyPhotoAddress() {
        return vcCarBodyPhotoAddress;
    }

    public void setVcCarBodyPhotoAddress(String vcCarBodyPhotoAddress) {
        this.vcCarBodyPhotoAddress = vcCarBodyPhotoAddress == null ? null : vcCarBodyPhotoAddress.trim();
    }

    public String getVcDrivingLicensePhotoAddress() {
        return vcDrivingLicensePhotoAddress;
    }

    public void setVcDrivingLicensePhotoAddress(String vcDrivingLicensePhotoAddress) {
        this.vcDrivingLicensePhotoAddress = vcDrivingLicensePhotoAddress == null ? null : vcDrivingLicensePhotoAddress.trim();
    }

    public String getVcEngineNo() {
        return vcEngineNo;
    }

    public void setVcEngineNo(String vcEngineNo) {
        this.vcEngineNo = vcEngineNo == null ? null : vcEngineNo.trim();
    }

    public String getVcVinNo() {
        return vcVinNo;
    }

    public void setVcVinNo(String vcVinNo) {
        this.vcVinNo = vcVinNo == null ? null : vcVinNo.trim();
    }

    public Date getDatRegistDate() {
        return datRegistDate;
    }

    public void setDatRegistDate(Date datRegistDate) {
        this.datRegistDate = datRegistDate;
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