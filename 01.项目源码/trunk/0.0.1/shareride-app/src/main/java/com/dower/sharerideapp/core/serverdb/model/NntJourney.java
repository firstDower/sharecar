package com.dower.sharerideapp.core.serverdb.model;

import java.math.BigDecimal;
import java.util.Date;

public class NntJourney {
    private Integer numRouteId;

    private String vcRouteNo;

    private Date datDepartDate;

    private Integer numSpendTime;

    private Integer numMaxPassengers;

    private Integer numRouteState;

    private BigDecimal numRouteFulfee;

    private BigDecimal numRouteNetfee;

    private Integer numMannedType;

    private Integer numStartTravelCityId;

    private Integer numEndTravelCityId;

    private Date datCreatDate;

    private Integer numUserId;

    private BigDecimal numUnitPrice;

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

    public Integer getNumMaxPassengers() {
        return numMaxPassengers;
    }

    public void setNumMaxPassengers(Integer numMaxPassengers) {
        this.numMaxPassengers = numMaxPassengers;
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

    public Integer getNumStartTravelCityId() {
        return numStartTravelCityId;
    }

    public void setNumStartTravelCityId(Integer numStartTravelCityId) {
        this.numStartTravelCityId = numStartTravelCityId;
    }

    public Integer getNumEndTravelCityId() {
        return numEndTravelCityId;
    }

    public void setNumEndTravelCityId(Integer numEndTravelCityId) {
        this.numEndTravelCityId = numEndTravelCityId;
    }

    public Date getDatCreatDate() {
        return datCreatDate;
    }

    public void setDatCreatDate(Date datCreatDate) {
        this.datCreatDate = datCreatDate;
    }

    public Integer getNumUserId() {
        return numUserId;
    }

    public void setNumUserId(Integer numUserId) {
        this.numUserId = numUserId;
    }

    public BigDecimal getNumUnitPrice() {
        return numUnitPrice;
    }

    public void setNumUnitPrice(BigDecimal numUnitPrice) {
        this.numUnitPrice = numUnitPrice;
    }
}