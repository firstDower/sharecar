package com.dower.sharerideapp.core.serverdb.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NntPlatformCouponExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NntPlatformCouponExample() {
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

        public Criteria andVcCouponNameIsNull() {
            addCriterion("VC_COUPON_NAME is null");
            return (Criteria) this;
        }

        public Criteria andVcCouponNameIsNotNull() {
            addCriterion("VC_COUPON_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andVcCouponNameEqualTo(String value) {
            addCriterion("VC_COUPON_NAME =", value, "vcCouponName");
            return (Criteria) this;
        }

        public Criteria andVcCouponNameNotEqualTo(String value) {
            addCriterion("VC_COUPON_NAME <>", value, "vcCouponName");
            return (Criteria) this;
        }

        public Criteria andVcCouponNameGreaterThan(String value) {
            addCriterion("VC_COUPON_NAME >", value, "vcCouponName");
            return (Criteria) this;
        }

        public Criteria andVcCouponNameGreaterThanOrEqualTo(String value) {
            addCriterion("VC_COUPON_NAME >=", value, "vcCouponName");
            return (Criteria) this;
        }

        public Criteria andVcCouponNameLessThan(String value) {
            addCriterion("VC_COUPON_NAME <", value, "vcCouponName");
            return (Criteria) this;
        }

        public Criteria andVcCouponNameLessThanOrEqualTo(String value) {
            addCriterion("VC_COUPON_NAME <=", value, "vcCouponName");
            return (Criteria) this;
        }

        public Criteria andVcCouponNameLike(String value) {
            addCriterion("VC_COUPON_NAME like", value, "vcCouponName");
            return (Criteria) this;
        }

        public Criteria andVcCouponNameNotLike(String value) {
            addCriterion("VC_COUPON_NAME not like", value, "vcCouponName");
            return (Criteria) this;
        }

        public Criteria andVcCouponNameIn(List<String> values) {
            addCriterion("VC_COUPON_NAME in", values, "vcCouponName");
            return (Criteria) this;
        }

        public Criteria andVcCouponNameNotIn(List<String> values) {
            addCriterion("VC_COUPON_NAME not in", values, "vcCouponName");
            return (Criteria) this;
        }

        public Criteria andVcCouponNameBetween(String value1, String value2) {
            addCriterion("VC_COUPON_NAME between", value1, value2, "vcCouponName");
            return (Criteria) this;
        }

        public Criteria andVcCouponNameNotBetween(String value1, String value2) {
            addCriterion("VC_COUPON_NAME not between", value1, value2, "vcCouponName");
            return (Criteria) this;
        }

        public Criteria andNumIssueTotalIsNull() {
            addCriterion("NUM_ISSUE_TOTAL is null");
            return (Criteria) this;
        }

        public Criteria andNumIssueTotalIsNotNull() {
            addCriterion("NUM_ISSUE_TOTAL is not null");
            return (Criteria) this;
        }

        public Criteria andNumIssueTotalEqualTo(Integer value) {
            addCriterion("NUM_ISSUE_TOTAL =", value, "numIssueTotal");
            return (Criteria) this;
        }

        public Criteria andNumIssueTotalNotEqualTo(Integer value) {
            addCriterion("NUM_ISSUE_TOTAL <>", value, "numIssueTotal");
            return (Criteria) this;
        }

        public Criteria andNumIssueTotalGreaterThan(Integer value) {
            addCriterion("NUM_ISSUE_TOTAL >", value, "numIssueTotal");
            return (Criteria) this;
        }

        public Criteria andNumIssueTotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("NUM_ISSUE_TOTAL >=", value, "numIssueTotal");
            return (Criteria) this;
        }

        public Criteria andNumIssueTotalLessThan(Integer value) {
            addCriterion("NUM_ISSUE_TOTAL <", value, "numIssueTotal");
            return (Criteria) this;
        }

        public Criteria andNumIssueTotalLessThanOrEqualTo(Integer value) {
            addCriterion("NUM_ISSUE_TOTAL <=", value, "numIssueTotal");
            return (Criteria) this;
        }

        public Criteria andNumIssueTotalIn(List<Integer> values) {
            addCriterion("NUM_ISSUE_TOTAL in", values, "numIssueTotal");
            return (Criteria) this;
        }

        public Criteria andNumIssueTotalNotIn(List<Integer> values) {
            addCriterion("NUM_ISSUE_TOTAL not in", values, "numIssueTotal");
            return (Criteria) this;
        }

        public Criteria andNumIssueTotalBetween(Integer value1, Integer value2) {
            addCriterion("NUM_ISSUE_TOTAL between", value1, value2, "numIssueTotal");
            return (Criteria) this;
        }

        public Criteria andNumIssueTotalNotBetween(Integer value1, Integer value2) {
            addCriterion("NUM_ISSUE_TOTAL not between", value1, value2, "numIssueTotal");
            return (Criteria) this;
        }

        public Criteria andNumDiscountTypeIsNull() {
            addCriterion("NUM_DISCOUNT_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andNumDiscountTypeIsNotNull() {
            addCriterion("NUM_DISCOUNT_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andNumDiscountTypeEqualTo(Byte value) {
            addCriterion("NUM_DISCOUNT_TYPE =", value, "numDiscountType");
            return (Criteria) this;
        }

        public Criteria andNumDiscountTypeNotEqualTo(Byte value) {
            addCriterion("NUM_DISCOUNT_TYPE <>", value, "numDiscountType");
            return (Criteria) this;
        }

        public Criteria andNumDiscountTypeGreaterThan(Byte value) {
            addCriterion("NUM_DISCOUNT_TYPE >", value, "numDiscountType");
            return (Criteria) this;
        }

        public Criteria andNumDiscountTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("NUM_DISCOUNT_TYPE >=", value, "numDiscountType");
            return (Criteria) this;
        }

        public Criteria andNumDiscountTypeLessThan(Byte value) {
            addCriterion("NUM_DISCOUNT_TYPE <", value, "numDiscountType");
            return (Criteria) this;
        }

        public Criteria andNumDiscountTypeLessThanOrEqualTo(Byte value) {
            addCriterion("NUM_DISCOUNT_TYPE <=", value, "numDiscountType");
            return (Criteria) this;
        }

        public Criteria andNumDiscountTypeIn(List<Byte> values) {
            addCriterion("NUM_DISCOUNT_TYPE in", values, "numDiscountType");
            return (Criteria) this;
        }

        public Criteria andNumDiscountTypeNotIn(List<Byte> values) {
            addCriterion("NUM_DISCOUNT_TYPE not in", values, "numDiscountType");
            return (Criteria) this;
        }

        public Criteria andNumDiscountTypeBetween(Byte value1, Byte value2) {
            addCriterion("NUM_DISCOUNT_TYPE between", value1, value2, "numDiscountType");
            return (Criteria) this;
        }

        public Criteria andNumDiscountTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("NUM_DISCOUNT_TYPE not between", value1, value2, "numDiscountType");
            return (Criteria) this;
        }

        public Criteria andNumDiscountNumberIsNull() {
            addCriterion("NUM_DISCOUNT_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andNumDiscountNumberIsNotNull() {
            addCriterion("NUM_DISCOUNT_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andNumDiscountNumberEqualTo(Integer value) {
            addCriterion("NUM_DISCOUNT_NUMBER =", value, "numDiscountNumber");
            return (Criteria) this;
        }

        public Criteria andNumDiscountNumberNotEqualTo(Integer value) {
            addCriterion("NUM_DISCOUNT_NUMBER <>", value, "numDiscountNumber");
            return (Criteria) this;
        }

        public Criteria andNumDiscountNumberGreaterThan(Integer value) {
            addCriterion("NUM_DISCOUNT_NUMBER >", value, "numDiscountNumber");
            return (Criteria) this;
        }

        public Criteria andNumDiscountNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("NUM_DISCOUNT_NUMBER >=", value, "numDiscountNumber");
            return (Criteria) this;
        }

        public Criteria andNumDiscountNumberLessThan(Integer value) {
            addCriterion("NUM_DISCOUNT_NUMBER <", value, "numDiscountNumber");
            return (Criteria) this;
        }

        public Criteria andNumDiscountNumberLessThanOrEqualTo(Integer value) {
            addCriterion("NUM_DISCOUNT_NUMBER <=", value, "numDiscountNumber");
            return (Criteria) this;
        }

        public Criteria andNumDiscountNumberIn(List<Integer> values) {
            addCriterion("NUM_DISCOUNT_NUMBER in", values, "numDiscountNumber");
            return (Criteria) this;
        }

        public Criteria andNumDiscountNumberNotIn(List<Integer> values) {
            addCriterion("NUM_DISCOUNT_NUMBER not in", values, "numDiscountNumber");
            return (Criteria) this;
        }

        public Criteria andNumDiscountNumberBetween(Integer value1, Integer value2) {
            addCriterion("NUM_DISCOUNT_NUMBER between", value1, value2, "numDiscountNumber");
            return (Criteria) this;
        }

        public Criteria andNumDiscountNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("NUM_DISCOUNT_NUMBER not between", value1, value2, "numDiscountNumber");
            return (Criteria) this;
        }

        public Criteria andVcDiscountStrIsNull() {
            addCriterion("VC_DISCOUNT_STR is null");
            return (Criteria) this;
        }

        public Criteria andVcDiscountStrIsNotNull() {
            addCriterion("VC_DISCOUNT_STR is not null");
            return (Criteria) this;
        }

        public Criteria andVcDiscountStrEqualTo(String value) {
            addCriterion("VC_DISCOUNT_STR =", value, "vcDiscountStr");
            return (Criteria) this;
        }

        public Criteria andVcDiscountStrNotEqualTo(String value) {
            addCriterion("VC_DISCOUNT_STR <>", value, "vcDiscountStr");
            return (Criteria) this;
        }

        public Criteria andVcDiscountStrGreaterThan(String value) {
            addCriterion("VC_DISCOUNT_STR >", value, "vcDiscountStr");
            return (Criteria) this;
        }

        public Criteria andVcDiscountStrGreaterThanOrEqualTo(String value) {
            addCriterion("VC_DISCOUNT_STR >=", value, "vcDiscountStr");
            return (Criteria) this;
        }

        public Criteria andVcDiscountStrLessThan(String value) {
            addCriterion("VC_DISCOUNT_STR <", value, "vcDiscountStr");
            return (Criteria) this;
        }

        public Criteria andVcDiscountStrLessThanOrEqualTo(String value) {
            addCriterion("VC_DISCOUNT_STR <=", value, "vcDiscountStr");
            return (Criteria) this;
        }

        public Criteria andVcDiscountStrLike(String value) {
            addCriterion("VC_DISCOUNT_STR like", value, "vcDiscountStr");
            return (Criteria) this;
        }

        public Criteria andVcDiscountStrNotLike(String value) {
            addCriterion("VC_DISCOUNT_STR not like", value, "vcDiscountStr");
            return (Criteria) this;
        }

        public Criteria andVcDiscountStrIn(List<String> values) {
            addCriterion("VC_DISCOUNT_STR in", values, "vcDiscountStr");
            return (Criteria) this;
        }

        public Criteria andVcDiscountStrNotIn(List<String> values) {
            addCriterion("VC_DISCOUNT_STR not in", values, "vcDiscountStr");
            return (Criteria) this;
        }

        public Criteria andVcDiscountStrBetween(String value1, String value2) {
            addCriterion("VC_DISCOUNT_STR between", value1, value2, "vcDiscountStr");
            return (Criteria) this;
        }

        public Criteria andVcDiscountStrNotBetween(String value1, String value2) {
            addCriterion("VC_DISCOUNT_STR not between", value1, value2, "vcDiscountStr");
            return (Criteria) this;
        }

        public Criteria andNumHasDiscountLimitIsNull() {
            addCriterion("NUM_HAS_DISCOUNT_LIMIT is null");
            return (Criteria) this;
        }

        public Criteria andNumHasDiscountLimitIsNotNull() {
            addCriterion("NUM_HAS_DISCOUNT_LIMIT is not null");
            return (Criteria) this;
        }

        public Criteria andNumHasDiscountLimitEqualTo(Byte value) {
            addCriterion("NUM_HAS_DISCOUNT_LIMIT =", value, "numHasDiscountLimit");
            return (Criteria) this;
        }

        public Criteria andNumHasDiscountLimitNotEqualTo(Byte value) {
            addCriterion("NUM_HAS_DISCOUNT_LIMIT <>", value, "numHasDiscountLimit");
            return (Criteria) this;
        }

        public Criteria andNumHasDiscountLimitGreaterThan(Byte value) {
            addCriterion("NUM_HAS_DISCOUNT_LIMIT >", value, "numHasDiscountLimit");
            return (Criteria) this;
        }

        public Criteria andNumHasDiscountLimitGreaterThanOrEqualTo(Byte value) {
            addCriterion("NUM_HAS_DISCOUNT_LIMIT >=", value, "numHasDiscountLimit");
            return (Criteria) this;
        }

        public Criteria andNumHasDiscountLimitLessThan(Byte value) {
            addCriterion("NUM_HAS_DISCOUNT_LIMIT <", value, "numHasDiscountLimit");
            return (Criteria) this;
        }

        public Criteria andNumHasDiscountLimitLessThanOrEqualTo(Byte value) {
            addCriterion("NUM_HAS_DISCOUNT_LIMIT <=", value, "numHasDiscountLimit");
            return (Criteria) this;
        }

        public Criteria andNumHasDiscountLimitIn(List<Byte> values) {
            addCriterion("NUM_HAS_DISCOUNT_LIMIT in", values, "numHasDiscountLimit");
            return (Criteria) this;
        }

        public Criteria andNumHasDiscountLimitNotIn(List<Byte> values) {
            addCriterion("NUM_HAS_DISCOUNT_LIMIT not in", values, "numHasDiscountLimit");
            return (Criteria) this;
        }

        public Criteria andNumHasDiscountLimitBetween(Byte value1, Byte value2) {
            addCriterion("NUM_HAS_DISCOUNT_LIMIT between", value1, value2, "numHasDiscountLimit");
            return (Criteria) this;
        }

        public Criteria andNumHasDiscountLimitNotBetween(Byte value1, Byte value2) {
            addCriterion("NUM_HAS_DISCOUNT_LIMIT not between", value1, value2, "numHasDiscountLimit");
            return (Criteria) this;
        }

        public Criteria andNumLimitPriceIsNull() {
            addCriterion("NUM_LIMIT_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andNumLimitPriceIsNotNull() {
            addCriterion("NUM_LIMIT_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andNumLimitPriceEqualTo(Integer value) {
            addCriterion("NUM_LIMIT_PRICE =", value, "numLimitPrice");
            return (Criteria) this;
        }

        public Criteria andNumLimitPriceNotEqualTo(Integer value) {
            addCriterion("NUM_LIMIT_PRICE <>", value, "numLimitPrice");
            return (Criteria) this;
        }

        public Criteria andNumLimitPriceGreaterThan(Integer value) {
            addCriterion("NUM_LIMIT_PRICE >", value, "numLimitPrice");
            return (Criteria) this;
        }

        public Criteria andNumLimitPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("NUM_LIMIT_PRICE >=", value, "numLimitPrice");
            return (Criteria) this;
        }

        public Criteria andNumLimitPriceLessThan(Integer value) {
            addCriterion("NUM_LIMIT_PRICE <", value, "numLimitPrice");
            return (Criteria) this;
        }

        public Criteria andNumLimitPriceLessThanOrEqualTo(Integer value) {
            addCriterion("NUM_LIMIT_PRICE <=", value, "numLimitPrice");
            return (Criteria) this;
        }

        public Criteria andNumLimitPriceIn(List<Integer> values) {
            addCriterion("NUM_LIMIT_PRICE in", values, "numLimitPrice");
            return (Criteria) this;
        }

        public Criteria andNumLimitPriceNotIn(List<Integer> values) {
            addCriterion("NUM_LIMIT_PRICE not in", values, "numLimitPrice");
            return (Criteria) this;
        }

        public Criteria andNumLimitPriceBetween(Integer value1, Integer value2) {
            addCriterion("NUM_LIMIT_PRICE between", value1, value2, "numLimitPrice");
            return (Criteria) this;
        }

        public Criteria andNumLimitPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("NUM_LIMIT_PRICE not between", value1, value2, "numLimitPrice");
            return (Criteria) this;
        }

        public Criteria andNumMemberIsNull() {
            addCriterion("NUM_MEMBER is null");
            return (Criteria) this;
        }

        public Criteria andNumMemberIsNotNull() {
            addCriterion("NUM_MEMBER is not null");
            return (Criteria) this;
        }

        public Criteria andNumMemberEqualTo(Byte value) {
            addCriterion("NUM_MEMBER =", value, "numMember");
            return (Criteria) this;
        }

        public Criteria andNumMemberNotEqualTo(Byte value) {
            addCriterion("NUM_MEMBER <>", value, "numMember");
            return (Criteria) this;
        }

        public Criteria andNumMemberGreaterThan(Byte value) {
            addCriterion("NUM_MEMBER >", value, "numMember");
            return (Criteria) this;
        }

        public Criteria andNumMemberGreaterThanOrEqualTo(Byte value) {
            addCriterion("NUM_MEMBER >=", value, "numMember");
            return (Criteria) this;
        }

        public Criteria andNumMemberLessThan(Byte value) {
            addCriterion("NUM_MEMBER <", value, "numMember");
            return (Criteria) this;
        }

        public Criteria andNumMemberLessThanOrEqualTo(Byte value) {
            addCriterion("NUM_MEMBER <=", value, "numMember");
            return (Criteria) this;
        }

        public Criteria andNumMemberIn(List<Byte> values) {
            addCriterion("NUM_MEMBER in", values, "numMember");
            return (Criteria) this;
        }

        public Criteria andNumMemberNotIn(List<Byte> values) {
            addCriterion("NUM_MEMBER not in", values, "numMember");
            return (Criteria) this;
        }

        public Criteria andNumMemberBetween(Byte value1, Byte value2) {
            addCriterion("NUM_MEMBER between", value1, value2, "numMember");
            return (Criteria) this;
        }

        public Criteria andNumMemberNotBetween(Byte value1, Byte value2) {
            addCriterion("NUM_MEMBER not between", value1, value2, "numMember");
            return (Criteria) this;
        }

        public Criteria andNumUserLimitNumIsNull() {
            addCriterion("NUM_USER_LIMIT_NUM is null");
            return (Criteria) this;
        }

        public Criteria andNumUserLimitNumIsNotNull() {
            addCriterion("NUM_USER_LIMIT_NUM is not null");
            return (Criteria) this;
        }

        public Criteria andNumUserLimitNumEqualTo(Byte value) {
            addCriterion("NUM_USER_LIMIT_NUM =", value, "numUserLimitNum");
            return (Criteria) this;
        }

        public Criteria andNumUserLimitNumNotEqualTo(Byte value) {
            addCriterion("NUM_USER_LIMIT_NUM <>", value, "numUserLimitNum");
            return (Criteria) this;
        }

        public Criteria andNumUserLimitNumGreaterThan(Byte value) {
            addCriterion("NUM_USER_LIMIT_NUM >", value, "numUserLimitNum");
            return (Criteria) this;
        }

        public Criteria andNumUserLimitNumGreaterThanOrEqualTo(Byte value) {
            addCriterion("NUM_USER_LIMIT_NUM >=", value, "numUserLimitNum");
            return (Criteria) this;
        }

        public Criteria andNumUserLimitNumLessThan(Byte value) {
            addCriterion("NUM_USER_LIMIT_NUM <", value, "numUserLimitNum");
            return (Criteria) this;
        }

        public Criteria andNumUserLimitNumLessThanOrEqualTo(Byte value) {
            addCriterion("NUM_USER_LIMIT_NUM <=", value, "numUserLimitNum");
            return (Criteria) this;
        }

        public Criteria andNumUserLimitNumIn(List<Byte> values) {
            addCriterion("NUM_USER_LIMIT_NUM in", values, "numUserLimitNum");
            return (Criteria) this;
        }

        public Criteria andNumUserLimitNumNotIn(List<Byte> values) {
            addCriterion("NUM_USER_LIMIT_NUM not in", values, "numUserLimitNum");
            return (Criteria) this;
        }

        public Criteria andNumUserLimitNumBetween(Byte value1, Byte value2) {
            addCriterion("NUM_USER_LIMIT_NUM between", value1, value2, "numUserLimitNum");
            return (Criteria) this;
        }

        public Criteria andNumUserLimitNumNotBetween(Byte value1, Byte value2) {
            addCriterion("NUM_USER_LIMIT_NUM not between", value1, value2, "numUserLimitNum");
            return (Criteria) this;
        }

        public Criteria andNumLimitDateTypeIsNull() {
            addCriterion("NUM_LIMIT_DATE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andNumLimitDateTypeIsNotNull() {
            addCriterion("NUM_LIMIT_DATE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andNumLimitDateTypeEqualTo(Byte value) {
            addCriterion("NUM_LIMIT_DATE_TYPE =", value, "numLimitDateType");
            return (Criteria) this;
        }

        public Criteria andNumLimitDateTypeNotEqualTo(Byte value) {
            addCriterion("NUM_LIMIT_DATE_TYPE <>", value, "numLimitDateType");
            return (Criteria) this;
        }

        public Criteria andNumLimitDateTypeGreaterThan(Byte value) {
            addCriterion("NUM_LIMIT_DATE_TYPE >", value, "numLimitDateType");
            return (Criteria) this;
        }

        public Criteria andNumLimitDateTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("NUM_LIMIT_DATE_TYPE >=", value, "numLimitDateType");
            return (Criteria) this;
        }

        public Criteria andNumLimitDateTypeLessThan(Byte value) {
            addCriterion("NUM_LIMIT_DATE_TYPE <", value, "numLimitDateType");
            return (Criteria) this;
        }

        public Criteria andNumLimitDateTypeLessThanOrEqualTo(Byte value) {
            addCriterion("NUM_LIMIT_DATE_TYPE <=", value, "numLimitDateType");
            return (Criteria) this;
        }

        public Criteria andNumLimitDateTypeIn(List<Byte> values) {
            addCriterion("NUM_LIMIT_DATE_TYPE in", values, "numLimitDateType");
            return (Criteria) this;
        }

        public Criteria andNumLimitDateTypeNotIn(List<Byte> values) {
            addCriterion("NUM_LIMIT_DATE_TYPE not in", values, "numLimitDateType");
            return (Criteria) this;
        }

        public Criteria andNumLimitDateTypeBetween(Byte value1, Byte value2) {
            addCriterion("NUM_LIMIT_DATE_TYPE between", value1, value2, "numLimitDateType");
            return (Criteria) this;
        }

        public Criteria andNumLimitDateTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("NUM_LIMIT_DATE_TYPE not between", value1, value2, "numLimitDateType");
            return (Criteria) this;
        }

        public Criteria andNumAvailableDaysIsNull() {
            addCriterion("NUM_AVAILABLE_DAYS is null");
            return (Criteria) this;
        }

        public Criteria andNumAvailableDaysIsNotNull() {
            addCriterion("NUM_AVAILABLE_DAYS is not null");
            return (Criteria) this;
        }

        public Criteria andNumAvailableDaysEqualTo(Integer value) {
            addCriterion("NUM_AVAILABLE_DAYS =", value, "numAvailableDays");
            return (Criteria) this;
        }

        public Criteria andNumAvailableDaysNotEqualTo(Integer value) {
            addCriterion("NUM_AVAILABLE_DAYS <>", value, "numAvailableDays");
            return (Criteria) this;
        }

        public Criteria andNumAvailableDaysGreaterThan(Integer value) {
            addCriterion("NUM_AVAILABLE_DAYS >", value, "numAvailableDays");
            return (Criteria) this;
        }

        public Criteria andNumAvailableDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("NUM_AVAILABLE_DAYS >=", value, "numAvailableDays");
            return (Criteria) this;
        }

        public Criteria andNumAvailableDaysLessThan(Integer value) {
            addCriterion("NUM_AVAILABLE_DAYS <", value, "numAvailableDays");
            return (Criteria) this;
        }

        public Criteria andNumAvailableDaysLessThanOrEqualTo(Integer value) {
            addCriterion("NUM_AVAILABLE_DAYS <=", value, "numAvailableDays");
            return (Criteria) this;
        }

        public Criteria andNumAvailableDaysIn(List<Integer> values) {
            addCriterion("NUM_AVAILABLE_DAYS in", values, "numAvailableDays");
            return (Criteria) this;
        }

        public Criteria andNumAvailableDaysNotIn(List<Integer> values) {
            addCriterion("NUM_AVAILABLE_DAYS not in", values, "numAvailableDays");
            return (Criteria) this;
        }

        public Criteria andNumAvailableDaysBetween(Integer value1, Integer value2) {
            addCriterion("NUM_AVAILABLE_DAYS between", value1, value2, "numAvailableDays");
            return (Criteria) this;
        }

        public Criteria andNumAvailableDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("NUM_AVAILABLE_DAYS not between", value1, value2, "numAvailableDays");
            return (Criteria) this;
        }

        public Criteria andNumAvailableGoodsIsNull() {
            addCriterion("NUM_AVAILABLE_GOODS is null");
            return (Criteria) this;
        }

        public Criteria andNumAvailableGoodsIsNotNull() {
            addCriterion("NUM_AVAILABLE_GOODS is not null");
            return (Criteria) this;
        }

        public Criteria andNumAvailableGoodsEqualTo(Long value) {
            addCriterion("NUM_AVAILABLE_GOODS =", value, "numAvailableGoods");
            return (Criteria) this;
        }

        public Criteria andNumAvailableGoodsNotEqualTo(Long value) {
            addCriterion("NUM_AVAILABLE_GOODS <>", value, "numAvailableGoods");
            return (Criteria) this;
        }

        public Criteria andNumAvailableGoodsGreaterThan(Long value) {
            addCriterion("NUM_AVAILABLE_GOODS >", value, "numAvailableGoods");
            return (Criteria) this;
        }

        public Criteria andNumAvailableGoodsGreaterThanOrEqualTo(Long value) {
            addCriterion("NUM_AVAILABLE_GOODS >=", value, "numAvailableGoods");
            return (Criteria) this;
        }

        public Criteria andNumAvailableGoodsLessThan(Long value) {
            addCriterion("NUM_AVAILABLE_GOODS <", value, "numAvailableGoods");
            return (Criteria) this;
        }

        public Criteria andNumAvailableGoodsLessThanOrEqualTo(Long value) {
            addCriterion("NUM_AVAILABLE_GOODS <=", value, "numAvailableGoods");
            return (Criteria) this;
        }

        public Criteria andNumAvailableGoodsIn(List<Long> values) {
            addCriterion("NUM_AVAILABLE_GOODS in", values, "numAvailableGoods");
            return (Criteria) this;
        }

        public Criteria andNumAvailableGoodsNotIn(List<Long> values) {
            addCriterion("NUM_AVAILABLE_GOODS not in", values, "numAvailableGoods");
            return (Criteria) this;
        }

        public Criteria andNumAvailableGoodsBetween(Long value1, Long value2) {
            addCriterion("NUM_AVAILABLE_GOODS between", value1, value2, "numAvailableGoods");
            return (Criteria) this;
        }

        public Criteria andNumAvailableGoodsNotBetween(Long value1, Long value2) {
            addCriterion("NUM_AVAILABLE_GOODS not between", value1, value2, "numAvailableGoods");
            return (Criteria) this;
        }

        public Criteria andVcInstructionsIsNull() {
            addCriterion("VC_INSTRUCTIONS is null");
            return (Criteria) this;
        }

        public Criteria andVcInstructionsIsNotNull() {
            addCriterion("VC_INSTRUCTIONS is not null");
            return (Criteria) this;
        }

        public Criteria andVcInstructionsEqualTo(String value) {
            addCriterion("VC_INSTRUCTIONS =", value, "vcInstructions");
            return (Criteria) this;
        }

        public Criteria andVcInstructionsNotEqualTo(String value) {
            addCriterion("VC_INSTRUCTIONS <>", value, "vcInstructions");
            return (Criteria) this;
        }

        public Criteria andVcInstructionsGreaterThan(String value) {
            addCriterion("VC_INSTRUCTIONS >", value, "vcInstructions");
            return (Criteria) this;
        }

        public Criteria andVcInstructionsGreaterThanOrEqualTo(String value) {
            addCriterion("VC_INSTRUCTIONS >=", value, "vcInstructions");
            return (Criteria) this;
        }

        public Criteria andVcInstructionsLessThan(String value) {
            addCriterion("VC_INSTRUCTIONS <", value, "vcInstructions");
            return (Criteria) this;
        }

        public Criteria andVcInstructionsLessThanOrEqualTo(String value) {
            addCriterion("VC_INSTRUCTIONS <=", value, "vcInstructions");
            return (Criteria) this;
        }

        public Criteria andVcInstructionsLike(String value) {
            addCriterion("VC_INSTRUCTIONS like", value, "vcInstructions");
            return (Criteria) this;
        }

        public Criteria andVcInstructionsNotLike(String value) {
            addCriterion("VC_INSTRUCTIONS not like", value, "vcInstructions");
            return (Criteria) this;
        }

        public Criteria andVcInstructionsIn(List<String> values) {
            addCriterion("VC_INSTRUCTIONS in", values, "vcInstructions");
            return (Criteria) this;
        }

        public Criteria andVcInstructionsNotIn(List<String> values) {
            addCriterion("VC_INSTRUCTIONS not in", values, "vcInstructions");
            return (Criteria) this;
        }

        public Criteria andVcInstructionsBetween(String value1, String value2) {
            addCriterion("VC_INSTRUCTIONS between", value1, value2, "vcInstructions");
            return (Criteria) this;
        }

        public Criteria andVcInstructionsNotBetween(String value1, String value2) {
            addCriterion("VC_INSTRUCTIONS not between", value1, value2, "vcInstructions");
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

        public Criteria andDatStartDateIsNull() {
            addCriterion("DAT_START_DATE is null");
            return (Criteria) this;
        }

        public Criteria andDatStartDateIsNotNull() {
            addCriterion("DAT_START_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andDatStartDateEqualTo(Date value) {
            addCriterion("DAT_START_DATE =", value, "datStartDate");
            return (Criteria) this;
        }

        public Criteria andDatStartDateNotEqualTo(Date value) {
            addCriterion("DAT_START_DATE <>", value, "datStartDate");
            return (Criteria) this;
        }

        public Criteria andDatStartDateGreaterThan(Date value) {
            addCriterion("DAT_START_DATE >", value, "datStartDate");
            return (Criteria) this;
        }

        public Criteria andDatStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("DAT_START_DATE >=", value, "datStartDate");
            return (Criteria) this;
        }

        public Criteria andDatStartDateLessThan(Date value) {
            addCriterion("DAT_START_DATE <", value, "datStartDate");
            return (Criteria) this;
        }

        public Criteria andDatStartDateLessThanOrEqualTo(Date value) {
            addCriterion("DAT_START_DATE <=", value, "datStartDate");
            return (Criteria) this;
        }

        public Criteria andDatStartDateIn(List<Date> values) {
            addCriterion("DAT_START_DATE in", values, "datStartDate");
            return (Criteria) this;
        }

        public Criteria andDatStartDateNotIn(List<Date> values) {
            addCriterion("DAT_START_DATE not in", values, "datStartDate");
            return (Criteria) this;
        }

        public Criteria andDatStartDateBetween(Date value1, Date value2) {
            addCriterion("DAT_START_DATE between", value1, value2, "datStartDate");
            return (Criteria) this;
        }

        public Criteria andDatStartDateNotBetween(Date value1, Date value2) {
            addCriterion("DAT_START_DATE not between", value1, value2, "datStartDate");
            return (Criteria) this;
        }

        public Criteria andDatEndDateIsNull() {
            addCriterion("DAT_END_DATE is null");
            return (Criteria) this;
        }

        public Criteria andDatEndDateIsNotNull() {
            addCriterion("DAT_END_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andDatEndDateEqualTo(Date value) {
            addCriterion("DAT_END_DATE =", value, "datEndDate");
            return (Criteria) this;
        }

        public Criteria andDatEndDateNotEqualTo(Date value) {
            addCriterion("DAT_END_DATE <>", value, "datEndDate");
            return (Criteria) this;
        }

        public Criteria andDatEndDateGreaterThan(Date value) {
            addCriterion("DAT_END_DATE >", value, "datEndDate");
            return (Criteria) this;
        }

        public Criteria andDatEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("DAT_END_DATE >=", value, "datEndDate");
            return (Criteria) this;
        }

        public Criteria andDatEndDateLessThan(Date value) {
            addCriterion("DAT_END_DATE <", value, "datEndDate");
            return (Criteria) this;
        }

        public Criteria andDatEndDateLessThanOrEqualTo(Date value) {
            addCriterion("DAT_END_DATE <=", value, "datEndDate");
            return (Criteria) this;
        }

        public Criteria andDatEndDateIn(List<Date> values) {
            addCriterion("DAT_END_DATE in", values, "datEndDate");
            return (Criteria) this;
        }

        public Criteria andDatEndDateNotIn(List<Date> values) {
            addCriterion("DAT_END_DATE not in", values, "datEndDate");
            return (Criteria) this;
        }

        public Criteria andDatEndDateBetween(Date value1, Date value2) {
            addCriterion("DAT_END_DATE between", value1, value2, "datEndDate");
            return (Criteria) this;
        }

        public Criteria andDatEndDateNotBetween(Date value1, Date value2) {
            addCriterion("DAT_END_DATE not between", value1, value2, "datEndDate");
            return (Criteria) this;
        }

        public Criteria andNumCreatAdminUserIdIsNull() {
            addCriterion("NUM_CREAT_ADMIN_USER_ID is null");
            return (Criteria) this;
        }

        public Criteria andNumCreatAdminUserIdIsNotNull() {
            addCriterion("NUM_CREAT_ADMIN_USER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andNumCreatAdminUserIdEqualTo(Long value) {
            addCriterion("NUM_CREAT_ADMIN_USER_ID =", value, "numCreatAdminUserId");
            return (Criteria) this;
        }

        public Criteria andNumCreatAdminUserIdNotEqualTo(Long value) {
            addCriterion("NUM_CREAT_ADMIN_USER_ID <>", value, "numCreatAdminUserId");
            return (Criteria) this;
        }

        public Criteria andNumCreatAdminUserIdGreaterThan(Long value) {
            addCriterion("NUM_CREAT_ADMIN_USER_ID >", value, "numCreatAdminUserId");
            return (Criteria) this;
        }

        public Criteria andNumCreatAdminUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("NUM_CREAT_ADMIN_USER_ID >=", value, "numCreatAdminUserId");
            return (Criteria) this;
        }

        public Criteria andNumCreatAdminUserIdLessThan(Long value) {
            addCriterion("NUM_CREAT_ADMIN_USER_ID <", value, "numCreatAdminUserId");
            return (Criteria) this;
        }

        public Criteria andNumCreatAdminUserIdLessThanOrEqualTo(Long value) {
            addCriterion("NUM_CREAT_ADMIN_USER_ID <=", value, "numCreatAdminUserId");
            return (Criteria) this;
        }

        public Criteria andNumCreatAdminUserIdIn(List<Long> values) {
            addCriterion("NUM_CREAT_ADMIN_USER_ID in", values, "numCreatAdminUserId");
            return (Criteria) this;
        }

        public Criteria andNumCreatAdminUserIdNotIn(List<Long> values) {
            addCriterion("NUM_CREAT_ADMIN_USER_ID not in", values, "numCreatAdminUserId");
            return (Criteria) this;
        }

        public Criteria andNumCreatAdminUserIdBetween(Long value1, Long value2) {
            addCriterion("NUM_CREAT_ADMIN_USER_ID between", value1, value2, "numCreatAdminUserId");
            return (Criteria) this;
        }

        public Criteria andNumCreatAdminUserIdNotBetween(Long value1, Long value2) {
            addCriterion("NUM_CREAT_ADMIN_USER_ID not between", value1, value2, "numCreatAdminUserId");
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