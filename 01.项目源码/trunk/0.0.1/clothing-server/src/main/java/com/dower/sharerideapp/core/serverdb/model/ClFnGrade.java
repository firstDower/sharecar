package com.dower.sharerideapp.core.serverdb.model;

public class ClFnGrade {
    private Long numId;

    private String vcGradeName;

    private Byte numIsDel;

    private Integer numSort;

    public Long getNumId() {
        return numId;
    }

    public void setNumId(Long numId) {
        this.numId = numId;
    }

    public String getVcGradeName() {
        return vcGradeName;
    }

    public void setVcGradeName(String vcGradeName) {
        this.vcGradeName = vcGradeName == null ? null : vcGradeName.trim();
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