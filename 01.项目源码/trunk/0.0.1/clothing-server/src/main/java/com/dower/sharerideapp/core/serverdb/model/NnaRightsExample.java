package com.dower.sharerideapp.core.serverdb.model;

import java.util.ArrayList;
import java.util.List;

public class NnaRightsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NnaRightsExample() {
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

        public Criteria andVcRightRuleIsNull() {
            addCriterion("VC_RIGHT_RULE is null");
            return (Criteria) this;
        }

        public Criteria andVcRightRuleIsNotNull() {
            addCriterion("VC_RIGHT_RULE is not null");
            return (Criteria) this;
        }

        public Criteria andVcRightRuleEqualTo(String value) {
            addCriterion("VC_RIGHT_RULE =", value, "vcRightRule");
            return (Criteria) this;
        }

        public Criteria andVcRightRuleNotEqualTo(String value) {
            addCriterion("VC_RIGHT_RULE <>", value, "vcRightRule");
            return (Criteria) this;
        }

        public Criteria andVcRightRuleGreaterThan(String value) {
            addCriterion("VC_RIGHT_RULE >", value, "vcRightRule");
            return (Criteria) this;
        }

        public Criteria andVcRightRuleGreaterThanOrEqualTo(String value) {
            addCriterion("VC_RIGHT_RULE >=", value, "vcRightRule");
            return (Criteria) this;
        }

        public Criteria andVcRightRuleLessThan(String value) {
            addCriterion("VC_RIGHT_RULE <", value, "vcRightRule");
            return (Criteria) this;
        }

        public Criteria andVcRightRuleLessThanOrEqualTo(String value) {
            addCriterion("VC_RIGHT_RULE <=", value, "vcRightRule");
            return (Criteria) this;
        }

        public Criteria andVcRightRuleLike(String value) {
            addCriterion("VC_RIGHT_RULE like", value, "vcRightRule");
            return (Criteria) this;
        }

        public Criteria andVcRightRuleNotLike(String value) {
            addCriterion("VC_RIGHT_RULE not like", value, "vcRightRule");
            return (Criteria) this;
        }

        public Criteria andVcRightRuleIn(List<String> values) {
            addCriterion("VC_RIGHT_RULE in", values, "vcRightRule");
            return (Criteria) this;
        }

        public Criteria andVcRightRuleNotIn(List<String> values) {
            addCriterion("VC_RIGHT_RULE not in", values, "vcRightRule");
            return (Criteria) this;
        }

        public Criteria andVcRightRuleBetween(String value1, String value2) {
            addCriterion("VC_RIGHT_RULE between", value1, value2, "vcRightRule");
            return (Criteria) this;
        }

        public Criteria andVcRightRuleNotBetween(String value1, String value2) {
            addCriterion("VC_RIGHT_RULE not between", value1, value2, "vcRightRule");
            return (Criteria) this;
        }

        public Criteria andVcRightNameIsNull() {
            addCriterion("VC_RIGHT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andVcRightNameIsNotNull() {
            addCriterion("VC_RIGHT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andVcRightNameEqualTo(String value) {
            addCriterion("VC_RIGHT_NAME =", value, "vcRightName");
            return (Criteria) this;
        }

        public Criteria andVcRightNameNotEqualTo(String value) {
            addCriterion("VC_RIGHT_NAME <>", value, "vcRightName");
            return (Criteria) this;
        }

        public Criteria andVcRightNameGreaterThan(String value) {
            addCriterion("VC_RIGHT_NAME >", value, "vcRightName");
            return (Criteria) this;
        }

        public Criteria andVcRightNameGreaterThanOrEqualTo(String value) {
            addCriterion("VC_RIGHT_NAME >=", value, "vcRightName");
            return (Criteria) this;
        }

        public Criteria andVcRightNameLessThan(String value) {
            addCriterion("VC_RIGHT_NAME <", value, "vcRightName");
            return (Criteria) this;
        }

        public Criteria andVcRightNameLessThanOrEqualTo(String value) {
            addCriterion("VC_RIGHT_NAME <=", value, "vcRightName");
            return (Criteria) this;
        }

        public Criteria andVcRightNameLike(String value) {
            addCriterion("VC_RIGHT_NAME like", value, "vcRightName");
            return (Criteria) this;
        }

        public Criteria andVcRightNameNotLike(String value) {
            addCriterion("VC_RIGHT_NAME not like", value, "vcRightName");
            return (Criteria) this;
        }

        public Criteria andVcRightNameIn(List<String> values) {
            addCriterion("VC_RIGHT_NAME in", values, "vcRightName");
            return (Criteria) this;
        }

        public Criteria andVcRightNameNotIn(List<String> values) {
            addCriterion("VC_RIGHT_NAME not in", values, "vcRightName");
            return (Criteria) this;
        }

        public Criteria andVcRightNameBetween(String value1, String value2) {
            addCriterion("VC_RIGHT_NAME between", value1, value2, "vcRightName");
            return (Criteria) this;
        }

        public Criteria andVcRightNameNotBetween(String value1, String value2) {
            addCriterion("VC_RIGHT_NAME not between", value1, value2, "vcRightName");
            return (Criteria) this;
        }

        public Criteria andVcRightPidIsNull() {
            addCriterion("VC_RIGHT_PID is null");
            return (Criteria) this;
        }

        public Criteria andVcRightPidIsNotNull() {
            addCriterion("VC_RIGHT_PID is not null");
            return (Criteria) this;
        }

        public Criteria andVcRightPidEqualTo(Integer value) {
            addCriterion("VC_RIGHT_PID =", value, "vcRightPid");
            return (Criteria) this;
        }

        public Criteria andVcRightPidNotEqualTo(Integer value) {
            addCriterion("VC_RIGHT_PID <>", value, "vcRightPid");
            return (Criteria) this;
        }

        public Criteria andVcRightPidGreaterThan(Integer value) {
            addCriterion("VC_RIGHT_PID >", value, "vcRightPid");
            return (Criteria) this;
        }

        public Criteria andVcRightPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("VC_RIGHT_PID >=", value, "vcRightPid");
            return (Criteria) this;
        }

        public Criteria andVcRightPidLessThan(Integer value) {
            addCriterion("VC_RIGHT_PID <", value, "vcRightPid");
            return (Criteria) this;
        }

        public Criteria andVcRightPidLessThanOrEqualTo(Integer value) {
            addCriterion("VC_RIGHT_PID <=", value, "vcRightPid");
            return (Criteria) this;
        }

        public Criteria andVcRightPidIn(List<Integer> values) {
            addCriterion("VC_RIGHT_PID in", values, "vcRightPid");
            return (Criteria) this;
        }

        public Criteria andVcRightPidNotIn(List<Integer> values) {
            addCriterion("VC_RIGHT_PID not in", values, "vcRightPid");
            return (Criteria) this;
        }

        public Criteria andVcRightPidBetween(Integer value1, Integer value2) {
            addCriterion("VC_RIGHT_PID between", value1, value2, "vcRightPid");
            return (Criteria) this;
        }

        public Criteria andVcRightPidNotBetween(Integer value1, Integer value2) {
            addCriterion("VC_RIGHT_PID not between", value1, value2, "vcRightPid");
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