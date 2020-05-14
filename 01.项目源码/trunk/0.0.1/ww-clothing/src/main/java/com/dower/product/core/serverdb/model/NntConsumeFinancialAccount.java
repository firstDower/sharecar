package com.dower.product.core.serverdb.model;

import java.math.BigDecimal;
import java.util.Date;

public class NntConsumeFinancialAccount {
    private Integer numId;

    private BigDecimal numBalanceAccount;

    private BigDecimal numDepositAccount;

    private BigDecimal numCashbackAccount;

    private Date datCreatDate;

    private Integer numState;

    private Integer numUserId;

    public Integer getNumId() {
        return numId;
    }

    public void setNumId(Integer numId) {
        this.numId = numId;
    }

    public BigDecimal getNumBalanceAccount() {
        return numBalanceAccount;
    }

    public void setNumBalanceAccount(BigDecimal numBalanceAccount) {
        this.numBalanceAccount = numBalanceAccount;
    }

    public BigDecimal getNumDepositAccount() {
        return numDepositAccount;
    }

    public void setNumDepositAccount(BigDecimal numDepositAccount) {
        this.numDepositAccount = numDepositAccount;
    }

    public BigDecimal getNumCashbackAccount() {
        return numCashbackAccount;
    }

    public void setNumCashbackAccount(BigDecimal numCashbackAccount) {
        this.numCashbackAccount = numCashbackAccount;
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