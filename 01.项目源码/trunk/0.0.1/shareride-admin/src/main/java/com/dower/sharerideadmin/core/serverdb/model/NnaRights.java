package com.dower.sharerideadmin.core.serverdb.model;

public class NnaRights {
    private Integer numRightId;

    private String vcRightRule;

    private String vcRightName;

    private Integer vcRightPid;

    private Integer numState;

    private Integer numSort;

    public Integer getNumRightId() {
        return numRightId;
    }

    public void setNumRightId(Integer numRightId) {
        this.numRightId = numRightId;
    }

    public String getVcRightRule() {
        return vcRightRule;
    }

    public void setVcRightRule(String vcRightRule) {
        this.vcRightRule = vcRightRule == null ? null : vcRightRule.trim();
    }

    public String getVcRightName() {
        return vcRightName;
    }

    public void setVcRightName(String vcRightName) {
        this.vcRightName = vcRightName == null ? null : vcRightName.trim();
    }

    public Integer getVcRightPid() {
        return vcRightPid;
    }

    public void setVcRightPid(Integer vcRightPid) {
        this.vcRightPid = vcRightPid;
    }

    public Integer getNumState() {
        return numState;
    }

    public void setNumState(Integer numState) {
        this.numState = numState;
    }

    public Integer getNumSort() {
        return numSort;
    }

    public void setNumSort(Integer numSort) {
        this.numSort = numSort;
    }
}