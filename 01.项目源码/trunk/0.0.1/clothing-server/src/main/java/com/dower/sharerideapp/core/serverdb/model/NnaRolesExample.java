package com.dower.sharerideapp.core.serverdb.model;

import java.util.ArrayList;
import java.util.List;

public class NnaRolesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NnaRolesExample() {
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

        public Criteria andVcRoleNameIsNull() {
            addCriterion("VC_ROLE_NAME is null");
            return (Criteria) this;
        }

        public Criteria andVcRoleNameIsNotNull() {
            addCriterion("VC_ROLE_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andVcRoleNameEqualTo(String value) {
            addCriterion("VC_ROLE_NAME =", value, "vcRoleName");
            return (Criteria) this;
        }

        public Criteria andVcRoleNameNotEqualTo(String value) {
            addCriterion("VC_ROLE_NAME <>", value, "vcRoleName");
            return (Criteria) this;
        }

        public Criteria andVcRoleNameGreaterThan(String value) {
            addCriterion("VC_ROLE_NAME >", value, "vcRoleName");
            return (Criteria) this;
        }

        public Criteria andVcRoleNameGreaterThanOrEqualTo(String value) {
            addCriterion("VC_ROLE_NAME >=", value, "vcRoleName");
            return (Criteria) this;
        }

        public Criteria andVcRoleNameLessThan(String value) {
            addCriterion("VC_ROLE_NAME <", value, "vcRoleName");
            return (Criteria) this;
        }

        public Criteria andVcRoleNameLessThanOrEqualTo(String value) {
            addCriterion("VC_ROLE_NAME <=", value, "vcRoleName");
            return (Criteria) this;
        }

        public Criteria andVcRoleNameLike(String value) {
            addCriterion("VC_ROLE_NAME like", value, "vcRoleName");
            return (Criteria) this;
        }

        public Criteria andVcRoleNameNotLike(String value) {
            addCriterion("VC_ROLE_NAME not like", value, "vcRoleName");
            return (Criteria) this;
        }

        public Criteria andVcRoleNameIn(List<String> values) {
            addCriterion("VC_ROLE_NAME in", values, "vcRoleName");
            return (Criteria) this;
        }

        public Criteria andVcRoleNameNotIn(List<String> values) {
            addCriterion("VC_ROLE_NAME not in", values, "vcRoleName");
            return (Criteria) this;
        }

        public Criteria andVcRoleNameBetween(String value1, String value2) {
            addCriterion("VC_ROLE_NAME between", value1, value2, "vcRoleName");
            return (Criteria) this;
        }

        public Criteria andVcRoleNameNotBetween(String value1, String value2) {
            addCriterion("VC_ROLE_NAME not between", value1, value2, "vcRoleName");
            return (Criteria) this;
        }

        public Criteria andVcRoleDescIsNull() {
            addCriterion("VC_ROLE_DESC is null");
            return (Criteria) this;
        }

        public Criteria andVcRoleDescIsNotNull() {
            addCriterion("VC_ROLE_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andVcRoleDescEqualTo(String value) {
            addCriterion("VC_ROLE_DESC =", value, "vcRoleDesc");
            return (Criteria) this;
        }

        public Criteria andVcRoleDescNotEqualTo(String value) {
            addCriterion("VC_ROLE_DESC <>", value, "vcRoleDesc");
            return (Criteria) this;
        }

        public Criteria andVcRoleDescGreaterThan(String value) {
            addCriterion("VC_ROLE_DESC >", value, "vcRoleDesc");
            return (Criteria) this;
        }

        public Criteria andVcRoleDescGreaterThanOrEqualTo(String value) {
            addCriterion("VC_ROLE_DESC >=", value, "vcRoleDesc");
            return (Criteria) this;
        }

        public Criteria andVcRoleDescLessThan(String value) {
            addCriterion("VC_ROLE_DESC <", value, "vcRoleDesc");
            return (Criteria) this;
        }

        public Criteria andVcRoleDescLessThanOrEqualTo(String value) {
            addCriterion("VC_ROLE_DESC <=", value, "vcRoleDesc");
            return (Criteria) this;
        }

        public Criteria andVcRoleDescLike(String value) {
            addCriterion("VC_ROLE_DESC like", value, "vcRoleDesc");
            return (Criteria) this;
        }

        public Criteria andVcRoleDescNotLike(String value) {
            addCriterion("VC_ROLE_DESC not like", value, "vcRoleDesc");
            return (Criteria) this;
        }

        public Criteria andVcRoleDescIn(List<String> values) {
            addCriterion("VC_ROLE_DESC in", values, "vcRoleDesc");
            return (Criteria) this;
        }

        public Criteria andVcRoleDescNotIn(List<String> values) {
            addCriterion("VC_ROLE_DESC not in", values, "vcRoleDesc");
            return (Criteria) this;
        }

        public Criteria andVcRoleDescBetween(String value1, String value2) {
            addCriterion("VC_ROLE_DESC between", value1, value2, "vcRoleDesc");
            return (Criteria) this;
        }

        public Criteria andVcRoleDescNotBetween(String value1, String value2) {
            addCriterion("VC_ROLE_DESC not between", value1, value2, "vcRoleDesc");
            return (Criteria) this;
        }

        public Criteria andNumRoleStateIsNull() {
            addCriterion("NUM_ROLE_STATE is null");
            return (Criteria) this;
        }

        public Criteria andNumRoleStateIsNotNull() {
            addCriterion("NUM_ROLE_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andNumRoleStateEqualTo(Integer value) {
            addCriterion("NUM_ROLE_STATE =", value, "numRoleState");
            return (Criteria) this;
        }

        public Criteria andNumRoleStateNotEqualTo(Integer value) {
            addCriterion("NUM_ROLE_STATE <>", value, "numRoleState");
            return (Criteria) this;
        }

        public Criteria andNumRoleStateGreaterThan(Integer value) {
            addCriterion("NUM_ROLE_STATE >", value, "numRoleState");
            return (Criteria) this;
        }

        public Criteria andNumRoleStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("NUM_ROLE_STATE >=", value, "numRoleState");
            return (Criteria) this;
        }

        public Criteria andNumRoleStateLessThan(Integer value) {
            addCriterion("NUM_ROLE_STATE <", value, "numRoleState");
            return (Criteria) this;
        }

        public Criteria andNumRoleStateLessThanOrEqualTo(Integer value) {
            addCriterion("NUM_ROLE_STATE <=", value, "numRoleState");
            return (Criteria) this;
        }

        public Criteria andNumRoleStateIn(List<Integer> values) {
            addCriterion("NUM_ROLE_STATE in", values, "numRoleState");
            return (Criteria) this;
        }

        public Criteria andNumRoleStateNotIn(List<Integer> values) {
            addCriterion("NUM_ROLE_STATE not in", values, "numRoleState");
            return (Criteria) this;
        }

        public Criteria andNumRoleStateBetween(Integer value1, Integer value2) {
            addCriterion("NUM_ROLE_STATE between", value1, value2, "numRoleState");
            return (Criteria) this;
        }

        public Criteria andNumRoleStateNotBetween(Integer value1, Integer value2) {
            addCriterion("NUM_ROLE_STATE not between", value1, value2, "numRoleState");
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