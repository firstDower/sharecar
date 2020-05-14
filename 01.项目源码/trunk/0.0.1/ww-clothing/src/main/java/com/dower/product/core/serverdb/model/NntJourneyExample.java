package com.dower.product.core.serverdb.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NntJourneyExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NntJourneyExample() {
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

        public Criteria andNumRouteIdIsNull() {
            addCriterion("NUM_ROUTE_ID is null");
            return (Criteria) this;
        }

        public Criteria andNumRouteIdIsNotNull() {
            addCriterion("NUM_ROUTE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andNumRouteIdEqualTo(Integer value) {
            addCriterion("NUM_ROUTE_ID =", value, "numRouteId");
            return (Criteria) this;
        }

        public Criteria andNumRouteIdNotEqualTo(Integer value) {
            addCriterion("NUM_ROUTE_ID <>", value, "numRouteId");
            return (Criteria) this;
        }

        public Criteria andNumRouteIdGreaterThan(Integer value) {
            addCriterion("NUM_ROUTE_ID >", value, "numRouteId");
            return (Criteria) this;
        }

        public Criteria andNumRouteIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("NUM_ROUTE_ID >=", value, "numRouteId");
            return (Criteria) this;
        }

        public Criteria andNumRouteIdLessThan(Integer value) {
            addCriterion("NUM_ROUTE_ID <", value, "numRouteId");
            return (Criteria) this;
        }

        public Criteria andNumRouteIdLessThanOrEqualTo(Integer value) {
            addCriterion("NUM_ROUTE_ID <=", value, "numRouteId");
            return (Criteria) this;
        }

        public Criteria andNumRouteIdIn(List<Integer> values) {
            addCriterion("NUM_ROUTE_ID in", values, "numRouteId");
            return (Criteria) this;
        }

        public Criteria andNumRouteIdNotIn(List<Integer> values) {
            addCriterion("NUM_ROUTE_ID not in", values, "numRouteId");
            return (Criteria) this;
        }

        public Criteria andNumRouteIdBetween(Integer value1, Integer value2) {
            addCriterion("NUM_ROUTE_ID between", value1, value2, "numRouteId");
            return (Criteria) this;
        }

        public Criteria andNumRouteIdNotBetween(Integer value1, Integer value2) {
            addCriterion("NUM_ROUTE_ID not between", value1, value2, "numRouteId");
            return (Criteria) this;
        }

        public Criteria andVcRouteNoIsNull() {
            addCriterion("VC_ROUTE_NO is null");
            return (Criteria) this;
        }

        public Criteria andVcRouteNoIsNotNull() {
            addCriterion("VC_ROUTE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andVcRouteNoEqualTo(String value) {
            addCriterion("VC_ROUTE_NO =", value, "vcRouteNo");
            return (Criteria) this;
        }

        public Criteria andVcRouteNoNotEqualTo(String value) {
            addCriterion("VC_ROUTE_NO <>", value, "vcRouteNo");
            return (Criteria) this;
        }

        public Criteria andVcRouteNoGreaterThan(String value) {
            addCriterion("VC_ROUTE_NO >", value, "vcRouteNo");
            return (Criteria) this;
        }

        public Criteria andVcRouteNoGreaterThanOrEqualTo(String value) {
            addCriterion("VC_ROUTE_NO >=", value, "vcRouteNo");
            return (Criteria) this;
        }

        public Criteria andVcRouteNoLessThan(String value) {
            addCriterion("VC_ROUTE_NO <", value, "vcRouteNo");
            return (Criteria) this;
        }

        public Criteria andVcRouteNoLessThanOrEqualTo(String value) {
            addCriterion("VC_ROUTE_NO <=", value, "vcRouteNo");
            return (Criteria) this;
        }

        public Criteria andVcRouteNoLike(String value) {
            addCriterion("VC_ROUTE_NO like", value, "vcRouteNo");
            return (Criteria) this;
        }

        public Criteria andVcRouteNoNotLike(String value) {
            addCriterion("VC_ROUTE_NO not like", value, "vcRouteNo");
            return (Criteria) this;
        }

        public Criteria andVcRouteNoIn(List<String> values) {
            addCriterion("VC_ROUTE_NO in", values, "vcRouteNo");
            return (Criteria) this;
        }

        public Criteria andVcRouteNoNotIn(List<String> values) {
            addCriterion("VC_ROUTE_NO not in", values, "vcRouteNo");
            return (Criteria) this;
        }

        public Criteria andVcRouteNoBetween(String value1, String value2) {
            addCriterion("VC_ROUTE_NO between", value1, value2, "vcRouteNo");
            return (Criteria) this;
        }

        public Criteria andVcRouteNoNotBetween(String value1, String value2) {
            addCriterion("VC_ROUTE_NO not between", value1, value2, "vcRouteNo");
            return (Criteria) this;
        }

        public Criteria andDatDepartDateIsNull() {
            addCriterion("DAT_DEPART_DATE is null");
            return (Criteria) this;
        }

        public Criteria andDatDepartDateIsNotNull() {
            addCriterion("DAT_DEPART_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andDatDepartDateEqualTo(Date value) {
            addCriterion("DAT_DEPART_DATE =", value, "datDepartDate");
            return (Criteria) this;
        }

        public Criteria andDatDepartDateNotEqualTo(Date value) {
            addCriterion("DAT_DEPART_DATE <>", value, "datDepartDate");
            return (Criteria) this;
        }

        public Criteria andDatDepartDateGreaterThan(Date value) {
            addCriterion("DAT_DEPART_DATE >", value, "datDepartDate");
            return (Criteria) this;
        }

        public Criteria andDatDepartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("DAT_DEPART_DATE >=", value, "datDepartDate");
            return (Criteria) this;
        }

        public Criteria andDatDepartDateLessThan(Date value) {
            addCriterion("DAT_DEPART_DATE <", value, "datDepartDate");
            return (Criteria) this;
        }

        public Criteria andDatDepartDateLessThanOrEqualTo(Date value) {
            addCriterion("DAT_DEPART_DATE <=", value, "datDepartDate");
            return (Criteria) this;
        }

        public Criteria andDatDepartDateIn(List<Date> values) {
            addCriterion("DAT_DEPART_DATE in", values, "datDepartDate");
            return (Criteria) this;
        }

        public Criteria andDatDepartDateNotIn(List<Date> values) {
            addCriterion("DAT_DEPART_DATE not in", values, "datDepartDate");
            return (Criteria) this;
        }

        public Criteria andDatDepartDateBetween(Date value1, Date value2) {
            addCriterion("DAT_DEPART_DATE between", value1, value2, "datDepartDate");
            return (Criteria) this;
        }

        public Criteria andDatDepartDateNotBetween(Date value1, Date value2) {
            addCriterion("DAT_DEPART_DATE not between", value1, value2, "datDepartDate");
            return (Criteria) this;
        }

        public Criteria andNumSpendTimeIsNull() {
            addCriterion("NUM_SPEND_TIME is null");
            return (Criteria) this;
        }

        public Criteria andNumSpendTimeIsNotNull() {
            addCriterion("NUM_SPEND_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andNumSpendTimeEqualTo(Integer value) {
            addCriterion("NUM_SPEND_TIME =", value, "numSpendTime");
            return (Criteria) this;
        }

        public Criteria andNumSpendTimeNotEqualTo(Integer value) {
            addCriterion("NUM_SPEND_TIME <>", value, "numSpendTime");
            return (Criteria) this;
        }

        public Criteria andNumSpendTimeGreaterThan(Integer value) {
            addCriterion("NUM_SPEND_TIME >", value, "numSpendTime");
            return (Criteria) this;
        }

        public Criteria andNumSpendTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("NUM_SPEND_TIME >=", value, "numSpendTime");
            return (Criteria) this;
        }

        public Criteria andNumSpendTimeLessThan(Integer value) {
            addCriterion("NUM_SPEND_TIME <", value, "numSpendTime");
            return (Criteria) this;
        }

        public Criteria andNumSpendTimeLessThanOrEqualTo(Integer value) {
            addCriterion("NUM_SPEND_TIME <=", value, "numSpendTime");
            return (Criteria) this;
        }

        public Criteria andNumSpendTimeIn(List<Integer> values) {
            addCriterion("NUM_SPEND_TIME in", values, "numSpendTime");
            return (Criteria) this;
        }

        public Criteria andNumSpendTimeNotIn(List<Integer> values) {
            addCriterion("NUM_SPEND_TIME not in", values, "numSpendTime");
            return (Criteria) this;
        }

        public Criteria andNumSpendTimeBetween(Integer value1, Integer value2) {
            addCriterion("NUM_SPEND_TIME between", value1, value2, "numSpendTime");
            return (Criteria) this;
        }

        public Criteria andNumSpendTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("NUM_SPEND_TIME not between", value1, value2, "numSpendTime");
            return (Criteria) this;
        }

        public Criteria andNumMaxPassengersIsNull() {
            addCriterion("NUM_MAX_PASSENGERS is null");
            return (Criteria) this;
        }

        public Criteria andNumMaxPassengersIsNotNull() {
            addCriterion("NUM_MAX_PASSENGERS is not null");
            return (Criteria) this;
        }

        public Criteria andNumMaxPassengersEqualTo(Integer value) {
            addCriterion("NUM_MAX_PASSENGERS =", value, "numMaxPassengers");
            return (Criteria) this;
        }

        public Criteria andNumMaxPassengersNotEqualTo(Integer value) {
            addCriterion("NUM_MAX_PASSENGERS <>", value, "numMaxPassengers");
            return (Criteria) this;
        }

        public Criteria andNumMaxPassengersGreaterThan(Integer value) {
            addCriterion("NUM_MAX_PASSENGERS >", value, "numMaxPassengers");
            return (Criteria) this;
        }

        public Criteria andNumMaxPassengersGreaterThanOrEqualTo(Integer value) {
            addCriterion("NUM_MAX_PASSENGERS >=", value, "numMaxPassengers");
            return (Criteria) this;
        }

        public Criteria andNumMaxPassengersLessThan(Integer value) {
            addCriterion("NUM_MAX_PASSENGERS <", value, "numMaxPassengers");
            return (Criteria) this;
        }

        public Criteria andNumMaxPassengersLessThanOrEqualTo(Integer value) {
            addCriterion("NUM_MAX_PASSENGERS <=", value, "numMaxPassengers");
            return (Criteria) this;
        }

        public Criteria andNumMaxPassengersIn(List<Integer> values) {
            addCriterion("NUM_MAX_PASSENGERS in", values, "numMaxPassengers");
            return (Criteria) this;
        }

        public Criteria andNumMaxPassengersNotIn(List<Integer> values) {
            addCriterion("NUM_MAX_PASSENGERS not in", values, "numMaxPassengers");
            return (Criteria) this;
        }

        public Criteria andNumMaxPassengersBetween(Integer value1, Integer value2) {
            addCriterion("NUM_MAX_PASSENGERS between", value1, value2, "numMaxPassengers");
            return (Criteria) this;
        }

        public Criteria andNumMaxPassengersNotBetween(Integer value1, Integer value2) {
            addCriterion("NUM_MAX_PASSENGERS not between", value1, value2, "numMaxPassengers");
            return (Criteria) this;
        }

        public Criteria andNumRouteStateIsNull() {
            addCriterion("NUM_ROUTE_STATE is null");
            return (Criteria) this;
        }

        public Criteria andNumRouteStateIsNotNull() {
            addCriterion("NUM_ROUTE_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andNumRouteStateEqualTo(Integer value) {
            addCriterion("NUM_ROUTE_STATE =", value, "numRouteState");
            return (Criteria) this;
        }

        public Criteria andNumRouteStateNotEqualTo(Integer value) {
            addCriterion("NUM_ROUTE_STATE <>", value, "numRouteState");
            return (Criteria) this;
        }

        public Criteria andNumRouteStateGreaterThan(Integer value) {
            addCriterion("NUM_ROUTE_STATE >", value, "numRouteState");
            return (Criteria) this;
        }

        public Criteria andNumRouteStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("NUM_ROUTE_STATE >=", value, "numRouteState");
            return (Criteria) this;
        }

        public Criteria andNumRouteStateLessThan(Integer value) {
            addCriterion("NUM_ROUTE_STATE <", value, "numRouteState");
            return (Criteria) this;
        }

        public Criteria andNumRouteStateLessThanOrEqualTo(Integer value) {
            addCriterion("NUM_ROUTE_STATE <=", value, "numRouteState");
            return (Criteria) this;
        }

        public Criteria andNumRouteStateIn(List<Integer> values) {
            addCriterion("NUM_ROUTE_STATE in", values, "numRouteState");
            return (Criteria) this;
        }

        public Criteria andNumRouteStateNotIn(List<Integer> values) {
            addCriterion("NUM_ROUTE_STATE not in", values, "numRouteState");
            return (Criteria) this;
        }

        public Criteria andNumRouteStateBetween(Integer value1, Integer value2) {
            addCriterion("NUM_ROUTE_STATE between", value1, value2, "numRouteState");
            return (Criteria) this;
        }

        public Criteria andNumRouteStateNotBetween(Integer value1, Integer value2) {
            addCriterion("NUM_ROUTE_STATE not between", value1, value2, "numRouteState");
            return (Criteria) this;
        }

        public Criteria andNumRouteFulfeeIsNull() {
            addCriterion("NUM_ROUTE_FULFEE is null");
            return (Criteria) this;
        }

        public Criteria andNumRouteFulfeeIsNotNull() {
            addCriterion("NUM_ROUTE_FULFEE is not null");
            return (Criteria) this;
        }

        public Criteria andNumRouteFulfeeEqualTo(BigDecimal value) {
            addCriterion("NUM_ROUTE_FULFEE =", value, "numRouteFulfee");
            return (Criteria) this;
        }

        public Criteria andNumRouteFulfeeNotEqualTo(BigDecimal value) {
            addCriterion("NUM_ROUTE_FULFEE <>", value, "numRouteFulfee");
            return (Criteria) this;
        }

        public Criteria andNumRouteFulfeeGreaterThan(BigDecimal value) {
            addCriterion("NUM_ROUTE_FULFEE >", value, "numRouteFulfee");
            return (Criteria) this;
        }

        public Criteria andNumRouteFulfeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NUM_ROUTE_FULFEE >=", value, "numRouteFulfee");
            return (Criteria) this;
        }

        public Criteria andNumRouteFulfeeLessThan(BigDecimal value) {
            addCriterion("NUM_ROUTE_FULFEE <", value, "numRouteFulfee");
            return (Criteria) this;
        }

        public Criteria andNumRouteFulfeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NUM_ROUTE_FULFEE <=", value, "numRouteFulfee");
            return (Criteria) this;
        }

        public Criteria andNumRouteFulfeeIn(List<BigDecimal> values) {
            addCriterion("NUM_ROUTE_FULFEE in", values, "numRouteFulfee");
            return (Criteria) this;
        }

        public Criteria andNumRouteFulfeeNotIn(List<BigDecimal> values) {
            addCriterion("NUM_ROUTE_FULFEE not in", values, "numRouteFulfee");
            return (Criteria) this;
        }

        public Criteria andNumRouteFulfeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NUM_ROUTE_FULFEE between", value1, value2, "numRouteFulfee");
            return (Criteria) this;
        }

        public Criteria andNumRouteFulfeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NUM_ROUTE_FULFEE not between", value1, value2, "numRouteFulfee");
            return (Criteria) this;
        }

        public Criteria andNumRouteNetfeeIsNull() {
            addCriterion("NUM_ROUTE_NETFEE is null");
            return (Criteria) this;
        }

        public Criteria andNumRouteNetfeeIsNotNull() {
            addCriterion("NUM_ROUTE_NETFEE is not null");
            return (Criteria) this;
        }

        public Criteria andNumRouteNetfeeEqualTo(BigDecimal value) {
            addCriterion("NUM_ROUTE_NETFEE =", value, "numRouteNetfee");
            return (Criteria) this;
        }

        public Criteria andNumRouteNetfeeNotEqualTo(BigDecimal value) {
            addCriterion("NUM_ROUTE_NETFEE <>", value, "numRouteNetfee");
            return (Criteria) this;
        }

        public Criteria andNumRouteNetfeeGreaterThan(BigDecimal value) {
            addCriterion("NUM_ROUTE_NETFEE >", value, "numRouteNetfee");
            return (Criteria) this;
        }

        public Criteria andNumRouteNetfeeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NUM_ROUTE_NETFEE >=", value, "numRouteNetfee");
            return (Criteria) this;
        }

        public Criteria andNumRouteNetfeeLessThan(BigDecimal value) {
            addCriterion("NUM_ROUTE_NETFEE <", value, "numRouteNetfee");
            return (Criteria) this;
        }

        public Criteria andNumRouteNetfeeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NUM_ROUTE_NETFEE <=", value, "numRouteNetfee");
            return (Criteria) this;
        }

        public Criteria andNumRouteNetfeeIn(List<BigDecimal> values) {
            addCriterion("NUM_ROUTE_NETFEE in", values, "numRouteNetfee");
            return (Criteria) this;
        }

        public Criteria andNumRouteNetfeeNotIn(List<BigDecimal> values) {
            addCriterion("NUM_ROUTE_NETFEE not in", values, "numRouteNetfee");
            return (Criteria) this;
        }

        public Criteria andNumRouteNetfeeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NUM_ROUTE_NETFEE between", value1, value2, "numRouteNetfee");
            return (Criteria) this;
        }

        public Criteria andNumRouteNetfeeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NUM_ROUTE_NETFEE not between", value1, value2, "numRouteNetfee");
            return (Criteria) this;
        }

        public Criteria andNumMannedTypeIsNull() {
            addCriterion("NUM_MANNED_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andNumMannedTypeIsNotNull() {
            addCriterion("NUM_MANNED_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andNumMannedTypeEqualTo(Integer value) {
            addCriterion("NUM_MANNED_TYPE =", value, "numMannedType");
            return (Criteria) this;
        }

        public Criteria andNumMannedTypeNotEqualTo(Integer value) {
            addCriterion("NUM_MANNED_TYPE <>", value, "numMannedType");
            return (Criteria) this;
        }

        public Criteria andNumMannedTypeGreaterThan(Integer value) {
            addCriterion("NUM_MANNED_TYPE >", value, "numMannedType");
            return (Criteria) this;
        }

        public Criteria andNumMannedTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("NUM_MANNED_TYPE >=", value, "numMannedType");
            return (Criteria) this;
        }

        public Criteria andNumMannedTypeLessThan(Integer value) {
            addCriterion("NUM_MANNED_TYPE <", value, "numMannedType");
            return (Criteria) this;
        }

        public Criteria andNumMannedTypeLessThanOrEqualTo(Integer value) {
            addCriterion("NUM_MANNED_TYPE <=", value, "numMannedType");
            return (Criteria) this;
        }

        public Criteria andNumMannedTypeIn(List<Integer> values) {
            addCriterion("NUM_MANNED_TYPE in", values, "numMannedType");
            return (Criteria) this;
        }

        public Criteria andNumMannedTypeNotIn(List<Integer> values) {
            addCriterion("NUM_MANNED_TYPE not in", values, "numMannedType");
            return (Criteria) this;
        }

        public Criteria andNumMannedTypeBetween(Integer value1, Integer value2) {
            addCriterion("NUM_MANNED_TYPE between", value1, value2, "numMannedType");
            return (Criteria) this;
        }

        public Criteria andNumMannedTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("NUM_MANNED_TYPE not between", value1, value2, "numMannedType");
            return (Criteria) this;
        }

        public Criteria andNumStartTravelCityIdIsNull() {
            addCriterion("NUM_START_TRAVEL_CITY_ID is null");
            return (Criteria) this;
        }

        public Criteria andNumStartTravelCityIdIsNotNull() {
            addCriterion("NUM_START_TRAVEL_CITY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andNumStartTravelCityIdEqualTo(Integer value) {
            addCriterion("NUM_START_TRAVEL_CITY_ID =", value, "numStartTravelCityId");
            return (Criteria) this;
        }

        public Criteria andNumStartTravelCityIdNotEqualTo(Integer value) {
            addCriterion("NUM_START_TRAVEL_CITY_ID <>", value, "numStartTravelCityId");
            return (Criteria) this;
        }

        public Criteria andNumStartTravelCityIdGreaterThan(Integer value) {
            addCriterion("NUM_START_TRAVEL_CITY_ID >", value, "numStartTravelCityId");
            return (Criteria) this;
        }

        public Criteria andNumStartTravelCityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("NUM_START_TRAVEL_CITY_ID >=", value, "numStartTravelCityId");
            return (Criteria) this;
        }

        public Criteria andNumStartTravelCityIdLessThan(Integer value) {
            addCriterion("NUM_START_TRAVEL_CITY_ID <", value, "numStartTravelCityId");
            return (Criteria) this;
        }

        public Criteria andNumStartTravelCityIdLessThanOrEqualTo(Integer value) {
            addCriterion("NUM_START_TRAVEL_CITY_ID <=", value, "numStartTravelCityId");
            return (Criteria) this;
        }

        public Criteria andNumStartTravelCityIdIn(List<Integer> values) {
            addCriterion("NUM_START_TRAVEL_CITY_ID in", values, "numStartTravelCityId");
            return (Criteria) this;
        }

        public Criteria andNumStartTravelCityIdNotIn(List<Integer> values) {
            addCriterion("NUM_START_TRAVEL_CITY_ID not in", values, "numStartTravelCityId");
            return (Criteria) this;
        }

        public Criteria andNumStartTravelCityIdBetween(Integer value1, Integer value2) {
            addCriterion("NUM_START_TRAVEL_CITY_ID between", value1, value2, "numStartTravelCityId");
            return (Criteria) this;
        }

        public Criteria andNumStartTravelCityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("NUM_START_TRAVEL_CITY_ID not between", value1, value2, "numStartTravelCityId");
            return (Criteria) this;
        }

        public Criteria andNumEndTravelCityIdIsNull() {
            addCriterion("NUM_END_TRAVEL_CITY_ID is null");
            return (Criteria) this;
        }

        public Criteria andNumEndTravelCityIdIsNotNull() {
            addCriterion("NUM_END_TRAVEL_CITY_ID is not null");
            return (Criteria) this;
        }

        public Criteria andNumEndTravelCityIdEqualTo(Integer value) {
            addCriterion("NUM_END_TRAVEL_CITY_ID =", value, "numEndTravelCityId");
            return (Criteria) this;
        }

        public Criteria andNumEndTravelCityIdNotEqualTo(Integer value) {
            addCriterion("NUM_END_TRAVEL_CITY_ID <>", value, "numEndTravelCityId");
            return (Criteria) this;
        }

        public Criteria andNumEndTravelCityIdGreaterThan(Integer value) {
            addCriterion("NUM_END_TRAVEL_CITY_ID >", value, "numEndTravelCityId");
            return (Criteria) this;
        }

        public Criteria andNumEndTravelCityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("NUM_END_TRAVEL_CITY_ID >=", value, "numEndTravelCityId");
            return (Criteria) this;
        }

        public Criteria andNumEndTravelCityIdLessThan(Integer value) {
            addCriterion("NUM_END_TRAVEL_CITY_ID <", value, "numEndTravelCityId");
            return (Criteria) this;
        }

        public Criteria andNumEndTravelCityIdLessThanOrEqualTo(Integer value) {
            addCriterion("NUM_END_TRAVEL_CITY_ID <=", value, "numEndTravelCityId");
            return (Criteria) this;
        }

        public Criteria andNumEndTravelCityIdIn(List<Integer> values) {
            addCriterion("NUM_END_TRAVEL_CITY_ID in", values, "numEndTravelCityId");
            return (Criteria) this;
        }

        public Criteria andNumEndTravelCityIdNotIn(List<Integer> values) {
            addCriterion("NUM_END_TRAVEL_CITY_ID not in", values, "numEndTravelCityId");
            return (Criteria) this;
        }

        public Criteria andNumEndTravelCityIdBetween(Integer value1, Integer value2) {
            addCriterion("NUM_END_TRAVEL_CITY_ID between", value1, value2, "numEndTravelCityId");
            return (Criteria) this;
        }

        public Criteria andNumEndTravelCityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("NUM_END_TRAVEL_CITY_ID not between", value1, value2, "numEndTravelCityId");
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

        public Criteria andNumUnitPriceIsNull() {
            addCriterion("NUM_UNIT_PRICE is null");
            return (Criteria) this;
        }

        public Criteria andNumUnitPriceIsNotNull() {
            addCriterion("NUM_UNIT_PRICE is not null");
            return (Criteria) this;
        }

        public Criteria andNumUnitPriceEqualTo(BigDecimal value) {
            addCriterion("NUM_UNIT_PRICE =", value, "numUnitPrice");
            return (Criteria) this;
        }

        public Criteria andNumUnitPriceNotEqualTo(BigDecimal value) {
            addCriterion("NUM_UNIT_PRICE <>", value, "numUnitPrice");
            return (Criteria) this;
        }

        public Criteria andNumUnitPriceGreaterThan(BigDecimal value) {
            addCriterion("NUM_UNIT_PRICE >", value, "numUnitPrice");
            return (Criteria) this;
        }

        public Criteria andNumUnitPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("NUM_UNIT_PRICE >=", value, "numUnitPrice");
            return (Criteria) this;
        }

        public Criteria andNumUnitPriceLessThan(BigDecimal value) {
            addCriterion("NUM_UNIT_PRICE <", value, "numUnitPrice");
            return (Criteria) this;
        }

        public Criteria andNumUnitPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("NUM_UNIT_PRICE <=", value, "numUnitPrice");
            return (Criteria) this;
        }

        public Criteria andNumUnitPriceIn(List<BigDecimal> values) {
            addCriterion("NUM_UNIT_PRICE in", values, "numUnitPrice");
            return (Criteria) this;
        }

        public Criteria andNumUnitPriceNotIn(List<BigDecimal> values) {
            addCriterion("NUM_UNIT_PRICE not in", values, "numUnitPrice");
            return (Criteria) this;
        }

        public Criteria andNumUnitPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NUM_UNIT_PRICE between", value1, value2, "numUnitPrice");
            return (Criteria) this;
        }

        public Criteria andNumUnitPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("NUM_UNIT_PRICE not between", value1, value2, "numUnitPrice");
            return (Criteria) this;
        }

        public Criteria andDatUpdataDateIsNull() {
            addCriterion("DAT_UPDATA_DATE is null");
            return (Criteria) this;
        }

        public Criteria andDatUpdataDateIsNotNull() {
            addCriterion("DAT_UPDATA_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andDatUpdataDateEqualTo(Date value) {
            addCriterion("DAT_UPDATA_DATE =", value, "datUpdataDate");
            return (Criteria) this;
        }

        public Criteria andDatUpdataDateNotEqualTo(Date value) {
            addCriterion("DAT_UPDATA_DATE <>", value, "datUpdataDate");
            return (Criteria) this;
        }

        public Criteria andDatUpdataDateGreaterThan(Date value) {
            addCriterion("DAT_UPDATA_DATE >", value, "datUpdataDate");
            return (Criteria) this;
        }

        public Criteria andDatUpdataDateGreaterThanOrEqualTo(Date value) {
            addCriterion("DAT_UPDATA_DATE >=", value, "datUpdataDate");
            return (Criteria) this;
        }

        public Criteria andDatUpdataDateLessThan(Date value) {
            addCriterion("DAT_UPDATA_DATE <", value, "datUpdataDate");
            return (Criteria) this;
        }

        public Criteria andDatUpdataDateLessThanOrEqualTo(Date value) {
            addCriterion("DAT_UPDATA_DATE <=", value, "datUpdataDate");
            return (Criteria) this;
        }

        public Criteria andDatUpdataDateIn(List<Date> values) {
            addCriterion("DAT_UPDATA_DATE in", values, "datUpdataDate");
            return (Criteria) this;
        }

        public Criteria andDatUpdataDateNotIn(List<Date> values) {
            addCriterion("DAT_UPDATA_DATE not in", values, "datUpdataDate");
            return (Criteria) this;
        }

        public Criteria andDatUpdataDateBetween(Date value1, Date value2) {
            addCriterion("DAT_UPDATA_DATE between", value1, value2, "datUpdataDate");
            return (Criteria) this;
        }

        public Criteria andDatUpdataDateNotBetween(Date value1, Date value2) {
            addCriterion("DAT_UPDATA_DATE not between", value1, value2, "datUpdataDate");
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