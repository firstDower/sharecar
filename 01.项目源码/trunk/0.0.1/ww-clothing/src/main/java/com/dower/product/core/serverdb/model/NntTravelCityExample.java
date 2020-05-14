package com.dower.product.core.serverdb.model;

import java.util.ArrayList;
import java.util.List;

public class NntTravelCityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NntTravelCityExample() {
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

        public Criteria andNumTravelCityIdIsNull() {
            addCriterion("NUM_TRAVEL_CITY_ID is null");
            return (Criteria) this;
        }

        public Criteria andNumTravelCityIdIsNotNull() {
            addCriterion("NUM_TRAVEL_CITY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andNumTravelCityIdEqualTo(Integer value) {
            addCriterion("NUM_TRAVEL_CITY_ID =", value, "numTravelCityId");
            return (Criteria) this;
        }

        public Criteria andNumTravelCityIdNotEqualTo(Integer value) {
            addCriterion("NUM_TRAVEL_CITY_ID <>", value, "numTravelCityId");
            return (Criteria) this;
        }

        public Criteria andNumTravelCityIdGreaterThan(Integer value) {
            addCriterion("NUM_TRAVEL_CITY_ID >", value, "numTravelCityId");
            return (Criteria) this;
        }

        public Criteria andNumTravelCityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("NUM_TRAVEL_CITY_ID >=", value, "numTravelCityId");
            return (Criteria) this;
        }

        public Criteria andNumTravelCityIdLessThan(Integer value) {
            addCriterion("NUM_TRAVEL_CITY_ID <", value, "numTravelCityId");
            return (Criteria) this;
        }

        public Criteria andNumTravelCityIdLessThanOrEqualTo(Integer value) {
            addCriterion("NUM_TRAVEL_CITY_ID <=", value, "numTravelCityId");
            return (Criteria) this;
        }

        public Criteria andNumTravelCityIdIn(List<Integer> values) {
            addCriterion("NUM_TRAVEL_CITY_ID in", values, "numTravelCityId");
            return (Criteria) this;
        }

        public Criteria andNumTravelCityIdNotIn(List<Integer> values) {
            addCriterion("NUM_TRAVEL_CITY_ID not in", values, "numTravelCityId");
            return (Criteria) this;
        }

        public Criteria andNumTravelCityIdBetween(Integer value1, Integer value2) {
            addCriterion("NUM_TRAVEL_CITY_ID between", value1, value2, "numTravelCityId");
            return (Criteria) this;
        }

