package com.dower.sharerideapp.core.serverdb.model;

public class NntUserinfo {
    private Integer numId;

    private Integer numUserId;

    private String vcBackCardNumber;

    private String vcIdcardNumber;

    private String vcDriverLicenseNo;

    private String vcIdcardPicturePathA;

    private String vcIdcardPicturePathB;

    private String vcDriverLicensePathA;

    private String vcDriverLicensePathB;

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

    public String getVcBackCardNumber() {
        return vcBackCardNumber;
    }

    public void setVcBackCardNumber(String vcBackCardNumber) {
        this.vcBackCardNumber = vcBackCardNumber == null ? null : vcBackCardNumber.trim();
    }

    public String getVcIdcardNumber() {
        return vcIdcardNumber;
    }

    public void setVcIdcardNumber(String vcIdcardNumber) {
        this.vcIdcardNumber = vcIdcardNumber == null ? null : vcIdcardNumber.trim();
    }

    public String getVcDriverLicenseNo() {
        return vcDriverLicenseNo;
    }

    public void setVcDriverLicenseNo(String vcDriverLicenseNo) {
        this.vcDriverLicenseNo = vcDriverLicenseNo == null ? null : vcDriverLicenseNo.trim();
    }

    public String getVcIdcardPicturePathA() {
        return vcIdcardPicturePathA;
    }

    public void setVcIdcardPicturePathA(String vcIdcardPicturePathA) {
        this.vcIdcardPicturePathA = vcIdcardPicturePathA == null ? null : vcIdcardPicturePathA.trim();
    }

    public String getVcIdcardPicturePathB() {
        return vcIdcardPicturePathB;
    }

    public void setVcIdcardPicturePathB(String vcIdcardPicturePathB) {
        this.vcIdcardPicturePathB = vcIdcardPicturePathB == null ? null : vcIdcardPicturePathB.trim();
    }

    public String getVcDriverLicensePathA() {
        return vcDriverLicensePathA;
    }

    public void setVcDriverLicensePathA(String vcDriverLicensePathA) {
        this.vcDriverLicensePathA = vcDriverLicensePathA == null ? null : vcDriverLicensePathA.trim();
    }

    public String getVcDriverLicensePathB() {
        return vcDriverLicensePathB;
    }

    public void setVcDriverLicensePathB(String vcDriverLicensePathB) {
        this.vcDriverLicensePathB = vcDriverLicensePathB == null ? null : vcDriverLicensePathB.trim();
    }
}