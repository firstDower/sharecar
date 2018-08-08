package com.dower.sharerideadmin.core.serverdb.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NnaOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NnaOrderExample() {
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

        public Criteria andNumOrderIdIsNull() {
            addCriterion("NUM_ORDER_ID is null");
            return (Criteria) this;
        }

        public Criteria andNumOrderIdIsNotNull() {
            addCriterion("NUM_ORDER_ID is not null");
            return (Criteria) this;
        }

        public Criteria andNumOrderIdEqualTo(Integer value) {
            addCriterion("NUM_ORDER_ID =", value, "numOrderId");
            return (Criteria) this;
        }

        public Criteria andNumOrderIdNotEqualTo(Integer value) {
            addCriterion("NUM_ORDER_ID <>", value, "numOrderId");
            return (Criteria) this;
        }

        public Criteria andNumOrderIdGreaterThan(Integer value) {
            addCriterion("NUM_ORDER_ID >", value, "numOrderId");
            return (Criteria) this;
        }

        public Criteria andNumOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("NUM_ORDER_ID >=", value, "numOrderId");
            return (Criteria) this;
        }

        public Criteria andNumOrderIdLessThan(Integer value) {
            addCriterion("NUM_ORDER_ID <", value, "numOrderId");
            return (Criteria) this;
        }

        public Criteria andNumOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("NUM_ORDER_ID <=", value, "numOrderId");
            return (Criteria) this;
        }

        public Criteria andNumOrderIdIn(List<Integer> values) {
            addCriterion("NUM_ORDER_ID in", values, "numOrderId");
            return (Criteria) this;
        }

        public Criteria andNumOrderIdNotIn(List<Integer> values) {
            addCriterion("NUM_ORDER_ID not in", values, "numOrderId");
            return (Criteria) this;
        }

        public Criteria andNumOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("NUM_ORDER_ID between", value1, value2, "numOrderId");
            return (Criteria) this;
        }

        public Criteria andNumOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("NUM_ORDER_ID not between", value1, value2, "numOrderId");
            return (Criteria) this;
        }

        public Criteria andVcOrderNameIsNull() {
            addCriterion("VC_ORDER_NAME is null");
            return (Criteria) this;
        }

        public Criteria andVcOrderNameIsNotNull() {
            addCriterion("VC_ORDER_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andVcOrderNameEqualTo(String value) {
            addCriterion("VC_ORDER_NAME =", value, "vcOrderName");
            return (Criteria) this;
        }

        public Criteria andVcOrderNameNotEqualTo(String value) {
            addCriterion("VC_ORDER_NAME <>", value, "vcOrderName");
            return (Criteria) this;
        }

        public Criteria andVcOrderNameGreaterThan(String value) {
            addCriterion("VC_ORDER_NAME >", value, "vcOrderName");
            return (Criteria) this;
        }

        public Criteria andVcOrderNameGreaterThanOrEqualTo(String value) {
            addCriterion("VC_ORDER_NAME >=", value, "vcOrderName");
            return (Criteria) this;
        }

        public Criteria andVcOrderNameLessThan(String value) {
            addCriterion("VC_ORDER_NAME <", value, "vcOrderName");
            return (Criteria) this;
        }

        public Criteria andVcOrderNameLessThanOrEqualTo(String value) {
            addCriterion("VC_ORDER_NAME <=", value, "vcOrderName");
            return (Criteria) this;
        }

        public Criteria andVcOrderNameLike(String value) {
            addCriterion("VC_ORDER_NAME like", value, "vcOrderName");
            return (Criteria) this;
        }

        public Criteria andVcOrderNameNotLike(String value) {
            addCriterion("VC_ORDER_NAME not like", value, "vcOrderName");
            return (Criteria) this;
        }

        public Criteria andVcOrderNameIn(List<String> values) {
            addCriterion("VC_ORDER_NAME in", values, "vcOrderName");
            return (Criteria) this;
        }

        public Criteria andVcOrderNameNotIn(List<String> values) {
            addCriterion("VC_ORDER_NAME not in", values, "vcOrderName");
            return (Criteria) this;
        }

        public Criteria andVcOrderNameBetween(String value1, String value2) {
            addCriterion("VC_ORDER_NAME between", value1, value2, "vcOrderName");
            return (Criteria) this;
        }

        public Criteria andVcOrderNameNotBetween(String value1, String value2) {
            addCriterion("VC_ORDER_NAME not between", value1, value2, "vcOrderName");
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

        public Criteria andNumPurchasePriceIsNull() {
            addCriterion("NUM_PURCHASE_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andNumPurchasePriceIsNotNull() {
            addCriterion("NUM_PURCHASE_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andNumPurchasePriceEqualTo(BigDecimal value) {
            addCriterion("NUM_PURCHASE_PRICE =", value, "numPurchasePrice");
            return (Criteria) this;
        }

        public Criteria andNumPurchasePriceNotEqualTo(BigDecimal value) {
            addCriterion("NUM_PURCHASE_PRICE <>", value, "numPurchasePrice");
            return (Criteria) this;
        }

        public Criteria andNumPurchasePriceGreaterThan(BigDecimal value) {
            addCriterion("NUM_PURCHASE_PRICE >", value, "numPurchasePrice");
            return (Criteria) this;
        }

        public Criteria andNumPurchasePriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NUM_PURCHASE_PRICE >=", value, "numPurchasePrice");
            return (Criteria) this;
        }

        public Criteria andNumPurchasePriceLessThan(BigDecimal value) {
            addCriterion("NUM_PURCHASE_PRICE <", value, "numPurchasePrice");
            return (Criteria) this;
        }

        public Criteria andNumPurchasePriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NUM_PURCHASE_PRICE <=", value, "numPurchasePrice");
            return (Criteria) this;
        }

        public Criteria andNumPurchasePriceIn(List<BigDecimal> values) {
            addCriterion("NUM_PURCHASE_PRICE in", values, "numPurchasePrice");
            return (Criteria) this;
        }

        public Criteria andNumPurchasePriceNotIn(List<BigDecimal> values) {
            addCriterion("NUM_PURCHASE_PRICE not in", values, "numPurchasePrice");
            return (Criteria) this;
        }

        public Criteria andNumPurchasePriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NUM_PURCHASE_PRICE between", value1, value2, "numPurchasePrice");
            return (Criteria) this;
        }

        public Criteria andNumPurchasePriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NUM_PURCHASE_PRICE not between", value1, value2, "numPurchasePrice");
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

        public Criteria andNumPrepaidIsNull() {
            addCriterion("NUM_PREPAID is null");
            return (Criteria) this;
        }

        public Criteria andNumPrepaidIsNotNull() {
            addCriterion("NUM_PREPAID is not null");
            return (Criteria) this;
        }

        public Criteria andNumPrepaidEqualTo(BigDecimal value) {
            addCriterion("NUM_PREPAID =", value, "numPrepaid");
            return (Criteria) this;
        }

        public Criteria andNumPrepaidNotEqualTo(BigDecimal value) {
            addCriterion("NUM_PREPAID <>", value, "numPrepaid");
            return (Criteria) this;
        }

        public Criteria andNumPrepaidGreaterThan(BigDecimal value) {
            addCriterion("NUM_PREPAID >", value, "numPrepaid");
            return (Criteria) this;
        }

        public Criteria andNumPrepaidGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NUM_PREPAID >=", value, "numPrepaid");
            return (Criteria) this;
        }

        public Criteria andNumPrepaidLessThan(BigDecimal value) {
            addCriterion("NUM_PREPAID <", value, "numPrepaid");
            return (Criteria) this;
        }

        public Criteria andNumPrepaidLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NUM_PREPAID <=", value, "numPrepaid");
            return (Criteria) this;
        }

        public Criteria andNumPrepaidIn(List<BigDecimal> values) {
            addCriterion("NUM_PREPAID in", values, "numPrepaid");
            return (Criteria) this;
        }

        public Criteria andNumPrepaidNotIn(List<BigDecimal> values) {
            addCriterion("NUM_PREPAID not in", values, "numPrepaid");
            return (Criteria) this;
        }

        public Criteria andNumPrepaidBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NUM_PREPAID between", value1, value2, "numPrepaid");
            return (Criteria) this;
        }

        public Criteria andNumPrepaidNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NUM_PREPAID not between", value1, value2, "numPrepaid");
            return (Criteria) this;
        }

        public Criteria andNumActualPaymentIsNull() {
            addCriterion("NUM_ACTUAL_PAYMENT is null");
            return (Criteria) this;
        }

        public Criteria andNumActualPaymentIsNotNull() {
            addCriterion("NUM_ACTUAL_PAYMENT is not null");
            return (Criteria) this;
        }

        public Criteria andNumActualPaymentEqualTo(BigDecimal value) {
            addCriterion("NUM_ACTUAL_PAYMENT =", value, "numActualPayment");
            return (Criteria) this;
        }

        public Criteria andNumActualPaymentNotEqualTo(BigDecimal value) {
            addCriterion("NUM_ACTUAL_PAYMENT <>", value, "numActualPayment");
            return (Criteria) this;
        }

        public Criteria andNumActualPaymentGreaterThan(BigDecimal value) {
            addCriterion("NUM_ACTUAL_PAYMENT >", value, "numActualPayment");
            return (Criteria) this;
        }

        public Criteria andNumActualPaymentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NUM_ACTUAL_PAYMENT >=", value, "numActualPayment");
            return (Criteria) this;
        }

        public Criteria andNumActualPaymentLessThan(BigDecimal value) {
            addCriterion("NUM_ACTUAL_PAYMENT <", value, "numActualPayment");
            return (Criteria) this;
        }

        public Criteria andNumActualPaymentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NUM_ACTUAL_PAYMENT <=", value, "numActualPayment");
            return (Criteria) this;
        }

        public Criteria andNumActualPaymentIn(List<BigDecimal> values) {
            addCriterion("NUM_ACTUAL_PAYMENT in", values, "numActualPayment");
            return (Criteria) this;
        }

        public Criteria andNumActualPaymentNotIn(List<BigDecimal> values) {
            addCriterion("NUM_ACTUAL_PAYMENT not in", values, "numActualPayment");
            return (Criteria) this;
        }

        public Criteria andNumActualPaymentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NUM_ACTUAL_PAYMENT between", value1, value2, "numActualPayment");
            return (Criteria) this;
        }

        public Criteria andNumActualPaymentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NUM_ACTUAL_PAYMENT not between", value1, value2, "numActualPayment");
            return (Criteria) this;
        }

        public Criteria andNumTailPaymentIsNull() {
            addCriterion("NUM_TAIL_PAYMENT is null");
            return (Criteria) this;
        }

        public Criteria andNumTailPaymentIsNotNull() {
            addCriterion("NUM_TAIL_PAYMENT is not null");
            return (Criteria) this;
        }

        public Criteria andNumTailPaymentEqualTo(BigDecimal value) {
            addCriterion("NUM_TAIL_PAYMENT =", value, "numTailPayment");
            return (Criteria) this;
        }

        public Criteria andNumTailPaymentNotEqualTo(BigDecimal value) {
            addCriterion("NUM_TAIL_PAYMENT <>", value, "numTailPayment");
            return (Criteria) this;
        }

        public Criteria andNumTailPaymentGreaterThan(BigDecimal value) {
            addCriterion("NUM_TAIL_PAYMENT >", value, "numTailPayment");
            return (Criteria) this;
        }

        public Criteria andNumTailPaymentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NUM_TAIL_PAYMENT >=", value, "numTailPayment");
            return (Criteria) this;
        }

        public Criteria andNumTailPaymentLessThan(BigDecimal value) {
            addCriterion("NUM_TAIL_PAYMENT <", value, "numTailPayment");
            return (Criteria) this;
        }

        public Criteria andNumTailPaymentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NUM_TAIL_PAYMENT <=", value, "numTailPayment");
            return (Criteria) this;
        }

        public Criteria andNumTailPaymentIn(List<BigDecimal> values) {
            addCriterion("NUM_TAIL_PAYMENT in", values, "numTailPayment");
            return (Criteria) this;
        }

        public Criteria andNumTailPaymentNotIn(List<BigDecimal> values) {
            addCriterion("NUM_TAIL_PAYMENT not in", values, "numTailPayment");
            return (Criteria) this;
        }

        public Criteria andNumTailPaymentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NUM_TAIL_PAYMENT between", value1, value2, "numTailPayment");
            return (Criteria) this;
        }

        public Criteria andNumTailPaymentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NUM_TAIL_PAYMENT not between", value1, value2, "numTailPayment");
            return (Criteria) this;
        }

        public Criteria andNumFreightIsNull() {
            addCriterion("NUM_FREIGHT is null");
            return (Criteria) this;
        }

        public Criteria andNumFreightIsNotNull() {
            addCriterion("NUM_FREIGHT is not null");
            return (Criteria) this;
        }

        public Criteria andNumFreightEqualTo(BigDecimal value) {
            addCriterion("NUM_FREIGHT =", value, "numFreight");
            return (Criteria) this;
        }

        public Criteria andNumFreightNotEqualTo(BigDecimal value) {
            addCriterion("NUM_FREIGHT <>", value, "numFreight");
            return (Criteria) this;
        }

        public Criteria andNumFreightGreaterThan(BigDecimal value) {
            addCriterion("NUM_FREIGHT >", value, "numFreight");
            return (Criteria) this;
        }

        public Criteria andNumFreightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NUM_FREIGHT >=", value, "numFreight");
            return (Criteria) this;
        }

        public Criteria andNumFreightLessThan(BigDecimal value) {
            addCriterion("NUM_FREIGHT <", value, "numFreight");
            return (Criteria) this;
        }

        public Criteria andNumFreightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NUM_FREIGHT <=", value, "numFreight");
            return (Criteria) this;
        }

        public Criteria andNumFreightIn(List<BigDecimal> values) {
            addCriterion("NUM_FREIGHT in", values, "numFreight");
            return (Criteria) this;
        }

        public Criteria andNumFreightNotIn(List<BigDecimal> values) {
            addCriterion("NUM_FREIGHT not in", values, "numFreight");
            return (Criteria) this;
        }

        public Criteria andNumFreightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NUM_FREIGHT between", value1, value2, "numFreight");
            return (Criteria) this;
        }

        public Criteria andNumFreightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NUM_FREIGHT not between", value1, value2, "numFreight");
            return (Criteria) this;
        }

        public Criteria andNumInstallFeeIsNull() {
            addCriterion("NUM_INSTALL_FEE is null");
            return (Criteria) this;
        }

        public Criteria andNumInstallFeeIsNotNull() {
            addCriterion("NUM_INSTALL_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andNumInstallFeeEqualTo(BigDecimal value) {
            addCriterion("NUM_INSTALL_FEE =", value, "numInstallFee");
            return (Criteria) this;
        }

        public Criteria andNumInstallFeeNotEqualTo(BigDecimal value) {
            addCriterion("NUM_INSTALL_FEE <>", value, "numInstallFee");
            return (Criteria) this;
        }

        public Criteria andNumInstallFeeGreaterThan(BigDecimal value) {
            addCriterion("NUM_INSTALL_FEE >", value, "numInstallFee");
            return (Criteria) this;
        }

        public Criteria andNumInstallFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NUM_INSTALL_FEE >=", value, "numInstallFee");
            return (Criteria) this;
        }

        public Criteria andNumInstallFeeLessThan(BigDecimal value) {
            addCriterion("NUM_INSTALL_FEE <", value, "numInstallFee");
            return (Criteria) this;
        }

        public Criteria andNumInstallFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NUM_INSTALL_FEE <=", value, "numInstallFee");
            return (Criteria) this;
        }

        public Criteria andNumInstallFeeIn(List<BigDecimal> values) {
            addCriterion("NUM_INSTALL_FEE in", values, "numInstallFee");
            return (Criteria) this;
        }

        public Criteria andNumInstallFeeNotIn(List<BigDecimal> values) {
            addCriterion("NUM_INSTALL_FEE not in", values, "numInstallFee");
            return (Criteria) this;
        }

        public Criteria andNumInstallFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NUM_INSTALL_FEE between", value1, value2, "numInstallFee");
            return (Criteria) this;
        }

        public Criteria andNumInstallFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NUM_INSTALL_FEE not between", value1, value2, "numInstallFee");
            return (Criteria) this;
        }

        public Criteria andNumOtherFeeIsNull() {
            addCriterion("NUM_OTHER_FEE is null");
            return (Criteria) this;
        }

        public Criteria andNumOtherFeeIsNotNull() {
            addCriterion("NUM_OTHER_FEE is not null");
            return (Criteria) this;
        }

        public Criteria andNumOtherFeeEqualTo(BigDecimal value) {
            addCriterion("NUM_OTHER_FEE =", value, "numOtherFee");
            return (Criteria) this;
        }

        public Criteria andNumOtherFeeNotEqualTo(BigDecimal value) {
            addCriterion("NUM_OTHER_FEE <>", value, "numOtherFee");
            return (Criteria) this;
        }

        public Criteria andNumOtherFeeGreaterThan(BigDecimal value) {
            addCriterion("NUM_OTHER_FEE >", value, "numOtherFee");
            return (Criteria) this;
        }

        public Criteria andNumOtherFeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NUM_OTHER_FEE >=", value, "numOtherFee");
            return (Criteria) this;
        }

        public Criteria andNumOtherFeeLessThan(BigDecimal value) {
            addCriterion("NUM_OTHER_FEE <", value, "numOtherFee");
            return (Criteria) this;
        }

        public Criteria andNumOtherFeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NUM_OTHER_FEE <=", value, "numOtherFee");
            return (Criteria) this;
        }

        public Criteria andNumOtherFeeIn(List<BigDecimal> values) {
            addCriterion("NUM_OTHER_FEE in", values, "numOtherFee");
            return (Criteria) this;
        }

        public Criteria andNumOtherFeeNotIn(List<BigDecimal> values) {
            addCriterion("NUM_OTHER_FEE not in", values, "numOtherFee");
            return (Criteria) this;
        }

        public Criteria andNumOtherFeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NUM_OTHER_FEE between", value1, value2, "numOtherFee");
            return (Criteria) this;
        }

        public Criteria andNumOtherFeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NUM_OTHER_FEE not between", value1, value2, "numOtherFee");
            return (Criteria) this;
        }

        public Criteria andNumStatusIsNull() {
            addCriterion("NUM_STATUS is null");
            return (Criteria) this;
        }

        public Criteria andNumStatusIsNotNull() {
            addCriterion("NUM_STATUS is not null");
            return (Criteria) this;
        }

        public Criteria andNumStatusEqualTo(Integer value) {
            addCriterion("NUM_STATUS =", value, "numStatus");
            return (Criteria) this;
        }

        public Criteria andNumStatusNotEqualTo(Integer value) {
            addCriterion("NUM_STATUS <>", value, "numStatus");
            return (Criteria) this;
        }

        public Criteria andNumStatusGreaterThan(Integer value) {
            addCriterion("NUM_STATUS >", value, "numStatus");
            return (Criteria) this;
        }

        public Criteria andNumStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("NUM_STATUS >=", value, "numStatus");
            return (Criteria) this;
        }

        public Criteria andNumStatusLessThan(Integer value) {
            addCriterion("NUM_STATUS <", value, "numStatus");
            return (Criteria) this;
        }

        public Criteria andNumStatusLessThanOrEqualTo(Integer value) {
            addCriterion("NUM_STATUS <=", value, "numStatus");
            return (Criteria) this;
        }

        public Criteria andNumStatusIn(List<Integer> values) {
            addCriterion("NUM_STATUS in", values, "numStatus");
            return (Criteria) this;
        }

        public Criteria andNumStatusNotIn(List<Integer> values) {
            addCriterion("NUM_STATUS not in", values, "numStatus");
            return (Criteria) this;
        }

        public Criteria andNumStatusBetween(Integer value1, Integer value2) {
            addCriterion("NUM_STATUS between", value1, value2, "numStatus");
            return (Criteria) this;
        }

        public Criteria andNumStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("NUM_STATUS not between", value1, value2, "numStatus");
            return (Criteria) this;
        }

        public Criteria andNumIsdelIsNull() {
            addCriterion("NUM_ISDEL is null");
            return (Criteria) this;
        }

        public Criteria andNumIsdelIsNotNull() {
            addCriterion("NUM_ISDEL is not null");
            return (Criteria) this;
        }

        public Criteria andNumIsdelEqualTo(Integer value) {
            addCriterion("NUM_ISDEL =", value, "numIsdel");
            return (Criteria) this;
        }

        public Criteria andNumIsdelNotEqualTo(Integer value) {
            addCriterion("NUM_ISDEL <>", value, "numIsdel");
            return (Criteria) this;
        }

        public Criteria andNumIsdelGreaterThan(Integer value) {
            addCriterion("NUM_ISDEL >", value, "numIsdel");
            return (Criteria) this;
        }

        public Criteria andNumIsdelGreaterThanOrEqualTo(Integer value) {
            addCriterion("NUM_ISDEL >=", value, "numIsdel");
            return (Criteria) this;
        }

        public Criteria andNumIsdelLessThan(Integer value) {
            addCriterion("NUM_ISDEL <", value, "numIsdel");
            return (Criteria) this;
        }

        public Criteria andNumIsdelLessThanOrEqualTo(Integer value) {
            addCriterion("NUM_ISDEL <=", value, "numIsdel");
            return (Criteria) this;
        }

        public Criteria andNumIsdelIn(List<Integer> values) {
            addCriterion("NUM_ISDEL in", values, "numIsdel");
            return (Criteria) this;
        }

        public Criteria andNumIsdelNotIn(List<Integer> values) {
            addCriterion("NUM_ISDEL not in", values, "numIsdel");
            return (Criteria) this;
        }

        public Criteria andNumIsdelBetween(Integer value1, Integer value2) {
            addCriterion("NUM_ISDEL between", value1, value2, "numIsdel");
            return (Criteria) this;
        }

        public Criteria andNumIsdelNotBetween(Integer value1, Integer value2) {
            addCriterion("NUM_ISDEL not between", value1, value2, "numIsdel");
            return (Criteria) this;
        }

        public Criteria andVcProductDescIsNull() {
            addCriterion("VC_PRODUCT_DESC is null");
            return (Criteria) this;
        }

        public Criteria andVcProductDescIsNotNull() {
            addCriterion("VC_PRODUCT_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andVcProductDescEqualTo(String value) {
            addCriterion("VC_PRODUCT_DESC =", value, "vcProductDesc");
            return (Criteria) this;
        }

        public Criteria andVcProductDescNotEqualTo(String value) {
            addCriterion("VC_PRODUCT_DESC <>", value, "vcProductDesc");
            return (Criteria) this;
        }

        public Criteria andVcProductDescGreaterThan(String value) {
            addCriterion("VC_PRODUCT_DESC >", value, "vcProductDesc");
            return (Criteria) this;
        }

        public Criteria andVcProductDescGreaterThanOrEqualTo(String value) {
            addCriterion("VC_PRODUCT_DESC >=", value, "vcProductDesc");
            return (Criteria) this;
        }

        public Criteria andVcProductDescLessThan(String value) {
            addCriterion("VC_PRODUCT_DESC <", value, "vcProductDesc");
            return (Criteria) this;
        }

        public Criteria andVcProductDescLessThanOrEqualTo(String value) {
            addCriterion("VC_PRODUCT_DESC <=", value, "vcProductDesc");
            return (Criteria) this;
        }

        public Criteria andVcProductDescLike(String value) {
            addCriterion("VC_PRODUCT_DESC like", value, "vcProductDesc");
            return (Criteria) this;
        }

        public Criteria andVcProductDescNotLike(String value) {
            addCriterion("VC_PRODUCT_DESC not like", value, "vcProductDesc");
            return (Criteria) this;
        }

        public Criteria andVcProductDescIn(List<String> values) {
            addCriterion("VC_PRODUCT_DESC in", values, "vcProductDesc");
            return (Criteria) this;
        }

        public Criteria andVcProductDescNotIn(List<String> values) {
            addCriterion("VC_PRODUCT_DESC not in", values, "vcProductDesc");
            return (Criteria) this;
        }

        public Criteria andVcProductDescBetween(String value1, String value2) {
            addCriterion("VC_PRODUCT_DESC between", value1, value2, "vcProductDesc");
            return (Criteria) this;
        }

        public Criteria andVcProductDescNotBetween(String value1, String value2) {
            addCriterion("VC_PRODUCT_DESC not between", value1, value2, "vcProductDesc");
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

        public Criteria andDatTailPaymentDateIsNull() {
            addCriterion("DAT_TAIL_PAYMENT_DATE is null");
            return (Criteria) this;
        }

        public Criteria andDatTailPaymentDateIsNotNull() {
            addCriterion("DAT_TAIL_PAYMENT_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andDatTailPaymentDateEqualTo(Date value) {
            addCriterion("DAT_TAIL_PAYMENT_DATE =", value, "datTailPaymentDate");
            return (Criteria) this;
        }

        public Criteria andDatTailPaymentDateNotEqualTo(Date value) {
            addCriterion("DAT_TAIL_PAYMENT_DATE <>", value, "datTailPaymentDate");
            return (Criteria) this;
        }

        public Criteria andDatTailPaymentDateGreaterThan(Date value) {
            addCriterion("DAT_TAIL_PAYMENT_DATE >", value, "datTailPaymentDate");
            return (Criteria) this;
        }

        public Criteria andDatTailPaymentDateGreaterThanOrEqualTo(Date value) {
            addCriterion("DAT_TAIL_PAYMENT_DATE >=", value, "datTailPaymentDate");
            return (Criteria) this;
        }

        public Criteria andDatTailPaymentDateLessThan(Date value) {
            addCriterion("DAT_TAIL_PAYMENT_DATE <", value, "datTailPaymentDate");
            return (Criteria) this;
        }

        public Criteria andDatTailPaymentDateLessThanOrEqualTo(Date value) {
            addCriterion("DAT_TAIL_PAYMENT_DATE <=", value, "datTailPaymentDate");
            return (Criteria) this;
        }

        public Criteria andDatTailPaymentDateIn(List<Date> values) {
            addCriterion("DAT_TAIL_PAYMENT_DATE in", values, "datTailPaymentDate");
            return (Criteria) this;
        }

        public Criteria andDatTailPaymentDateNotIn(List<Date> values) {
            addCriterion("DAT_TAIL_PAYMENT_DATE not in", values, "datTailPaymentDate");
            return (Criteria) this;
        }

        public Criteria andDatTailPaymentDateBetween(Date value1, Date value2) {
            addCriterion("DAT_TAIL_PAYMENT_DATE between", value1, value2, "datTailPaymentDate");
            return (Criteria) this;
        }

        public Criteria andDatTailPaymentDateNotBetween(Date value1, Date value2) {
            addCriterion("DAT_TAIL_PAYMENT_DATE not between", value1, value2, "datTailPaymentDate");
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

        public Criteria andDatCreateDateIsNull() {
            addCriterion("DAT_CREATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andDatCreateDateIsNotNull() {
            addCriterion("DAT_CREATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andDatCreateDateEqualTo(Date value) {
            addCriterion("DAT_CREATE_DATE =", value, "datCreateDate");
            return (Criteria) this;
        }

        public Criteria andDatCreateDateNotEqualTo(Date value) {
            addCriterion("DAT_CREATE_DATE <>", value, "datCreateDate");
            return (Criteria) this;
        }

        public Criteria andDatCreateDateGreaterThan(Date value) {
            addCriterion("DAT_CREATE_DATE >", value, "datCreateDate");
            return (Criteria) this;
        }

        public Criteria andDatCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("DAT_CREATE_DATE >=", value, "datCreateDate");
            return (Criteria) this;
        }

        public Criteria andDatCreateDateLessThan(Date value) {
            addCriterion("DAT_CREATE_DATE <", value, "datCreateDate");
            return (Criteria) this;
        }

        public Criteria andDatCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("DAT_CREATE_DATE <=", value, "datCreateDate");
            return (Criteria) this;
        }

        public Criteria andDatCreateDateIn(List<Date> values) {
            addCriterion("DAT_CREATE_DATE in", values, "datCreateDate");
            return (Criteria) this;
        }

        public Criteria andDatCreateDateNotIn(List<Date> values) {
            addCriterion("DAT_CREATE_DATE not in", values, "datCreateDate");
            return (Criteria) this;
        }

        public Criteria andDatCreateDateBetween(Date value1, Date value2) {
            addCriterion("DAT_CREATE_DATE between", value1, value2, "datCreateDate");
            return (Criteria) this;
        }

        public Criteria andDatCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("DAT_CREATE_DATE not between", value1, value2, "datCreateDate");
            return (Criteria) this;
        }

        public Criteria andVcOrderDescIsNull() {
            addCriterion("VC_ORDER_DESC is null");
            return (Criteria) this;
        }

        public Criteria andVcOrderDescIsNotNull() {
            addCriterion("VC_ORDER_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andVcOrderDescEqualTo(String value) {
            addCriterion("VC_ORDER_DESC =", value, "vcOrderDesc");
            return (Criteria) this;
        }

        public Criteria andVcOrderDescNotEqualTo(String value) {
            addCriterion("VC_ORDER_DESC <>", value, "vcOrderDesc");
            return (Criteria) this;
        }

        public Criteria andVcOrderDescGreaterThan(String value) {
            addCriterion("VC_ORDER_DESC >", value, "vcOrderDesc");
            return (Criteria) this;
        }

        public Criteria andVcOrderDescGreaterThanOrEqualTo(String value) {
            addCriterion("VC_ORDER_DESC >=", value, "vcOrderDesc");
            return (Criteria) this;
        }

        public Criteria andVcOrderDescLessThan(String value) {
            addCriterion("VC_ORDER_DESC <", value, "vcOrderDesc");
            return (Criteria) this;
        }

        public Criteria andVcOrderDescLessThanOrEqualTo(String value) {
            addCriterion("VC_ORDER_DESC <=", value, "vcOrderDesc");
            return (Criteria) this;
        }

        public Criteria andVcOrderDescLike(String value) {
            addCriterion("VC_ORDER_DESC like", value, "vcOrderDesc");
            return (Criteria) this;
        }

        public Criteria andVcOrderDescNotLike(String value) {
            addCriterion("VC_ORDER_DESC not like", value, "vcOrderDesc");
            return (Criteria) this;
        }

        public Criteria andVcOrderDescIn(List<String> values) {
            addCriterion("VC_ORDER_DESC in", values, "vcOrderDesc");
            return (Criteria) this;
        }

        public Criteria andVcOrderDescNotIn(List<String> values) {
            addCriterion("VC_ORDER_DESC not in", values, "vcOrderDesc");
            return (Criteria) this;
        }

        public Criteria andVcOrderDescBetween(String value1, String value2) {
            addCriterion("VC_ORDER_DESC between", value1, value2, "vcOrderDesc");
            return (Criteria) this;
        }

        public Criteria andVcOrderDescNotBetween(String value1, String value2) {
            addCriterion("VC_ORDER_DESC not between", value1, value2, "vcOrderDesc");
            return (Criteria) this;
        }

        public Criteria andVcClientNameIsNull() {
            addCriterion("VC_CLIENT_NAME is null");
            return (Criteria) this;
        }

        public Criteria andVcClientNameIsNotNull() {
            addCriterion("VC_CLIENT_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andVcClientNameEqualTo(String value) {
            addCriterion("VC_CLIENT_NAME =", value, "vcClientName");
            return (Criteria) this;
        }

        public Criteria andVcClientNameNotEqualTo(String value) {
            addCriterion("VC_CLIENT_NAME <>", value, "vcClientName");
            return (Criteria) this;
        }

        public Criteria andVcClientNameGreaterThan(String value) {
            addCriterion("VC_CLIENT_NAME >", value, "vcClientName");
            return (Criteria) this;
        }

        public Criteria andVcClientNameGreaterThanOrEqualTo(String value) {
            addCriterion("VC_CLIENT_NAME >=", value, "vcClientName");
            return (Criteria) this;
        }

        public Criteria andVcClientNameLessThan(String value) {
            addCriterion("VC_CLIENT_NAME <", value, "vcClientName");
            return (Criteria) this;
        }

        public Criteria andVcClientNameLessThanOrEqualTo(String value) {
            addCriterion("VC_CLIENT_NAME <=", value, "vcClientName");
            return (Criteria) this;
        }

        public Criteria andVcClientNameLike(String value) {
            addCriterion("VC_CLIENT_NAME like", value, "vcClientName");
            return (Criteria) this;
        }

        public Criteria andVcClientNameNotLike(String value) {
            addCriterion("VC_CLIENT_NAME not like", value, "vcClientName");
            return (Criteria) this;
        }

        public Criteria andVcClientNameIn(List<String> values) {
            addCriterion("VC_CLIENT_NAME in", values, "vcClientName");
            return (Criteria) this;
        }

        public Criteria andVcClientNameNotIn(List<String> values) {
            addCriterion("VC_CLIENT_NAME not in", values, "vcClientName");
            return (Criteria) this;
        }

        public Criteria andVcClientNameBetween(String value1, String value2) {
            addCriterion("VC_CLIENT_NAME between", value1, value2, "vcClientName");
            return (Criteria) this;
        }

        public Criteria andVcClientNameNotBetween(String value1, String value2) {
            addCriterion("VC_CLIENT_NAME not between", value1, value2, "vcClientName");
            return (Criteria) this;
        }

        public Criteria andVcClientPhoneIsNull() {
            addCriterion("VC_CLIENT_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andVcClientPhoneIsNotNull() {
            addCriterion("VC_CLIENT_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andVcClientPhoneEqualTo(String value) {
            addCriterion("VC_CLIENT_PHONE =", value, "vcClientPhone");
            return (Criteria) this;
        }

        public Criteria andVcClientPhoneNotEqualTo(String value) {
            addCriterion("VC_CLIENT_PHONE <>", value, "vcClientPhone");
            return (Criteria) this;
        }

        public Criteria andVcClientPhoneGreaterThan(String value) {
            addCriterion("VC_CLIENT_PHONE >", value, "vcClientPhone");
            return (Criteria) this;
        }

        public Criteria andVcClientPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("VC_CLIENT_PHONE >=", value, "vcClientPhone");
            return (Criteria) this;
        }

        public Criteria andVcClientPhoneLessThan(String value) {
            addCriterion("VC_CLIENT_PHONE <", value, "vcClientPhone");
            return (Criteria) this;
        }

        public Criteria andVcClientPhoneLessThanOrEqualTo(String value) {
            addCriterion("VC_CLIENT_PHONE <=", value, "vcClientPhone");
            return (Criteria) this;
        }

        public Criteria andVcClientPhoneLike(String value) {
            addCriterion("VC_CLIENT_PHONE like", value, "vcClientPhone");
            return (Criteria) this;
        }

        public Criteria andVcClientPhoneNotLike(String value) {
            addCriterion("VC_CLIENT_PHONE not like", value, "vcClientPhone");
            return (Criteria) this;
        }

        public Criteria andVcClientPhoneIn(List<String> values) {
            addCriterion("VC_CLIENT_PHONE in", values, "vcClientPhone");
            return (Criteria) this;
        }

        public Criteria andVcClientPhoneNotIn(List<String> values) {
            addCriterion("VC_CLIENT_PHONE not in", values, "vcClientPhone");
            return (Criteria) this;
        }

        public Criteria andVcClientPhoneBetween(String value1, String value2) {
            addCriterion("VC_CLIENT_PHONE between", value1, value2, "vcClientPhone");
            return (Criteria) this;
        }

        public Criteria andVcClientPhoneNotBetween(String value1, String value2) {
            addCriterion("VC_CLIENT_PHONE not between", value1, value2, "vcClientPhone");
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