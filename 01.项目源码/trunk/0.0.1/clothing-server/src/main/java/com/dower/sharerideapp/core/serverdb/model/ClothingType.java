package com.dower.sharerideapp.core.serverdb.model;

public class ClothingType {
    private Long numId;

    private String vcCtypeName;

    private String vcCtypeDesc;

    private Byte numIsDel;

    private Byte numSort;

    public Long getNumId() {
        return numId;
    }

    public void setNumId(Long numId) {
        this.numId = numId;
    }

    public String getVcCtypeName() {
        return vcCtypeName;
    }

    public void setVcCtypeName(String vcCtypeName) {
        this.vcCtypeName = vcCtypeName == null ? null : vcCtypeName.trim();
    }

    public String getVcCtypeDesc() {
        return vcCtypeDesc;
    }

    public void setVcCtypeDesc(String vcCtypeDesc) {
        this.vcCtypeDesc = vcCtypeDesc == null ? null : vcCtypeDesc.trim();
    }

    public Byte getNumIsDel() {
        return numIsDel;
    }

    public void setNumIsDel(Byte numIsDel) {
        this.numIsDel = numIsDel;
    }

    public Byte getNumSort() {
        return numSort;
    }

    public void setNumSort(Byte numSort) {
        this.numSort = numSort;
    }
}