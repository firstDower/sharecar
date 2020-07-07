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

        public Criteria andNumSchoolIdIsNull() {
            addCriterion("NUM_SCHOOL_ID is null");
            return (Criteria) this;
        }

        public Criteria andNumSchoolIdIsNotNull() {
            addCriterion("NUM_SCHOOL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andNumSchoolIdEqualTo(Long value) {
            addCriterion("NUM_SCHOOL_ID =", value, "numSchoolId");
            return (Criteria) this;
        }

        public Criteria andNumSchoolIdNotEqualTo(Long value) {
            addCriterion("NUM_SCHOOL_ID <>", value, "numSchoolId");
            return (Criteria) this;
        }

        public Criteria andNumSchoolIdGreaterThan(Long value) {
            addCriterion("NUM_SCHOOL_ID >", value, "numSchoolId");
            return (Criteria) this;
        }

        public Criteria andNumSchoolIdGreaterThanOrEqualTo(Long value) {
            addCriterion("NUM_SCHOOL_ID >=", value, "numSchoolId");
            return (Criteria) this;
        }

        public Criteria andNumSchoolIdLessThan(Long value) {
            addCriterion("NUM_SCHOOL_ID <", value, "numSchoolId");
            return (Criteria) this;
        }

        public Criteria andNumSchoolIdLessThanOrEqualTo(Long value) {
            addCriterion("NUM_SCHOOL_ID <=", value, "numSchoolId");
            return (Criteria) this;
        }

        public Criteria andNumSchoolIdIn(List<Long> values) {
            addCriterion("NUM_SCHOOL_ID in", values, "numSchoolId");
            return (Criteria) this;
        }

        public Criteria andNumSchoolIdNotIn(List<Long> values) {
            addCriterion("NUM_SCHOOL_ID not in", values, "numSchoolId");
            return (Criteria) this;
        }

        public Criteria andNumSchoolIdBetween(Long value1, Long value2) {
            addCriterion("NUM_SCHOOL_ID between", value1, value2, "numSchoolId");
            return (Criteria) this;
        }

        public Criteria andNumSchoolIdNotBetween(Long value1, Long value2) {
            addCriterion("NUM_SCHOOL_ID not between", value1, value2, "numSchoolId");
            return (Criteria) this;
        }

        public Criteria andNumGradeIdIsNull() {
            addCriterion("NUM_GRADE_ID is null");
            return (Criteria) this;
        }

        public Criteria andNumGradeIdIsNotNull() {
            addCriterion("NUM_GRADE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andNumGradeIdEqualTo(Long value) {
            addCriterion("NUM_GRADE_ID =", value, "numGradeId");
            return (Criteria) this;
        }

        public Criteria andNumGradeIdNotEqualTo(Long value) {
            addCriterion("NUM_GRADE_ID <>", value, "numGradeId");
            return (Criteria) this;
        }

        public Criteria andNumGradeIdGreaterThan(Long value) {
            addCriterion("NUM_GRADE_ID >", value, "numGradeId");
            return (Criteria) this;
        }

        public Criteria andNumGradeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("NUM_GRADE_ID >=", value, "numGradeId");
            return (Criteria) this;
        }

        public Criteria andNumGradeIdLessThan(Long value) {
            addCriterion("NUM_GRADE_ID <", value, "numGradeId");
            return (Criteria) this;
        }

        public Criteria andNumGradeIdLessThanOrEqualTo(Long value) {
            addCriterion("NUM_GRADE_ID <=", value, "numGradeId");
            return (Criteria) this;
        }

        public Criteria andNumGradeIdIn(List<Long> values) {
            addCriterion("NUM_GRADE_ID in", values, "numGradeId");
            return (Criteria) this;
        }

        public Criteria andNumGradeIdNotIn(List<Long> values) {
            addCriterion("NUM_GRADE_ID not in", values, "numGradeId");
            return (Criteria) this;
        }

        public Criteria andNumGradeIdBetween(Long value1, Long value2) {
            addCriterion("NUM_GRADE_ID between", value1, value2, "numGradeId");
            return (Criteria) this;
        }

        public Criteria andNumGradeIdNotBetween(Long value1, Long value2) {
            addCriterion("NUM_GRADE_ID not between", value1, value2, "numGradeId");
            return (Criteria) this;
        }

        public Criteria andNumModelIdIsNull() {
            addCriterion("NUM_MODEL_ID is null");
            return (Criteria) this;
        }

        public Criteria andNumModelIdIsNotNull() {
            addCriterion("NUM_MODEL_ID is not null");
            return (Criteria) this;
        }

        public Criteria andNumModelIdEqualTo(Long value) {
            addCriterion("NUM_MODEL_ID =", value, "numModelId");
            return (Criteria) this;
        }

        public Criteria andNumModelIdNotEqualTo(Long value) {
            addCriterion("NUM_MODEL_ID <>", value, "numModelId");
            return (Criteria) this;
        }

        public Criteria andNumModelIdGreaterThan(Long value) {
            addCriterion("NUM_MODEL_ID >", value, "numModelId");
            return (Criteria) this;
        }

        public Criteria andNumModelIdGreaterThanOrEqualTo(Long value) {
            addCriterion("NUM_MODEL_ID >=", value, "numModelId");
            return (Criteria) this;
        }

        public Criteria andNumModelIdLessThan(Long value) {
            addCriterion("NUM_MODEL_ID <", value, "numModelId");
            return (Criteria) this;
        }

        public Criteria andNumModelIdLessThanOrEqualTo(Long value) {
            addCriterion("NUM_MODEL_ID <=", value, "numModelId");
            return (Criteria) this;
        }

        public Criteria andNumModelIdIn(List<Long> values) {
            addCriterion("NUM_MODEL_ID in", values, "numModelId");
            return (Criteria) this;
        }

        public Criteria andNumModelIdNotIn(List<Long> values) {
            addCriterion("NUM_MODEL_ID not in", values, "numModelId");
            return (Criteria) this;
        }

        public Criteria andNumModelIdBetween(Long value1, Long value2) {
            addCriterion("NUM_MODEL_ID between", value1, value2, "numModelId");
            return (Criteria) this;
        }

        public Criteria andNumModelIdNotBetween(Long value1, Long value2) {
            addCriterion("NUM_MODEL_ID not between", value1, value2, "numModelId");
            return (Criteria) this;
        }

        public Criteria andVcOrderNoIsNull() {
            addCriterion("VC_ORDER_NO is null");
            return (Criteria) this;
        }

        public Criteria andVcOrderNoIsNotNull() {
            addCriterion("VC_ORDER_NO is not null");
            return (Criteria) this;
        }

        public Criteria andVcOrderNoEqualTo(String value) {
            addCriterion("VC_ORDER_NO =", value, "vcOrderNo");
            return (Criteria) this;
        }

        public Criteria andVcOrderNoNotEqualTo(String value) {
            addCriterion("VC_ORDER_NO <>", value, "vcOrderNo");
            return (Criteria) this;
        }

        public Criteria andVcOrderNoGreaterThan(String value) {
            addCriterion("VC_ORDER_NO >", value, "vcOrderNo");
            return (Criteria) this;
        }

        public Criteria andVcOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("VC_ORDER_NO >=", value, "vcOrderNo");
            return (Criteria) this;
        }

        public Criteria andVcOrderNoLessThan(String value) {
            addCriterion("VC_ORDER_NO <", value, "vcOrderNo");
            return (Criteria) this;
        }

        public Criteria andVcOrderNoLessThanOrEqualTo(String value) {
            addCriterion("VC_ORDER_NO <=", value, "vcOrderNo");
            return (Criteria) this;
        }

        public Criteria andVcOrderNoLike(String value) {
            addCriterion("VC_ORDER_NO like", value, "vcOrderNo");
            return (Criteria) this;
        }

        public Criteria andVcOrderNoNotLike(String value) {
            addCriterion("VC_ORDER_NO not like", value, "vcOrderNo");
            return (Criteria) this;
        }

        public Criteria andVcOrderNoIn(List<String> values) {
            addCriterion("VC_ORDER_NO in", values, "vcOrderNo");
            return (Criteria) this;
        }

        public Criteria andVcOrderNoNotIn(List<String> values) {
            addCriterion("VC_ORDER_NO not in", values, "vcOrderNo");
            return (Criteria) this;
        }

        public Criteria andVcOrderNoBetween(String value1, String value2) {
            addCriterion("VC_ORDER_NO between", value1, value2, "vcOrderNo");
            return (Criteria) this;
        }

        public Criteria andVcOrderNoNotBetween(String value1, String value2) {
            addCriterion("VC_ORDER_NO not between", value1, value2, "vcOrderNo");
            return (Criteria) this;
        }

        public Criteria andVcUnionIdIsNull() {
            addCriterion("VC_UNION_ID is null");
            return (Criteria) this;
        }

        public Criteria andVcUnionIdIsNotNull() {
            addCriterion("VC_UNION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andVcUnionIdEqualTo(String value) {
            addCriterion("VC_UNION_ID =", value, "vcUnionId");
            return (Criteria) this;
        }

        public Criteria andVcUnionIdNotEqualTo(String value) {
            addCriterion("VC_UNION_ID <>", value, "vcUnionId");
            return (Criteria) this;
        }

        public Criteria andVcUnionIdGreaterThan(String value) {
            addCriterion("VC_UNION_ID >", value, "vcUnionId");
            return (Criteria) this;
        }

        public Criteria andVcUnionIdGreaterThanOrEqualTo(String value) {
            addCriterion("VC_UNION_ID >=", value, "vcUnionId");
            return (Criteria) this;
        }

        public Criteria andVcUnionIdLessThan(String value) {
            addCriterion("VC_UNION_ID <", value, "vcUnionId");
            return (Criteria) this;
        }

        public Criteria andVcUnionIdLessThanOrEqualTo(String value) {
            addCriterion("VC_UNION_ID <=", value, "vcUnionId");
            return (Criteria) this;
        }

        public Criteria andVcUnionIdLike(String value) {
            addCriterion("VC_UNION_ID like", value, "vcUnionId");
            return (Criteria) this;
        }

        public Criteria andVcUnionIdNotLike(String value) {
            addCriterion("VC_UNION_ID not like", value, "vcUnionId");
            return (Criteria) this;
        }

        public Criteria andVcUnionIdIn(List<String> values) {
            addCriterion("VC_UNION_ID in", values, "vcUnionId");
            return (Criteria) this;
        }

        public Criteria andVcUnionIdNotIn(List<String> values) {
            addCriterion("VC_UNION_ID not in", values, "vcUnionId");
            return (Criteria) this;
        }

        public Criteria andVcUnionIdBetween(String value1, String value2) {
            addCriterion("VC_UNION_ID between", value1, value2, "vcUnionId");
            return (Criteria) this;
        }

        public Criteria andVcUnionIdNotBetween(String value1, String value2) {
            addCriterion("VC_UNION_ID not between", value1, value2, "vcUnionId");
            return (Criteria) this;
        }

        public Criteria andVcSignDescIsNull() {
            addCriterion("VC_SIGN_DESC is null");
            return (Criteria) this;
        }

        public Criteria andVcSignDescIsNotNull() {
            addCriterion("VC_SIGN_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andVcSignDescEqualTo(String value) {
            addCriterion("VC_SIGN_DESC =", value, "vcSignDesc");
            return (Criteria) this;
        }

        public Criteria andVcSignDescNotEqualTo(String value) {
            addCriterion("VC_SIGN_DESC <>", value, "vcSignDesc");
            return (Criteria) this;
        }

        public Criteria andVcSignDescGreaterThan(String value) {
            addCriterion("VC_SIGN_DESC >", value, "vcSignDesc");
            return (Criteria) this;
        }

        public Criteria andVcSignDescGreaterThanOrEqualTo(String value) {
            addCriterion("VC_SIGN_DESC >=", value, "vcSignDesc");
            return (Criteria) this;
        }

        public Criteria andVcSignDescLessThan(String value) {
            addCriterion("VC_SIGN_DESC <", value, "vcSignDesc");
            return (Criteria) this;
        }

        public Criteria andVcSignDescLessThanOrEqualTo(String value) {
            addCriterion("VC_SIGN_DESC <=", value, "vcSignDesc");
            return (Criteria) this;
        }

        public Criteria andVcSignDescLike(String value) {
            addCriterion("VC_SIGN_DESC like", value, "vcSignDesc");
            return (Criteria) this;
        }

        public Criteria andVcSignDescNotLike(String value) {
            addCriterion("VC_SIGN_DESC not like", value, "vcSignDesc");
            return (Criteria) this;
        }

        public Criteria andVcSignDescIn(List<String> values) {
            addCriterion("VC_SIGN_DESC in", values, "vcSignDesc");
            return (Criteria) this;
        }

        public Criteria andVcSignDescNotIn(List<String> values) {
            addCriterion("VC_SIGN_DESC not in", values, "vcSignDesc");
            return (Criteria) this;
        }

        public Criteria andVcSignDescBetween(String value1, String value2) {
            addCriterion("VC_SIGN_DESC between", value1, value2, "vcSignDesc");
            return (Criteria) this;
        }

        public Criteria andVcSignDescNotBetween(String value1, String value2) {
            addCriterion("VC_SIGN_DESC not between", value1, value2, "vcSignDesc");
            return (Criteria) this;
        }

        public Criteria andNumParTypeIsNull() {
            addCriterion("NUM_PAR_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andNumParTypeIsNotNull() {
            addCriterion("NUM_PAR_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andNumParTypeEqualTo(Byte value) {
            addCriterion("NUM_PAR_TYPE =", value, "numParType");
            return (Criteria) this;
        }

        public Criteria andNumParTypeNotEqualTo(Byte value) {
            addCriterion("NUM_PAR_TYPE <>", value, "numParType");
            return (Criteria) this;
        }

        public Criteria andNumParTypeGreaterThan(Byte value) {
            addCriterion("NUM_PAR_TYPE >", value, "numParType");
            return (Criteria) this;
        }

        public Criteria andNumParTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("NUM_PAR_TYPE >=", value, "numParType");
            return (Criteria) this;
        }

        public Criteria andNumParTypeLessThan(Byte value) {
            addCriterion("NUM_PAR_TYPE <", value, "numParType");
            return (Criteria) this;
        }

        public Criteria andNumParTypeLessThanOrEqualTo(Byte value) {
            addCriterion("NUM_PAR_TYPE <=", value, "numParType");
            return (Criteria) this;
        }

        public Criteria andNumParTypeIn(List<Byte> values) {
            addCriterion("NUM_PAR_TYPE in", values, "numParType");
            return (Criteria) this;
        }

        public Criteria andNumParTypeNotIn(List<Byte> values) {
            addCriterion("NUM_PAR_TYPE not in", values, "numParType");
            return (Criteria) this;
        }

        public Criteria andNumParTypeBetween(Byte value1, Byte value2) {
            addCriterion("NUM_PAR_TYPE between", value1, value2, "numParType");
            return (Criteria) this;
        }

        public Criteria andNumParTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("NUM_PAR_TYPE not between", value1, value2, "numParType");
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