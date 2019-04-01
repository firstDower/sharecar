package com.dower.sharerideapp.core.serverdb.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NntOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NntOrderExample() {
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

        public Criteria andNumNntUserJourneyIdIsNull() {
            addCriterion("NUM_NNT_USER_JOURNEY_ID is null");
            return (Criteria) this;
        }

        public Criteria andNumNntUserJourneyIdIsNotNull() {
            addCriterion("NUM_NNT_USER_JOURNEY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andNumNntUserJourneyIdEqualTo(Integer value) {
            addCriterion("NUM_NNT_USER_JOURNEY_ID =", value, "numNntUserJourneyId");
            return (Criteria) this;
        }

        public Criteria andNumNntUserJourneyIdNotEqualTo(Integer value) {
            addCriterion("NUM_NNT_USER_JOURNEY_ID <>", value, "numNntUserJourneyId");
            return (Criteria) this;
        }

        public Criteria andNumNntUserJourneyIdGreaterThan(Integer value) {
            addCriterion("NUM_NNT_USER_JOURNEY_ID >", value, "numNntUserJourneyId");
            return (Criteria) this;
        }

        public Criteria andNumNntUserJourneyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("NUM_NNT_USER_JOURNEY_ID >=", value, "numNntUserJourneyId");
            return (Criteria) this;
        }

        public Criteria andNumNntUserJourneyIdLessThan(Integer value) {
            addCriterion("NUM_NNT_USER_JOURNEY_ID <", value, "numNntUserJourneyId");
            return (Criteria) this;
        }

        public Criteria andNumNntUserJourneyIdLessThanOrEqualTo(Integer value) {
            addCriterion("NUM_NNT_USER_JOURNEY_ID <=", value, "numNntUserJourneyId");
            return (Criteria) this;
        }

        public Criteria andNumNntUserJourneyIdIn(List<Integer> values) {
            addCriterion("NUM_NNT_USER_JOURNEY_ID in", values, "numNntUserJourneyId");
            return (Criteria) this;
        }

        public Criteria andNumNntUserJourneyIdNotIn(List<Integer> values) {
            addCriterion("NUM_NNT_USER_JOURNEY_ID not in", values, "numNntUserJourneyId");
            return (Criteria) this;
        }

        public Criteria andNumNntUserJourneyIdBetween(Integer value1, Integer value2) {
            addCriterion("NUM_NNT_USER_JOURNEY_ID between", value1, value2, "numNntUserJourneyId");
            return (Criteria) this;
        }

        public Criteria andNumNntUserJourneyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("NUM_NNT_USER_JOURNEY_ID not between", value1, value2, "numNntUserJourneyId");
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

        public Criteria andDatUpdateDateIsNull() {
            addCriterion("DAT_UPDATE_DATE is null");
            return (Criteria) this;
        }

        public Criteria andDatUpdateDateIsNotNull() {
            addCriterion("DAT_UPDATE_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andDatUpdateDateEqualTo(Date value) {
            addCriterion("DAT_UPDATE_DATE =", value, "datUpdateDate");
            return (Criteria) this;
        }

        public Criteria andDatUpdateDateNotEqualTo(Date value) {
            addCriterion("DAT_UPDATE_DATE <>", value, "datUpdateDate");
            return (Criteria) this;
        }

        public Criteria andDatUpdateDateGreaterThan(Date value) {
            addCriterion("DAT_UPDATE_DATE >", value, "datUpdateDate");
            return (Criteria) this;
        }

        public Criteria andDatUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("DAT_UPDATE_DATE >=", value, "datUpdateDate");
            return (Criteria) this;
        }

        public Criteria andDatUpdateDateLessThan(Date value) {
            addCriterion("DAT_UPDATE_DATE <", value, "datUpdateDate");
            return (Criteria) this;
        }

        public Criteria andDatUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("DAT_UPDATE_DATE <=", value, "datUpdateDate");
            return (Criteria) this;
        }

        public Criteria andDatUpdateDateIn(List<Date> values) {
            addCriterion("DAT_UPDATE_DATE in", values, "datUpdateDate");
            return (Criteria) this;
        }

        public Criteria andDatUpdateDateNotIn(List<Date> values) {
            addCriterion("DAT_UPDATE_DATE not in", values, "datUpdateDate");
            return (Criteria) this;
        }

        public Criteria andDatUpdateDateBetween(Date value1, Date value2) {
            addCriterion("DAT_UPDATE_DATE between", value1, value2, "datUpdateDate");
            return (Criteria) this;
        }

        public Criteria andDatUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("DAT_UPDATE_DATE not between", value1, value2, "datUpdateDate");
            return (Criteria) this;
        }

        public Criteria andVcObjectDescIsNull() {
            addCriterion("VC_OBJECT_DESC is null");
            return (Criteria) this;
        }

        public Criteria andVcObjectDescIsNotNull() {
            addCriterion("VC_OBJECT_DESC is not null");
            return (Criteria) this;
        }

        public Criteria andVcObjectDescEqualTo(String value) {
            addCriterion("VC_OBJECT_DESC =", value, "vcObjectDesc");
            return (Criteria) this;
        }

        public Criteria andVcObjectDescNotEqualTo(String value) {
            addCriterion("VC_OBJECT_DESC <>", value, "vcObjectDesc");
            return (Criteria) this;
        }

        public Criteria andVcObjectDescGreaterThan(String value) {
            addCriterion("VC_OBJECT_DESC >", value, "vcObjectDesc");
            return (Criteria) this;
        }

        public Criteria andVcObjectDescGreaterThanOrEqualTo(String value) {
            addCriterion("VC_OBJECT_DESC >=", value, "vcObjectDesc");
            return (Criteria) this;
        }

        public Criteria andVcObjectDescLessThan(String value) {
            addCriterion("VC_OBJECT_DESC <", value, "vcObjectDesc");
            return (Criteria) this;
        }

        public Criteria andVcObjectDescLessThanOrEqualTo(String value) {
            addCriterion("VC_OBJECT_DESC <=", value, "vcObjectDesc");
            return (Criteria) this;
        }

        public Criteria andVcObjectDescLike(String value) {
            addCriterion("VC_OBJECT_DESC like", value, "vcObjectDesc");
            return (Criteria) this;
        }

        public Criteria andVcObjectDescNotLike(String value) {
            addCriterion("VC_OBJECT_DESC not like", value, "vcObjectDesc");
            return (Criteria) this;
        }

        public Criteria andVcObjectDescIn(List<String> values) {
            addCriterion("VC_OBJECT_DESC in", values, "vcObjectDesc");
            return (Criteria) this;
        }

        public Criteria andVcObjectDescNotIn(List<String> values) {
            addCriterion("VC_OBJECT_DESC not in", values, "vcObjectDesc");
            return (Criteria) this;
        }

        public Criteria andVcObjectDescBetween(String value1, String value2) {
            addCriterion("VC_OBJECT_DESC between", value1, value2, "vcObjectDesc");
            return (Criteria) this;
        }

        public Criteria andVcObjectDescNotBetween(String value1, String value2) {
            addCriterion("VC_OBJECT_DESC not between", value1, value2, "vcObjectDesc");
            return (Criteria) this;
        }

        public Criteria andVcDetailIsNull() {
            addCriterion("VC_DETAIL is null");
            return (Criteria) this;
        }

        public Criteria andVcDetailIsNotNull() {
            addCriterion("VC_DETAIL is not null");
            return (Criteria) this;
        }

        public Criteria andVcDetailEqualTo(String value) {
            addCriterion("VC_DETAIL =", value, "vcDetail");
            return (Criteria) this;
        }

        public Criteria andVcDetailNotEqualTo(String value) {
            addCriterion("VC_DETAIL <>", value, "vcDetail");
            return (Criteria) this;
        }

        public Criteria andVcDetailGreaterThan(String value) {
            addCriterion("VC_DETAIL >", value, "vcDetail");
            return (Criteria) this;
        }

        public Criteria andVcDetailGreaterThanOrEqualTo(String value) {
            addCriterion("VC_DETAIL >=", value, "vcDetail");
            return (Criteria) this;
        }

        public Criteria andVcDetailLessThan(String value) {
            addCriterion("VC_DETAIL <", value, "vcDetail");
            return (Criteria) this;
        }

        public Criteria andVcDetailLessThanOrEqualTo(String value) {
            addCriterion("VC_DETAIL <=", value, "vcDetail");
            return (Criteria) this;
        }

        public Criteria andVcDetailLike(String value) {
            addCriterion("VC_DETAIL like", value, "vcDetail");
            return (Criteria) this;
        }

        public Criteria andVcDetailNotLike(String value) {
            addCriterion("VC_DETAIL not like", value, "vcDetail");
            return (Criteria) this;
        }

        public Criteria andVcDetailIn(List<String> values) {
            addCriterion("VC_DETAIL in", values, "vcDetail");
            return (Criteria) this;
        }

        public Criteria andVcDetailNotIn(List<String> values) {
            addCriterion("VC_DETAIL not in", values, "vcDetail");
            return (Criteria) this;
        }

        public Criteria andVcDetailBetween(String value1, String value2) {
            addCriterion("VC_DETAIL between", value1, value2, "vcDetail");
            return (Criteria) this;
        }

        public Criteria andVcDetailNotBetween(String value1, String value2) {
            addCriterion("VC_DETAIL not between", value1, value2, "vcDetail");
            return (Criteria) this;
        }

        public Criteria andVcDiscountSignIsNull() {
            addCriterion("VC_DISCOUNT_SIGN is null");
            return (Criteria) this;
        }

        public Criteria andVcDiscountSignIsNotNull() {
            addCriterion("VC_DISCOUNT_SIGN is not null");
            return (Criteria) this;
        }

        public Criteria andVcDiscountSignEqualTo(String value) {
            addCriterion("VC_DISCOUNT_SIGN =", value, "vcDiscountSign");
            return (Criteria) this;
        }

        public Criteria andVcDiscountSignNotEqualTo(String value) {
            addCriterion("VC_DISCOUNT_SIGN <>", value, "vcDiscountSign");
            return (Criteria) this;
        }

        public Criteria andVcDiscountSignGreaterThan(String value) {
            addCriterion("VC_DISCOUNT_SIGN >", value, "vcDiscountSign");
            return (Criteria) this;
        }

        public Criteria andVcDiscountSignGreaterThanOrEqualTo(String value) {
            addCriterion("VC_DISCOUNT_SIGN >=", value, "vcDiscountSign");
            return (Criteria) this;
        }

        public Criteria andVcDiscountSignLessThan(String value) {
            addCriterion("VC_DISCOUNT_SIGN <", value, "vcDiscountSign");
            return (Criteria) this;
        }

        public Criteria andVcDiscountSignLessThanOrEqualTo(String value) {
            addCriterion("VC_DISCOUNT_SIGN <=", value, "vcDiscountSign");
            return (Criteria) this;
        }

        public Criteria andVcDiscountSignLike(String value) {
            addCriterion("VC_DISCOUNT_SIGN like", value, "vcDiscountSign");
            return (Criteria) this;
        }

        public Criteria andVcDiscountSignNotLike(String value) {
            addCriterion("VC_DISCOUNT_SIGN not like", value, "vcDiscountSign");
            return (Criteria) this;
        }

        public Criteria andVcDiscountSignIn(List<String> values) {
            addCriterion("VC_DISCOUNT_SIGN in", values, "vcDiscountSign");
            return (Criteria) this;
        }

        public Criteria andVcDiscountSignNotIn(List<String> values) {
            addCriterion("VC_DISCOUNT_SIGN not in", values, "vcDiscountSign");
            return (Criteria) this;
        }

        public Criteria andVcDiscountSignBetween(String value1, String value2) {
            addCriterion("VC_DISCOUNT_SIGN between", value1, value2, "vcDiscountSign");
            return (Criteria) this;
        }

        public Criteria andVcDiscountSignNotBetween(String value1, String value2) {
            addCriterion("VC_DISCOUNT_SIGN not between", value1, value2, "vcDiscountSign");
            return (Criteria) this;
        }

        public Criteria andNumTradeTypeIsNull() {
            addCriterion("NUM_TRADE_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andNumTradeTypeIsNotNull() {
            addCriterion("NUM_TRADE_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andNumTradeTypeEqualTo(Integer value) {
            addCriterion("NUM_TRADE_TYPE =", value, "numTradeType");
            return (Criteria) this;
        }

        public Criteria andNumTradeTypeNotEqualTo(Integer value) {
            addCriterion("NUM_TRADE_TYPE <>", value, "numTradeType");
            return (Criteria) this;
        }

        public Criteria andNumTradeTypeGreaterThan(Integer value) {
            addCriterion("NUM_TRADE_TYPE >", value, "numTradeType");
            return (Criteria) this;
        }

        public Criteria andNumTradeTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("NUM_TRADE_TYPE >=", value, "numTradeType");
            return (Criteria) this;
        }

        public Criteria andNumTradeTypeLessThan(Integer value) {
            addCriterion("NUM_TRADE_TYPE <", value, "numTradeType");
            return (Criteria) this;
        }

        public Criteria andNumTradeTypeLessThanOrEqualTo(Integer value) {
            addCriterion("NUM_TRADE_TYPE <=", value, "numTradeType");
            return (Criteria) this;
        }

        public Criteria andNumTradeTypeIn(List<Integer> values) {
            addCriterion("NUM_TRADE_TYPE in", values, "numTradeType");
            return (Criteria) this;
        }

        public Criteria andNumTradeTypeNotIn(List<Integer> values) {
            addCriterion("NUM_TRADE_TYPE not in", values, "numTradeType");
            return (Criteria) this;
        }

        public Criteria andNumTradeTypeBetween(Integer value1, Integer value2) {
            addCriterion("NUM_TRADE_TYPE between", value1, value2, "numTradeType");
            return (Criteria) this;
        }

        public Criteria andNumTradeTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("NUM_TRADE_TYPE not between", value1, value2, "numTradeType");
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

        public Criteria andVcAccathIsNull() {
            addCriterion("VC_ACCATH is null");
            return (Criteria) this;
        }

        public Criteria andVcAccathIsNotNull() {
            addCriterion("VC_ACCATH is not null");
            return (Criteria) this;
        }

        public Criteria andVcAccathEqualTo(String value) {
            addCriterion("VC_ACCATH =", value, "vcAccath");
            return (Criteria) this;
        }

        public Criteria andVcAccathNotEqualTo(String value) {
            addCriterion("VC_ACCATH <>", value, "vcAccath");
            return (Criteria) this;
        }

        public Criteria andVcAccathGreaterThan(String value) {
            addCriterion("VC_ACCATH >", value, "vcAccath");
            return (Criteria) this;
        }

        public Criteria andVcAccathGreaterThanOrEqualTo(String value) {
            addCriterion("VC_ACCATH >=", value, "vcAccath");
            return (Criteria) this;
        }

        public Criteria andVcAccathLessThan(String value) {
            addCriterion("VC_ACCATH <", value, "vcAccath");
            return (Criteria) this;
        }

        public Criteria andVcAccathLessThanOrEqualTo(String value) {
            addCriterion("VC_ACCATH <=", value, "vcAccath");
            return (Criteria) this;
        }

        public Criteria andVcAccathLike(String value) {
            addCriterion("VC_ACCATH like", value, "vcAccath");
            return (Criteria) this;
        }

        public Criteria andVcAccathNotLike(String value) {
            addCriterion("VC_ACCATH not like", value, "vcAccath");
            return (Criteria) this;
        }

        public Criteria andVcAccathIn(List<String> values) {
            addCriterion("VC_ACCATH in", values, "vcAccath");
            return (Criteria) this;
        }

        public Criteria andVcAccathNotIn(List<String> values) {
            addCriterion("VC_ACCATH not in", values, "vcAccath");
            return (Criteria) this;
        }

        public Criteria andVcAccathBetween(String value1, String value2) {
            addCriterion("VC_ACCATH between", value1, value2, "vcAccath");
            return (Criteria) this;
        }

        public Criteria andVcAccathNotBetween(String value1, String value2) {
            addCriterion("VC_ACCATH not between", value1, value2, "vcAccath");
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