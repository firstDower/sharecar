package com.dower.sharerideapp.core.serverdb.model;

import java.util.ArrayList;
import java.util.List;

public class NntCustomClouthUsersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NntCustomClouthUsersExample() {
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

        public Criteria andNumCustomClouthUserIdIsNull() {
            addCriterion("num_custom_clouth_user_id is null");
            return (Criteria) this;
        }

        public Criteria andNumCustomClouthUserIdIsNotNull() {
            addCriterion("num_custom_clouth_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andNumCustomClouthUserIdEqualTo(Long value) {
            addCriterion("num_custom_clouth_user_id =", value, "numCustomClouthUserId");
            return (Criteria) this;
        }

        public Criteria andNumCustomClouthUserIdNotEqualTo(Long value) {
            addCriterion("num_custom_clouth_user_id <>", value, "numCustomClouthUserId");
            return (Criteria) this;
        }

        public Criteria andNumCustomClouthUserIdGreaterThan(Long value) {
            addCriterion("num_custom_clouth_user_id >", value, "numCustomClouthUserId");
            return (Criteria) this;
        }

        public Criteria andNumCustomClouthUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("num_custom_clouth_user_id >=", value, "numCustomClouthUserId");
            return (Criteria) this;
        }

        public Criteria andNumCustomClouthUserIdLessThan(Long value) {
            addCriterion("num_custom_clouth_user_id <", value, "numCustomClouthUserId");
            return (Criteria) this;
        }

        public Criteria andNumCustomClouthUserIdLessThanOrEqualTo(Long value) {
            addCriterion("num_custom_clouth_user_id <=", value, "numCustomClouthUserId");
            return (Criteria) this;
        }

        public Criteria andNumCustomClouthUserIdIn(List<Long> values) {
            addCriterion("num_custom_clouth_user_id in", values, "numCustomClouthUserId");
            return (Criteria) this;
        }

        public Criteria andNumCustomClouthUserIdNotIn(List<Long> values) {
            addCriterion("num_custom_clouth_user_id not in", values, "numCustomClouthUserId");
            return (Criteria) this;
        }

        public Criteria andNumCustomClouthUserIdBetween(Long value1, Long value2) {
            addCriterion("num_custom_clouth_user_id between", value1, value2, "numCustomClouthUserId");
            return (Criteria) this;
        }

