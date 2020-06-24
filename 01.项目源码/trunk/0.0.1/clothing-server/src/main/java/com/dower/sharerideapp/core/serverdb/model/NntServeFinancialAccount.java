package com.dower.sharerideapp.core.serverdb.model;

import java.math.BigDecimal;
import java.util.Date;

public class NntServeFinancialAccount {
    private Integer numId;

    private BigDecimal numReceiveAccount;

    private BigDecimal numBlockedAccount;

    private BigDecimal numSettlementAccount;

    private Date datCreatDate;

    private Integer numState;

    private Integer numUserId;

    public Integer getNumId() {
        return numId;
    }

    public void setNumId(Integer numId) {
        this.numId = numId;
    }

    public BigDecimal getNumReceiveAccount() {
        return numReceiveAccount;
    }

    public void setNumReceiveAccount(BigDecimal numReceiveAccount) {
        this.numReceiveAccount = numReceiveAccount;
    }

    public BigDecimal getNumBlockedAccount() {
        return numBlockedAccount;
    }

    public void setNumBlockedAccount(BigDecimal numBlockedAccount) {
        this.numBlockedAccount = numBlockedAccount;
    }

    public BigDecimal getNumSettlementAccount() {
        return numSettlementAccount;
    }

    public void setNumSettlementAccount(BigDecimal numSettlementAccount) {
        this.numSettlementAccount = numSettlementAccount;
    }

    public Date getDatCreatDate() {
        return datCreatDate;
    }

    public void setDatCreatDate(Date datCreatDate) {
        this.datCreatDate = datCreatDate;
    }

    public Integer getNumState() {
        return numState;
    }

    public void setNumState(Integer numState) {
        this.numState = numState;
    }

    public Integer getNumUserId() {
        return numUserId;
    }

    public void setNumUserId(Integer numUserId) {
        this.numUserId = numUserId;
    }
}