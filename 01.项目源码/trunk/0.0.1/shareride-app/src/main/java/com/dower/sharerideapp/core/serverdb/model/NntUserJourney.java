package com.dower.sharerideapp.core.serverdb.model;

import java.util.Date;

public class NntUserJourney {
    private Integer numNntUserJourneyId;

    private Integer numRouteId;

    private Integer numUserId;

    private Integer numState;

    private String vcSeatNo;

    private Integer numPayState;

    private Date datCreatDate;

    private Integer numPayTaye;

    private Integer numAgreeState;

    public Integer getNumNntUserJourneyId() {
        return numNntUserJourneyId;
    }

    public void setNumNntUserJourneyId(Integer numNntUserJourneyId) {
        this.numNntUserJourneyId = numNntUserJourneyId;
    }

    public Integer getNumRouteId() {
        return numRouteId;
    }

    public void setNumRouteId(Integer numRouteId) {
        this.numRouteId = numRouteId;
    }

    public Integer getNumUserId() {
        return numUserId;
    }

    public void setNumUserId(Integer numUserId) {
        this.numUserId = numUserId;
    }

    public Integer getNumState() {
        return numState;
    }

    public void setNumState(Integer numState) {
        this.numState = numState;
    }

    public String getVcSeatNo() {
        return vcSeatNo;
    }

    public void setVcSeatNo(String vcSeatNo) {
        this.vcSeatNo = vcSeatNo == null ? null : vcSeatNo.trim();
    }

    public Integer getNumPayState() {
        return numPayState;
    }

    public void setNumPayState(Integer numPayState) {
        this.numPayState = numPayState;
    }

    public Date getDatCreatDate() {
        return datCreatDate;
    }

    public void setDatCreatDate(Date datCreatDate) {
        this.datCreatDate = datCreatDate;
    }

    public Integer getNumPayTaye() {
        return numPayTaye;
    }

    public void setNumPayTaye(Integer numPayTaye) {
        this.numPayTaye = numPayTaye;
    }

    public Integer getNumAgreeState() {
        return numAgreeState;
    }

    public void setNumAgreeState(Integer numAgreeState) {
        this.numAgreeState = numAgreeState;
    }
}