        public Criteria andNumTravelCityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("NUM_TRAVEL_CITY_ID not between", value1, value2, "numTravelCityId");
            return (Criteria) this;
        }

        public Criteria andVcCityNameIsNull() {
            addCriterion("VC_CITY_NAME is null");
            return (Criteria) this;
        }

        public Criteria andVcCityNameIsNotNull() {
            addCriterion("VC_CITY_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andVcCityNameEqualTo(String value) {
            addCriterion("VC_CITY_NAME =", value, "vcCityName");
            return (Criteria) this;
        }

        public Criteria andVcCityNameNotEqualTo(String value) {
            addCriterion("VC_CITY_NAME <>", value, "vcCityName");
            return (Criteria) this;
        }

        public Criteria andVcCityNameGreaterThan(String value) {
            addCriterion("VC_CITY_NAME >", value, "vcCityName");
            return (Criteria) this;
        }

        public Criteria andVcCityNameGreaterThanOrEqualTo(String value) {
            addCriterion("VC_CITY_NAME >=", value, "vcCityName");
            return (Criteria) this;
        }

        public Criteria andVcCityNameLessThan(String value) {
            addCriterion("VC_CITY_NAME <", value, "vcCityName");
            return (Criteria) this;
        }

        public Criteria andVcCityNameLessThanOrEqualTo(String value) {
            addCriterion("VC_CITY_NAME <=", value, "vcCityName");
            return (Criteria) this;
        }

        public Criteria andVcCityNameLike(String value) {
            addCriterion("VC_CITY_NAME like", value, "vcCityName");
            return (Criteria) this;
        }

        public Criteria andVcCityNameNotLike(String value) {
            addCriterion("VC_CITY_NAME not like", value, "vcCityName");
            return (Criteria) this;
        }

        public Criteria andVcCityNameIn(List<String> values) {
            addCriterion("VC_CITY_NAME in", values, "vcCityName");
            return (Criteria) this;
        }

        public Criteria andVcCityNameNotIn(List<String> values) {
            addCriterion("VC_CITY_NAME not in", values, "vcCityName");
            return (Criteria) this;
        }

        public Criteria andVcCityNameBetween(String value1, String value2) {
            addCriterion("VC_CITY_NAME between", value1, value2, "vcCityName");
            return (Criteria) this;
        }

        public Criteria andVcCityNameNotBetween(String value1, String value2) {
            addCriterion("VC_CITY_NAME not between", value1, value2, "vcCityName");
            return (Criteria) this;
        }

        public Criteria andVcCityCodeIsNull() {
            addCriterion("VC_CITY_CODE is null");
            return (Criteria) this;
        }

        public Criteria andVcCityCodeIsNotNull() {
            addCriterion("VC_CITY_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andVcCityCodeEqualTo(String value) {
            addCriterion("VC_CITY_CODE =", value, "vcCityCode");
            return (Criteria) this;
        }

        public Criteria andVcCityCodeNotEqualTo(String value) {
            addCriterion("VC_CITY_CODE <>", value, "vcCityCode");
            return (Criteria) this;
        }

        public Criteria andVcCityCodeGreaterThan(String value) {
            addCriterion("VC_CITY_CODE >", value, "vcCityCode");
            return (Criteria) this;
        }

        public Criteria andVcCityCodeGreaterThanOrEqualTo(String value) {
            addCriterion("VC_CITY_CODE >=", value, "vcCityCode");
            return (Criteria) this;
        }

        public Criteria andVcCityCodeLessThan(String value) {
            addCriterion("VC_CITY_CODE <", value, "vcCityCode");
            return (Criteria) this;
        }

        public Criteria andVcCityCodeLessThanOrEqualTo(String value) {
            addCriterion("VC_CITY_CODE <=", value, "vcCityCode");
            return (Criteria) this;
        }

        public Criteria andVcCityCodeLike(String value) {
            addCriterion("VC_CITY_CODE like", value, "vcCityCode");
            return (Criteria) this;
        }

        public Criteria andVcCityCodeNotLike(String value) {
            addCriterion("VC_CITY_CODE not like", value, "vcCityCode");
            return (Criteria) this;
        }

        public Criteria andVcCityCodeIn(List<String> values) {
            addCriterion("VC_CITY_CODE in", values, "vcCityCode");
            return (Criteria) this;
        }

        public Criteria andVcCityCodeNotIn(List<String> values) {
            addCriterion("VC_CITY_CODE not in", values, "vcCityCode");
            return (Criteria) this;
        }

        public Criteria andVcCityCodeBetween(String value1, String value2) {
            addCriterion("VC_CITY_CODE between", value1, value2, "vcCityCode");
            return (Criteria) this;
        }

        public Criteria andVcCityCodeNotBetween(String value1, String value2) {
            addCriterion("VC_CITY_CODE not between", value1, value2, "vcCityCode");
            return (Criteria) this;
        }

        public Criteria andNumSortIsNull() {
            addCriterion("NUM_SORT is null");
            return (Criteria) this;
        }

        public Criteria andNumSortIsNotNull() {
            addCriterion("NUM_SORT is not null");
            return (Criteria) this;
        }

        public Criteria andNumSortEqualTo(Integer value) {
            addCriterion("NUM_SORT =", value, "numSort");
            return (Criteria) this;
        }

        public Criteria andNumSortNotEqualTo(Integer value) {
            addCriterion("NUM_SORT <>", value, "numSort");
            return (Criteria) this;
        }

        public Criteria andNumSortGreaterThan(Integer value) {
            addCriterion("NUM_SORT >", value, "numSort");
            return (Criteria) this;
        }

        public Criteria andNumSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("NUM_SORT >=", value, "numSort");
            return (Criteria) this;
        }

        public Criteria andNumSortLessThan(Integer value) {
            addCriterion("NUM_SORT <", value, "numSort");
            return (Criteria) this;
        }

        public Criteria andNumSortLessThanOrEqualTo(Integer value) {
            addCriterion("NUM_SORT <=", value, "numSort");
            return (Criteria) this;
        }

        public Criteria andNumSortIn(List<Integer> values) {
            addCriterion("NUM_SORT in", values, "numSort");
            return (Criteria) this;
        }

        public Criteria andNumSortNotIn(List<Integer> values) {
            addCriterion("NUM_SORT not in", values, "numSort");
            return (Criteria) this;
        }

        public Criteria andNumSortBetween(Integer value1, Integer value2) {
            addCriterion("NUM_SORT between", value1, value2, "numSort");
            return (Criteria) this;
        }

        public Criteria andNumSortNotBetween(Integer value1, Integer value2) {
            addCriterion("NUM_SORT not between", value1, value2, "numSort");
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

        public Criteria andNumIsDelEqualTo(Integer value) {
            addCriterion("NUM_IS_DEL =", value, "numIsDel");
            return (Criteria) this;
        }

        public Criteria andNumIsDelNotEqualTo(Integer value) {
            addCriterion("NUM_IS_DEL <>", value, "numIsDel");
            return (Criteria) this;
        }

        public Criteria andNumIsDelGreaterThan(Integer value) {
            addCriterion("NUM_IS_DEL >", value, "numIsDel");
            return (Criteria) this;
        }

        public Criteria andNumIsDelGreaterThanOrEqualTo(Integer value) {
            addCriterion("NUM_IS_DEL >=", value, "numIsDel");
            return (Criteria) this;
        }

        public Criteria andNumIsDelLessThan(Integer value) {
            addCriterion("NUM_IS_DEL <", value, "numIsDel");
            return (Criteria) this;
        }

        public Criteria andNumIsDelLessThanOrEqualTo(Integer value) {
            addCriterion("NUM_IS_DEL <=", value, "numIsDel");
            return (Criteria) this;
        }

        public Criteria andNumIsDelIn(List<Integer> values) {
            addCriterion("NUM_IS_DEL in", values, "numIsDel");
            return (Criteria) this;
        }

        public Criteria andNumIsDelNotIn(List<Integer> values) {
            addCriterion("NUM_IS_DEL not in", values, "numIsDel");
            return (Criteria) this;
        }

        public Criteria andNumIsDelBetween(Integer value1, Integer value2) {
            addCriterion("NUM_IS_DEL between", value1, value2, "numIsDel");
            return (Criteria) this;
        }

        public Criteria andNumIsDelNotBetween(Integer value1, Integer value2) {
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