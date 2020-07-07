package com.dower.sharerideapp.core.serverdb.model;

import java.util.ArrayList;
import java.util.List;

public class ClFnModelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClFnModelExample() {
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

        public Criteria andVcModelNameIsNull() {
            addCriterion("VC_MODEL_NAME is null");
            return (Criteria) this;
        }

        public Criteria andVcModelNameIsNotNull() {
            addCriterion("VC_MODEL_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andVcModelNameEqualTo(String value) {
            addCriterion("VC_MODEL_NAME =", value, "vcModelName");
            return (Criteria) this;
        }

        public Criteria andVcModelNameNotEqualTo(String value) {
            addCriterion("VC_MODEL_NAME <>", value, "vcModelName");
            return (Criteria) this;
        }

        public Criteria andVcModelNameGreaterThan(String value) {
            addCriterion("VC_MODEL_NAME >", value, "vcModelName");
            return (Criteria) this;
        }

        public Criteria andVcModelNameGreaterThanOrEqualTo(String value) {
            addCriterion("VC_MODEL_NAME >=", value, "vcModelName");
            return (Criteria) this;
        }

        public Criteria andVcModelNameLessThan(String value) {
            addCriterion("VC_MODEL_NAME <", value, "vcModelName");
            return (Criteria) this;
        }

        public Criteria andVcModelNameLessThanOrEqualTo(String value) {
            addCriterion("VC_MODEL_NAME <=", value, "vcModelName");
            return (Criteria) this;
        }

        public Criteria andVcModelNameLike(String value) {
            addCriterion("VC_MODEL_NAME like", value, "vcModelName");
            return (Criteria) this;
        }

        public Criteria andVcModelNameNotLike(String value) {
            addCriterion("VC_MODEL_NAME not like", value, "vcModelName");
            return (Criteria) this;
        }

        public Criteria andVcModelNameIn(List<String> values) {
            addCriterion("VC_MODEL_NAME in", values, "vcModelName");
            return (Criteria) this;
        }

        public Criteria andVcModelNameNotIn(List<String> values) {
            addCriterion("VC_MODEL_NAME not in", values, "vcModelName");
            return (Criteria) this;
        }

        public Criteria andVcModelNameBetween(String value1, String value2) {
            addCriterion("VC_MODEL_NAME between", value1, value2, "vcModelName");
            return (Criteria) this;
        }

        public Criteria andVcModelNameNotBetween(String value1, String value2) {
            addCriterion("VC_MODEL_NAME not between", value1, value2, "vcModelName");
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