package com.dower.sharerideapp.core.serverdb.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PaymentFlowExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PaymentFlowExample() {
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

        public Criteria andNumIdEqualTo(Integer value) {
            addCriterion("NUM_ID =", value, "numId");
            return (Criteria) this;
        }

        public Criteria andNumIdNotEqualTo(Integer value) {
            addCriterion("NUM_ID <>", value, "numId");
            return (Criteria) this;
        }

        public Criteria andNumIdGreaterThan(Integer value) {
            addCriterion("NUM_ID >", value, "numId");
            return (Criteria) this;
        }

        public Criteria andNumIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("NUM_ID >=", value, "numId");
            return (Criteria) this;
        }

        public Criteria andNumIdLessThan(Integer value) {
            addCriterion("NUM_ID <", value, "numId");
            return (Criteria) this;
        }

        public Criteria andNumIdLessThanOrEqualTo(Integer value) {
            addCriterion("NUM_ID <=", value, "numId");
            return (Criteria) this;
        }

        public Criteria andNumIdIn(List<Integer> values) {
            addCriterion("NUM_ID in", values, "numId");
            return (Criteria) this;
        }

        public Criteria andNumIdNotIn(List<Integer> values) {
            addCriterion("NUM_ID not in", values, "numId");
            return (Criteria) this;
        }

        public Criteria andNumIdBetween(Integer value1, Integer value2) {
            addCriterion("NUM_ID between", value1, value2, "numId");
            return (Criteria) this;
        }

        public Criteria andNumIdNotBetween(Integer value1, Integer value2) {
            addCriterion("NUM_ID not between", value1, value2, "numId");
            return (Criteria) this;
        }

        public Criteria andVcBankTypeIsNull() {
            addCriterion("VC_BANK_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andVcBankTypeIsNotNull() {
            addCriterion("VC_BANK_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andVcBankTypeEqualTo(String value) {
            addCriterion("VC_BANK_TYPE =", value, "vcBankType");
            return (Criteria) this;
        }

        public Criteria andVcBankTypeNotEqualTo(String value) {
            addCriterion("VC_BANK_TYPE <>", value, "vcBankType");
            return (Criteria) this;
        }

        public Criteria andVcBankTypeGreaterThan(String value) {
            addCriterion("VC_BANK_TYPE >", value, "vcBankType");
            return (Criteria) this;
        }

        public Criteria andVcBankTypeGreaterThanOrEqualTo(String value) {
            addCriterion("VC_BANK_TYPE >=", value, "vcBankType");
            return (Criteria) this;
        }

        public Criteria andVcBankTypeLessThan(String value) {
            addCriterion("VC_BANK_TYPE <", value, "vcBankType");
            return (Criteria) this;
        }

        public Criteria andVcBankTypeLessThanOrEqualTo(String value) {
            addCriterion("VC_BANK_TYPE <=", value, "vcBankType");
            return (Criteria) this;
        }

        public Criteria andVcBankTypeLike(String value) {
            addCriterion("VC_BANK_TYPE like", value, "vcBankType");
            return (Criteria) this;
        }

        public Criteria andVcBankTypeNotLike(String value) {
            addCriterion("VC_BANK_TYPE not like", value, "vcBankType");
            return (Criteria) this;
        }

        public Criteria andVcBankTypeIn(List<String> values) {
            addCriterion("VC_BANK_TYPE in", values, "vcBankType");
            return (Criteria) this;
        }

        public Criteria andVcBankTypeNotIn(List<String> values) {
            addCriterion("VC_BANK_TYPE not in", values, "vcBankType");
            return (Criteria) this;
        }

        public Criteria andVcBankTypeBetween(String value1, String value2) {
            addCriterion("VC_BANK_TYPE between", value1, value2, "vcBankType");
            return (Criteria) this;
        }

        public Criteria andVcBankTypeNotBetween(String value1, String value2) {
            addCriterion("VC_BANK_TYPE not between", value1, value2, "vcBankType");
            return (Criteria) this;
        }

        public Criteria andVcMchIdIsNull() {
            addCriterion("VC_MCH_ID is null");
            return (Criteria) this;
        }

        public Criteria andVcMchIdIsNotNull() {
            addCriterion("VC_MCH_ID is not null");
            return (Criteria) this;
        }

        public Criteria andVcMchIdEqualTo(String value) {
            addCriterion("VC_MCH_ID =", value, "vcMchId");
            return (Criteria) this;
        }

        public Criteria andVcMchIdNotEqualTo(String value) {
            addCriterion("VC_MCH_ID <>", value, "vcMchId");
            return (Criteria) this;
        }

        public Criteria andVcMchIdGreaterThan(String value) {
            addCriterion("VC_MCH_ID >", value, "vcMchId");
            return (Criteria) this;
        }

        public Criteria andVcMchIdGreaterThanOrEqualTo(String value) {
            addCriterion("VC_MCH_ID >=", value, "vcMchId");
            return (Criteria) this;
        }

        public Criteria andVcMchIdLessThan(String value) {
            addCriterion("VC_MCH_ID <", value, "vcMchId");
            return (Criteria) this;
        }

        public Criteria andVcMchIdLessThanOrEqualTo(String value) {
            addCriterion("VC_MCH_ID <=", value, "vcMchId");
            return (Criteria) this;
        }

        public Criteria andVcMchIdLike(String value) {
            addCriterion("VC_MCH_ID like", value, "vcMchId");
            return (Criteria) this;
        }

        public Criteria andVcMchIdNotLike(String value) {
            addCriterion("VC_MCH_ID not like", value, "vcMchId");
            return (Criteria) this;
        }

        public Criteria andVcMchIdIn(List<String> values) {
            addCriterion("VC_MCH_ID in", values, "vcMchId");
            return (Criteria) this;
        }

        public Criteria andVcMchIdNotIn(List<String> values) {
            addCriterion("VC_MCH_ID not in", values, "vcMchId");
            return (Criteria) this;
        }

        public Criteria andVcMchIdBetween(String value1, String value2) {
            addCriterion("VC_MCH_ID between", value1, value2, "vcMchId");
            return (Criteria) this;
        }

        public Criteria andVcMchIdNotBetween(String value1, String value2) {
            addCriterion("VC_MCH_ID not between", value1, value2, "vcMchId");
            return (Criteria) this;
        }

        public Criteria andVcOpenidIsNull() {
            addCriterion("VC_OPENID is null");
            return (Criteria) this;
        }

        public Criteria andVcOpenidIsNotNull() {
            addCriterion("VC_OPENID is not null");
            return (Criteria) this;
        }

        public Criteria andVcOpenidEqualTo(String value) {
            addCriterion("VC_OPENID =", value, "vcOpenid");
            return (Criteria) this;
        }

        public Criteria andVcOpenidNotEqualTo(String value) {
            addCriterion("VC_OPENID <>", value, "vcOpenid");
            return (Criteria) this;
        }

        public Criteria andVcOpenidGreaterThan(String value) {
            addCriterion("VC_OPENID >", value, "vcOpenid");
            return (Criteria) this;
        }

        public Criteria andVcOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("VC_OPENID >=", value, "vcOpenid");
            return (Criteria) this;
        }

        public Criteria andVcOpenidLessThan(String value) {
            addCriterion("VC_OPENID <", value, "vcOpenid");
            return (Criteria) this;
        }

        public Criteria andVcOpenidLessThanOrEqualTo(String value) {
            addCriterion("VC_OPENID <=", value, "vcOpenid");
            return (Criteria) this;
        }

        public Criteria andVcOpenidLike(String value) {
            addCriterion("VC_OPENID like", value, "vcOpenid");
            return (Criteria) this;
        }

        public Criteria andVcOpenidNotLike(String value) {
            addCriterion("VC_OPENID not like", value, "vcOpenid");
            return (Criteria) this;
        }

        public Criteria andVcOpenidIn(List<String> values) {
            addCriterion("VC_OPENID in", values, "vcOpenid");
            return (Criteria) this;
        }

        public Criteria andVcOpenidNotIn(List<String> values) {
            addCriterion("VC_OPENID not in", values, "vcOpenid");
            return (Criteria) this;
        }

        public Criteria andVcOpenidBetween(String value1, String value2) {
            addCriterion("VC_OPENID between", value1, value2, "vcOpenid");
            return (Criteria) this;
        }

        public Criteria andVcOpenidNotBetween(String value1, String value2) {
            addCriterion("VC_OPENID not between", value1, value2, "vcOpenid");
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

        public Criteria andNumTotalFeeIsNull() {
            addCriterion("NUM_TOTAL_FEE is null");
            return (Criteria) this;
        }

        public Criteria andNumTotalFeeIsNotNull() {
            addCriterion("NUM_TOTAL_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andNumTotalFeeEqualTo(Long value) {
            addCriterion("NUM_TOTAL_FEE =", value, "numTotalFee");
            return (Criteria) this;
        }

        public Criteria andNumTotalFeeNotEqualTo(Long value) {
            addCriterion("NUM_TOTAL_FEE <>", value, "numTotalFee");
            return (Criteria) this;
        }

        public Criteria andNumTotalFeeGreaterThan(Long value) {
            addCriterion("NUM_TOTAL_FEE >", value, "numTotalFee");
            return (Criteria) this;
        }

        public Criteria andNumTotalFeeGreaterThanOrEqualTo(Long value) {
            addCriterion("NUM_TOTAL_FEE >=", value, "numTotalFee");
            return (Criteria) this;
        }

        public Criteria andNumTotalFeeLessThan(Long value) {
            addCriterion("NUM_TOTAL_FEE <", value, "numTotalFee");
            return (Criteria) this;
        }

        public Criteria andNumTotalFeeLessThanOrEqualTo(Long value) {
            addCriterion("NUM_TOTAL_FEE <=", value, "numTotalFee");
            return (Criteria) this;
        }

        public Criteria andNumTotalFeeIn(List<Long> values) {
            addCriterion("NUM_TOTAL_FEE in", values, "numTotalFee");
            return (Criteria) this;
        }

        public Criteria andNumTotalFeeNotIn(List<Long> values) {
            addCriterion("NUM_TOTAL_FEE not in", values, "numTotalFee");
            return (Criteria) this;
        }

        public Criteria andNumTotalFeeBetween(Long value1, Long value2) {
            addCriterion("NUM_TOTAL_FEE between", value1, value2, "numTotalFee");
            return (Criteria) this;
        }

        public Criteria andNumTotalFeeNotBetween(Long value1, Long value2) {
            addCriterion("NUM_TOTAL_FEE not between", value1, value2, "numTotalFee");
            return (Criteria) this;
        }

        public Criteria andNumCashFeeIsNull() {
            addCriterion("NUM_CASH_FEE is null");
            return (Criteria) this;
        }

        public Criteria andNumCashFeeIsNotNull() {
            addCriterion("NUM_CASH_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andNumCashFeeEqualTo(Long value) {
            addCriterion("NUM_CASH_FEE =", value, "numCashFee");
            return (Criteria) this;
        }

        public Criteria andNumCashFeeNotEqualTo(Long value) {
            addCriterion("NUM_CASH_FEE <>", value, "numCashFee");
            return (Criteria) this;
        }

        public Criteria andNumCashFeeGreaterThan(Long value) {
            addCriterion("NUM_CASH_FEE >", value, "numCashFee");
            return (Criteria) this;
        }

        public Criteria andNumCashFeeGreaterThanOrEqualTo(Long value) {
            addCriterion("NUM_CASH_FEE >=", value, "numCashFee");
            return (Criteria) this;
        }

        public Criteria andNumCashFeeLessThan(Long value) {
            addCriterion("NUM_CASH_FEE <", value, "numCashFee");
            return (Criteria) this;
        }

        public Criteria andNumCashFeeLessThanOrEqualTo(Long value) {
            addCriterion("NUM_CASH_FEE <=", value, "numCashFee");
            return (Criteria) this;
        }

        public Criteria andNumCashFeeIn(List<Long> values) {
            addCriterion("NUM_CASH_FEE in", values, "numCashFee");
            return (Criteria) this;
        }

        public Criteria andNumCashFeeNotIn(List<Long> values) {
            addCriterion("NUM_CASH_FEE not in", values, "numCashFee");
            return (Criteria) this;
        }

        public Criteria andNumCashFeeBetween(Long value1, Long value2) {
            addCriterion("NUM_CASH_FEE between", value1, value2, "numCashFee");
            return (Criteria) this;
        }

        public Criteria andNumCashFeeNotBetween(Long value1, Long value2) {
            addCriterion("NUM_CASH_FEE not between", value1, value2, "numCashFee");
            return (Criteria) this;
        }

        public Criteria andVcTransactionIdIsNull() {
            addCriterion("VC_TRANSACTION_ID is null");
            return (Criteria) this;
        }

        public Criteria andVcTransactionIdIsNotNull() {
            addCriterion("VC_TRANSACTION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andVcTransactionIdEqualTo(String value) {
            addCriterion("VC_TRANSACTION_ID =", value, "vcTransactionId");
            return (Criteria) this;
        }

        public Criteria andVcTransactionIdNotEqualTo(String value) {
            addCriterion("VC_TRANSACTION_ID <>", value, "vcTransactionId");
            return (Criteria) this;
        }

        public Criteria andVcTransactionIdGreaterThan(String value) {
            addCriterion("VC_TRANSACTION_ID >", value, "vcTransactionId");
            return (Criteria) this;
        }

        public Criteria andVcTransactionIdGreaterThanOrEqualTo(String value) {
            addCriterion("VC_TRANSACTION_ID >=", value, "vcTransactionId");
            return (Criteria) this;
        }

        public Criteria andVcTransactionIdLessThan(String value) {
            addCriterion("VC_TRANSACTION_ID <", value, "vcTransactionId");
            return (Criteria) this;
        }

        public Criteria andVcTransactionIdLessThanOrEqualTo(String value) {
            addCriterion("VC_TRANSACTION_ID <=", value, "vcTransactionId");
            return (Criteria) this;
        }

        public Criteria andVcTransactionIdLike(String value) {
            addCriterion("VC_TRANSACTION_ID like", value, "vcTransactionId");
            return (Criteria) this;
        }

        public Criteria andVcTransactionIdNotLike(String value) {
            addCriterion("VC_TRANSACTION_ID not like", value, "vcTransactionId");
            return (Criteria) this;
        }

        public Criteria andVcTransactionIdIn(List<String> values) {
            addCriterion("VC_TRANSACTION_ID in", values, "vcTransactionId");
            return (Criteria) this;
        }

        public Criteria andVcTransactionIdNotIn(List<String> values) {
            addCriterion("VC_TRANSACTION_ID not in", values, "vcTransactionId");
            return (Criteria) this;
        }

        public Criteria andVcTransactionIdBetween(String value1, String value2) {
            addCriterion("VC_TRANSACTION_ID between", value1, value2, "vcTransactionId");
            return (Criteria) this;
        }

        public Criteria andVcTransactionIdNotBetween(String value1, String value2) {
            addCriterion("VC_TRANSACTION_ID not between", value1, value2, "vcTransactionId");
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