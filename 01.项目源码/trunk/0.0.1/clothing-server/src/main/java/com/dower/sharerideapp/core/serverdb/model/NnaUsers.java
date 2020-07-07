package com.dower.sharerideapp.core.serverdb.model;

public class NnaUsers {
    private Integer numUserId;

    private String vcLoginName;

    private String vcPhone;

    private String vcEmail;

    private String vcPassword;

    private Integer numState;

    private String vcDesc;

    public Integer getNumUserId() {
        return numUserId;
    }

    public void setNumUserId(Integer numUserId) {
        this.numUserId = numUserId;
    }

    public String getVcLoginName() {
        return vcLoginName;
    }

    public void setVcLoginName(String vcLoginName) {
        this.vcLoginName = vcLoginName == null ? null : vcLoginName.trim();
    }

    public String getVcPhone() {
        return vcPhone;
    }

    public void setVcPhone(String vcPhone) {
        this.vcPhone = vcPhone == null ? null : vcPhone.trim();
    }

    public String getVcEmail() {
        return vcEmail;
    }

    public void setVcEmail(String vcEmail) {
        this.vcEmail = vcEmail == null ? null : vcEmail.trim();
    }

    public String getVcPassword() {
        return vcPassword;
    }

    public void setVcPassword(String vcPassword) {
        this.vcPassword = vcPassword == null ? null : vcPassword.trim();
    }

    public Integer getNumState() {
        return numState;
    }

    public void setNumState(Integer numState) {
        this.numState = numState;
    }

    public String getVcDesc() {
        return vcDesc;
    }

    public void setVcDesc(String vcDesc) {
        this.vcDesc = vcDesc == null ? null : vcDesc.trim();
    }
}