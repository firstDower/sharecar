package com.dower.sharerideapp.core.serverdb.model;

public class ClFnModel {
    private Long numId;

    private String vcModelName;

    private Byte numIsDel;

    private Integer numSort;

    public Long getNumId() {
        return numId;
    }

    public void setNumId(Long numId) {
        this.numId = numId;
    }

    public String getVcModelName() {
        return vcModelName;
    }

    public void setVcModelName(String vcModelName) {
        this.vcModelName = vcModelName == null ? null : vcModelName.trim();
    }

    public Byte getNumIsDel() {
        return numIsDel;
    }

    public void setNumIsDel(Byte numIsDel) {
        this.numIsDel = numIsDel;
    }

    public Integer getNumSort() {
        return numSort;
    }

    public void setNumSort(Integer numSort) {
        this.numSort = numSort;
    }
}