package com.dower.product.core.serverdb.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NntUserJourneyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NntUserJourneyExample() {
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

        public Criteria andNumNntUserJourneyIdIsNull() {
            addCriterion("NUM_NNT_USER_JOURNEY_ID is null");
            return (Criteria) this;
        }

        public Criteria andNumNntUserJourneyIdIsNotNull() {
            addCriterion("NUM_NNT_USER_JOURNEY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andNumNntUserJourneyIdEqualTo(Integer value) {
            addCriterion("NUM_NNT_USER_JOURNEY_ID =", value, "numNntUserJourneyId");
            return (Criteria) this;
        }

        public Criteria andNumNntUserJourneyIdNotEqualTo(Integer value) {
            addCriterion("NUM_NNT_USER_JOURNEY_ID <>", value, "numNntUserJourneyId");
            return (Criteria) this;
        }

        public Criteria andNumNntUserJourneyIdGreaterThan(Integer value) {
            addCriterion("NUM_NNT_USER_JOURNEY_ID >", value, "numNntUserJourneyId");
            return (Criteria) this;
        }

        public Criteria andNumNntUserJourneyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("NUM_NNT_USER_JOURNEY_ID >=", value, "numNntUserJourneyId");
            return (Criteria) this;
        }

        public Criteria andNumNntUserJourneyIdLessThan(Integer value) {
            addCriterion("NUM_NNT_USER_JOURNEY_ID <", value, "numNntUserJourneyId");
            return (Criteria) this;
        }

        public Criteria andNumNntUserJourneyIdLessThanOrEqualTo(Integer value) {
            addCriterion("NUM_NNT_USER_JOURNEY_ID <=", value, "numNntUserJourneyId");
            return (Criteria) this;
        }

        public Criteria andNumNntUserJourneyIdIn(List<Integer> values) {
            addCriterion("NUM_NNT_USER_JOURNEY_ID in", values, "numNntUserJourneyId");
            return (Criteria) this;
        }

        public Criteria andNumNntUserJourneyIdNotIn(List<Integer> values) {
            addCriterion("NUM_NNT_USER_JOURNEY_ID not in", values, "numNntUserJourneyId");
            return (Criteria) this;
        }

        public Criteria andNumNntUserJourneyIdBetween(Integer value1, Integer value2) {
            addCriterion("NUM_NNT_USER_JOURNEY_ID between", value1, value2, "numNntUserJourneyId");
            return (Criteria) this;
        }

        public Criteria andNumNntUserJourneyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("NUM_NNT_USER_JOURNEY_ID not between", value1, value2, "numNntUserJourneyId");
            return (Criteria) this;
        }

        public Criteria andNumRouteIdIsNull() {
            addCriterion("NUM_ROUTE_ID is null");
            return (Criteria) this;
        }

        public Criteria andNumRouteIdIsNotNull() {
            addCriterion("NUM_ROUTE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andNumRouteIdEqualTo(Integer value) {
            addCriterion("NUM_ROUTE_ID =", value, "numRouteId");
            return (Criteria) this;
        }

        public Criteria andNumRouteIdNotEqualTo(Integer value) {
            addCriterion("NUM_ROUTE_ID <>", value, "numRouteId");
            return (Criteria) this;
        }

        public Criteria andNumRouteIdGreaterThan(Integer value) {
            addCriterion("NUM_ROUTE_ID >", value, "numRouteId");
            return (Criteria) this;
        }

        public Criteria andNumRouteIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("NUM_ROUTE_ID >=", value, "numRouteId");
            return (Criteria) this;
        }

        public Criteria andNumRouteIdLessThan(Integer value) {
            addCriterion("NUM_ROUTE_ID <", value, "numRouteId");
            return (Criteria) this;
        }

        public Criteria andNumRouteIdLessThanOrEqualTo(Integer value) {
            addCriterion("NUM_ROUTE_ID <=", value, "numRouteId");
            return (Criteria) this;
        }

        public Criteria andNumRouteIdIn(List<Integer> values) {
            addCriterion("NUM_ROUTE_ID in", values, "numRouteId");
            return (Criteria) this;
        }

        public Criteria andNumRouteIdNotIn(List<Integer> values) {
            addCriterion("NUM_ROUTE_ID not in", values, "numRouteId");
            return (Criteria) this;
        }

        public Criteria andNumRouteIdBetween(Integer value1, Integer value2) {
            addCriterion("NUM_ROUTE_ID between", value1, value2, "numRouteId");
            return (Criteria) this;
        }

        public Criteria andNumRouteIdNotBetween(Integer value1, Integer value2) {
            addCriterion("NUM_ROUTE_ID not between", value1, value2, "numRouteId");
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

        public Criteria andVcSeatNoIsNull() {
            addCriterion("VC_SEAT_NO is null");
            return (Criteria) this;
        }

        public Criteria andVcSeatNoIsNotNull() {
            addCriterion("VC_SEAT_NO is not null");
            return (Criteria) this;
        }

        public Criteria andVcSeatNoEqualTo(String value) {
            addCriterion("VC_SEAT_NO =", value, "vcSeatNo");
            return (Criteria) this;
        }

        public Criteria andVcSeatNoNotEqualTo(String value) {
            addCriterion("VC_SEAT_NO <>", value, "vcSeatNo");
            return (Criteria) this;
        }

        public Criteria andVcSeatNoGreaterThan(String value) {
            addCriterion("VC_SEAT_NO >", value, "vcSeatNo");
            return (Criteria) this;
        }

        public Criteria andVcSeatNoGreaterThanOrEqualTo(String value) {
            addCriterion("VC_SEAT_NO >=", value, "vcSeatNo");
            return (Criteria) this;
        }

        public Criteria andVcSeatNoLessThan(String value) {
            addCriterion("VC_SEAT_NO <", value, "vcSeatNo");
            return (Criteria) this;
        }

        public Criteria andVcSeatNoLessThanOrEqualTo(String value) {
            addCriterion("VC_SEAT_NO <=", value, "vcSeatNo");
            return (Criteria) this;
        }

        public Criteria andVcSeatNoLike(String value) {
            addCriterion("VC_SEAT_NO like", value, "vcSeatNo");
            return (Criteria) this;
        }

        public Criteria andVcSeatNoNotLike(String value) {
            addCriterion("VC_SEAT_NO not like", value, "vcSeatNo");
            return (Criteria) this;
        }

        public Criteria andVcSeatNoIn(List<String> values) {
            addCriterion("VC_SEAT_NO in", values, "vcSeatNo");
            return (Criteria) this;
        }

        public Criteria andVcSeatNoNotIn(List<String> values) {
            addCriterion("VC_SEAT_NO not in", values, "vcSeatNo");
            return (Criteria) this;
        }

        public Criteria andVcSeatNoBetween(String value1, String value2) {
            addCriterion("VC_SEAT_NO between", value1, value2, "vcSeatNo");
            return (Criteria) this;
        }

        public Criteria andVcSeatNoNotBetween(String value1, String value2) {
            addCriterion("VC_SEAT_NO not between", value1, value2, "vcSeatNo");
            return (Criteria) this;
        }

        public Criteria andNumPayStateIsNull() {
            addCriterion("NUM_PAY_STATE is null");
            return (Criteria) this;
        }

        public Criteria andNumPayStateIsNotNull() {
            addCriterion("NUM_PAY_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andNumPayStateEqualTo(Integer value) {
            addCriterion("NUM_PAY_STATE =", value, "numPayState");
            return (Criteria) this;
        }

        public Criteria andNumPayStateNotEqualTo(Integer value) {
            addCriterion("NUM_PAY_STATE <>", value, "numPayState");
            return (Criteria) this;
        }

        public Criteria andNumPayStateGreaterThan(Integer value) {
            addCriterion("NUM_PAY_STATE >", value, "numPayState");
            return (Criteria) this;
        }

        public Criteria andNumPayStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("NUM_PAY_STATE >=", value, "numPayState");
            return (Criteria) this;
        }

        public Criteria andNumPayStateLessThan(Integer value) {
            addCriterion("NUM_PAY_STATE <", value, "numPayState");
            return (Criteria) this;
        }

        public Criteria andNumPayStateLessThanOrEqualTo(Integer value) {
            addCriterion("NUM_PAY_STATE <=", value, "numPayState");
            return (Criteria) this;
        }

        public Criteria andNumPayStateIn(List<Integer> values) {
            addCriterion("NUM_PAY_STATE in", values, "numPayState");
            return (Criteria) this;
        }

        public Criteria andNumPayStateNotIn(List<Integer> values) {
            addCriterion("NUM_PAY_STATE not in", values, "numPayState");
            return (Criteria) this;
        }

        public Criteria andNumPayStateBetween(Integer value1, Integer value2) {
            addCriterion("NUM_PAY_STATE between", value1, value2, "numPayState");
            return (Criteria) this;
        }

        public Criteria andNumPayStateNotBetween(Integer value1, Integer value2) {
            addCriterion("NUM_PAY_STATE not between", value1, value2, "numPayState");
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

        public Criteria andNumPayTayeIsNull() {
            addCriterion("NUM_PAY_TAYE is null");
            return (Criteria) this;
        }

        public Criteria andNumPayTayeIsNotNull() {
            addCriterion("NUM_PAY_TAYE is not null");
            return (Criteria) this;
        }

        public Criteria andNumPayTayeEqualTo(Integer value) {
            addCriterion("NUM_PAY_TAYE =", value, "numPayTaye");
            return (Criteria) this;
        }

        public Criteria andNumPayTayeNotEqualTo(Integer value) {
            addCriterion("NUM_PAY_TAYE <>", value, "numPayTaye");
            return (Criteria) this;
        }

        public Criteria andNumPayTayeGreaterThan(Integer value) {
            addCriterion("NUM_PAY_TAYE >", value, "numPayTaye");
            return (Criteria) this;
        }

        public Criteria andNumPayTayeGreaterThanOrEqualTo(Integer value) {
            addCriterion("NUM_PAY_TAYE >=", value, "numPayTaye");
            return (Criteria) this;
        }

        public Criteria andNumPayTayeLessThan(Integer value) {
            addCriterion("NUM_PAY_TAYE <", value, "numPayTaye");
            return (Criteria) this;
        }

        public Criteria andNumPayTayeLessThanOrEqualTo(Integer value) {
            addCriterion("NUM_PAY_TAYE <=", value, "numPayTaye");
            return (Criteria) this;
        }

        public Criteria andNumPayTayeIn(List<Integer> values) {
            addCriterion("NUM_PAY_TAYE in", values, "numPayTaye");
            return (Criteria) this;
        }

        public Criteria andNumPayTayeNotIn(List<Integer> values) {
            addCriterion("NUM_PAY_TAYE not in", values, "numPayTaye");
            return (Criteria) this;
        }

        public Criteria andNumPayTayeBetween(Integer value1, Integer value2) {
            addCriterion("NUM_PAY_TAYE between", value1, value2, "numPayTaye");
            return (Criteria) this;
        }

        public Criteria andNumPayTayeNotBetween(Integer value1, Integer value2) {
            addCriterion("NUM_PAY_TAYE not between", value1, value2, "numPayTaye");
            return (Criteria) this;
        }

        public Criteria andNumAgreeStateIsNull() {
            addCriterion("NUM_AGREE_STATE is null");
            return (Criteria) this;
        }

        public Criteria andNumAgreeStateIsNotNull() {
            addCriterion("NUM_AGREE_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andNumAgreeStateEqualTo(Integer value) {
            addCriterion("NUM_AGREE_STATE =", value, "numAgreeState");
            return (Criteria) this;
        }

        public Criteria andNumAgreeStateNotEqualTo(Integer value) {
            addCriterion("NUM_AGREE_STATE <>", value, "numAgreeState");
            return (Criteria) this;
        }

        public Criteria andNumAgreeStateGreaterThan(Integer value) {
            addCriterion("NUM_AGREE_STATE >", value, "numAgreeState");
            return (Criteria) this;
        }

        public Criteria andNumAgreeStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("NUM_AGREE_STATE >=", value, "numAgreeState");
            return (Criteria) this;
        }

        public Criteria andNumAgreeStateLessThan(Integer value) {
            addCriterion("NUM_AGREE_STATE <", value, "numAgreeState");
            return (Criteria) this;
        }

        public Criteria andNumAgreeStateLessThanOrEqualTo(Integer value) {
            addCriterion("NUM_AGREE_STATE <=", value, "numAgreeState");
            return (Criteria) this;
        }

        public Criteria andNumAgreeStateIn(List<Integer> values) {
            addCriterion("NUM_AGREE_STATE in", values, "numAgreeState");
            return (Criteria) this;
        }

        public Criteria andNumAgreeStateNotIn(List<Integer> values) {
            addCriterion("NUM_AGREE_STATE not in", values, "numAgreeState");
            return (Criteria) this;
        }

        public Criteria andNumAgreeStateBetween(Integer value1, Integer value2) {
            addCriterion("NUM_AGREE_STATE between", value1, value2, "numAgreeState");
            return (Criteria) this;
        }

        public Criteria andNumAgreeStateNotBetween(Integer value1, Integer value2) {
            addCriterion("NUM_AGREE_STATE not between", value1, value2, "numAgreeState");
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