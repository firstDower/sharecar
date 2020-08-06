package com.dower.sharerideapp.core.serverdb.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NntShareStatisticsSettlementExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NntShareStatisticsSettlementExample() {
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
            addCriterion("num_id is null");
            return (Criteria) this;
        }

        public Criteria andNumIdIsNotNull() {
            addCriterion("num_id is not null");
            return (Criteria) this;
        }

        public Criteria andNumIdEqualTo(Long value) {
            addCriterion("num_id =", value, "numId");
            return (Criteria) this;
        }

        public Criteria andNumIdNotEqualTo(Long value) {
            addCriterion("num_id <>", value, "numId");
            return (Criteria) this;
        }

        public Criteria andNumIdGreaterThan(Long value) {
            addCriterion("num_id >", value, "numId");
            return (Criteria) this;
        }

        public Criteria andNumIdGreaterThanOrEqualTo(Long value) {
            addCriterion("num_id >=", value, "numId");
            return (Criteria) this;
        }

        public Criteria andNumIdLessThan(Long value) {
            addCriterion("num_id <", value, "numId");
            return (Criteria) this;
        }

        public Criteria andNumIdLessThanOrEqualTo(Long value) {
            addCriterion("num_id <=", value, "numId");
            return (Criteria) this;
        }

        public Criteria andNumIdIn(List<Long> values) {
            addCriterion("num_id in", values, "numId");
            return (Criteria) this;
        }

        public Criteria andNumIdNotIn(List<Long> values) {
            addCriterion("num_id not in", values, "numId");
            return (Criteria) this;
        }

        public Criteria andNumIdBetween(Long value1, Long value2) {
            addCriterion("num_id between", value1, value2, "numId");
            return (Criteria) this;
        }

        public Criteria andNumIdNotBetween(Long value1, Long value2) {
            addCriterion("num_id not between", value1, value2, "numId");
            return (Criteria) this;
        }

        public Criteria andVcUserNoIsNull() {
            addCriterion("vc_user_no is null");
            return (Criteria) this;
        }

        public Criteria andVcUserNoIsNotNull() {
            addCriterion("vc_user_no is not null");
            return (Criteria) this;
        }

        public Criteria andVcUserNoEqualTo(String value) {
            addCriterion("vc_user_no =", value, "vcUserNo");
            return (Criteria) this;
        }

        public Criteria andVcUserNoNotEqualTo(String value) {
            addCriterion("vc_user_no <>", value, "vcUserNo");
            return (Criteria) this;
        }

        public Criteria andVcUserNoGreaterThan(String value) {
            addCriterion("vc_user_no >", value, "vcUserNo");
            return (Criteria) this;
        }

        public Criteria andVcUserNoGreaterThanOrEqualTo(String value) {
            addCriterion("vc_user_no >=", value, "vcUserNo");
            return (Criteria) this;
        }

        public Criteria andVcUserNoLessThan(String value) {
            addCriterion("vc_user_no <", value, "vcUserNo");
            return (Criteria) this;
        }

        public Criteria andVcUserNoLessThanOrEqualTo(String value) {
            addCriterion("vc_user_no <=", value, "vcUserNo");
            return (Criteria) this;
        }

        public Criteria andVcUserNoLike(String value) {
            addCriterion("vc_user_no like", value, "vcUserNo");
            return (Criteria) this;
        }

        public Criteria andVcUserNoNotLike(String value) {
            addCriterion("vc_user_no not like", value, "vcUserNo");
            return (Criteria) this;
        }

        public Criteria andVcUserNoIn(List<String> values) {
            addCriterion("vc_user_no in", values, "vcUserNo");
            return (Criteria) this;
        }

        public Criteria andVcUserNoNotIn(List<String> values) {
            addCriterion("vc_user_no not in", values, "vcUserNo");
            return (Criteria) this;
        }

        public Criteria andVcUserNoBetween(String value1, String value2) {
            addCriterion("vc_user_no between", value1, value2, "vcUserNo");
            return (Criteria) this;
        }

        public Criteria andVcUserNoNotBetween(String value1, String value2) {
            addCriterion("vc_user_no not between", value1, value2, "vcUserNo");
            return (Criteria) this;
        }

        public Criteria andNumSettlementStateIsNull() {
            addCriterion("num_settlement_state is null");
            return (Criteria) this;
        }

        public Criteria andNumSettlementStateIsNotNull() {
            addCriterion("num_settlement_state is not null");
            return (Criteria) this;
        }

        public Criteria andNumSettlementStateEqualTo(Byte value) {
            addCriterion("num_settlement_state =", value, "numSettlementState");
            return (Criteria) this;
        }

        public Criteria andNumSettlementStateNotEqualTo(Byte value) {
            addCriterion("num_settlement_state <>", value, "numSettlementState");
            return (Criteria) this;
        }

        public Criteria andNumSettlementStateGreaterThan(Byte value) {
            addCriterion("num_settlement_state >", value, "numSettlementState");
            return (Criteria) this;
        }

        public Criteria andNumSettlementStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("num_settlement_state >=", value, "numSettlementState");
            return (Criteria) this;
        }

        public Criteria andNumSettlementStateLessThan(Byte value) {
            addCriterion("num_settlement_state <", value, "numSettlementState");
            return (Criteria) this;
        }

        public Criteria andNumSettlementStateLessThanOrEqualTo(Byte value) {
            addCriterion("num_settlement_state <=", value, "numSettlementState");
            return (Criteria) this;
        }

        public Criteria andNumSettlementStateIn(List<Byte> values) {
            addCriterion("num_settlement_state in", values, "numSettlementState");
            return (Criteria) this;
        }

        public Criteria andNumSettlementStateNotIn(List<Byte> values) {
            addCriterion("num_settlement_state not in", values, "numSettlementState");
            return (Criteria) this;
        }

        public Criteria andNumSettlementStateBetween(Byte value1, Byte value2) {
            addCriterion("num_settlement_state between", value1, value2, "numSettlementState");
            return (Criteria) this;
        }

        public Criteria andNumSettlementStateNotBetween(Byte value1, Byte value2) {
            addCriterion("num_settlement_state not between", value1, value2, "numSettlementState");
            return (Criteria) this;
        }

        public Criteria andDatCreatTimeIsNull() {
            addCriterion("DAT_CREAT_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDatCreatTimeIsNotNull() {
            addCriterion("DAT_CREAT_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDatCreatTimeEqualTo(Date value) {
            addCriterion("DAT_CREAT_TIME =", value, "datCreatTime");
            return (Criteria) this;
        }

        public Criteria andDatCreatTimeNotEqualTo(Date value) {
            addCriterion("DAT_CREAT_TIME <>", value, "datCreatTime");
            return (Criteria) this;
        }

        public Criteria andDatCreatTimeGreaterThan(Date value) {
            addCriterion("DAT_CREAT_TIME >", value, "datCreatTime");
            return (Criteria) this;
        }

        public Criteria andDatCreatTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("DAT_CREAT_TIME >=", value, "datCreatTime");
            return (Criteria) this;
        }

        public Criteria andDatCreatTimeLessThan(Date value) {
            addCriterion("DAT_CREAT_TIME <", value, "datCreatTime");
            return (Criteria) this;
        }

        public Criteria andDatCreatTimeLessThanOrEqualTo(Date value) {
            addCriterion("DAT_CREAT_TIME <=", value, "datCreatTime");
            return (Criteria) this;
        }

        public Criteria andDatCreatTimeIn(List<Date> values) {
            addCriterion("DAT_CREAT_TIME in", values, "datCreatTime");
            return (Criteria) this;
        }

        public Criteria andDatCreatTimeNotIn(List<Date> values) {
            addCriterion("DAT_CREAT_TIME not in", values, "datCreatTime");
            return (Criteria) this;
        }

        public Criteria andDatCreatTimeBetween(Date value1, Date value2) {
            addCriterion("DAT_CREAT_TIME between", value1, value2, "datCreatTime");
            return (Criteria) this;
        }

        public Criteria andDatCreatTimeNotBetween(Date value1, Date value2) {
            addCriterion("DAT_CREAT_TIME not between", value1, value2, "datCreatTime");
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