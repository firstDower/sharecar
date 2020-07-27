package com.dower.sharerideapp.core.serverdb.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PaymentOrderRecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PaymentOrderRecordExample() {
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

        public Criteria andNumUserMoneyLogIdIsNull() {
            addCriterion("NUM_USER_MONEY_LOG_ID is null");
            return (Criteria) this;
        }

        public Criteria andNumUserMoneyLogIdIsNotNull() {
            addCriterion("NUM_USER_MONEY_LOG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andNumUserMoneyLogIdEqualTo(Long value) {
            addCriterion("NUM_USER_MONEY_LOG_ID =", value, "numUserMoneyLogId");
            return (Criteria) this;
        }

        public Criteria andNumUserMoneyLogIdNotEqualTo(Long value) {
            addCriterion("NUM_USER_MONEY_LOG_ID <>", value, "numUserMoneyLogId");
            return (Criteria) this;
        }

        public Criteria andNumUserMoneyLogIdGreaterThan(Long value) {
            addCriterion("NUM_USER_MONEY_LOG_ID >", value, "numUserMoneyLogId");
            return (Criteria) this;
        }

        public Criteria andNumUserMoneyLogIdGreaterThanOrEqualTo(Long value) {
            addCriterion("NUM_USER_MONEY_LOG_ID >=", value, "numUserMoneyLogId");
            return (Criteria) this;
        }

        public Criteria andNumUserMoneyLogIdLessThan(Long value) {
            addCriterion("NUM_USER_MONEY_LOG_ID <", value, "numUserMoneyLogId");
            return (Criteria) this;
        }

        public Criteria andNumUserMoneyLogIdLessThanOrEqualTo(Long value) {
            addCriterion("NUM_USER_MONEY_LOG_ID <=", value, "numUserMoneyLogId");
            return (Criteria) this;
        }

        public Criteria andNumUserMoneyLogIdIn(List<Long> values) {
            addCriterion("NUM_USER_MONEY_LOG_ID in", values, "numUserMoneyLogId");
            return (Criteria) this;
        }

        public Criteria andNumUserMoneyLogIdNotIn(List<Long> values) {
            addCriterion("NUM_USER_MONEY_LOG_ID not in", values, "numUserMoneyLogId");
            return (Criteria) this;
        }

        public Criteria andNumUserMoneyLogIdBetween(Long value1, Long value2) {
            addCriterion("NUM_USER_MONEY_LOG_ID between", value1, value2, "numUserMoneyLogId");
            return (Criteria) this;
        }

        public Criteria andNumUserMoneyLogIdNotBetween(Long value1, Long value2) {
            addCriterion("NUM_USER_MONEY_LOG_ID not between", value1, value2, "numUserMoneyLogId");
            return (Criteria) this;
        }

        public Criteria andNumUserCouponIdIsNull() {
            addCriterion("NUM_USER_COUPON_ID is null");
            return (Criteria) this;
        }

        public Criteria andNumUserCouponIdIsNotNull() {
            addCriterion("NUM_USER_COUPON_ID is not null");
            return (Criteria) this;
        }

        public Criteria andNumUserCouponIdEqualTo(Long value) {
            addCriterion("NUM_USER_COUPON_ID =", value, "numUserCouponId");
            return (Criteria) this;
        }

        public Criteria andNumUserCouponIdNotEqualTo(Long value) {
            addCriterion("NUM_USER_COUPON_ID <>", value, "numUserCouponId");
            return (Criteria) this;
        }

        public Criteria andNumUserCouponIdGreaterThan(Long value) {
            addCriterion("NUM_USER_COUPON_ID >", value, "numUserCouponId");
            return (Criteria) this;
        }

        public Criteria andNumUserCouponIdGreaterThanOrEqualTo(Long value) {
            addCriterion("NUM_USER_COUPON_ID >=", value, "numUserCouponId");
            return (Criteria) this;
        }

        public Criteria andNumUserCouponIdLessThan(Long value) {
            addCriterion("NUM_USER_COUPON_ID <", value, "numUserCouponId");
            return (Criteria) this;
        }

        public Criteria andNumUserCouponIdLessThanOrEqualTo(Long value) {
            addCriterion("NUM_USER_COUPON_ID <=", value, "numUserCouponId");
            return (Criteria) this;
        }

        public Criteria andNumUserCouponIdIn(List<Long> values) {
            addCriterion("NUM_USER_COUPON_ID in", values, "numUserCouponId");
            return (Criteria) this;
        }

        public Criteria andNumUserCouponIdNotIn(List<Long> values) {
            addCriterion("NUM_USER_COUPON_ID not in", values, "numUserCouponId");
            return (Criteria) this;
        }

        public Criteria andNumUserCouponIdBetween(Long value1, Long value2) {
            addCriterion("NUM_USER_COUPON_ID between", value1, value2, "numUserCouponId");
            return (Criteria) this;
        }

        public Criteria andNumUserCouponIdNotBetween(Long value1, Long value2) {
            addCriterion("NUM_USER_COUPON_ID not between", value1, value2, "numUserCouponId");
            return (Criteria) this;
        }

        public Criteria andNumGroupBuyDetailsIdIsNull() {
            addCriterion("NUM_GROUP_BUY_DETAILS_ID is null");
            return (Criteria) this;
        }

        public Criteria andNumGroupBuyDetailsIdIsNotNull() {
            addCriterion("NUM_GROUP_BUY_DETAILS_ID is not null");
            return (Criteria) this;
        }

        public Criteria andNumGroupBuyDetailsIdEqualTo(Long value) {
            addCriterion("NUM_GROUP_BUY_DETAILS_ID =", value, "numGroupBuyDetailsId");
            return (Criteria) this;
        }

        public Criteria andNumGroupBuyDetailsIdNotEqualTo(Long value) {
            addCriterion("NUM_GROUP_BUY_DETAILS_ID <>", value, "numGroupBuyDetailsId");
            return (Criteria) this;
        }

        public Criteria andNumGroupBuyDetailsIdGreaterThan(Long value) {
            addCriterion("NUM_GROUP_BUY_DETAILS_ID >", value, "numGroupBuyDetailsId");
            return (Criteria) this;
        }

        public Criteria andNumGroupBuyDetailsIdGreaterThanOrEqualTo(Long value) {
            addCriterion("NUM_GROUP_BUY_DETAILS_ID >=", value, "numGroupBuyDetailsId");
            return (Criteria) this;
        }

        public Criteria andNumGroupBuyDetailsIdLessThan(Long value) {
            addCriterion("NUM_GROUP_BUY_DETAILS_ID <", value, "numGroupBuyDetailsId");
            return (Criteria) this;
        }

        public Criteria andNumGroupBuyDetailsIdLessThanOrEqualTo(Long value) {
            addCriterion("NUM_GROUP_BUY_DETAILS_ID <=", value, "numGroupBuyDetailsId");
            return (Criteria) this;
        }

        public Criteria andNumGroupBuyDetailsIdIn(List<Long> values) {
            addCriterion("NUM_GROUP_BUY_DETAILS_ID in", values, "numGroupBuyDetailsId");
            return (Criteria) this;
        }

        public Criteria andNumGroupBuyDetailsIdNotIn(List<Long> values) {
            addCriterion("NUM_GROUP_BUY_DETAILS_ID not in", values, "numGroupBuyDetailsId");
            return (Criteria) this;
        }

        public Criteria andNumGroupBuyDetailsIdBetween(Long value1, Long value2) {
            addCriterion("NUM_GROUP_BUY_DETAILS_ID between", value1, value2, "numGroupBuyDetailsId");
            return (Criteria) this;
        }

        public Criteria andNumGroupBuyDetailsIdNotBetween(Long value1, Long value2) {
            addCriterion("NUM_GROUP_BUY_DETAILS_ID not between", value1, value2, "numGroupBuyDetailsId");
            return (Criteria) this;
        }

        public Criteria andNumBargainBizLogIdIsNull() {
            addCriterion("NUM_BARGAIN_BIZ_LOG_ID is null");
            return (Criteria) this;
        }

        public Criteria andNumBargainBizLogIdIsNotNull() {
            addCriterion("NUM_BARGAIN_BIZ_LOG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andNumBargainBizLogIdEqualTo(Long value) {
            addCriterion("NUM_BARGAIN_BIZ_LOG_ID =", value, "numBargainBizLogId");
            return (Criteria) this;
        }

        public Criteria andNumBargainBizLogIdNotEqualTo(Long value) {
            addCriterion("NUM_BARGAIN_BIZ_LOG_ID <>", value, "numBargainBizLogId");
            return (Criteria) this;
        }

        public Criteria andNumBargainBizLogIdGreaterThan(Long value) {
            addCriterion("NUM_BARGAIN_BIZ_LOG_ID >", value, "numBargainBizLogId");
            return (Criteria) this;
        }

        public Criteria andNumBargainBizLogIdGreaterThanOrEqualTo(Long value) {
            addCriterion("NUM_BARGAIN_BIZ_LOG_ID >=", value, "numBargainBizLogId");
            return (Criteria) this;
        }

        public Criteria andNumBargainBizLogIdLessThan(Long value) {
            addCriterion("NUM_BARGAIN_BIZ_LOG_ID <", value, "numBargainBizLogId");
            return (Criteria) this;
        }

        public Criteria andNumBargainBizLogIdLessThanOrEqualTo(Long value) {
            addCriterion("NUM_BARGAIN_BIZ_LOG_ID <=", value, "numBargainBizLogId");
            return (Criteria) this;
        }

        public Criteria andNumBargainBizLogIdIn(List<Long> values) {
            addCriterion("NUM_BARGAIN_BIZ_LOG_ID in", values, "numBargainBizLogId");
            return (Criteria) this;
        }

        public Criteria andNumBargainBizLogIdNotIn(List<Long> values) {
            addCriterion("NUM_BARGAIN_BIZ_LOG_ID not in", values, "numBargainBizLogId");
            return (Criteria) this;
        }

        public Criteria andNumBargainBizLogIdBetween(Long value1, Long value2) {
            addCriterion("NUM_BARGAIN_BIZ_LOG_ID between", value1, value2, "numBargainBizLogId");
            return (Criteria) this;
        }

        public Criteria andNumBargainBizLogIdNotBetween(Long value1, Long value2) {
            addCriterion("NUM_BARGAIN_BIZ_LOG_ID not between", value1, value2, "numBargainBizLogId");
            return (Criteria) this;
        }

        public Criteria andNumPayFlowIdIsNull() {
            addCriterion("NUM_PAY_FLOW_ID is null");
            return (Criteria) this;
        }

        public Criteria andNumPayFlowIdIsNotNull() {
            addCriterion("NUM_PAY_FLOW_ID is not null");
            return (Criteria) this;
        }

        public Criteria andNumPayFlowIdEqualTo(Long value) {
            addCriterion("NUM_PAY_FLOW_ID =", value, "numPayFlowId");
            return (Criteria) this;
        }

        public Criteria andNumPayFlowIdNotEqualTo(Long value) {
            addCriterion("NUM_PAY_FLOW_ID <>", value, "numPayFlowId");
            return (Criteria) this;
        }

        public Criteria andNumPayFlowIdGreaterThan(Long value) {
            addCriterion("NUM_PAY_FLOW_ID >", value, "numPayFlowId");
            return (Criteria) this;
        }

        public Criteria andNumPayFlowIdGreaterThanOrEqualTo(Long value) {
            addCriterion("NUM_PAY_FLOW_ID >=", value, "numPayFlowId");
            return (Criteria) this;
        }

        public Criteria andNumPayFlowIdLessThan(Long value) {
            addCriterion("NUM_PAY_FLOW_ID <", value, "numPayFlowId");
            return (Criteria) this;
        }

        public Criteria andNumPayFlowIdLessThanOrEqualTo(Long value) {
            addCriterion("NUM_PAY_FLOW_ID <=", value, "numPayFlowId");
            return (Criteria) this;
        }

        public Criteria andNumPayFlowIdIn(List<Long> values) {
            addCriterion("NUM_PAY_FLOW_ID in", values, "numPayFlowId");
            return (Criteria) this;
        }

        public Criteria andNumPayFlowIdNotIn(List<Long> values) {
            addCriterion("NUM_PAY_FLOW_ID not in", values, "numPayFlowId");
            return (Criteria) this;
        }

        public Criteria andNumPayFlowIdBetween(Long value1, Long value2) {
            addCriterion("NUM_PAY_FLOW_ID between", value1, value2, "numPayFlowId");
            return (Criteria) this;
        }

        public Criteria andNumPayFlowIdNotBetween(Long value1, Long value2) {
            addCriterion("NUM_PAY_FLOW_ID not between", value1, value2, "numPayFlowId");
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

        public Criteria andNumPayStateIsNull() {
            addCriterion("NUM_PAY_STATE is null");
            return (Criteria) this;
        }

        public Criteria andNumPayStateIsNotNull() {
            addCriterion("NUM_PAY_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andNumPayStateEqualTo(Byte value) {
            addCriterion("NUM_PAY_STATE =", value, "numPayState");
            return (Criteria) this;
        }

        public Criteria andNumPayStateNotEqualTo(Byte value) {
            addCriterion("NUM_PAY_STATE <>", value, "numPayState");
            return (Criteria) this;
        }

        public Criteria andNumPayStateGreaterThan(Byte value) {
            addCriterion("NUM_PAY_STATE >", value, "numPayState");
            return (Criteria) this;
        }

        public Criteria andNumPayStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("NUM_PAY_STATE >=", value, "numPayState");
            return (Criteria) this;
        }

        public Criteria andNumPayStateLessThan(Byte value) {
            addCriterion("NUM_PAY_STATE <", value, "numPayState");
            return (Criteria) this;
        }

        public Criteria andNumPayStateLessThanOrEqualTo(Byte value) {
            addCriterion("NUM_PAY_STATE <=", value, "numPayState");
            return (Criteria) this;
        }

        public Criteria andNumPayStateIn(List<Byte> values) {
            addCriterion("NUM_PAY_STATE in", values, "numPayState");
            return (Criteria) this;
        }

        public Criteria andNumPayStateNotIn(List<Byte> values) {
            addCriterion("NUM_PAY_STATE not in", values, "numPayState");
            return (Criteria) this;
        }

        public Criteria andNumPayStateBetween(Byte value1, Byte value2) {
            addCriterion("NUM_PAY_STATE between", value1, value2, "numPayState");
            return (Criteria) this;
        }

        public Criteria andNumPayStateNotBetween(Byte value1, Byte value2) {
            addCriterion("NUM_PAY_STATE not between", value1, value2, "numPayState");
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