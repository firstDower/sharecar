package com.dower.sharerideadmin.core.serverdb.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NnaAccountingExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NnaAccountingExample() {
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

        public Criteria andNumAccountingIdIsNull() {
            addCriterion("NUM_ACCOUNTING_ID is null");
            return (Criteria) this;
        }

        public Criteria andNumAccountingIdIsNotNull() {
            addCriterion("NUM_ACCOUNTING_ID is not null");
            return (Criteria) this;
        }

        public Criteria andNumAccountingIdEqualTo(Integer value) {
            addCriterion("NUM_ACCOUNTING_ID =", value, "numAccountingId");
            return (Criteria) this;
        }

        public Criteria andNumAccountingIdNotEqualTo(Integer value) {
            addCriterion("NUM_ACCOUNTING_ID <>", value, "numAccountingId");
            return (Criteria) this;
        }

        public Criteria andNumAccountingIdGreaterThan(Integer value) {
            addCriterion("NUM_ACCOUNTING_ID >", value, "numAccountingId");
            return (Criteria) this;
        }

        public Criteria andNumAccountingIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("NUM_ACCOUNTING_ID >=", value, "numAccountingId");
            return (Criteria) this;
        }

        public Criteria andNumAccountingIdLessThan(Integer value) {
            addCriterion("NUM_ACCOUNTING_ID <", value, "numAccountingId");
            return (Criteria) this;
        }

        public Criteria andNumAccountingIdLessThanOrEqualTo(Integer value) {
            addCriterion("NUM_ACCOUNTING_ID <=", value, "numAccountingId");
            return (Criteria) this;
        }

        public Criteria andNumAccountingIdIn(List<Integer> values) {
            addCriterion("NUM_ACCOUNTING_ID in", values, "numAccountingId");
            return (Criteria) this;
        }

        public Criteria andNumAccountingIdNotIn(List<Integer> values) {
            addCriterion("NUM_ACCOUNTING_ID not in", values, "numAccountingId");
            return (Criteria) this;
        }

        public Criteria andNumAccountingIdBetween(Integer value1, Integer value2) {
            addCriterion("NUM_ACCOUNTING_ID between", value1, value2, "numAccountingId");
            return (Criteria) this;
        }

        public Criteria andNumAccountingIdNotBetween(Integer value1, Integer value2) {
            addCriterion("NUM_ACCOUNTING_ID not between", value1, value2, "numAccountingId");
            return (Criteria) this;
        }

        public Criteria andVcAccountingNameIsNull() {
            addCriterion("VC_ACCOUNTING_NAME is null");
            return (Criteria) this;
        }

        public Criteria andVcAccountingNameIsNotNull() {
            addCriterion("VC_ACCOUNTING_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andVcAccountingNameEqualTo(String value) {
            addCriterion("VC_ACCOUNTING_NAME =", value, "vcAccountingName");
            return (Criteria) this;
        }

        public Criteria andVcAccountingNameNotEqualTo(String value) {
            addCriterion("VC_ACCOUNTING_NAME <>", value, "vcAccountingName");
            return (Criteria) this;
        }

        public Criteria andVcAccountingNameGreaterThan(String value) {
            addCriterion("VC_ACCOUNTING_NAME >", value, "vcAccountingName");
            return (Criteria) this;
        }

        public Criteria andVcAccountingNameGreaterThanOrEqualTo(String value) {
            addCriterion("VC_ACCOUNTING_NAME >=", value, "vcAccountingName");
            return (Criteria) this;
        }

        public Criteria andVcAccountingNameLessThan(String value) {
            addCriterion("VC_ACCOUNTING_NAME <", value, "vcAccountingName");
            return (Criteria) this;
        }

        public Criteria andVcAccountingNameLessThanOrEqualTo(String value) {
            addCriterion("VC_ACCOUNTING_NAME <=", value, "vcAccountingName");
            return (Criteria) this;
        }

        public Criteria andVcAccountingNameLike(String value) {
            addCriterion("VC_ACCOUNTING_NAME like", value, "vcAccountingName");
            return (Criteria) this;
        }

        public Criteria andVcAccountingNameNotLike(String value) {
            addCriterion("VC_ACCOUNTING_NAME not like", value, "vcAccountingName");
            return (Criteria) this;
        }

        public Criteria andVcAccountingNameIn(List<String> values) {
            addCriterion("VC_ACCOUNTING_NAME in", values, "vcAccountingName");
            return (Criteria) this;
        }

        public Criteria andVcAccountingNameNotIn(List<String> values) {
            addCriterion("VC_ACCOUNTING_NAME not in", values, "vcAccountingName");
            return (Criteria) this;
        }

        public Criteria andVcAccountingNameBetween(String value1, String value2) {
            addCriterion("VC_ACCOUNTING_NAME between", value1, value2, "vcAccountingName");
            return (Criteria) this;
        }

        public Criteria andVcAccountingNameNotBetween(String value1, String value2) {
            addCriterion("VC_ACCOUNTING_NAME not between", value1, value2, "vcAccountingName");
            return (Criteria) this;
        }

        public Criteria andVcAccountingDescIsNull() {
            addCriterion("VC_ACCOUNTING_DESC is null");
            return (Criteria) this;
        }

        public Criteria andVcAccountingDescIsNotNull() {
            addCriterion("VC_ACCOUNTING_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andVcAccountingDescEqualTo(String value) {
            addCriterion("VC_ACCOUNTING_DESC =", value, "vcAccountingDesc");
            return (Criteria) this;
        }

        public Criteria andVcAccountingDescNotEqualTo(String value) {
            addCriterion("VC_ACCOUNTING_DESC <>", value, "vcAccountingDesc");
            return (Criteria) this;
        }

        public Criteria andVcAccountingDescGreaterThan(String value) {
            addCriterion("VC_ACCOUNTING_DESC >", value, "vcAccountingDesc");
            return (Criteria) this;
        }

        public Criteria andVcAccountingDescGreaterThanOrEqualTo(String value) {
            addCriterion("VC_ACCOUNTING_DESC >=", value, "vcAccountingDesc");
            return (Criteria) this;
        }

        public Criteria andVcAccountingDescLessThan(String value) {
            addCriterion("VC_ACCOUNTING_DESC <", value, "vcAccountingDesc");
            return (Criteria) this;
        }

        public Criteria andVcAccountingDescLessThanOrEqualTo(String value) {
            addCriterion("VC_ACCOUNTING_DESC <=", value, "vcAccountingDesc");
            return (Criteria) this;
        }

        public Criteria andVcAccountingDescLike(String value) {
            addCriterion("VC_ACCOUNTING_DESC like", value, "vcAccountingDesc");
            return (Criteria) this;
        }

        public Criteria andVcAccountingDescNotLike(String value) {
            addCriterion("VC_ACCOUNTING_DESC not like", value, "vcAccountingDesc");
            return (Criteria) this;
        }

        public Criteria andVcAccountingDescIn(List<String> values) {
            addCriterion("VC_ACCOUNTING_DESC in", values, "vcAccountingDesc");
            return (Criteria) this;
        }

        public Criteria andVcAccountingDescNotIn(List<String> values) {
            addCriterion("VC_ACCOUNTING_DESC not in", values, "vcAccountingDesc");
            return (Criteria) this;
        }

        public Criteria andVcAccountingDescBetween(String value1, String value2) {
            addCriterion("VC_ACCOUNTING_DESC between", value1, value2, "vcAccountingDesc");
            return (Criteria) this;
        }

        public Criteria andVcAccountingDescNotBetween(String value1, String value2) {
            addCriterion("VC_ACCOUNTING_DESC not between", value1, value2, "vcAccountingDesc");
            return (Criteria) this;
        }

        public Criteria andNumAmountIsNull() {
            addCriterion("NUM_AMOUNT is null");
            return (Criteria) this;
        }

        public Criteria andNumAmountIsNotNull() {
            addCriterion("NUM_AMOUNT is not null");
            return (Criteria) this;
        }

        public Criteria andNumAmountEqualTo(BigDecimal value) {
            addCriterion("NUM_AMOUNT =", value, "numAmount");
            return (Criteria) this;
        }

        public Criteria andNumAmountNotEqualTo(BigDecimal value) {
            addCriterion("NUM_AMOUNT <>", value, "numAmount");
            return (Criteria) this;
        }

        public Criteria andNumAmountGreaterThan(BigDecimal value) {
            addCriterion("NUM_AMOUNT >", value, "numAmount");
            return (Criteria) this;
        }

        public Criteria andNumAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NUM_AMOUNT >=", value, "numAmount");
            return (Criteria) this;
        }

        public Criteria andNumAmountLessThan(BigDecimal value) {
            addCriterion("NUM_AMOUNT <", value, "numAmount");
            return (Criteria) this;
        }

        public Criteria andNumAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NUM_AMOUNT <=", value, "numAmount");
            return (Criteria) this;
        }

        public Criteria andNumAmountIn(List<BigDecimal> values) {
            addCriterion("NUM_AMOUNT in", values, "numAmount");
            return (Criteria) this;
        }

        public Criteria andNumAmountNotIn(List<BigDecimal> values) {
            addCriterion("NUM_AMOUNT not in", values, "numAmount");
            return (Criteria) this;
        }

        public Criteria andNumAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NUM_AMOUNT between", value1, value2, "numAmount");
            return (Criteria) this;
        }

        public Criteria andNumAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NUM_AMOUNT not between", value1, value2, "numAmount");
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

        public Criteria andDatMakeDateIsNull() {
            addCriterion("DAT_MAKE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andDatMakeDateIsNotNull() {
            addCriterion("DAT_MAKE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andDatMakeDateEqualTo(Date value) {
            addCriterion("DAT_MAKE_DATE =", value, "datMakeDate");
            return (Criteria) this;
        }

        public Criteria andDatMakeDateNotEqualTo(Date value) {
            addCriterion("DAT_MAKE_DATE <>", value, "datMakeDate");
            return (Criteria) this;
        }

        public Criteria andDatMakeDateGreaterThan(Date value) {
            addCriterion("DAT_MAKE_DATE >", value, "datMakeDate");
            return (Criteria) this;
        }

        public Criteria andDatMakeDateGreaterThanOrEqualTo(Date value) {
            addCriterion("DAT_MAKE_DATE >=", value, "datMakeDate");
            return (Criteria) this;
        }

        public Criteria andDatMakeDateLessThan(Date value) {
            addCriterion("DAT_MAKE_DATE <", value, "datMakeDate");
            return (Criteria) this;
        }

        public Criteria andDatMakeDateLessThanOrEqualTo(Date value) {
            addCriterion("DAT_MAKE_DATE <=", value, "datMakeDate");
            return (Criteria) this;
        }

        public Criteria andDatMakeDateIn(List<Date> values) {
            addCriterion("DAT_MAKE_DATE in", values, "datMakeDate");
            return (Criteria) this;
        }

        public Criteria andDatMakeDateNotIn(List<Date> values) {
            addCriterion("DAT_MAKE_DATE not in", values, "datMakeDate");
            return (Criteria) this;
        }

        public Criteria andDatMakeDateBetween(Date value1, Date value2) {
            addCriterion("DAT_MAKE_DATE between", value1, value2, "datMakeDate");
            return (Criteria) this;
        }

        public Criteria andDatMakeDateNotBetween(Date value1, Date value2) {
            addCriterion("DAT_MAKE_DATE not between", value1, value2, "datMakeDate");
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

        public Criteria andVcImgeUrlIsNull() {
            addCriterion("VC_IMGE_URL is null");
            return (Criteria) this;
        }

        public Criteria andVcImgeUrlIsNotNull() {
            addCriterion("VC_IMGE_URL is not null");
            return (Criteria) this;
        }

        public Criteria andVcImgeUrlEqualTo(String value) {
            addCriterion("VC_IMGE_URL =", value, "vcImgeUrl");
            return (Criteria) this;
        }

        public Criteria andVcImgeUrlNotEqualTo(String value) {
            addCriterion("VC_IMGE_URL <>", value, "vcImgeUrl");
            return (Criteria) this;
        }

        public Criteria andVcImgeUrlGreaterThan(String value) {
            addCriterion("VC_IMGE_URL >", value, "vcImgeUrl");
            return (Criteria) this;
        }

        public Criteria andVcImgeUrlGreaterThanOrEqualTo(String value) {
            addCriterion("VC_IMGE_URL >=", value, "vcImgeUrl");
            return (Criteria) this;
        }

        public Criteria andVcImgeUrlLessThan(String value) {
            addCriterion("VC_IMGE_URL <", value, "vcImgeUrl");
            return (Criteria) this;
        }

        public Criteria andVcImgeUrlLessThanOrEqualTo(String value) {
            addCriterion("VC_IMGE_URL <=", value, "vcImgeUrl");
            return (Criteria) this;
        }

        public Criteria andVcImgeUrlLike(String value) {
            addCriterion("VC_IMGE_URL like", value, "vcImgeUrl");
            return (Criteria) this;
        }

        public Criteria andVcImgeUrlNotLike(String value) {
            addCriterion("VC_IMGE_URL not like", value, "vcImgeUrl");
            return (Criteria) this;
        }

        public Criteria andVcImgeUrlIn(List<String> values) {
            addCriterion("VC_IMGE_URL in", values, "vcImgeUrl");
            return (Criteria) this;
        }

        public Criteria andVcImgeUrlNotIn(List<String> values) {
            addCriterion("VC_IMGE_URL not in", values, "vcImgeUrl");
            return (Criteria) this;
        }

        public Criteria andVcImgeUrlBetween(String value1, String value2) {
            addCriterion("VC_IMGE_URL between", value1, value2, "vcImgeUrl");
            return (Criteria) this;
        }

        public Criteria andVcImgeUrlNotBetween(String value1, String value2) {
            addCriterion("VC_IMGE_URL not between", value1, value2, "vcImgeUrl");
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

        public Criteria andNumTypeEqualTo(Integer value) {
            addCriterion("NUM_TYPE =", value, "numType");
            return (Criteria) this;
        }

        public Criteria andNumTypeNotEqualTo(Integer value) {
            addCriterion("NUM_TYPE <>", value, "numType");
            return (Criteria) this;
        }

        public Criteria andNumTypeGreaterThan(Integer value) {
            addCriterion("NUM_TYPE >", value, "numType");
            return (Criteria) this;
        }

        public Criteria andNumTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("NUM_TYPE >=", value, "numType");
            return (Criteria) this;
        }

        public Criteria andNumTypeLessThan(Integer value) {
            addCriterion("NUM_TYPE <", value, "numType");
            return (Criteria) this;
        }

        public Criteria andNumTypeLessThanOrEqualTo(Integer value) {
            addCriterion("NUM_TYPE <=", value, "numType");
            return (Criteria) this;
        }

        public Criteria andNumTypeIn(List<Integer> values) {
            addCriterion("NUM_TYPE in", values, "numType");
            return (Criteria) this;
        }

        public Criteria andNumTypeNotIn(List<Integer> values) {
            addCriterion("NUM_TYPE not in", values, "numType");
            return (Criteria) this;
        }

        public Criteria andNumTypeBetween(Integer value1, Integer value2) {
            addCriterion("NUM_TYPE between", value1, value2, "numType");
            return (Criteria) this;
        }

        public Criteria andNumTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("NUM_TYPE not between", value1, value2, "numType");
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