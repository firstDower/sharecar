package com.dower.sharerideapp.core.serverdb.model;

public class NntUserinfo {
    private Integer numId;

    private Integer numUserId;

    private String vcBackCardNumber;

    private String vcIdcardNumber;

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
}