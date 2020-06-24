package com.dower.sharerideapp.core.serverdb.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ClProductExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ClProductExample() {
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

        public Criteria andVcHightIsNull() {
            addCriterion("VC_HIGHT is null");
            return (Criteria) this;
        }

        public Criteria andVcHightIsNotNull() {
            addCriterion("VC_HIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andVcHightEqualTo(String value) {
            addCriterion("VC_HIGHT =", value, "vcHight");
            return (Criteria) this;
        }

        public Criteria andVcHightNotEqualTo(String value) {
            addCriterion("VC_HIGHT <>", value, "vcHight");
            return (Criteria) this;
        }

        public Criteria andVcHightGreaterThan(String value) {
            addCriterion("VC_HIGHT >", value, "vcHight");
            return (Criteria) this;
        }

        public Criteria andVcHightGreaterThanOrEqualTo(String value) {
            addCriterion("VC_HIGHT >=", value, "vcHight");
            return (Criteria) this;
        }

        public Criteria andVcHightLessThan(String value) {
            addCriterion("VC_HIGHT <", value, "vcHight");
            return (Criteria) this;
        }

        public Criteria andVcHightLessThanOrEqualTo(String value) {
            addCriterion("VC_HIGHT <=", value, "vcHight");
            return (Criteria) this;
        }

        public Criteria andVcHightLike(String value) {
            addCriterion("VC_HIGHT like", value, "vcHight");
            return (Criteria) this;
        }

        public Criteria andVcHightNotLike(String value) {
            addCriterion("VC_HIGHT not like", value, "vcHight");
            return (Criteria) this;
        }

        public Criteria andVcHightIn(List<String> values) {
            addCriterion("VC_HIGHT in", values, "vcHight");
            return (Criteria) this;
        }

        public Criteria andVcHightNotIn(List<String> values) {
            addCriterion("VC_HIGHT not in", values, "vcHight");
            return (Criteria) this;
        }

        public Criteria andVcHightBetween(String value1, String value2) {
            addCriterion("VC_HIGHT between", value1, value2, "vcHight");
            return (Criteria) this;
        }

        public Criteria andVcHightNotBetween(String value1, String value2) {
            addCriterion("VC_HIGHT not between", value1, value2, "vcHight");
            return (Criteria) this;
        }

        public Criteria andVcWightIsNull() {
            addCriterion("VC_WIGHT is null");
            return (Criteria) this;
        }

        public Criteria andVcWightIsNotNull() {
            addCriterion("VC_WIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andVcWightEqualTo(String value) {
            addCriterion("VC_WIGHT =", value, "vcWight");
            return (Criteria) this;
        }

        public Criteria andVcWightNotEqualTo(String value) {
            addCriterion("VC_WIGHT <>", value, "vcWight");
            return (Criteria) this;
        }

        public Criteria andVcWightGreaterThan(String value) {
            addCriterion("VC_WIGHT >", value, "vcWight");
            return (Criteria) this;
        }

        public Criteria andVcWightGreaterThanOrEqualTo(String value) {
            addCriterion("VC_WIGHT >=", value, "vcWight");
            return (Criteria) this;
        }

        public Criteria andVcWightLessThan(String value) {
            addCriterion("VC_WIGHT <", value, "vcWight");
            return (Criteria) this;
        }

        public Criteria andVcWightLessThanOrEqualTo(String value) {
            addCriterion("VC_WIGHT <=", value, "vcWight");
            return (Criteria) this;
        }

        public Criteria andVcWightLike(String value) {
            addCriterion("VC_WIGHT like", value, "vcWight");
            return (Criteria) this;
        }

        public Criteria andVcWightNotLike(String value) {
            addCriterion("VC_WIGHT not like", value, "vcWight");
            return (Criteria) this;
        }

        public Criteria andVcWightIn(List<String> values) {
            addCriterion("VC_WIGHT in", values, "vcWight");
            return (Criteria) this;
        }

        public Criteria andVcWightNotIn(List<String> values) {
            addCriterion("VC_WIGHT not in", values, "vcWight");
            return (Criteria) this;
        }

        public Criteria andVcWightBetween(String value1, String value2) {
            addCriterion("VC_WIGHT between", value1, value2, "vcWight");
            return (Criteria) this;
        }

        public Criteria andVcWightNotBetween(String value1, String value2) {
            addCriterion("VC_WIGHT not between", value1, value2, "vcWight");
            return (Criteria) this;
        }

        public Criteria andVcNameIsNull() {
            addCriterion("VC_NAME is null");
            return (Criteria) this;
        }

        public Criteria andVcNameIsNotNull() {
            addCriterion("VC_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andVcNameEqualTo(String value) {
            addCriterion("VC_NAME =", value, "vcName");
            return (Criteria) this;
        }

        public Criteria andVcNameNotEqualTo(String value) {
            addCriterion("VC_NAME <>", value, "vcName");
            return (Criteria) this;
        }

        public Criteria andVcNameGreaterThan(String value) {
            addCriterion("VC_NAME >", value, "vcName");
            return (Criteria) this;
        }

        public Criteria andVcNameGreaterThanOrEqualTo(String value) {
            addCriterion("VC_NAME >=", value, "vcName");
            return (Criteria) this;
        }

        public Criteria andVcNameLessThan(String value) {
            addCriterion("VC_NAME <", value, "vcName");
            return (Criteria) this;
        }

        public Criteria andVcNameLessThanOrEqualTo(String value) {
            addCriterion("VC_NAME <=", value, "vcName");
            return (Criteria) this;
        }

        public Criteria andVcNameLike(String value) {
            addCriterion("VC_NAME like", value, "vcName");
            return (Criteria) this;
        }

        public Criteria andVcNameNotLike(String value) {
            addCriterion("VC_NAME not like", value, "vcName");
            return (Criteria) this;
        }

        public Criteria andVcNameIn(List<String> values) {
            addCriterion("VC_NAME in", values, "vcName");
            return (Criteria) this;
        }

        public Criteria andVcNameNotIn(List<String> values) {
            addCriterion("VC_NAME not in", values, "vcName");
            return (Criteria) this;
        }

        public Criteria andVcNameBetween(String value1, String value2) {
            addCriterion("VC_NAME between", value1, value2, "vcName");
            return (Criteria) this;
        }

        public Criteria andVcNameNotBetween(String value1, String value2) {
            addCriterion("VC_NAME not between", value1, value2, "vcName");
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

        public Criteria andNumTypeIsNull() {
            addCriterion("NUM_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andNumTypeIsNotNull() {
            addCriterion("NUM_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andNumTypeEqualTo(Byte value) {
            addCriterion("NUM_TYPE =", value, "numType");
            return (Criteria) this;
        }

        public Criteria andNumTypeNotEqualTo(Byte value) {
            addCriterion("NUM_TYPE <>", value, "numType");
            return (Criteria) this;
        }

        public Criteria andNumTypeGreaterThan(Byte value) {
            addCriterion("NUM_TYPE >", value, "numType");
            return (Criteria) this;
        }

        public Criteria andNumTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("NUM_TYPE >=", value, "numType");
            return (Criteria) this;
        }

        public Criteria andNumTypeLessThan(Byte value) {
            addCriterion("NUM_TYPE <", value, "numType");
            return (Criteria) this;
        }

        public Criteria andNumTypeLessThanOrEqualTo(Byte value) {
            addCriterion("NUM_TYPE <=", value, "numType");
            return (Criteria) this;
        }

        public Criteria andNumTypeIn(List<Byte> values) {
            addCriterion("NUM_TYPE in", values, "numType");
            return (Criteria) this;
        }

        public Criteria andNumTypeNotIn(List<Byte> values) {
            addCriterion("NUM_TYPE not in", values, "numType");
            return (Criteria) this;
        }

        public Criteria andNumTypeBetween(Byte value1, Byte value2) {
            addCriterion("NUM_TYPE between", value1, value2, "numType");
            return (Criteria) this;
        }

        public Criteria andNumTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("NUM_TYPE not between", value1, value2, "numType");
            return (Criteria) this;
        }

        public Criteria andNumNumIsNull() {
            addCriterion("NUM_NUM is null");
            return (Criteria) this;
        }

        public Criteria andNumNumIsNotNull() {
            addCriterion("NUM_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andNumNumEqualTo(Byte value) {
            addCriterion("NUM_NUM =", value, "numNum");
            return (Criteria) this;
        }

        public Criteria andNumNumNotEqualTo(Byte value) {
            addCriterion("NUM_NUM <>", value, "numNum");
            return (Criteria) this;
        }

        public Criteria andNumNumGreaterThan(Byte value) {
            addCriterion("NUM_NUM >", value, "numNum");
            return (Criteria) this;
        }

        public Criteria andNumNumGreaterThanOrEqualTo(Byte value) {
            addCriterion("NUM_NUM >=", value, "numNum");
            return (Criteria) this;
        }

        public Criteria andNumNumLessThan(Byte value) {
            addCriterion("NUM_NUM <", value, "numNum");
            return (Criteria) this;
        }

        public Criteria andNumNumLessThanOrEqualTo(Byte value) {
            addCriterion("NUM_NUM <=", value, "numNum");
            return (Criteria) this;
        }

        public Criteria andNumNumIn(List<Byte> values) {
            addCriterion("NUM_NUM in", values, "numNum");
            return (Criteria) this;
        }

        public Criteria andNumNumNotIn(List<Byte> values) {
            addCriterion("NUM_NUM not in", values, "numNum");
            return (Criteria) this;
        }

        public Criteria andNumNumBetween(Byte value1, Byte value2) {
            addCriterion("NUM_NUM between", value1, value2, "numNum");
            return (Criteria) this;
        }

        public Criteria andNumNumNotBetween(Byte value1, Byte value2) {
            addCriterion("NUM_NUM not between", value1, value2, "numNum");
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

        public Criteria andDatUpdateTimeIsNull() {
            addCriterion("DAT_UPDATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDatUpdateTimeIsNotNull() {
            addCriterion("DAT_UPDATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDatUpdateTimeEqualTo(Date value) {
            addCriterion("DAT_UPDATE_TIME =", value, "datUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDatUpdateTimeNotEqualTo(Date value) {
            addCriterion("DAT_UPDATE_TIME <>", value, "datUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDatUpdateTimeGreaterThan(Date value) {
            addCriterion("DAT_UPDATE_TIME >", value, "datUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDatUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("DAT_UPDATE_TIME >=", value, "datUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDatUpdateTimeLessThan(Date value) {
            addCriterion("DAT_UPDATE_TIME <", value, "datUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDatUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("DAT_UPDATE_TIME <=", value, "datUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDatUpdateTimeIn(List<Date> values) {
            addCriterion("DAT_UPDATE_TIME in", values, "datUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDatUpdateTimeNotIn(List<Date> values) {
            addCriterion("DAT_UPDATE_TIME not in", values, "datUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDatUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("DAT_UPDATE_TIME between", value1, value2, "datUpdateTime");
            return (Criteria) this;
        }

        public Criteria andDatUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("DAT_UPDATE_TIME not between", value1, value2, "datUpdateTime");
            return (Criteria) this;
        }

        public Criteria andNumPriceIsNull() {
            addCriterion("NUM_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andNumPriceIsNotNull() {
            addCriterion("NUM_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andNumPriceEqualTo(BigDecimal value) {
            addCriterion("NUM_PRICE =", value, "numPrice");
            return (Criteria) this;
        }

        public Criteria andNumPriceNotEqualTo(BigDecimal value) {
            addCriterion("NUM_PRICE <>", value, "numPrice");
            return (Criteria) this;
        }

        public Criteria andNumPriceGreaterThan(BigDecimal value) {
            addCriterion("NUM_PRICE >", value, "numPrice");
            return (Criteria) this;
        }

        public Criteria andNumPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NUM_PRICE >=", value, "numPrice");
            return (Criteria) this;
        }

        public Criteria andNumPriceLessThan(BigDecimal value) {
            addCriterion("NUM_PRICE <", value, "numPrice");
            return (Criteria) this;
        }

        public Criteria andNumPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NUM_PRICE <=", value, "numPrice");
            return (Criteria) this;
        }

        public Criteria andNumPriceIn(List<BigDecimal> values) {
            addCriterion("NUM_PRICE in", values, "numPrice");
            return (Criteria) this;
        }

        public Criteria andNumPriceNotIn(List<BigDecimal> values) {
            addCriterion("NUM_PRICE not in", values, "numPrice");
            return (Criteria) this;
        }

        public Criteria andNumPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NUM_PRICE between", value1, value2, "numPrice");
            return (Criteria) this;
        }

        public Criteria andNumPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NUM_PRICE not between", value1, value2, "numPrice");
            return (Criteria) this;
        }

        public Criteria andVcUserIdIsNull() {
            addCriterion("VC_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andVcUserIdIsNotNull() {
            addCriterion("VC_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andVcUserIdEqualTo(String value) {
            addCriterion("VC_USER_ID =", value, "vcUserId");
            return (Criteria) this;
        }

        public Criteria andVcUserIdNotEqualTo(String value) {
            addCriterion("VC_USER_ID <>", value, "vcUserId");
            return (Criteria) this;
        }

        public Criteria andVcUserIdGreaterThan(String value) {
            addCriterion("VC_USER_ID >", value, "vcUserId");
            return (Criteria) this;
        }

        public Criteria andVcUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("VC_USER_ID >=", value, "vcUserId");
            return (Criteria) this;
        }

        public Criteria andVcUserIdLessThan(String value) {
            addCriterion("VC_USER_ID <", value, "vcUserId");
            return (Criteria) this;
        }

        public Criteria andVcUserIdLessThanOrEqualTo(String value) {
            addCriterion("VC_USER_ID <=", value, "vcUserId");
            return (Criteria) this;
        }

        public Criteria andVcUserIdLike(String value) {
            addCriterion("VC_USER_ID like", value, "vcUserId");
            return (Criteria) this;
        }

        public Criteria andVcUserIdNotLike(String value) {
            addCriterion("VC_USER_ID not like", value, "vcUserId");
            return (Criteria) this;
        }

        public Criteria andVcUserIdIn(List<String> values) {
            addCriterion("VC_USER_ID in", values, "vcUserId");
            return (Criteria) this;
        }

        public Criteria andVcUserIdNotIn(List<String> values) {
            addCriterion("VC_USER_ID not in", values, "vcUserId");
            return (Criteria) this;
        }

        public Criteria andVcUserIdBetween(String value1, String value2) {
            addCriterion("VC_USER_ID between", value1, value2, "vcUserId");
            return (Criteria) this;
        }

        public Criteria andVcUserIdNotBetween(String value1, String value2) {
            addCriterion("VC_USER_ID not between", value1, value2, "vcUserId");
            return (Criteria) this;
        }

        public Criteria andVcOpenIdIsNull() {
            addCriterion("VC_OPEN_ID is null");
            return (Criteria) this;
        }

        public Criteria andVcOpenIdIsNotNull() {
            addCriterion("VC_OPEN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andVcOpenIdEqualTo(String value) {
            addCriterion("VC_OPEN_ID =", value, "vcOpenId");
            return (Criteria) this;
        }

        public Criteria andVcOpenIdNotEqualTo(String value) {
            addCriterion("VC_OPEN_ID <>", value, "vcOpenId");
            return (Criteria) this;
        }

        public Criteria andVcOpenIdGreaterThan(String value) {
            addCriterion("VC_OPEN_ID >", value, "vcOpenId");
            return (Criteria) this;
        }

        public Criteria andVcOpenIdGreaterThanOrEqualTo(String value) {
            addCriterion("VC_OPEN_ID >=", value, "vcOpenId");
            return (Criteria) this;
        }

        public Criteria andVcOpenIdLessThan(String value) {
            addCriterion("VC_OPEN_ID <", value, "vcOpenId");
            return (Criteria) this;
        }

        public Criteria andVcOpenIdLessThanOrEqualTo(String value) {
            addCriterion("VC_OPEN_ID <=", value, "vcOpenId");
            return (Criteria) this;
        }

        public Criteria andVcOpenIdLike(String value) {
            addCriterion("VC_OPEN_ID like", value, "vcOpenId");
            return (Criteria) this;
        }

        public Criteria andVcOpenIdNotLike(String value) {
            addCriterion("VC_OPEN_ID not like", value, "vcOpenId");
            return (Criteria) this;
        }

        public Criteria andVcOpenIdIn(List<String> values) {
            addCriterion("VC_OPEN_ID in", values, "vcOpenId");
            return (Criteria) this;
        }

        public Criteria andVcOpenIdNotIn(List<String> values) {
            addCriterion("VC_OPEN_ID not in", values, "vcOpenId");
            return (Criteria) this;
        }

        public Criteria andVcOpenIdBetween(String value1, String value2) {
            addCriterion("VC_OPEN_ID between", value1, value2, "vcOpenId");
            return (Criteria) this;
        }

        public Criteria andVcOpenIdNotBetween(String value1, String value2) {
            addCriterion("VC_OPEN_ID not between", value1, value2, "vcOpenId");
            return (Criteria) this;
        }

        public Criteria andDatConfirmTimeIsNull() {
            addCriterion("DAT_CONFIRM_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDatConfirmTimeIsNotNull() {
            addCriterion("DAT_CONFIRM_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDatConfirmTimeEqualTo(Date value) {
            addCriterion("DAT_CONFIRM_TIME =", value, "datConfirmTime");
            return (Criteria) this;
        }

        public Criteria andDatConfirmTimeNotEqualTo(Date value) {
            addCriterion("DAT_CONFIRM_TIME <>", value, "datConfirmTime");
            return (Criteria) this;
        }

        public Criteria andDatConfirmTimeGreaterThan(Date value) {
            addCriterion("DAT_CONFIRM_TIME >", value, "datConfirmTime");
            return (Criteria) this;
        }

        public Criteria andDatConfirmTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("DAT_CONFIRM_TIME >=", value, "datConfirmTime");
            return (Criteria) this;
        }

        public Criteria andDatConfirmTimeLessThan(Date value) {
            addCriterion("DAT_CONFIRM_TIME <", value, "datConfirmTime");
            return (Criteria) this;
        }

        public Criteria andDatConfirmTimeLessThanOrEqualTo(Date value) {
            addCriterion("DAT_CONFIRM_TIME <=", value, "datConfirmTime");
            return (Criteria) this;
        }

        public Criteria andDatConfirmTimeIn(List<Date> values) {
            addCriterion("DAT_CONFIRM_TIME in", values, "datConfirmTime");
            return (Criteria) this;
        }

        public Criteria andDatConfirmTimeNotIn(List<Date> values) {
            addCriterion("DAT_CONFIRM_TIME not in", values, "datConfirmTime");
            return (Criteria) this;
        }

        public Criteria andDatConfirmTimeBetween(Date value1, Date value2) {
            addCriterion("DAT_CONFIRM_TIME between", value1, value2, "datConfirmTime");
            return (Criteria) this;
        }

        public Criteria andDatConfirmTimeNotBetween(Date value1, Date value2) {
            addCriterion("DAT_CONFIRM_TIME not between", value1, value2, "datConfirmTime");
            return (Criteria) this;
        }

        public Criteria andVcNotesIsNull() {
            addCriterion("VC_NOTES is null");
            return (Criteria) this;
        }

        public Criteria andVcNotesIsNotNull() {
            addCriterion("VC_NOTES is not null");
            return (Criteria) this;
        }

        public Criteria andVcNotesEqualTo(String value) {
            addCriterion("VC_NOTES =", value, "vcNotes");
            return (Criteria) this;
        }

        public Criteria andVcNotesNotEqualTo(String value) {
            addCriterion("VC_NOTES <>", value, "vcNotes");
            return (Criteria) this;
        }

        public Criteria andVcNotesGreaterThan(String value) {
            addCriterion("VC_NOTES >", value, "vcNotes");
            return (Criteria) this;
        }

        public Criteria andVcNotesGreaterThanOrEqualTo(String value) {
            addCriterion("VC_NOTES >=", value, "vcNotes");
            return (Criteria) this;
        }

        public Criteria andVcNotesLessThan(String value) {
            addCriterion("VC_NOTES <", value, "vcNotes");
            return (Criteria) this;
        }

        public Criteria andVcNotesLessThanOrEqualTo(String value) {
            addCriterion("VC_NOTES <=", value, "vcNotes");
            return (Criteria) this;
        }

        public Criteria andVcNotesLike(String value) {
            addCriterion("VC_NOTES like", value, "vcNotes");
            return (Criteria) this;
        }

        public Criteria andVcNotesNotLike(String value) {
            addCriterion("VC_NOTES not like", value, "vcNotes");
            return (Criteria) this;
        }

        public Criteria andVcNotesIn(List<String> values) {
            addCriterion("VC_NOTES in", values, "vcNotes");
            return (Criteria) this;
        }

        public Criteria andVcNotesNotIn(List<String> values) {
            addCriterion("VC_NOTES not in", values, "vcNotes");
            return (Criteria) this;
        }

        public Criteria andVcNotesBetween(String value1, String value2) {
            addCriterion("VC_NOTES between", value1, value2, "vcNotes");
            return (Criteria) this;
        }

        public Criteria andVcNotesNotBetween(String value1, String value2) {
            addCriterion("VC_NOTES not between", value1, value2, "vcNotes");
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