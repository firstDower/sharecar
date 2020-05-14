package com.dower.product.core.serverdb.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NntTransLogExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NntTransLogExample() {
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

        public Criteria andNumTransLogIdIsNull() {
            addCriterion("NUM_TRANS_LOG_ID is null");
            return (Criteria) this;
        }

        public Criteria andNumTransLogIdIsNotNull() {
            addCriterion("NUM_TRANS_LOG_ID is not null");
            return (Criteria) this;
        }

        public Criteria andNumTransLogIdEqualTo(Integer value) {
            addCriterion("NUM_TRANS_LOG_ID =", value, "numTransLogId");
            return (Criteria) this;
        }

        public Criteria andNumTransLogIdNotEqualTo(Integer value) {
            addCriterion("NUM_TRANS_LOG_ID <>", value, "numTransLogId");
            return (Criteria) this;
        }

        public Criteria andNumTransLogIdGreaterThan(Integer value) {
            addCriterion("NUM_TRANS_LOG_ID >", value, "numTransLogId");
            return (Criteria) this;
        }

        public Criteria andNumTransLogIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("NUM_TRANS_LOG_ID >=", value, "numTransLogId");
            return (Criteria) this;
        }

        public Criteria andNumTransLogIdLessThan(Integer value) {
            addCriterion("NUM_TRANS_LOG_ID <", value, "numTransLogId");
            return (Criteria) this;
        }

        public Criteria andNumTransLogIdLessThanOrEqualTo(Integer value) {
            addCriterion("NUM_TRANS_LOG_ID <=", value, "numTransLogId");
            return (Criteria) this;
        }

        public Criteria andNumTransLogIdIn(List<Integer> values) {
            addCriterion("NUM_TRANS_LOG_ID in", values, "numTransLogId");
            return (Criteria) this;
        }

        public Criteria andNumTransLogIdNotIn(List<Integer> values) {
            addCriterion("NUM_TRANS_LOG_ID not in", values, "numTransLogId");
            return (Criteria) this;
        }

        public Criteria andNumTransLogIdBetween(Integer value1, Integer value2) {
            addCriterion("NUM_TRANS_LOG_ID between", value1, value2, "numTransLogId");
            return (Criteria) this;
        }

        public Criteria andNumTransLogIdNotBetween(Integer value1, Integer value2) {
            addCriterion("NUM_TRANS_LOG_ID not between", value1, value2, "numTransLogId");
            return (Criteria) this;
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

        public Criteria andDatTransTimeIsNull() {
            addCriterion("DAT_TRANS_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDatTransTimeIsNotNull() {
            addCriterion("DAT_TRANS_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDatTransTimeEqualTo(Date value) {
            addCriterion("DAT_TRANS_TIME =", value, "datTransTime");
            return (Criteria) this;
        }

        public Criteria andDatTransTimeNotEqualTo(Date value) {
            addCriterion("DAT_TRANS_TIME <>", value, "datTransTime");
            return (Criteria) this;
        }

        public Criteria andDatTransTimeGreaterThan(Date value) {
            addCriterion("DAT_TRANS_TIME >", value, "datTransTime");
            return (Criteria) this;
        }

        public Criteria andDatTransTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("DAT_TRANS_TIME >=", value, "datTransTime");
            return (Criteria) this;
        }

        public Criteria andDatTransTimeLessThan(Date value) {
            addCriterion("DAT_TRANS_TIME <", value, "datTransTime");
            return (Criteria) this;
        }

        public Criteria andDatTransTimeLessThanOrEqualTo(Date value) {
            addCriterion("DAT_TRANS_TIME <=", value, "datTransTime");
            return (Criteria) this;
        }

        public Criteria andDatTransTimeIn(List<Date> values) {
            addCriterion("DAT_TRANS_TIME in", values, "datTransTime");
            return (Criteria) this;
        }

        public Criteria andDatTransTimeNotIn(List<Date> values) {
            addCriterion("DAT_TRANS_TIME not in", values, "datTransTime");
            return (Criteria) this;
        }

        public Criteria andDatTransTimeBetween(Date value1, Date value2) {
            addCriterion("DAT_TRANS_TIME between", value1, value2, "datTransTime");
            return (Criteria) this;
        }

        public Criteria andDatTransTimeNotBetween(Date value1, Date value2) {
            addCriterion("DAT_TRANS_TIME not between", value1, value2, "datTransTime");
            return (Criteria) this;
        }

        public Criteria andNumTransMoneySumIsNull() {
            addCriterion("NUM_TRANS_MONEY_SUM is null");
            return (Criteria) this;
        }

        public Criteria andNumTransMoneySumIsNotNull() {
            addCriterion("NUM_TRANS_MONEY_SUM is not null");
            return (Criteria) this;
        }

        public Criteria andNumTransMoneySumEqualTo(BigDecimal value) {
            addCriterion("NUM_TRANS_MONEY_SUM =", value, "numTransMoneySum");
            return (Criteria) this;
        }

        public Criteria andNumTransMoneySumNotEqualTo(BigDecimal value) {
            addCriterion("NUM_TRANS_MONEY_SUM <>", value, "numTransMoneySum");
            return (Criteria) this;
        }

        public Criteria andNumTransMoneySumGreaterThan(BigDecimal value) {
            addCriterion("NUM_TRANS_MONEY_SUM >", value, "numTransMoneySum");
            return (Criteria) this;
        }

        public Criteria andNumTransMoneySumGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NUM_TRANS_MONEY_SUM >=", value, "numTransMoneySum");
            return (Criteria) this;
        }

        public Criteria andNumTransMoneySumLessThan(BigDecimal value) {
            addCriterion("NUM_TRANS_MONEY_SUM <", value, "numTransMoneySum");
            return (Criteria) this;
        }

        public Criteria andNumTransMoneySumLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NUM_TRANS_MONEY_SUM <=", value, "numTransMoneySum");
            return (Criteria) this;
        }

        public Criteria andNumTransMoneySumIn(List<BigDecimal> values) {
            addCriterion("NUM_TRANS_MONEY_SUM in", values, "numTransMoneySum");
            return (Criteria) this;
        }

        public Criteria andNumTransMoneySumNotIn(List<BigDecimal> values) {
            addCriterion("NUM_TRANS_MONEY_SUM not in", values, "numTransMoneySum");
            return (Criteria) this;
        }

        public Criteria andNumTransMoneySumBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NUM_TRANS_MONEY_SUM between", value1, value2, "numTransMoneySum");
            return (Criteria) this;
        }

        public Criteria andNumTransMoneySumNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NUM_TRANS_MONEY_SUM not between", value1, value2, "numTransMoneySum");
            return (Criteria) this;
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

        public Criteria andNumStautsIsNull() {
            addCriterion("NUM_STAUTS is null");
            return (Criteria) this;
        }

        public Criteria andNumStautsIsNotNull() {
            addCriterion("NUM_STAUTS is not null");
            return (Criteria) this;
        }

        public Criteria andNumStautsEqualTo(Integer value) {
            addCriterion("NUM_STAUTS =", value, "numStauts");
            return (Criteria) this;
        }

        public Criteria andNumStautsNotEqualTo(Integer value) {
            addCriterion("NUM_STAUTS <>", value, "numStauts");
            return (Criteria) this;
        }

        public Criteria andNumStautsGreaterThan(Integer value) {
            addCriterion("NUM_STAUTS >", value, "numStauts");
            return (Criteria) this;
        }

        public Criteria andNumStautsGreaterThanOrEqualTo(Integer value) {
            addCriterion("NUM_STAUTS >=", value, "numStauts");
            return (Criteria) this;
        }

        public Criteria andNumStautsLessThan(Integer value) {
            addCriterion("NUM_STAUTS <", value, "numStauts");
            return (Criteria) this;
        }

        public Criteria andNumStautsLessThanOrEqualTo(Integer value) {
            addCriterion("NUM_STAUTS <=", value, "numStauts");
            return (Criteria) this;
        }

        public Criteria andNumStautsIn(List<Integer> values) {
            addCriterion("NUM_STAUTS in", values, "numStauts");
            return (Criteria) this;
        }

        public Criteria andNumStautsNotIn(List<Integer> values) {
            addCriterion("NUM_STAUTS not in", values, "numStauts");
            return (Criteria) this;
        }

        public Criteria andNumStautsBetween(Integer value1, Integer value2) {
            addCriterion("NUM_STAUTS between", value1, value2, "numStauts");
            return (Criteria) this;
        }

        public Criteria andNumStautsNotBetween(Integer value1, Integer value2) {
            addCriterion("NUM_STAUTS not between", value1, value2, "numStauts");
            return (Criteria) this;
        }

        public Criteria andDatCreateTimeIsNull() {
            addCriterion("DAT_CREATE_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDatCreateTimeIsNotNull() {
            addCriterion("DAT_CREATE_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDatCreateTimeEqualTo(Date value) {
            addCriterion("DAT_CREATE_TIME =", value, "datCreateTime");
            return (Criteria) this;
        }

        public Criteria andDatCreateTimeNotEqualTo(Date value) {
            addCriterion("DAT_CREATE_TIME <>", value, "datCreateTime");
            return (Criteria) this;
        }

        public Criteria andDatCreateTimeGreaterThan(Date value) {
            addCriterion("DAT_CREATE_TIME >", value, "datCreateTime");
            return (Criteria) this;
        }

        public Criteria andDatCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("DAT_CREATE_TIME >=", value, "datCreateTime");
            return (Criteria) this;
        }

        public Criteria andDatCreateTimeLessThan(Date value) {
            addCriterion("DAT_CREATE_TIME <", value, "datCreateTime");
            return (Criteria) this;
        }

        public Criteria andDatCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("DAT_CREATE_TIME <=", value, "datCreateTime");
            return (Criteria) this;
        }

        public Criteria andDatCreateTimeIn(List<Date> values) {
            addCriterion("DAT_CREATE_TIME in", values, "datCreateTime");
            return (Criteria) this;
        }

        public Criteria andDatCreateTimeNotIn(List<Date> values) {
            addCriterion("DAT_CREATE_TIME not in", values, "datCreateTime");
            return (Criteria) this;
        }

        public Criteria andDatCreateTimeBetween(Date value1, Date value2) {
            addCriterion("DAT_CREATE_TIME between", value1, value2, "datCreateTime");
            return (Criteria) this;
        }

        public Criteria andDatCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("DAT_CREATE_TIME not between", value1, value2, "datCreateTime");
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

        public Criteria andNumIsDelEqualTo(Integer value) {
            addCriterion("NUM_IS_DEL =", value, "numIsDel");
            return (Criteria) this;
        }

        public Criteria andNumIsDelNotEqualTo(Integer value) {
            addCriterion("NUM_IS_DEL <>", value, "numIsDel");
            return (Criteria) this;
        }

        public Criteria andNumIsDelGreaterThan(Integer value) {
            addCriterion("NUM_IS_DEL >", value, "numIsDel");
            return (Criteria) this;
        }

        public Criteria andNumIsDelGreaterThanOrEqualTo(Integer value) {
            addCriterion("NUM_IS_DEL >=", value, "numIsDel");
            return (Criteria) this;
        }

        public Criteria andNumIsDelLessThan(Integer value) {
            addCriterion("NUM_IS_DEL <", value, "numIsDel");
            return (Criteria) this;
        }

        public Criteria andNumIsDelLessThanOrEqualTo(Integer value) {
            addCriterion("NUM_IS_DEL <=", value, "numIsDel");
            return (Criteria) this;
        }

        public Criteria andNumIsDelIn(List<Integer> values) {
            addCriterion("NUM_IS_DEL in", values, "numIsDel");
            return (Criteria) this;
        }

        public Criteria andNumIsDelNotIn(List<Integer> values) {
            addCriterion("NUM_IS_DEL not in", values, "numIsDel");
            return (Criteria) this;
        }

        public Criteria andNumIsDelBetween(Integer value1, Integer value2) {
            addCriterion("NUM_IS_DEL between", value1, value2, "numIsDel");
            return (Criteria) this;
        }

        public Criteria andNumIsDelNotBetween(Integer value1, Integer value2) {
            addCriterion("NUM_IS_DEL not between", value1, value2, "numIsDel");
            return (Criteria) this;
        }

        public Criteria andDatLastUpdataTimeIsNull() {
            addCriterion("DAT_LAST_UPDATA_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDatLastUpdataTimeIsNotNull() {
            addCriterion("DAT_LAST_UPDATA_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDatLastUpdataTimeEqualTo(Date value) {
            addCriterion("DAT_LAST_UPDATA_TIME =", value, "datLastUpdataTime");
            return (Criteria) this;
        }

        public Criteria andDatLastUpdataTimeNotEqualTo(Date value) {
            addCriterion("DAT_LAST_UPDATA_TIME <>", value, "datLastUpdataTime");
            return (Criteria) this;
        }

        public Criteria andDatLastUpdataTimeGreaterThan(Date value) {
            addCriterion("DAT_LAST_UPDATA_TIME >", value, "datLastUpdataTime");
            return (Criteria) this;
        }

        public Criteria andDatLastUpdataTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("DAT_LAST_UPDATA_TIME >=", value, "datLastUpdataTime");
            return (Criteria) this;
        }

        public Criteria andDatLastUpdataTimeLessThan(Date value) {
            addCriterion("DAT_LAST_UPDATA_TIME <", value, "datLastUpdataTime");
            return (Criteria) this;
        }

        public Criteria andDatLastUpdataTimeLessThanOrEqualTo(Date value) {
            addCriterion("DAT_LAST_UPDATA_TIME <=", value, "datLastUpdataTime");
            return (Criteria) this;
        }

        public Criteria andDatLastUpdataTimeIn(List<Date> values) {
            addCriterion("DAT_LAST_UPDATA_TIME in", values, "datLastUpdataTime");
            return (Criteria) this;
        }

        public Criteria andDatLastUpdataTimeNotIn(List<Date> values) {
            addCriterion("DAT_LAST_UPDATA_TIME not in", values, "datLastUpdataTime");
            return (Criteria) this;
        }

        public Criteria andDatLastUpdataTimeBetween(Date value1, Date value2) {
            addCriterion("DAT_LAST_UPDATA_TIME between", value1, value2, "datLastUpdataTime");
            return (Criteria) this;
        }

        public Criteria andDatLastUpdataTimeNotBetween(Date value1, Date value2) {
            addCriterion("DAT_LAST_UPDATA_TIME not between", value1, value2, "datLastUpdataTime");
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