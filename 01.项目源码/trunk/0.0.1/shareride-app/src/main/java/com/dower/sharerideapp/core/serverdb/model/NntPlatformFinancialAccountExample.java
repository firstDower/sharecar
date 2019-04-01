package com.dower.sharerideapp.core.serverdb.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class NntPlatformFinancialAccountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NntPlatformFinancialAccountExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andNumIdIsNull() {
            addCriterion("NUM_ID is null");
            return (Criteria) this;
        }

        public Criteria andNumIdIsNotNull() {
            addCriterion("NUM_ID is not null");
            return (Criteria) this;
        }

        public Criteria andNumIdEqualTo(Integer value) {
            addCriterion("NUM_ID =", value, "numId");
            return (Criteria) this;
        }

        public Criteria andNumIdNotEqualTo(Integer value) {
            addCriterion("NUM_ID <>", value, "numId");
            return (Criteria) this;
        }

        public Criteria andNumIdGreaterThan(Integer value) {
            addCriterion("NUM_ID >", value, "numId");
            return (Criteria) this;
        }

        public Criteria andNumIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("NUM_ID >=", value, "numId");
            return (Criteria) this;
        }

        public Criteria andNumIdLessThan(Integer value) {
            addCriterion("NUM_ID <", value, "numId");
            return (Criteria) this;
        }

        public Criteria andNumIdLessThanOrEqualTo(Integer value) {
            addCriterion("NUM_ID <=", value, "numId");
            return (Criteria) this;
        }

        public Criteria andNumIdIn(List<Integer> values) {
            addCriterion("NUM_ID in", values, "numId");
            return (Criteria) this;
        }

        public Criteria andNumIdNotIn(List<Integer> values) {
            addCriterion("NUM_ID not in", values, "numId");
            return (Criteria) this;
        }

        public Criteria andNumIdBetween(Integer value1, Integer value2) {
            addCriterion("NUM_ID between", value1, value2, "numId");
            return (Criteria) this;
        }

        public Criteria andNumIdNotBetween(Integer value1, Integer value2) {
            addCriterion("NUM_ID not between", value1, value2, "numId");
            return (Criteria) this;
        }

        public Criteria andNumServiceChargeAccountIsNull() {
            addCriterion("NUM_SERVICE_CHARGE_ACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andNumServiceChargeAccountIsNotNull() {
            addCriterion("NUM_SERVICE_CHARGE_ACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andNumServiceChargeAccountEqualTo(BigDecimal value) {
            addCriterion("NUM_SERVICE_CHARGE_ACCOUNT =", value, "numServiceChargeAccount");
            return (Criteria) this;
        }

        public Criteria andNumServiceChargeAccountNotEqualTo(BigDecimal value) {
            addCriterion("NUM_SERVICE_CHARGE_ACCOUNT <>", value, "numServiceChargeAccount");
            return (Criteria) this;
        }

        public Criteria andNumServiceChargeAccountGreaterThan(BigDecimal value) {
            addCriterion("NUM_SERVICE_CHARGE_ACCOUNT >", value, "numServiceChargeAccount");
            return (Criteria) this;
        }

        public Criteria andNumServiceChargeAccountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NUM_SERVICE_CHARGE_ACCOUNT >=", value, "numServiceChargeAccount");
            return (Criteria) this;
        }

        public Criteria andNumServiceChargeAccountLessThan(BigDecimal value) {
            addCriterion("NUM_SERVICE_CHARGE_ACCOUNT <", value, "numServiceChargeAccount");
            return (Criteria) this;
        }

        public Criteria andNumServiceChargeAccountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NUM_SERVICE_CHARGE_ACCOUNT <=", value, "numServiceChargeAccount");
            return (Criteria) this;
        }

        public Criteria andNumServiceChargeAccountIn(List<BigDecimal> values) {
            addCriterion("NUM_SERVICE_CHARGE_ACCOUNT in", values, "numServiceChargeAccount");
            return (Criteria) this;
        }

        public Criteria andNumServiceChargeAccountNotIn(List<BigDecimal> values) {
            addCriterion("NUM_SERVICE_CHARGE_ACCOUNT not in", values, "numServiceChargeAccount");
            return (Criteria) this;
        }

        public Criteria andNumServiceChargeAccountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NUM_SERVICE_CHARGE_ACCOUNT between", value1, value2, "numServiceChargeAccount");
            return (Criteria) this;
        }

        public Criteria andNumServiceChargeAccountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NUM_SERVICE_CHARGE_ACCOUNT not between", value1, value2, "numServiceChargeAccount");
            return (Criteria) this;
        }

        public Criteria andNumCollectionPaymentAccountIsNull() {
            addCriterion("NUM_COLLECTION_PAYMENT_ACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andNumCollectionPaymentAccountIsNotNull() {
            addCriterion("NUM_COLLECTION_PAYMENT_ACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andNumCollectionPaymentAccountEqualTo(BigDecimal value) {
            addCriterion("NUM_COLLECTION_PAYMENT_ACCOUNT =", value, "numCollectionPaymentAccount");
            return (Criteria) this;
        }

        public Criteria andNumCollectionPaymentAccountNotEqualTo(BigDecimal value) {
            addCriterion("NUM_COLLECTION_PAYMENT_ACCOUNT <>", value, "numCollectionPaymentAccount");
            return (Criteria) this;
        }

        public Criteria andNumCollectionPaymentAccountGreaterThan(BigDecimal value) {
            addCriterion("NUM_COLLECTION_PAYMENT_ACCOUNT >", value, "numCollectionPaymentAccount");
            return (Criteria) this;
        }

        public Criteria andNumCollectionPaymentAccountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NUM_COLLECTION_PAYMENT_ACCOUNT >=", value, "numCollectionPaymentAccount");
            return (Criteria) this;
        }

        public Criteria andNumCollectionPaymentAccountLessThan(BigDecimal value) {
            addCriterion("NUM_COLLECTION_PAYMENT_ACCOUNT <", value, "numCollectionPaymentAccount");
            return (Criteria) this;
        }

        public Criteria andNumCollectionPaymentAccountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NUM_COLLECTION_PAYMENT_ACCOUNT <=", value, "numCollectionPaymentAccount");
            return (Criteria) this;
        }

        public Criteria andNumCollectionPaymentAccountIn(List<BigDecimal> values) {
            addCriterion("NUM_COLLECTION_PAYMENT_ACCOUNT in", values, "numCollectionPaymentAccount");
            return (Criteria) this;
        }

        public Criteria andNumCollectionPaymentAccountNotIn(List<BigDecimal> values) {
            addCriterion("NUM_COLLECTION_PAYMENT_ACCOUNT not in", values, "numCollectionPaymentAccount");
            return (Criteria) this;
        }

        public Criteria andNumCollectionPaymentAccountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NUM_COLLECTION_PAYMENT_ACCOUNT between", value1, value2, "numCollectionPaymentAccount");
            return (Criteria) this;
        }

        public Criteria andNumCollectionPaymentAccountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NUM_COLLECTION_PAYMENT_ACCOUNT not between", value1, value2, "numCollectionPaymentAccount");
            return (Criteria) this;
        }

        public Criteria andNumSettlementAccountIsNull() {
            addCriterion("NUM_SETTLEMENT_ACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andNumSettlementAccountIsNotNull() {
            addCriterion("NUM_SETTLEMENT_ACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andNumSettlementAccountEqualTo(BigDecimal value) {
            addCriterion("NUM_SETTLEMENT_ACCOUNT =", value, "numSettlementAccount");
            return (Criteria) this;
        }

        public Criteria andNumSettlementAccountNotEqualTo(BigDecimal value) {
            addCriterion("NUM_SETTLEMENT_ACCOUNT <>", value, "numSettlementAccount");
            return (Criteria) this;
        }

        public Criteria andNumSettlementAccountGreaterThan(BigDecimal value) {
            addCriterion("NUM_SETTLEMENT_ACCOUNT >", value, "numSettlementAccount");
            return (Criteria) this;
        }

        public Criteria andNumSettlementAccountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NUM_SETTLEMENT_ACCOUNT >=", value, "numSettlementAccount");
            return (Criteria) this;
        }

        public Criteria andNumSettlementAccountLessThan(BigDecimal value) {
            addCriterion("NUM_SETTLEMENT_ACCOUNT <", value, "numSettlementAccount");
            return (Criteria) this;
        }

        public Criteria andNumSettlementAccountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NUM_SETTLEMENT_ACCOUNT <=", value, "numSettlementAccount");
            return (Criteria) this;
        }

        public Criteria andNumSettlementAccountIn(List<BigDecimal> values) {
            addCriterion("NUM_SETTLEMENT_ACCOUNT in", values, "numSettlementAccount");
            return (Criteria) this;
        }

        public Criteria andNumSettlementAccountNotIn(List<BigDecimal> values) {
            addCriterion("NUM_SETTLEMENT_ACCOUNT not in", values, "numSettlementAccount");
            return (Criteria) this;
        }

        public Criteria andNumSettlementAccountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NUM_SETTLEMENT_ACCOUNT between", value1, value2, "numSettlementAccount");
            return (Criteria) this;
        }

        public Criteria andNumSettlementAccountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NUM_SETTLEMENT_ACCOUNT not between", value1, value2, "numSettlementAccount");
            return (Criteria) this;
        }

        public Criteria andNumMarketingStrategyAccountIsNull() {
            addCriterion("NUM_MARKETING_STRATEGY_ACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andNumMarketingStrategyAccountIsNotNull() {
            addCriterion("NUM_MARKETING_STRATEGY_ACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andNumMarketingStrategyAccountEqualTo(BigDecimal value) {
            addCriterion("NUM_MARKETING_STRATEGY_ACCOUNT =", value, "numMarketingStrategyAccount");
            return (Criteria) this;
        }

        public Criteria andNumMarketingStrategyAccountNotEqualTo(BigDecimal value) {
            addCriterion("NUM_MARKETING_STRATEGY_ACCOUNT <>", value, "numMarketingStrategyAccount");
            return (Criteria) this;
        }

        public Criteria andNumMarketingStrategyAccountGreaterThan(BigDecimal value) {
            addCriterion("NUM_MARKETING_STRATEGY_ACCOUNT >", value, "numMarketingStrategyAccount");
            return (Criteria) this;
        }

        public Criteria andNumMarketingStrategyAccountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NUM_MARKETING_STRATEGY_ACCOUNT >=", value, "numMarketingStrategyAccount");
            return (Criteria) this;
        }

        public Criteria andNumMarketingStrategyAccountLessThan(BigDecimal value) {
            addCriterion("NUM_MARKETING_STRATEGY_ACCOUNT <", value, "numMarketingStrategyAccount");
            return (Criteria) this;
        }

        public Criteria andNumMarketingStrategyAccountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NUM_MARKETING_STRATEGY_ACCOUNT <=", value, "numMarketingStrategyAccount");
            return (Criteria) this;
        }

        public Criteria andNumMarketingStrategyAccountIn(List<BigDecimal> values) {
            addCriterion("NUM_MARKETING_STRATEGY_ACCOUNT in", values, "numMarketingStrategyAccount");
            return (Criteria) this;
        }

        public Criteria andNumMarketingStrategyAccountNotIn(List<BigDecimal> values) {
            addCriterion("NUM_MARKETING_STRATEGY_ACCOUNT not in", values, "numMarketingStrategyAccount");
            return (Criteria) this;
        }

        public Criteria andNumMarketingStrategyAccountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NUM_MARKETING_STRATEGY_ACCOUNT between", value1, value2, "numMarketingStrategyAccount");
            return (Criteria) this;
        }

        public Criteria andNumMarketingStrategyAccountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NUM_MARKETING_STRATEGY_ACCOUNT not between", value1, value2, "numMarketingStrategyAccount");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}