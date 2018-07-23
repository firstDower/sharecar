package com.dower.sharerideapp.core.serverdb.model;

public class NntUserinfoWithBLOBs extends NntUserinfo {
    private byte[] vcDriverLicenseNo;

    private byte[] vcIdcardPicturePathA;

    private byte[] vcIdcardPicturePathB;

    private byte[] vcDriverLicensePathA;

    private byte[] vcDriverLicensePathB;

    public byte[] getVcDriverLicenseNo() {
        return vcDriverLicenseNo;
    }

    public void setVcDriverLicenseNo(byte[] vcDriverLicenseNo) {
        this.vcDriverLicenseNo = vcDriverLicenseNo;
    }

    public byte[] getVcIdcardPicturePathA() {
        return vcIdcardPicturePathA;
    }

    public void setVcIdcardPicturePathA(byte[] vcIdcardPicturePathA) {
        this.vcIdcardPicturePathA = vcIdcardPicturePathA;
    }

    public byte[] getVcIdcardPicturePathB() {
        return vcIdcardPicturePathB;
    }

    public void setVcIdcardPicturePathB(byte[] vcIdcardPicturePathB) {
        this.vcIdcardPicturePathB = vcIdcardPicturePathB;
    }

    public byte[] getVcDriverLicensePathA() {
        return vcDriverLicensePathA;
    }

    public void setVcDriverLicensePathA(byte[] vcDriverLicensePathA) {
        this.vcDriverLicensePathA = vcDriverLicensePathA;
    }

    public byte[] getVcDriverLicensePathB() {
        return vcDriverLicensePathB;
    }

    public void setVcDriverLicensePathB(byte[] vcDriverLicensePathB) {
        this.vcDriverLicensePathB = vcDriverLicensePathB;
    }
}