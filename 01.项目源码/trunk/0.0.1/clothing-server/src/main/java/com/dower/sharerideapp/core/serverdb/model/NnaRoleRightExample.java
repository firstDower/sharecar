package com.dower.sharerideapp.core.serverdb.model;

import java.util.ArrayList;
import java.util.List;

public class NnaRoleRightExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NnaRoleRightExample() {
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

        public Criteria andNumRoleRightIdIsNull() {
            addCriterion("NUM_ROLE_RIGHT_ID is null");
            return (Criteria) this;
        }

        public Criteria andNumRoleRightIdIsNotNull() {
            addCriterion("NUM_ROLE_RIGHT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andNumRoleRightIdEqualTo(Integer value) {
            addCriterion("NUM_ROLE_RIGHT_ID =", value, "numRoleRightId");
            return (Criteria) this;
        }

        public Criteria andNumRoleRightIdNotEqualTo(Integer value) {
            addCriterion("NUM_ROLE_RIGHT_ID <>", value, "numRoleRightId");
            return (Criteria) this;
        }

        public Criteria andNumRoleRightIdGreaterThan(Integer value) {
            addCriterion("NUM_ROLE_RIGHT_ID >", value, "numRoleRightId");
            return (Criteria) this;
        }

        public Criteria andNumRoleRightIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("NUM_ROLE_RIGHT_ID >=", value, "numRoleRightId");
            return (Criteria) this;
        }

        public Criteria andNumRoleRightIdLessThan(Integer value) {
            addCriterion("NUM_ROLE_RIGHT_ID <", value, "numRoleRightId");
            return (Criteria) this;
        }

        public Criteria andNumRoleRightIdLessThanOrEqualTo(Integer value) {
            addCriterion("NUM_ROLE_RIGHT_ID <=", value, "numRoleRightId");
            return (Criteria) this;
        }

        public Criteria andNumRoleRightIdIn(List<Integer> values) {
            addCriterion("NUM_ROLE_RIGHT_ID in", values, "numRoleRightId");
            return (Criteria) this;
        }

        public Criteria andNumRoleRightIdNotIn(List<Integer> values) {
            addCriterion("NUM_ROLE_RIGHT_ID not in", values, "numRoleRightId");
            return (Criteria) this;
        }

        public Criteria andNumRoleRightIdBetween(Integer value1, Integer value2) {
            addCriterion("NUM_ROLE_RIGHT_ID between", value1, value2, "numRoleRightId");
            return (Criteria) this;
        }

        public Criteria andNumRoleRightIdNotBetween(Integer value1, Integer value2) {
            addCriterion("NUM_ROLE_RIGHT_ID not between", value1, value2, "numRoleRightId");
            return (Criteria) this;
        }

        public Criteria andNumRoleIdIsNull() {
            addCriterion("NUM_ROLE_ID is null");
            return (Criteria) this;
        }

        public Criteria andNumRoleIdIsNotNull() {
            addCriterion("NUM_ROLE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andNumRoleIdEqualTo(Integer value) {
            addCriterion("NUM_ROLE_ID =", value, "numRoleId");
            return (Criteria) this;
        }

        public Criteria andNumRoleIdNotEqualTo(Integer value) {
            addCriterion("NUM_ROLE_ID <>", value, "numRoleId");
            return (Criteria) this;
        }

        public Criteria andNumRoleIdGreaterThan(Integer value) {
            addCriterion("NUM_ROLE_ID >", value, "numRoleId");
            return (Criteria) this;
        }

        public Criteria andNumRoleIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("NUM_ROLE_ID >=", value, "numRoleId");
            return (Criteria) this;
        }

        public Criteria andNumRoleIdLessThan(Integer value) {
            addCriterion("NUM_ROLE_ID <", value, "numRoleId");
            return (Criteria) this;
        }

        public Criteria andNumRoleIdLessThanOrEqualTo(Integer value) {
            addCriterion("NUM_ROLE_ID <=", value, "numRoleId");
            return (Criteria) this;
        }

        public Criteria andNumRoleIdIn(List<Integer> values) {
            addCriterion("NUM_ROLE_ID in", values, "numRoleId");
            return (Criteria) this;
        }

        public Criteria andNumRoleIdNotIn(List<Integer> values) {
            addCriterion("NUM_ROLE_ID not in", values, "numRoleId");
            return (Criteria) this;
        }

        public Criteria andNumRoleIdBetween(Integer value1, Integer value2) {
            addCriterion("NUM_ROLE_ID between", value1, value2, "numRoleId");
            return (Criteria) this;
        }

        public Criteria andNumRoleIdNotBetween(Integer value1, Integer value2) {
            addCriterion("NUM_ROLE_ID not between", value1, value2, "numRoleId");
            return (Criteria) this;
        }

        public Criteria andNumRightIdIsNull() {
            addCriterion("NUM_RIGHT_ID is null");
            return (Criteria) this;
        }

        public Criteria andNumRightIdIsNotNull() {
            addCriterion("NUM_RIGHT_ID is not null");
            return (Criteria) this;
        }

        public Criteria andNumRightIdEqualTo(Integer value) {
            addCriterion("NUM_RIGHT_ID =", value, "numRightId");
            return (Criteria) this;
        }

        public Criteria andNumRightIdNotEqualTo(Integer value) {
            addCriterion("NUM_RIGHT_ID <>", value, "numRightId");
            return (Criteria) this;
        }

        public Criteria andNumRightIdGreaterThan(Integer value) {
            addCriterion("NUM_RIGHT_ID >", value, "numRightId");
            return (Criteria) this;
        }

        public Criteria andNumRightIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("NUM_RIGHT_ID >=", value, "numRightId");
            return (Criteria) this;
        }

        public Criteria andNumRightIdLessThan(Integer value) {
            addCriterion("NUM_RIGHT_ID <", value, "numRightId");
            return (Criteria) this;
        }

        public Criteria andNumRightIdLessThanOrEqualTo(Integer value) {
            addCriterion("NUM_RIGHT_ID <=", value, "numRightId");
            return (Criteria) this;
        }

        public Criteria andNumRightIdIn(List<Integer> values) {
            addCriterion("NUM_RIGHT_ID in", values, "numRightId");
            return (Criteria) this;
        }

        public Criteria andNumRightIdNotIn(List<Integer> values) {
            addCriterion("NUM_RIGHT_ID not in", values, "numRightId");
            return (Criteria) this;
        }

        public Criteria andNumRightIdBetween(Integer value1, Integer value2) {
            addCriterion("NUM_RIGHT_ID between", value1, value2, "numRightId");
            return (Criteria) this;
        }

        public Criteria andNumRightIdNotBetween(Integer value1, Integer value2) {
            addCriterion("NUM_RIGHT_ID not between", value1, value2, "numRightId");
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