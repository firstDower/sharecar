package com.dower.sharerideapp.core.serverdb.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NntUserBalanceChangeRecodeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NntUserBalanceChangeRecodeExample() {
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

        public Criteria andNumIdEqualTo(Long value) {
            addCriterion("NUM_ID =", value, "numId");
            return (Criteria) this;
        }

        public Criteria andNumIdNotEqualTo(Long value) {
            addCriterion("NUM_ID <>", value, "numId");
            return (Criteria) this;
        }

        public Criteria andNumIdGreaterThan(Long value) {
            addCriterion("NUM_ID >", value, "numId");
            return (Criteria) this;
        }

        public Criteria andNumIdGreaterThanOrEqualTo(Long value) {
            addCriterion("NUM_ID >=", value, "numId");
            return (Criteria) this;
        }

        public Criteria andNumIdLessThan(Long value) {
            addCriterion("NUM_ID <", value, "numId");
            return (Criteria) this;
        }

        public Criteria andNumIdLessThanOrEqualTo(Long value) {
            addCriterion("NUM_ID <=", value, "numId");
            return (Criteria) this;
        }

        public Criteria andNumIdIn(List<Long> values) {
            addCriterion("NUM_ID in", values, "numId");
            return (Criteria) this;
        }

        public Criteria andNumIdNotIn(List<Long> values) {
            addCriterion("NUM_ID not in", values, "numId");
            return (Criteria) this;
        }

        public Criteria andNumIdBetween(Long value1, Long value2) {
            addCriterion("NUM_ID between", value1, value2, "numId");
            return (Criteria) this;
        }

        public Criteria andNumIdNotBetween(Long value1, Long value2) {
            addCriterion("NUM_ID not between", value1, value2, "numId");
            return (Criteria) this;
        }

        public Criteria andNumUserBalanceIdIsNull() {
            addCriterion("NUM_USER_BALANCE_ID is null");
            return (Criteria) this;
        }

        public Criteria andNumUserBalanceIdIsNotNull() {
            addCriterion("NUM_USER_BALANCE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andNumUserBalanceIdEqualTo(String value) {
            addCriterion("NUM_USER_BALANCE_ID =", value, "numUserBalanceId");
            return (Criteria) this;
        }

        public Criteria andNumUserBalanceIdNotEqualTo(String value) {
            addCriterion("NUM_USER_BALANCE_ID <>", value, "numUserBalanceId");
            return (Criteria) this;
        }

        public Criteria andNumUserBalanceIdGreaterThan(String value) {
            addCriterion("NUM_USER_BALANCE_ID >", value, "numUserBalanceId");
            return (Criteria) this;
        }

        public Criteria andNumUserBalanceIdGreaterThanOrEqualTo(String value) {
            addCriterion("NUM_USER_BALANCE_ID >=", value, "numUserBalanceId");
            return (Criteria) this;
        }

        public Criteria andNumUserBalanceIdLessThan(String value) {
            addCriterion("NUM_USER_BALANCE_ID <", value, "numUserBalanceId");
            return (Criteria) this;
        }

        public Criteria andNumUserBalanceIdLessThanOrEqualTo(String value) {
            addCriterion("NUM_USER_BALANCE_ID <=", value, "numUserBalanceId");
            return (Criteria) this;
        }

        public Criteria andNumUserBalanceIdLike(String value) {
            addCriterion("NUM_USER_BALANCE_ID like", value, "numUserBalanceId");
            return (Criteria) this;
        }

        public Criteria andNumUserBalanceIdNotLike(String value) {
            addCriterion("NUM_USER_BALANCE_ID not like", value, "numUserBalanceId");
            return (Criteria) this;
        }

        public Criteria andNumUserBalanceIdIn(List<String> values) {
            addCriterion("NUM_USER_BALANCE_ID in", values, "numUserBalanceId");
            return (Criteria) this;
        }

        public Criteria andNumUserBalanceIdNotIn(List<String> values) {
            addCriterion("NUM_USER_BALANCE_ID not in", values, "numUserBalanceId");
            return (Criteria) this;
        }

        public Criteria andNumUserBalanceIdBetween(String value1, String value2) {
            addCriterion("NUM_USER_BALANCE_ID between", value1, value2, "numUserBalanceId");
            return (Criteria) this;
        }

        public Criteria andNumUserBalanceIdNotBetween(String value1, String value2) {
            addCriterion("NUM_USER_BALANCE_ID not between", value1, value2, "numUserBalanceId");
            return (Criteria) this;
        }

        public Criteria andNumSourceTypeIsNull() {
            addCriterion("NUM_SOURCE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andNumSourceTypeIsNotNull() {
            addCriterion("NUM_SOURCE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andNumSourceTypeEqualTo(Byte value) {
            addCriterion("NUM_SOURCE_TYPE =", value, "numSourceType");
            return (Criteria) this;
        }

        public Criteria andNumSourceTypeNotEqualTo(Byte value) {
            addCriterion("NUM_SOURCE_TYPE <>", value, "numSourceType");
            return (Criteria) this;
        }

        public Criteria andNumSourceTypeGreaterThan(Byte value) {
            addCriterion("NUM_SOURCE_TYPE >", value, "numSourceType");
            return (Criteria) this;
        }

        public Criteria andNumSourceTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("NUM_SOURCE_TYPE >=", value, "numSourceType");
            return (Criteria) this;
        }

        public Criteria andNumSourceTypeLessThan(Byte value) {
            addCriterion("NUM_SOURCE_TYPE <", value, "numSourceType");
            return (Criteria) this;
        }

        public Criteria andNumSourceTypeLessThanOrEqualTo(Byte value) {
            addCriterion("NUM_SOURCE_TYPE <=", value, "numSourceType");
            return (Criteria) this;
        }

        public Criteria andNumSourceTypeIn(List<Byte> values) {
            addCriterion("NUM_SOURCE_TYPE in", values, "numSourceType");
            return (Criteria) this;
        }

        public Criteria andNumSourceTypeNotIn(List<Byte> values) {
            addCriterion("NUM_SOURCE_TYPE not in", values, "numSourceType");
            return (Criteria) this;
        }

        public Criteria andNumSourceTypeBetween(Byte value1, Byte value2) {
            addCriterion("NUM_SOURCE_TYPE between", value1, value2, "numSourceType");
            return (Criteria) this;
        }

        public Criteria andNumSourceTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("NUM_SOURCE_TYPE not between", value1, value2, "numSourceType");
            return (Criteria) this;
        }

        public Criteria andNumOrderNoIsNull() {
            addCriterion("NUM_ORDER_NO is null");
            return (Criteria) this;
        }

        public Criteria andNumOrderNoIsNotNull() {
            addCriterion("NUM_ORDER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andNumOrderNoEqualTo(String value) {
            addCriterion("NUM_ORDER_NO =", value, "numOrderNo");
            return (Criteria) this;
        }

        public Criteria andNumOrderNoNotEqualTo(String value) {
            addCriterion("NUM_ORDER_NO <>", value, "numOrderNo");
            return (Criteria) this;
        }

        public Criteria andNumOrderNoGreaterThan(String value) {
            addCriterion("NUM_ORDER_NO >", value, "numOrderNo");
            return (Criteria) this;
        }

        public Criteria andNumOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("NUM_ORDER_NO >=", value, "numOrderNo");
            return (Criteria) this;
        }

        public Criteria andNumOrderNoLessThan(String value) {
            addCriterion("NUM_ORDER_NO <", value, "numOrderNo");
            return (Criteria) this;
        }

        public Criteria andNumOrderNoLessThanOrEqualTo(String value) {
            addCriterion("NUM_ORDER_NO <=", value, "numOrderNo");
            return (Criteria) this;
        }

        public Criteria andNumOrderNoLike(String value) {
            addCriterion("NUM_ORDER_NO like", value, "numOrderNo");
            return (Criteria) this;
        }

        public Criteria andNumOrderNoNotLike(String value) {
            addCriterion("NUM_ORDER_NO not like", value, "numOrderNo");
            return (Criteria) this;
        }

        public Criteria andNumOrderNoIn(List<String> values) {
            addCriterion("NUM_ORDER_NO in", values, "numOrderNo");
            return (Criteria) this;
        }

        public Criteria andNumOrderNoNotIn(List<String> values) {
            addCriterion("NUM_ORDER_NO not in", values, "numOrderNo");
            return (Criteria) this;
        }

        public Criteria andNumOrderNoBetween(String value1, String value2) {
            addCriterion("NUM_ORDER_NO between", value1, value2, "numOrderNo");
            return (Criteria) this;
        }

        public Criteria andNumOrderNoNotBetween(String value1, String value2) {
            addCriterion("NUM_ORDER_NO not between", value1, value2, "numOrderNo");
            return (Criteria) this;
        }

        public Criteria andDatCreateTimeIsNull() {
            addCriterion("DAT_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDatCreateTimeIsNotNull() {
            addCriterion("DAT_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDatCreateTimeEqualTo(Date value) {
            addCriterion("DAT_CREATE_TIME =", value, "datCreateTime");
            return (Criteria) this;
        }

        public Criteria andDatCreateTimeNotEqualTo(Date value) {
            addCriterion("DAT_CREATE_TIME <>", value, "datCreateTime");
            return (Criteria) this;
        }

        public Criteria andDatCreateTimeGreaterThan(Date value) {
            addCriterion("DAT_CREATE_TIME >", value, "datCreateTime");
            return (Criteria) this;
        }

        public Criteria andDatCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("DAT_CREATE_TIME >=", value, "datCreateTime");
            return (Criteria) this;
        }

        public Criteria andDatCreateTimeLessThan(Date value) {
            addCriterion("DAT_CREATE_TIME <", value, "datCreateTime");
            return (Criteria) this;
        }

        public Criteria andDatCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("DAT_CREATE_TIME <=", value, "datCreateTime");
            return (Criteria) this;
        }

        public Criteria andDatCreateTimeIn(List<Date> values) {
            addCriterion("DAT_CREATE_TIME in", values, "datCreateTime");
            return (Criteria) this;
        }

        public Criteria andDatCreateTimeNotIn(List<Date> values) {
            addCriterion("DAT_CREATE_TIME not in", values, "datCreateTime");
            return (Criteria) this;
        }

        public Criteria andDatCreateTimeBetween(Date value1, Date value2) {
            addCriterion("DAT_CREATE_TIME between", value1, value2, "datCreateTime");
            return (Criteria) this;
        }

        public Criteria andDatCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("DAT_CREATE_TIME not between", value1, value2, "datCreateTime");
            return (Criteria) this;
        }

        public Criteria andNumAmountIsNull() {
            addCriterion("NUM_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andNumAmountIsNotNull() {
            addCriterion("NUM_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andNumAmountEqualTo(Long value) {
            addCriterion("NUM_AMOUNT =", value, "numAmount");
            return (Criteria) this;
        }

        public Criteria andNumAmountNotEqualTo(Long value) {
            addCriterion("NUM_AMOUNT <>", value, "numAmount");
            return (Criteria) this;
        }

        public Criteria andNumAmountGreaterThan(Long value) {
            addCriterion("NUM_AMOUNT >", value, "numAmount");
            return (Criteria) this;
        }

        public Criteria andNumAmountGreaterThanOrEqualTo(Long value) {
            addCriterion("NUM_AMOUNT >=", value, "numAmount");
            return (Criteria) this;
        }

        public Criteria andNumAmountLessThan(Long value) {
            addCriterion("NUM_AMOUNT <", value, "numAmount");
            return (Criteria) this;
        }

        public Criteria andNumAmountLessThanOrEqualTo(Long value) {
            addCriterion("NUM_AMOUNT <=", value, "numAmount");
            return (Criteria) this;
        }

        public Criteria andNumAmountIn(List<Long> values) {
            addCriterion("NUM_AMOUNT in", values, "numAmount");
            return (Criteria) this;
        }

        public Criteria andNumAmountNotIn(List<Long> values) {
            addCriterion("NUM_AMOUNT not in", values, "numAmount");
            return (Criteria) this;
        }

        public Criteria andNumAmountBetween(Long value1, Long value2) {
            addCriterion("NUM_AMOUNT between", value1, value2, "numAmount");
            return (Criteria) this;
        }

        public Criteria andNumAmountNotBetween(Long value1, Long value2) {
            addCriterion("NUM_AMOUNT not between", value1, value2, "numAmount");
            return (Criteria) this;
        }

        public Criteria andNumIsDelIsNull() {
            addCriterion("NUM_IS_DEL is null");
            return (Criteria) this;
        }

        public Criteria andNumIsDelIsNotNull() {
            addCriterion("NUM_IS_DEL is not null");
            return (Criteria) this;
        }

        public Criteria andNumIsDelEqualTo(Byte value) {
            addCriterion("NUM_IS_DEL =", value, "numIsDel");
            return (Criteria) this;
        }

        public Criteria andNumIsDelNotEqualTo(Byte value) {
            addCriterion("NUM_IS_DEL <>", value, "numIsDel");
            return (Criteria) this;
        }

        public Criteria andNumIsDelGreaterThan(Byte value) {
            addCriterion("NUM_IS_DEL >", value, "numIsDel");
            return (Criteria) this;
        }

        public Criteria andNumIsDelGreaterThanOrEqualTo(Byte value) {
            addCriterion("NUM_IS_DEL >=", value, "numIsDel");
            return (Criteria) this;
        }

        public Criteria andNumIsDelLessThan(Byte value) {
            addCriterion("NUM_IS_DEL <", value, "numIsDel");
            return (Criteria) this;
        }

        public Criteria andNumIsDelLessThanOrEqualTo(Byte value) {
            addCriterion("NUM_IS_DEL <=", value, "numIsDel");
            return (Criteria) this;
        }

        public Criteria andNumIsDelIn(List<Byte> values) {
            addCriterion("NUM_IS_DEL in", values, "numIsDel");
            return (Criteria) this;
        }

        public Criteria andNumIsDelNotIn(List<Byte> values) {
            addCriterion("NUM_IS_DEL not in", values, "numIsDel");
            return (Criteria) this;
        }

        public Criteria andNumIsDelBetween(Byte value1, Byte value2) {
            addCriterion("NUM_IS_DEL between", value1, value2, "numIsDel");
            return (Criteria) this;
        }

        public Criteria andNumIsDelNotBetween(Byte value1, Byte value2) {
            addCriterion("NUM_IS_DEL not between", value1, value2, "numIsDel");
            return (Criteria) this;
        }

        public Criteria andNumMoneyStateIsNull() {
            addCriterion("NUM_MONEY_STATE is null");
            return (Criteria) this;
        }

        public Criteria andNumMoneyStateIsNotNull() {
            addCriterion("NUM_MONEY_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andNumMoneyStateEqualTo(Byte value) {
            addCriterion("NUM_MONEY_STATE =", value, "numMoneyState");
            return (Criteria) this;
        }

        public Criteria andNumMoneyStateNotEqualTo(Byte value) {
            addCriterion("NUM_MONEY_STATE <>", value, "numMoneyState");
            return (Criteria) this;
        }

        public Criteria andNumMoneyStateGreaterThan(Byte value) {
            addCriterion("NUM_MONEY_STATE >", value, "numMoneyState");
            return (Criteria) this;
        }

        public Criteria andNumMoneyStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("NUM_MONEY_STATE >=", value, "numMoneyState");
            return (Criteria) this;
        }

        public Criteria andNumMoneyStateLessThan(Byte value) {
            addCriterion("NUM_MONEY_STATE <", value, "numMoneyState");
            return (Criteria) this;
        }

        public Criteria andNumMoneyStateLessThanOrEqualTo(Byte value) {
            addCriterion("NUM_MONEY_STATE <=", value, "numMoneyState");
            return (Criteria) this;
        }

        public Criteria andNumMoneyStateIn(List<Byte> values) {
            addCriterion("NUM_MONEY_STATE in", values, "numMoneyState");
            return (Criteria) this;
        }

        public Criteria andNumMoneyStateNotIn(List<Byte> values) {
            addCriterion("NUM_MONEY_STATE not in", values, "numMoneyState");
            return (Criteria) this;
        }

        public Criteria andNumMoneyStateBetween(Byte value1, Byte value2) {
            addCriterion("NUM_MONEY_STATE between", value1, value2, "numMoneyState");
            return (Criteria) this;
        }

        public Criteria andNumMoneyStateNotBetween(Byte value1, Byte value2) {
            addCriterion("NUM_MONEY_STATE not between", value1, value2, "numMoneyState");
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