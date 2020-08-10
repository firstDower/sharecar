package com.dower.sharerideapp.core.serverdb.model;

public class NntCustomClouthUsers {
    private Long numCustomClouthUserId;

    private String vcUserNo;

    private String vcCustomName;

    private String vcCustomPhone;

    private String vcCustomHight;

    private String vcCustomWight;

    private Byte numIsState;

    private Byte numIsDel;

    public Long getNumCustomClouthUserId() {
        return numCustomClouthUserId;
    }

    public void setNumCustomClouthUserId(Long numCustomClouthUserId) {
        this.numCustomClouthUserId = numCustomClouthUserId;
    }

    public String getVcUserNo() {
        return vcUserNo;
    }

    public void setVcUserNo(String vcUserNo) {
        this.vcUserNo = vcUserNo == null ? null : vcUserNo.trim();
    }

    public String getVcCustomName() {
        return vcCustomName;
    }

    public void setVcCustomName(String vcCustomName) {
        this.vcCustomName = vcCustomName == null ? null : vcCustomName.trim();
    }

    public String getVcCustomPhone() {
        return vcCustomPhone;
    }

    public void setVcCustomPhone(String vcCustomPhone) {
        this.vcCustomPhone = vcCustomPhone == null ? null : vcCustomPhone.trim();
    }

    public String getVcCustomHight() {
        return vcCustomHight;
    }

    public void setVcCustomHight(String vcCustomHight) {
        this.vcCustomHight = vcCustomHight == null ? null : vcCustomHight.trim();
    }

    public String getVcCustomWight() {
        return vcCustomWight;
    }

    public void setVcCustomWight(String vcCustomWight) {
        this.vcCustomWight = vcCustomWight == null ? null : vcCustomWight.trim();
    }

    public Byte getNumIsState() {
        return numIsState;
    }

    public void setNumIsState(Byte numIsState) {
        this.numIsState = numIsState;
    }

    public Byte getNumIsDel() {
        return numIsDel;
    }

    public void setNumIsDel(Byte numIsDel) {
        this.numIsDel = numIsDel;
    }
}