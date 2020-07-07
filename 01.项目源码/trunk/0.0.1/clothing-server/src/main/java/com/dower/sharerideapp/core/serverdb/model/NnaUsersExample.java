package com.dower.sharerideapp.core.serverdb.model;

import java.util.ArrayList;
import java.util.List;

public class NnaUsersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NnaUsersExample() {
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

        public Criteria andVcLoginNameIsNull() {
            addCriterion("VC_LOGIN_NAME is null");
            return (Criteria) this;
        }

        public Criteria andVcLoginNameIsNotNull() {
            addCriterion("VC_LOGIN_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andVcLoginNameEqualTo(String value) {
            addCriterion("VC_LOGIN_NAME =", value, "vcLoginName");
            return (Criteria) this;
        }

        public Criteria andVcLoginNameNotEqualTo(String value) {
            addCriterion("VC_LOGIN_NAME <>", value, "vcLoginName");
            return (Criteria) this;
        }

        public Criteria andVcLoginNameGreaterThan(String value) {
            addCriterion("VC_LOGIN_NAME >", value, "vcLoginName");
            return (Criteria) this;
        }

        public Criteria andVcLoginNameGreaterThanOrEqualTo(String value) {
            addCriterion("VC_LOGIN_NAME >=", value, "vcLoginName");
            return (Criteria) this;
        }

        public Criteria andVcLoginNameLessThan(String value) {
            addCriterion("VC_LOGIN_NAME <", value, "vcLoginName");
            return (Criteria) this;
        }

        public Criteria andVcLoginNameLessThanOrEqualTo(String value) {
            addCriterion("VC_LOGIN_NAME <=", value, "vcLoginName");
            return (Criteria) this;
        }

        public Criteria andVcLoginNameLike(String value) {
            addCriterion("VC_LOGIN_NAME like", value, "vcLoginName");
            return (Criteria) this;
        }

        public Criteria andVcLoginNameNotLike(String value) {
            addCriterion("VC_LOGIN_NAME not like", value, "vcLoginName");
            return (Criteria) this;
        }

        public Criteria andVcLoginNameIn(List<String> values) {
            addCriterion("VC_LOGIN_NAME in", values, "vcLoginName");
            return (Criteria) this;
        }

        public Criteria andVcLoginNameNotIn(List<String> values) {
            addCriterion("VC_LOGIN_NAME not in", values, "vcLoginName");
            return (Criteria) this;
        }

        public Criteria andVcLoginNameBetween(String value1, String value2) {
            addCriterion("VC_LOGIN_NAME between", value1, value2, "vcLoginName");
            return (Criteria) this;
        }

        public Criteria andVcLoginNameNotBetween(String value1, String value2) {
            addCriterion("VC_LOGIN_NAME not between", value1, value2, "vcLoginName");
            return (Criteria) this;
        }

        public Criteria andVcPhoneIsNull() {
            addCriterion("VC_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andVcPhoneIsNotNull() {
            addCriterion("VC_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andVcPhoneEqualTo(String value) {
            addCriterion("VC_PHONE =", value, "vcPhone");
            return (Criteria) this;
        }

        public Criteria andVcPhoneNotEqualTo(String value) {
            addCriterion("VC_PHONE <>", value, "vcPhone");
            return (Criteria) this;
        }

        public Criteria andVcPhoneGreaterThan(String value) {
            addCriterion("VC_PHONE >", value, "vcPhone");
            return (Criteria) this;
        }

        public Criteria andVcPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("VC_PHONE >=", value, "vcPhone");
            return (Criteria) this;
        }

        public Criteria andVcPhoneLessThan(String value) {
            addCriterion("VC_PHONE <", value, "vcPhone");
            return (Criteria) this;
        }

        public Criteria andVcPhoneLessThanOrEqualTo(String value) {
            addCriterion("VC_PHONE <=", value, "vcPhone");
            return (Criteria) this;
        }

        public Criteria andVcPhoneLike(String value) {
            addCriterion("VC_PHONE like", value, "vcPhone");
            return (Criteria) this;
        }

        public Criteria andVcPhoneNotLike(String value) {
            addCriterion("VC_PHONE not like", value, "vcPhone");
            return (Criteria) this;
        }

        public Criteria andVcPhoneIn(List<String> values) {
            addCriterion("VC_PHONE in", values, "vcPhone");
            return (Criteria) this;
        }

        public Criteria andVcPhoneNotIn(List<String> values) {
            addCriterion("VC_PHONE not in", values, "vcPhone");
            return (Criteria) this;
        }

        public Criteria andVcPhoneBetween(String value1, String value2) {
            addCriterion("VC_PHONE between", value1, value2, "vcPhone");
            return (Criteria) this;
        }

        public Criteria andVcPhoneNotBetween(String value1, String value2) {
            addCriterion("VC_PHONE not between", value1, value2, "vcPhone");
            return (Criteria) this;
        }

        public Criteria andVcEmailIsNull() {
            addCriterion("VC_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andVcEmailIsNotNull() {
            addCriterion("VC_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andVcEmailEqualTo(String value) {
            addCriterion("VC_EMAIL =", value, "vcEmail");
            return (Criteria) this;
        }

        public Criteria andVcEmailNotEqualTo(String value) {
            addCriterion("VC_EMAIL <>", value, "vcEmail");
            return (Criteria) this;
        }

        public Criteria andVcEmailGreaterThan(String value) {
            addCriterion("VC_EMAIL >", value, "vcEmail");
            return (Criteria) this;
        }

        public Criteria andVcEmailGreaterThanOrEqualTo(String value) {
            addCriterion("VC_EMAIL >=", value, "vcEmail");
            return (Criteria) this;
        }

        public Criteria andVcEmailLessThan(String value) {
            addCriterion("VC_EMAIL <", value, "vcEmail");
            return (Criteria) this;
        }

        public Criteria andVcEmailLessThanOrEqualTo(String value) {
            addCriterion("VC_EMAIL <=", value, "vcEmail");
            return (Criteria) this;
        }

        public Criteria andVcEmailLike(String value) {
            addCriterion("VC_EMAIL like", value, "vcEmail");
            return (Criteria) this;
        }

        public Criteria andVcEmailNotLike(String value) {
            addCriterion("VC_EMAIL not like", value, "vcEmail");
            return (Criteria) this;
        }

        public Criteria andVcEmailIn(List<String> values) {
            addCriterion("VC_EMAIL in", values, "vcEmail");
            return (Criteria) this;
        }

        public Criteria andVcEmailNotIn(List<String> values) {
            addCriterion("VC_EMAIL not in", values, "vcEmail");
            return (Criteria) this;
        }

        public Criteria andVcEmailBetween(String value1, String value2) {
            addCriterion("VC_EMAIL between", value1, value2, "vcEmail");
            return (Criteria) this;
        }

        public Criteria andVcEmailNotBetween(String value1, String value2) {
            addCriterion("VC_EMAIL not between", value1, value2, "vcEmail");
            return (Criteria) this;
        }

        public Criteria andVcPasswordIsNull() {
            addCriterion("VC_PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andVcPasswordIsNotNull() {
            addCriterion("VC_PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andVcPasswordEqualTo(String value) {
            addCriterion("VC_PASSWORD =", value, "vcPassword");
            return (Criteria) this;
        }

        public Criteria andVcPasswordNotEqualTo(String value) {
            addCriterion("VC_PASSWORD <>", value, "vcPassword");
            return (Criteria) this;
        }

        public Criteria andVcPasswordGreaterThan(String value) {
            addCriterion("VC_PASSWORD >", value, "vcPassword");
            return (Criteria) this;
        }

        public Criteria andVcPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("VC_PASSWORD >=", value, "vcPassword");
            return (Criteria) this;
        }

        public Criteria andVcPasswordLessThan(String value) {
            addCriterion("VC_PASSWORD <", value, "vcPassword");
            return (Criteria) this;
        }

        public Criteria andVcPasswordLessThanOrEqualTo(String value) {
            addCriterion("VC_PASSWORD <=", value, "vcPassword");
            return (Criteria) this;
        }

        public Criteria andVcPasswordLike(String value) {
            addCriterion("VC_PASSWORD like", value, "vcPassword");
            return (Criteria) this;
        }

        public Criteria andVcPasswordNotLike(String value) {
            addCriterion("VC_PASSWORD not like", value, "vcPassword");
            return (Criteria) this;
        }

        public Criteria andVcPasswordIn(List<String> values) {
            addCriterion("VC_PASSWORD in", values, "vcPassword");
            return (Criteria) this;
        }

        public Criteria andVcPasswordNotIn(List<String> values) {
            addCriterion("VC_PASSWORD not in", values, "vcPassword");
            return (Criteria) this;
        }

        public Criteria andVcPasswordBetween(String value1, String value2) {
            addCriterion("VC_PASSWORD between", value1, value2, "vcPassword");
            return (Criteria) this;
        }

        public Criteria andVcPasswordNotBetween(String value1, String value2) {
            addCriterion("VC_PASSWORD not between", value1, value2, "vcPassword");
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

        public Criteria andVcDescIsNull() {
            addCriterion("VC_DESC is null");
            return (Criteria) this;
        }

        public Criteria andVcDescIsNotNull() {
            addCriterion("VC_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andVcDescEqualTo(String value) {
            addCriterion("VC_DESC =", value, "vcDesc");
            return (Criteria) this;
        }

        public Criteria andVcDescNotEqualTo(String value) {
            addCriterion("VC_DESC <>", value, "vcDesc");
            return (Criteria) this;
        }

        public Criteria andVcDescGreaterThan(String value) {
            addCriterion("VC_DESC >", value, "vcDesc");
            return (Criteria) this;
        }

        public Criteria andVcDescGreaterThanOrEqualTo(String value) {
            addCriterion("VC_DESC >=", value, "vcDesc");
            return (Criteria) this;
        }

        public Criteria andVcDescLessThan(String value) {
            addCriterion("VC_DESC <", value, "vcDesc");
            return (Criteria) this;
        }

        public Criteria andVcDescLessThanOrEqualTo(String value) {
            addCriterion("VC_DESC <=", value, "vcDesc");
            return (Criteria) this;
        }

        public Criteria andVcDescLike(String value) {
            addCriterion("VC_DESC like", value, "vcDesc");
            return (Criteria) this;
        }

        public Criteria andVcDescNotLike(String value) {
            addCriterion("VC_DESC not like", value, "vcDesc");
            return (Criteria) this;
        }

        public Criteria andVcDescIn(List<String> values) {
            addCriterion("VC_DESC in", values, "vcDesc");
            return (Criteria) this;
        }

        public Criteria andVcDescNotIn(List<String> values) {
            addCriterion("VC_DESC not in", values, "vcDesc");
            return (Criteria) this;
        }

        public Criteria andVcDescBetween(String value1, String value2) {
            addCriterion("VC_DESC between", value1, value2, "vcDesc");
            return (Criteria) this;
        }

        public Criteria andVcDescNotBetween(String value1, String value2) {
            addCriterion("VC_DESC not between", value1, value2, "vcDesc");
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