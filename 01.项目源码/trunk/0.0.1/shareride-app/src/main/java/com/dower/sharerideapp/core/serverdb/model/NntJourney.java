package com.dower.sharerideapp.core.serverdb.model;

import java.math.BigDecimal;
import java.util.Date;

public class NntJourney {
    private Integer numRouteId;

    private String vcRouteNo;

    private Date datDepartDate;

    private Integer numSpendTime;

    private Integer numSeat;

    private Integer numRouteState;

    private BigDecimal numRouteFulfee;

    private BigDecimal numRouteNetfee;

    private Integer numMannedType;

    private String vcStartArea;

    private String vcEndArea;

    private Date datCreatDate;

    public Integer getNumRouteId() {
        return numRouteId;
    }

    public void setNumRouteId(Integer numRouteId) {
        this.numRouteId = numRouteId;
    }

    public String getVcRouteNo() {
        return vcRouteNo;
    }

    public void setVcRouteNo(String vcRouteNo) {
        this.vcRouteNo = vcRouteNo == null ? null : vcRouteNo.trim();
    }

    public Date getDatDepartDate() {
        return datDepartDate;
    }

    public void setDatDepartDate(Date datDepartDate) {
        this.datDepartDate = datDepartDate;
    }

    public Integer getNumSpendTime() {
        return numSpendTime;
    }

    public void setNumSpendTime(Integer numSpendTime) {
        this.numSpendTime = numSpendTime;
    }

    public Integer getNumSeat() {
        return numSeat;
    }

    public void setNumSeat(Integer numSeat) {
        this.numSeat = numSeat;
    }

    public Integer getNumRouteState() {
        return numRouteState;
    }

    public void setNumRouteState(Integer numRouteState) {
        this.numRouteState = numRouteState;
    }

    public BigDecimal getNumRouteFulfee() {
        return numRouteFulfee;
    }

    public void setNumRouteFulfee(BigDecimal numRouteFulfee) {
        this.numRouteFulfee = numRouteFulfee;
    }

    public BigDecimal getNumRouteNetfee() {
        return numRouteNetfee;
    }

    public void setNumRouteNetfee(BigDecimal numRouteNetfee) {
        this.numRouteNetfee = numRouteNetfee;
    }

    public Integer getNumMannedType() {
        return numMannedType;
    }

    public void setNumMannedType(Integer numMannedType) {
        this.numMannedType = numMannedType;
    }

    public String getVcStartArea() {
        return vcStartArea;
    }

    public void setVcStartArea(String vcStartArea) {
        this.vcStartArea = vcStartArea == null ? null : vcStartArea.trim();
    }

    public String getVcEndArea() {
        return vcEndArea;
    }

    public void setVcEndArea(String vcEndArea) {
        this.vcEndArea = vcEndArea == null ? null : vcEndArea.trim();
    }

    public Date getDatCreatDate() {
        return datCreatDate;
    }

    public void setDatCreatDate(Date datCreatDate) {
        this.datCreatDate = datCreatDate;
    }
}