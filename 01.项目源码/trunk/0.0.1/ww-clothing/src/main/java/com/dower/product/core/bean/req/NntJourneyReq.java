package com.dower.product.core.bean.req;

import java.util.Date;

/**
 * @param
 * @Author: wangwei
 * @Description:
 * @Date: Created in 14:09   2019/1/14
 */

public class NntJourneyReq {
    private Integer numRouteId;

    private String vcRouteNo;

    private String datDepartDate;

    private Integer numSpendTime;

    private Integer numMaxPassengers;

    private Integer numRouteState;

    private Double numRouteFulfee;

    private Double numRouteNetfee;

    private Integer numMannedType;

    private Integer numStartTravelCityId;

    private Integer numEndTravelCityId;

    private String datCreatDate;

    private Integer numUserId;

    private Double numUnitPrice;

    private Date datUpdataDate;

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
        this.vcRouteNo = vcRouteNo;
    }

    public String getDatDepartDate() {
        return datDepartDate;
    }

    public void setDatDepartDate(String datDepartDate) {
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

    public Double getNumRouteFulfee() {
        return numRouteFulfee;
    }

    public void setNumRouteFulfee(Double numRouteFulfee) {
        this.numRouteFulfee = numRouteFulfee;
    }

    public Double getNumRouteNetfee() {
        return numRouteNetfee;
    }

    public void setNumRouteNetfee(Double numRouteNetfee) {
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

    public String getDatCreatDate() {
        return datCreatDate;
    }

    public void setDatCreatDate(String datCreatDate) {
        this.datCreatDate = datCreatDate;
    }

    public Integer getNumUserId() {
        return numUserId;
    }

    public void setNumUserId(Integer numUserId) {
        this.numUserId = numUserId;
    }

    public Double getNumUnitPrice() {
        return numUnitPrice;
    }

    public void setNumUnitPrice(Double numUnitPrice) {
        this.numUnitPrice = numUnitPrice;
    }

    public Date getDatUpdataDate() {
        return datUpdataDate;
    }

    public void setDatUpdataDate(Date datUpdataDate) {
        this.datUpdataDate = datUpdataDate;
    }
}