        public Criteria andNumCustomClouthUserIdNotBetween(Long value1, Long value2) {
            addCriterion("num_custom_clouth_user_id not between", value1, value2, "numCustomClouthUserId");
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

        public Criteria andVcCustomNameIsNull() {
            addCriterion("vc_custom_name is null");
            return (Criteria) this;
        }

        public Criteria andVcCustomNameIsNotNull() {
            addCriterion("vc_custom_name is not null");
            return (Criteria) this;
        }

        public Criteria andVcCustomNameEqualTo(String value) {
            addCriterion("vc_custom_name =", value, "vcCustomName");
            return (Criteria) this;
        }

        public Criteria andVcCustomNameNotEqualTo(String value) {
            addCriterion("vc_custom_name <>", value, "vcCustomName");
            return (Criteria) this;
        }

        public Criteria andVcCustomNameGreaterThan(String value) {
            addCriterion("vc_custom_name >", value, "vcCustomName");
            return (Criteria) this;
        }

        public Criteria andVcCustomNameGreaterThanOrEqualTo(String value) {
            addCriterion("vc_custom_name >=", value, "vcCustomName");
            return (Criteria) this;
        }

        public Criteria andVcCustomNameLessThan(String value) {
            addCriterion("vc_custom_name <", value, "vcCustomName");
            return (Criteria) this;
        }

        public Criteria andVcCustomNameLessThanOrEqualTo(String value) {
            addCriterion("vc_custom_name <=", value, "vcCustomName");
            return (Criteria) this;
        }

        public Criteria andVcCustomNameLike(String value) {
            addCriterion("vc_custom_name like", value, "vcCustomName");
            return (Criteria) this;
        }

        public Criteria andVcCustomNameNotLike(String value) {
            addCriterion("vc_custom_name not like", value, "vcCustomName");
            return (Criteria) this;
        }

        public Criteria andVcCustomNameIn(List<String> values) {
            addCriterion("vc_custom_name in", values, "vcCustomName");
            return (Criteria) this;
        }

        public Criteria andVcCustomNameNotIn(List<String> values) {
            addCriterion("vc_custom_name not in", values, "vcCustomName");
            return (Criteria) this;
        }

        public Criteria andVcCustomNameBetween(String value1, String value2) {
            addCriterion("vc_custom_name between", value1, value2, "vcCustomName");
            return (Criteria) this;
        }

        public Criteria andVcCustomNameNotBetween(String value1, String value2) {
            addCriterion("vc_custom_name not between", value1, value2, "vcCustomName");
            return (Criteria) this;
        }

        public Criteria andVcCustomPhoneIsNull() {
            addCriterion("vc_custom_phone is null");
            return (Criteria) this;
        }

        public Criteria andVcCustomPhoneIsNotNull() {
            addCriterion("vc_custom_phone is not null");
            return (Criteria) this;
        }

        public Criteria andVcCustomPhoneEqualTo(String value) {
            addCriterion("vc_custom_phone =", value, "vcCustomPhone");
            return (Criteria) this;
        }

        public Criteria andVcCustomPhoneNotEqualTo(String value) {
            addCriterion("vc_custom_phone <>", value, "vcCustomPhone");
            return (Criteria) this;
        }

        public Criteria andVcCustomPhoneGreaterThan(String value) {
            addCriterion("vc_custom_phone >", value, "vcCustomPhone");
            return (Criteria) this;
        }

        public Criteria andVcCustomPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("vc_custom_phone >=", value, "vcCustomPhone");
            return (Criteria) this;
        }

        public Criteria andVcCustomPhoneLessThan(String value) {
            addCriterion("vc_custom_phone <", value, "vcCustomPhone");
            return (Criteria) this;
        }

        public Criteria andVcCustomPhoneLessThanOrEqualTo(String value) {
            addCriterion("vc_custom_phone <=", value, "vcCustomPhone");
            return (Criteria) this;
        }

        public Criteria andVcCustomPhoneLike(String value) {
            addCriterion("vc_custom_phone like", value, "vcCustomPhone");
            return (Criteria) this;
        }

        public Criteria andVcCustomPhoneNotLike(String value) {
            addCriterion("vc_custom_phone not like", value, "vcCustomPhone");
            return (Criteria) this;
        }

        public Criteria andVcCustomPhoneIn(List<String> values) {
            addCriterion("vc_custom_phone in", values, "vcCustomPhone");
            return (Criteria) this;
        }

        public Criteria andVcCustomPhoneNotIn(List<String> values) {
            addCriterion("vc_custom_phone not in", values, "vcCustomPhone");
            return (Criteria) this;
        }

        public Criteria andVcCustomPhoneBetween(String value1, String value2) {
            addCriterion("vc_custom_phone between", value1, value2, "vcCustomPhone");
            return (Criteria) this;
        }

        public Criteria andVcCustomPhoneNotBetween(String value1, String value2) {
            addCriterion("vc_custom_phone not between", value1, value2, "vcCustomPhone");
            return (Criteria) this;
        }

        public Criteria andVcCustomHightIsNull() {
            addCriterion("vc_custom_hight is null");
            return (Criteria) this;
        }

        public Criteria andVcCustomHightIsNotNull() {
            addCriterion("vc_custom_hight is not null");
            return (Criteria) this;
        }

        public Criteria andVcCustomHightEqualTo(String value) {
            addCriterion("vc_custom_hight =", value, "vcCustomHight");
            return (Criteria) this;
        }

        public Criteria andVcCustomHightNotEqualTo(String value) {
            addCriterion("vc_custom_hight <>", value, "vcCustomHight");
            return (Criteria) this;
        }

