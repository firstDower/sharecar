package com.dower.sharerideapp.core.serverdb.model;

public class NntTravelCity {
    private Integer numTravelCityId;

    private String vcCityName;

    private String vcCityCode;

    private Integer numSort;

    private Integer numIsDel;

    public Integer getNumTravelCityId() {
        return numTravelCityId;
    }

    public void setNumTravelCityId(Integer numTravelCityId) {
        this.numTravelCityId = numTravelCityId;
    }

    public String getVcCityName() {
        return vcCityName;
    }

    public void setVcCityName(String vcCityName) {
        this.vcCityName = vcCityName == null ? null : vcCityName.trim();
    }

    public String getVcCityCode() {
        return vcCityCode;
    }

    public void setVcCityCode(String vcCityCode) {
        this.vcCityCode = vcCityCode == null ? null : vcCityCode.trim();
    }

    public Integer getNumSort() {
        return numSort;
    }

    public void setNumSort(Integer numSort) {
        this.numSort = numSort;
    }

    public Integer getNumIsDel() {
        return numIsDel;
    }

    public void setNumIsDel(Integer numIsDel) {
        this.numIsDel = numIsDel;
    }
}