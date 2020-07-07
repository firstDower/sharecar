package com.dower.sharerideapp.core.serverdb.model;

public class ClFnSchool {
    private Long numId;

    private String vcSchoolName;

    private Byte numIsDel;

    private Integer numSort;

    public Long getNumId() {
        return numId;
    }

    public void setNumId(Long numId) {
        this.numId = numId;
    }

    public String getVcSchoolName() {
        return vcSchoolName;
    }

    public void setVcSchoolName(String vcSchoolName) {
        this.vcSchoolName = vcSchoolName == null ? null : vcSchoolName.trim();
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