        public Criteria andVcCustomHightGreaterThan(String value) {
            addCriterion("vc_custom_hight >", value, "vcCustomHight");
            return (Criteria) this;
        }

        public Criteria andVcCustomHightGreaterThanOrEqualTo(String value) {
            addCriterion("vc_custom_hight >=", value, "vcCustomHight");
            return (Criteria) this;
        }

        public Criteria andVcCustomHightLessThan(String value) {
            addCriterion("vc_custom_hight <", value, "vcCustomHight");
            return (Criteria) this;
        }

        public Criteria andVcCustomHightLessThanOrEqualTo(String value) {
            addCriterion("vc_custom_hight <=", value, "vcCustomHight");
            return (Criteria) this;
        }

        public Criteria andVcCustomHightLike(String value) {
            addCriterion("vc_custom_hight like", value, "vcCustomHight");
            return (Criteria) this;
        }

        public Criteria andVcCustomHightNotLike(String value) {
            addCriterion("vc_custom_hight not like", value, "vcCustomHight");
            return (Criteria) this;
        }

        public Criteria andVcCustomHightIn(List<String> values) {
            addCriterion("vc_custom_hight in", values, "vcCustomHight");
            return (Criteria) this;
        }

        public Criteria andVcCustomHightNotIn(List<String> values) {
            addCriterion("vc_custom_hight not in", values, "vcCustomHight");
            return (Criteria) this;
        }

        public Criteria andVcCustomHightBetween(String value1, String value2) {
            addCriterion("vc_custom_hight between", value1, value2, "vcCustomHight");
            return (Criteria) this;
        }

        public Criteria andVcCustomHightNotBetween(String value1, String value2) {
            addCriterion("vc_custom_hight not between", value1, value2, "vcCustomHight");
            return (Criteria) this;
        }

        public Criteria andVcCustomWightIsNull() {
            addCriterion("vc_custom_wight is null");
            return (Criteria) this;
        }

        public Criteria andVcCustomWightIsNotNull() {
            addCriterion("vc_custom_wight is not null");
            return (Criteria) this;
        }

        public Criteria andVcCustomWightEqualTo(String value) {
            addCriterion("vc_custom_wight =", value, "vcCustomWight");
            return (Criteria) this;
        }

        public Criteria andVcCustomWightNotEqualTo(String value) {
            addCriterion("vc_custom_wight <>", value, "vcCustomWight");
            return (Criteria) this;
        }

        public Criteria andVcCustomWightGreaterThan(String value) {
            addCriterion("vc_custom_wight >", value, "vcCustomWight");
            return (Criteria) this;
        }

        public Criteria andVcCustomWightGreaterThanOrEqualTo(String value) {
            addCriterion("vc_custom_wight >=", value, "vcCustomWight");
            return (Criteria) this;
        }

        public Criteria andVcCustomWightLessThan(String value) {
            addCriterion("vc_custom_wight <", value, "vcCustomWight");
            return (Criteria) this;
        }

        public Criteria andVcCustomWightLessThanOrEqualTo(String value) {
            addCriterion("vc_custom_wight <=", value, "vcCustomWight");
            return (Criteria) this;
        }

        public Criteria andVcCustomWightLike(String value) {
            addCriterion("vc_custom_wight like", value, "vcCustomWight");
            return (Criteria) this;
        }

        public Criteria andVcCustomWightNotLike(String value) {
            addCriterion("vc_custom_wight not like", value, "vcCustomWight");
            return (Criteria) this;
        }

        public Criteria andVcCustomWightIn(List<String> values) {
            addCriterion("vc_custom_wight in", values, "vcCustomWight");
            return (Criteria) this;
        }

        public Criteria andVcCustomWightNotIn(List<String> values) {
            addCriterion("vc_custom_wight not in", values, "vcCustomWight");
            return (Criteria) this;
        }

        public Criteria andVcCustomWightBetween(String value1, String value2) {
            addCriterion("vc_custom_wight between", value1, value2, "vcCustomWight");
            return (Criteria) this;
        }

