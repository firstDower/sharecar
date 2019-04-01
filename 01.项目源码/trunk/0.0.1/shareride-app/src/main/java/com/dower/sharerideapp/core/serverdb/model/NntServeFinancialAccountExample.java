package com.dower.sharerideapp.core.serverdb.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NntServeFinancialAccountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NntServeFinancialAccountExample() {
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

        public Criteria andNumReceiveAccountIsNull() {
            addCriterion("NUM_RECEIVE_ACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andNumReceiveAccountIsNotNull() {
            addCriterion("NUM_RECEIVE_ACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andNumReceiveAccountEqualTo(BigDecimal value) {
            addCriterion("NUM_RECEIVE_ACCOUNT =", value, "numReceiveAccount");
            return (Criteria) this;
        }

        public Criteria andNumReceiveAccountNotEqualTo(BigDecimal value) {
            addCriterion("NUM_RECEIVE_ACCOUNT <>", value, "numReceiveAccount");
            return (Criteria) this;
        }

        public Criteria andNumReceiveAccountGreaterThan(BigDecimal value) {
            addCriterion("NUM_RECEIVE_ACCOUNT >", value, "numReceiveAccount");
            return (Criteria) this;
        }

        public Criteria andNumReceiveAccountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NUM_RECEIVE_ACCOUNT >=", value, "numReceiveAccount");
            return (Criteria) this;
        }

        public Criteria andNumReceiveAccountLessThan(BigDecimal value) {
            addCriterion("NUM_RECEIVE_ACCOUNT <", value, "numReceiveAccount");
            return (Criteria) this;
        }

        public Criteria andNumReceiveAccountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NUM_RECEIVE_ACCOUNT <=", value, "numReceiveAccount");
            return (Criteria) this;
        }

        public Criteria andNumReceiveAccountIn(List<BigDecimal> values) {
            addCriterion("NUM_RECEIVE_ACCOUNT in", values, "numReceiveAccount");
            return (Criteria) this;
        }

        public Criteria andNumReceiveAccountNotIn(List<BigDecimal> values) {
            addCriterion("NUM_RECEIVE_ACCOUNT not in", values, "numReceiveAccount");
            return (Criteria) this;
        }

        public Criteria andNumReceiveAccountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NUM_RECEIVE_ACCOUNT between", value1, value2, "numReceiveAccount");
            return (Criteria) this;
        }

        public Criteria andNumReceiveAccountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NUM_RECEIVE_ACCOUNT not between", value1, value2, "numReceiveAccount");
            return (Criteria) this;
        }

        public Criteria andNumBlockedAccountIsNull() {
            addCriterion("NUM_BLOCKED_ACCOUNT is null");
            return (Criteria) this;
        }

        public Criteria andNumBlockedAccountIsNotNull() {
            addCriterion("NUM_BLOCKED_ACCOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andNumBlockedAccountEqualTo(BigDecimal value) {
            addCriterion("NUM_BLOCKED_ACCOUNT =", value, "numBlockedAccount");
            return (Criteria) this;
        }

        public Criteria andNumBlockedAccountNotEqualTo(BigDecimal value) {
            addCriterion("NUM_BLOCKED_ACCOUNT <>", value, "numBlockedAccount");
            return (Criteria) this;
        }

        public Criteria andNumBlockedAccountGreaterThan(BigDecimal value) {
            addCriterion("NUM_BLOCKED_ACCOUNT >", value, "numBlockedAccount");
            return (Criteria) this;
        }

        public Criteria andNumBlockedAccountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NUM_BLOCKED_ACCOUNT >=", value, "numBlockedAccount");
            return (Criteria) this;
        }

        public Criteria andNumBlockedAccountLessThan(BigDecimal value) {
            addCriterion("NUM_BLOCKED_ACCOUNT <", value, "numBlockedAccount");
            return (Criteria) this;
        }

        public Criteria andNumBlockedAccountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NUM_BLOCKED_ACCOUNT <=", value, "numBlockedAccount");
            return (Criteria) this;
        }

        public Criteria andNumBlockedAccountIn(List<BigDecimal> values) {
            addCriterion("NUM_BLOCKED_ACCOUNT in", values, "numBlockedAccount");
            return (Criteria) this;
        }

        public Criteria andNumBlockedAccountNotIn(List<BigDecimal> values) {
            addCriterion("NUM_BLOCKED_ACCOUNT not in", values, "numBlockedAccount");
            return (Criteria) this;
        }

        public Criteria andNumBlockedAccountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NUM_BLOCKED_ACCOUNT between", value1, value2, "numBlockedAccount");
            return (Criteria) this;
        }

        public Criteria andNumBlockedAccountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NUM_BLOCKED_ACCOUNT not between", value1, value2, "numBlockedAccount");
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

        public Criteria andDatCreatDateIsNull() {
            addCriterion("DAT_CREAT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andDatCreatDateIsNotNull() {
            addCriterion("DAT_CREAT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andDatCreatDateEqualTo(Date value) {
            addCriterion("DAT_CREAT_DATE =", value, "datCreatDate");
            return (Criteria) this;
        }

        public Criteria andDatCreatDateNotEqualTo(Date value) {
            addCriterion("DAT_CREAT_DATE <>", value, "datCreatDate");
            return (Criteria) this;
        }

        public Criteria andDatCreatDateGreaterThan(Date value) {
            addCriterion("DAT_CREAT_DATE >", value, "datCreatDate");
            return (Criteria) this;
        }

        public Criteria andDatCreatDateGreaterThanOrEqualTo(Date value) {
            addCriterion("DAT_CREAT_DATE >=", value, "datCreatDate");
            return (Criteria) this;
        }

        public Criteria andDatCreatDateLessThan(Date value) {
            addCriterion("DAT_CREAT_DATE <", value, "datCreatDate");
            return (Criteria) this;
        }

        public Criteria andDatCreatDateLessThanOrEqualTo(Date value) {
            addCriterion("DAT_CREAT_DATE <=", value, "datCreatDate");
            return (Criteria) this;
        }

        public Criteria andDatCreatDateIn(List<Date> values) {
            addCriterion("DAT_CREAT_DATE in", values, "datCreatDate");
            return (Criteria) this;
        }

        public Criteria andDatCreatDateNotIn(List<Date> values) {
            addCriterion("DAT_CREAT_DATE not in", values, "datCreatDate");
            return (Criteria) this;
        }

        public Criteria andDatCreatDateBetween(Date value1, Date value2) {
            addCriterion("DAT_CREAT_DATE between", value1, value2, "datCreatDate");
            return (Criteria) this;
        }

        public Criteria andDatCreatDateNotBetween(Date value1, Date value2) {
            addCriterion("DAT_CREAT_DATE not between", value1, value2, "datCreatDate");
            return (Criteria) this;
        }

        public Criteria andNumStateIsNull() {
            addCriterion("NUM_STATE is null");
            return (Criteria) this;
        }

        public Criteria andNumStateIsNotNull() {
            addCriterion("NUM_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andNumStateEqualTo(Integer value) {
            addCriterion("NUM_STATE =", value, "numState");
            return (Criteria) this;
        }

        public Criteria andNumStateNotEqualTo(Integer value) {
            addCriterion("NUM_STATE <>", value, "numState");
            return (Criteria) this;
        }

        public Criteria andNumStateGreaterThan(Integer value) {
            addCriterion("NUM_STATE >", value, "numState");
            return (Criteria) this;
        }

        public Criteria andNumStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("NUM_STATE >=", value, "numState");
            return (Criteria) this;
        }

        public Criteria andNumStateLessThan(Integer value) {
            addCriterion("NUM_STATE <", value, "numState");
            return (Criteria) this;
        }

        public Criteria andNumStateLessThanOrEqualTo(Integer value) {
            addCriterion("NUM_STATE <=", value, "numState");
            return (Criteria) this;
        }

        public Criteria andNumStateIn(List<Integer> values) {
            addCriterion("NUM_STATE in", values, "numState");
            return (Criteria) this;
        }

        public Criteria andNumStateNotIn(List<Integer> values) {
            addCriterion("NUM_STATE not in", values, "numState");
            return (Criteria) this;
        }

        public Criteria andNumStateBetween(Integer value1, Integer value2) {
            addCriterion("NUM_STATE between", value1, value2, "numState");
            return (Criteria) this;
        }

        public Criteria andNumStateNotBetween(Integer value1, Integer value2) {
            addCriterion("NUM_STATE not between", value1, value2, "numState");
            return (Criteria) this;
        }

        public Criteria andNumUserIdIsNull() {
            addCriterion("NUM_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andNumUserIdIsNotNull() {
            addCriterion("NUM_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andNumUserIdEqualTo(Integer value) {
            addCriterion("NUM_USER_ID =", value, "numUserId");
            return (Criteria) this;
        }

        public Criteria andNumUserIdNotEqualTo(Integer value) {
            addCriterion("NUM_USER_ID <>", value, "numUserId");
            return (Criteria) this;
        }

        public Criteria andNumUserIdGreaterThan(Integer value) {
            addCriterion("NUM_USER_ID >", value, "numUserId");
            return (Criteria) this;
        }

        public Criteria andNumUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("NUM_USER_ID >=", value, "numUserId");
            return (Criteria) this;
        }

        public Criteria andNumUserIdLessThan(Integer value) {
            addCriterion("NUM_USER_ID <", value, "numUserId");
            return (Criteria) this;
        }

        public Criteria andNumUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("NUM_USER_ID <=", value, "numUserId");
            return (Criteria) this;
        }

        public Criteria andNumUserIdIn(List<Integer> values) {
            addCriterion("NUM_USER_ID in", values, "numUserId");
            return (Criteria) this;
        }

        public Criteria andNumUserIdNotIn(List<Integer> values) {
            addCriterion("NUM_USER_ID not in", values, "numUserId");
            return (Criteria) this;
        }

        public Criteria andNumUserIdBetween(Integer value1, Integer value2) {
            addCriterion("NUM_USER_ID between", value1, value2, "numUserId");
            return (Criteria) this;
        }

        public Criteria andNumUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("NUM_USER_ID not between", value1, value2, "numUserId");
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