package com.dower.product.core.serverdb.model;

import java.math.BigDecimal;

public class NntPlatformFinancialAccount {
    private Integer numId;

    private BigDecimal numServiceChargeAccount;

    private BigDecimal numCollectionPaymentAccount;

    private BigDecimal numSettlementAccount;

    private BigDecimal numMarketingStrategyAccount;

    public Integer getNumId() {
        return numId;
    }

    public void setNumId(Integer numId) {
        this.numId = numId;
    }

    public BigDecimal getNumServiceChargeAccount() {
        return numServiceChargeAccount;
    }

    public void setNumServiceChargeAccount(BigDecimal numServiceChargeAccount) {
        this.numServiceChargeAccount = numServiceChargeAccount;
    }

    public BigDecimal getNumCollectionPaymentAccount() {
        return numCollectionPaymentAccount;
    }

    public void setNumCollectionPaymentAccount(BigDecimal numCollectionPaymentAccount) {
        this.numCollectionPaymentAccount = numCollectionPaymentAccount;
    }

    public BigDecimal getNumSettlementAccount() {
        return numSettlementAccount;
    }

    public void setNumSettlementAccount(BigDecimal numSettlementAccount) {
        this.numSettlementAccount = numSettlementAccount;
    }

    public BigDecimal getNumMarketingStrategyAccount() {
        return numMarketingStrategyAccount;
    }

    public void setNumMarketingStrategyAccount(BigDecimal numMarketingStrategyAccount) {
        this.numMarketingStrategyAccount = numMarketingStrategyAccount;
    }
}