        public Criteria andVcCustomWightNotBetween(String value1, String value2) {
            addCriterion("vc_custom_wight not between", value1, value2, "vcCustomWight");
            return (Criteria) this;
        }

        public Criteria andNumIsStateIsNull() {
            addCriterion("num_is_state is null");
            return (Criteria) this;
        }

        public Criteria andNumIsStateIsNotNull() {
            addCriterion("num_is_state is not null");
            return (Criteria) this;
        }

        public Criteria andNumIsStateEqualTo(Byte value) {
            addCriterion("num_is_state =", value, "numIsState");
            return (Criteria) this;
        }

        public Criteria andNumIsStateNotEqualTo(Byte value) {
            addCriterion("num_is_state <>", value, "numIsState");
            return (Criteria) this;
        }

        public Criteria andNumIsStateGreaterThan(Byte value) {
            addCriterion("num_is_state >", value, "numIsState");
            return (Criteria) this;
        }

        public Criteria andNumIsStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("num_is_state >=", value, "numIsState");
            return (Criteria) this;
        }

        public Criteria andNumIsStateLessThan(Byte value) {
            addCriterion("num_is_state <", value, "numIsState");
            return (Criteria) this;
        }

        public Criteria andNumIsStateLessThanOrEqualTo(Byte value) {
            addCriterion("num_is_state <=", value, "numIsState");
            return (Criteria) this;
        }

        public Criteria andNumIsStateIn(List<Byte> values) {
            addCriterion("num_is_state in", values, "numIsState");
            return (Criteria) this;
        }

        public Criteria andNumIsStateNotIn(List<Byte> values) {
            addCriterion("num_is_state not in", values, "numIsState");
            return (Criteria) this;
        }

        public Criteria andNumIsStateBetween(Byte value1, Byte value2) {
            addCriterion("num_is_state between", value1, value2, "numIsState");
            return (Criteria) this;
        }

        public Criteria andNumIsStateNotBetween(Byte value1, Byte value2) {
            addCriterion("num_is_state not between", value1, value2, "numIsState");
            return (Criteria) this;
        }

        public Criteria andNumIsDelIsNull() {
            addCriterion("num_is_del is null");
            return (Criteria) this;
        }

        public Criteria andNumIsDelIsNotNull() {
            addCriterion("num_is_del is not null");
            return (Criteria) this;
        }

        public Criteria andNumIsDelEqualTo(Byte value) {
            addCriterion("num_is_del =", value, "numIsDel");
            return (Criteria) this;
        }

        public Criteria andNumIsDelNotEqualTo(Byte value) {
            addCriterion("num_is_del <>", value, "numIsDel");
            return (Criteria) this;
        }

        public Criteria andNumIsDelGreaterThan(Byte value) {
            addCriterion("num_is_del >", value, "numIsDel");
            return (Criteria) this;
        }

        public Criteria andNumIsDelGreaterThanOrEqualTo(Byte value) {
            addCriterion("num_is_del >=", value, "numIsDel");
            return (Criteria) this;
        }

        public Criteria andNumIsDelLessThan(Byte value) {
            addCriterion("num_is_del <", value, "numIsDel");
            return (Criteria) this;
        }

        public Criteria andNumIsDelLessThanOrEqualTo(Byte value) {
            addCriterion("num_is_del <=", value, "numIsDel");
            return (Criteria) this;
        }

        public Criteria andNumIsDelIn(List<Byte> values) {
            addCriterion("num_is_del in", values, "numIsDel");
            return (Criteria) this;
        }

        public Criteria andNumIsDelNotIn(List<Byte> values) {
            addCriterion("num_is_del not in", values, "numIsDel");
            return (Criteria) this;
        }

        public Criteria andNumIsDelBetween(Byte value1, Byte value2) {
            addCriterion("num_is_del between", value1, value2, "numIsDel");
            return (Criteria) this;
        }

        public Criteria andNumIsDelNotBetween(Byte value1, Byte value2) {
            addCriterion("num_is_del not between", value1, value2, "numIsDel");
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