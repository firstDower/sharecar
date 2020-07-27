package com.dower.sharerideapp.core.serverdb.model;

import java.util.Date;

public class NntUserinfo {
    private Integer numUserinfoId;

    private String numUserId;

    private String vcName;

    private Byte numIdcardType;

    private String vcIdcardNo;

    private String vcMobilePhone;

    private String vcEmail;

    private String numGender;

    private Integer numUserPoint;

    private Date datRegisterTime;

    private Date datBirthday;

    private Byte numUserLevel;

    private Long numUserMoney;

    private Date datModifiedTime;

    private Byte numUserState;

    private Byte numIsDel;

    public Integer getNumUserinfoId() {
        return numUserinfoId;
    }

    public void setNumUserinfoId(Integer numUserinfoId) {
        this.numUserinfoId = numUserinfoId;
    }

    public String getNumUserId() {
        return numUserId;
    }

    public void setNumUserId(String numUserId) {
        this.numUserId = numUserId == null ? null : numUserId.trim();
    }

    public String getVcName() {
        return vcName;
    }

    public void setVcName(String vcName) {
        this.vcName = vcName == null ? null : vcName.trim();
    }

    public Byte getNumIdcardType() {
        return numIdcardType;
    }

    public void setNumIdcardType(Byte numIdcardType) {
        this.numIdcardType = numIdcardType;
    }

    public String getVcIdcardNo() {
        return vcIdcardNo;
    }

    public void setVcIdcardNo(String vcIdcardNo) {
        this.vcIdcardNo = vcIdcardNo == null ? null : vcIdcardNo.trim();
    }

    public String getVcMobilePhone() {
        return vcMobilePhone;
    }

    public void setVcMobilePhone(String vcMobilePhone) {
        this.vcMobilePhone = vcMobilePhone == null ? null : vcMobilePhone.trim();
    }

    public String getVcEmail() {
        return vcEmail;
    }

    public void setVcEmail(String vcEmail) {
        this.vcEmail = vcEmail == null ? null : vcEmail.trim();
    }

    public String getNumGender() {
        return numGender;
    }

    public void setNumGender(String numGender) {
        this.numGender = numGender == null ? null : numGender.trim();
    }

    public Integer getNumUserPoint() {
        return numUserPoint;
    }

    public void setNumUserPoint(Integer numUserPoint) {
        this.numUserPoint = numUserPoint;
    }

    public Date getDatRegisterTime() {
        return datRegisterTime;
    }

    public void setDatRegisterTime(Date datRegisterTime) {
        this.datRegisterTime = datRegisterTime;
    }

    public Date getDatBirthday() {
        return datBirthday;
    }

    public void setDatBirthday(Date datBirthday) {
        this.datBirthday = datBirthday;
    }

    public Byte getNumUserLevel() {
        return numUserLevel;
    }

    public void setNumUserLevel(Byte numUserLevel) {
        this.numUserLevel = numUserLevel;
    }

    public Long getNumUserMoney() {
        return numUserMoney;
    }

    public void setNumUserMoney(Long numUserMoney) {
        this.numUserMoney = numUserMoney;
    }

    public Date getDatModifiedTime() {
        return datModifiedTime;
    }

    public void setDatModifiedTime(Date datModifiedTime) {
        this.datModifiedTime = datModifiedTime;
    }

    public Byte getNumUserState() {
        return numUserState;
    }

    public void setNumUserState(Byte numUserState) {
        this.numUserState = numUserState;
    }

    public Byte getNumIsDel() {
        return numIsDel;
    }

    public void setNumIsDel(Byte numIsDel) {
        this.numIsDel = numIsDel;
    }
}