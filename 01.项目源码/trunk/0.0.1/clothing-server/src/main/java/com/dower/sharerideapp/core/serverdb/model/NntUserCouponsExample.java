package com.dower.sharerideapp.core.serverdb.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NntUserCouponsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NntUserCouponsExample() {
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

        public Criteria andNumPlatformCouponIdIsNull() {
            addCriterion("NUM_PLATFORM_COUPON_ID is null");
            return (Criteria) this;
        }

        public Criteria andNumPlatformCouponIdIsNotNull() {
            addCriterion("NUM_PLATFORM_COUPON_ID is not null");
            return (Criteria) this;
        }

        public Criteria andNumPlatformCouponIdEqualTo(Long value) {
            addCriterion("NUM_PLATFORM_COUPON_ID =", value, "numPlatformCouponId");
            return (Criteria) this;
        }

        public Criteria andNumPlatformCouponIdNotEqualTo(Long value) {
            addCriterion("NUM_PLATFORM_COUPON_ID <>", value, "numPlatformCouponId");
            return (Criteria) this;
        }

        public Criteria andNumPlatformCouponIdGreaterThan(Long value) {
            addCriterion("NUM_PLATFORM_COUPON_ID >", value, "numPlatformCouponId");
            return (Criteria) this;
        }

        public Criteria andNumPlatformCouponIdGreaterThanOrEqualTo(Long value) {
            addCriterion("NUM_PLATFORM_COUPON_ID >=", value, "numPlatformCouponId");
            return (Criteria) this;
        }

        public Criteria andNumPlatformCouponIdLessThan(Long value) {
            addCriterion("NUM_PLATFORM_COUPON_ID <", value, "numPlatformCouponId");
            return (Criteria) this;
        }

        public Criteria andNumPlatformCouponIdLessThanOrEqualTo(Long value) {
            addCriterion("NUM_PLATFORM_COUPON_ID <=", value, "numPlatformCouponId");
            return (Criteria) this;
        }

        public Criteria andNumPlatformCouponIdIn(List<Long> values) {
            addCriterion("NUM_PLATFORM_COUPON_ID in", values, "numPlatformCouponId");
            return (Criteria) this;
        }

        public Criteria andNumPlatformCouponIdNotIn(List<Long> values) {
            addCriterion("NUM_PLATFORM_COUPON_ID not in", values, "numPlatformCouponId");
            return (Criteria) this;
        }

        public Criteria andNumPlatformCouponIdBetween(Long value1, Long value2) {
            addCriterion("NUM_PLATFORM_COUPON_ID between", value1, value2, "numPlatformCouponId");
            return (Criteria) this;
        }

        public Criteria andNumPlatformCouponIdNotBetween(Long value1, Long value2) {
            addCriterion("NUM_PLATFORM_COUPON_ID not between", value1, value2, "numPlatformCouponId");
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

        public Criteria andDatEndDateIsNull() {
            addCriterion("DAT_END_DATE is null");
            return (Criteria) this;
        }

        public Criteria andDatEndDateIsNotNull() {
            addCriterion("DAT_END_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andDatEndDateEqualTo(Date value) {
            addCriterion("DAT_END_DATE =", value, "datEndDate");
            return (Criteria) this;
        }

        public Criteria andDatEndDateNotEqualTo(Date value) {
            addCriterion("DAT_END_DATE <>", value, "datEndDate");
            return (Criteria) this;
        }

        public Criteria andDatEndDateGreaterThan(Date value) {
            addCriterion("DAT_END_DATE >", value, "datEndDate");
            return (Criteria) this;
        }

        public Criteria andDatEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("DAT_END_DATE >=", value, "datEndDate");
            return (Criteria) this;
        }

        public Criteria andDatEndDateLessThan(Date value) {
            addCriterion("DAT_END_DATE <", value, "datEndDate");
            return (Criteria) this;
        }

        public Criteria andDatEndDateLessThanOrEqualTo(Date value) {
            addCriterion("DAT_END_DATE <=", value, "datEndDate");
            return (Criteria) this;
        }

        public Criteria andDatEndDateIn(List<Date> values) {
            addCriterion("DAT_END_DATE in", values, "datEndDate");
            return (Criteria) this;
        }

        public Criteria andDatEndDateNotIn(List<Date> values) {
            addCriterion("DAT_END_DATE not in", values, "datEndDate");
            return (Criteria) this;
        }

        public Criteria andDatEndDateBetween(Date value1, Date value2) {
            addCriterion("DAT_END_DATE between", value1, value2, "datEndDate");
            return (Criteria) this;
        }

        public Criteria andDatEndDateNotBetween(Date value1, Date value2) {
            addCriterion("DAT_END_DATE not between", value1, value2, "datEndDate");
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

        public Criteria andNumStateEqualTo(Byte value) {
            addCriterion("NUM_STATE =", value, "numState");
            return (Criteria) this;
        }

        public Criteria andNumStateNotEqualTo(Byte value) {
            addCriterion("NUM_STATE <>", value, "numState");
            return (Criteria) this;
        }

        public Criteria andNumStateGreaterThan(Byte value) {
            addCriterion("NUM_STATE >", value, "numState");
            return (Criteria) this;
        }

        public Criteria andNumStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("NUM_STATE >=", value, "numState");
            return (Criteria) this;
        }

        public Criteria andNumStateLessThan(Byte value) {
            addCriterion("NUM_STATE <", value, "numState");
            return (Criteria) this;
        }

        public Criteria andNumStateLessThanOrEqualTo(Byte value) {
            addCriterion("NUM_STATE <=", value, "numState");
            return (Criteria) this;
        }

        public Criteria andNumStateIn(List<Byte> values) {
            addCriterion("NUM_STATE in", values, "numState");
            return (Criteria) this;
        }

        public Criteria andNumStateNotIn(List<Byte> values) {
            addCriterion("NUM_STATE not in", values, "numState");
            return (Criteria) this;
        }

        public Criteria andNumStateBetween(Byte value1, Byte value2) {
            addCriterion("NUM_STATE between", value1, value2, "numState");
            return (Criteria) this;
        }

        public Criteria andNumStateNotBetween(Byte value1, Byte value2) {
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

        public Criteria andNumUserIdEqualTo(String value) {
            addCriterion("NUM_USER_ID =", value, "numUserId");
            return (Criteria) this;
        }

        public Criteria andNumUserIdNotEqualTo(String value) {
            addCriterion("NUM_USER_ID <>", value, "numUserId");
            return (Criteria) this;
        }

        public Criteria andNumUserIdGreaterThan(String value) {
            addCriterion("NUM_USER_ID >", value, "numUserId");
            return (Criteria) this;
        }

        public Criteria andNumUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("NUM_USER_ID >=", value, "numUserId");
            return (Criteria) this;
        }

        public Criteria andNumUserIdLessThan(String value) {
            addCriterion("NUM_USER_ID <", value, "numUserId");
            return (Criteria) this;
        }

        public Criteria andNumUserIdLessThanOrEqualTo(String value) {
            addCriterion("NUM_USER_ID <=", value, "numUserId");
            return (Criteria) this;
        }

        public Criteria andNumUserIdLike(String value) {
            addCriterion("NUM_USER_ID like", value, "numUserId");
            return (Criteria) this;
        }

        public Criteria andNumUserIdNotLike(String value) {
            addCriterion("NUM_USER_ID not like", value, "numUserId");
            return (Criteria) this;
        }

        public Criteria andNumUserIdIn(List<String> values) {
            addCriterion("NUM_USER_ID in", values, "numUserId");
            return (Criteria) this;
        }

        public Criteria andNumUserIdNotIn(List<String> values) {
            addCriterion("NUM_USER_ID not in", values, "numUserId");
            return (Criteria) this;
        }

        public Criteria andNumUserIdBetween(String value1, String value2) {
            addCriterion("NUM_USER_ID between", value1, value2, "numUserId");
            return (Criteria) this;
        }

        public Criteria andNumUserIdNotBetween(String value1, String value2) {
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