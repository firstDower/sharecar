package com.dower.sharerideapp.core.serverdb.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NntCarinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NntCarinfoExample() {
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

        public Criteria andVcCarNoIsNull() {
            addCriterion("VC_CAR_NO is null");
            return (Criteria) this;
        }

        public Criteria andVcCarNoIsNotNull() {
            addCriterion("VC_CAR_NO is not null");
            return (Criteria) this;
        }

        public Criteria andVcCarNoEqualTo(String value) {
            addCriterion("VC_CAR_NO =", value, "vcCarNo");
            return (Criteria) this;
        }

        public Criteria andVcCarNoNotEqualTo(String value) {
            addCriterion("VC_CAR_NO <>", value, "vcCarNo");
            return (Criteria) this;
        }

        public Criteria andVcCarNoGreaterThan(String value) {
            addCriterion("VC_CAR_NO >", value, "vcCarNo");
            return (Criteria) this;
        }

        public Criteria andVcCarNoGreaterThanOrEqualTo(String value) {
            addCriterion("VC_CAR_NO >=", value, "vcCarNo");
            return (Criteria) this;
        }

        public Criteria andVcCarNoLessThan(String value) {
            addCriterion("VC_CAR_NO <", value, "vcCarNo");
            return (Criteria) this;
        }

        public Criteria andVcCarNoLessThanOrEqualTo(String value) {
            addCriterion("VC_CAR_NO <=", value, "vcCarNo");
            return (Criteria) this;
        }

        public Criteria andVcCarNoLike(String value) {
            addCriterion("VC_CAR_NO like", value, "vcCarNo");
            return (Criteria) this;
        }

        public Criteria andVcCarNoNotLike(String value) {
            addCriterion("VC_CAR_NO not like", value, "vcCarNo");
            return (Criteria) this;
        }

        public Criteria andVcCarNoIn(List<String> values) {
            addCriterion("VC_CAR_NO in", values, "vcCarNo");
            return (Criteria) this;
        }

        public Criteria andVcCarNoNotIn(List<String> values) {
            addCriterion("VC_CAR_NO not in", values, "vcCarNo");
            return (Criteria) this;
        }

        public Criteria andVcCarNoBetween(String value1, String value2) {
            addCriterion("VC_CAR_NO between", value1, value2, "vcCarNo");
            return (Criteria) this;
        }

        public Criteria andVcCarNoNotBetween(String value1, String value2) {
            addCriterion("VC_CAR_NO not between", value1, value2, "vcCarNo");
            return (Criteria) this;
        }

        public Criteria andVcBrandIsNull() {
            addCriterion("VC_BRAND is null");
            return (Criteria) this;
        }

        public Criteria andVcBrandIsNotNull() {
            addCriterion("VC_BRAND is not null");
            return (Criteria) this;
        }

        public Criteria andVcBrandEqualTo(String value) {
            addCriterion("VC_BRAND =", value, "vcBrand");
            return (Criteria) this;
        }

        public Criteria andVcBrandNotEqualTo(String value) {
            addCriterion("VC_BRAND <>", value, "vcBrand");
            return (Criteria) this;
        }

        public Criteria andVcBrandGreaterThan(String value) {
            addCriterion("VC_BRAND >", value, "vcBrand");
            return (Criteria) this;
        }

        public Criteria andVcBrandGreaterThanOrEqualTo(String value) {
            addCriterion("VC_BRAND >=", value, "vcBrand");
            return (Criteria) this;
        }

        public Criteria andVcBrandLessThan(String value) {
            addCriterion("VC_BRAND <", value, "vcBrand");
            return (Criteria) this;
        }

        public Criteria andVcBrandLessThanOrEqualTo(String value) {
            addCriterion("VC_BRAND <=", value, "vcBrand");
            return (Criteria) this;
        }

        public Criteria andVcBrandLike(String value) {
            addCriterion("VC_BRAND like", value, "vcBrand");
            return (Criteria) this;
        }

        public Criteria andVcBrandNotLike(String value) {
            addCriterion("VC_BRAND not like", value, "vcBrand");
            return (Criteria) this;
        }

        public Criteria andVcBrandIn(List<String> values) {
            addCriterion("VC_BRAND in", values, "vcBrand");
            return (Criteria) this;
        }

        public Criteria andVcBrandNotIn(List<String> values) {
            addCriterion("VC_BRAND not in", values, "vcBrand");
            return (Criteria) this;
        }

        public Criteria andVcBrandBetween(String value1, String value2) {
            addCriterion("VC_BRAND between", value1, value2, "vcBrand");
            return (Criteria) this;
        }

        public Criteria andVcBrandNotBetween(String value1, String value2) {
            addCriterion("VC_BRAND not between", value1, value2, "vcBrand");
            return (Criteria) this;
        }

        public Criteria andVcCarColorIsNull() {
            addCriterion("VC_CAR_COLOR is null");
            return (Criteria) this;
        }

        public Criteria andVcCarColorIsNotNull() {
            addCriterion("VC_CAR_COLOR is not null");
            return (Criteria) this;
        }

        public Criteria andVcCarColorEqualTo(String value) {
            addCriterion("VC_CAR_COLOR =", value, "vcCarColor");
            return (Criteria) this;
        }

        public Criteria andVcCarColorNotEqualTo(String value) {
            addCriterion("VC_CAR_COLOR <>", value, "vcCarColor");
            return (Criteria) this;
        }

        public Criteria andVcCarColorGreaterThan(String value) {
            addCriterion("VC_CAR_COLOR >", value, "vcCarColor");
            return (Criteria) this;
        }

        public Criteria andVcCarColorGreaterThanOrEqualTo(String value) {
            addCriterion("VC_CAR_COLOR >=", value, "vcCarColor");
            return (Criteria) this;
        }

        public Criteria andVcCarColorLessThan(String value) {
            addCriterion("VC_CAR_COLOR <", value, "vcCarColor");
            return (Criteria) this;
        }

        public Criteria andVcCarColorLessThanOrEqualTo(String value) {
            addCriterion("VC_CAR_COLOR <=", value, "vcCarColor");
            return (Criteria) this;
        }

        public Criteria andVcCarColorLike(String value) {
            addCriterion("VC_CAR_COLOR like", value, "vcCarColor");
            return (Criteria) this;
        }

        public Criteria andVcCarColorNotLike(String value) {
            addCriterion("VC_CAR_COLOR not like", value, "vcCarColor");
            return (Criteria) this;
        }

        public Criteria andVcCarColorIn(List<String> values) {
            addCriterion("VC_CAR_COLOR in", values, "vcCarColor");
            return (Criteria) this;
        }

        public Criteria andVcCarColorNotIn(List<String> values) {
            addCriterion("VC_CAR_COLOR not in", values, "vcCarColor");
            return (Criteria) this;
        }

        public Criteria andVcCarColorBetween(String value1, String value2) {
            addCriterion("VC_CAR_COLOR between", value1, value2, "vcCarColor");
            return (Criteria) this;
        }

        public Criteria andVcCarColorNotBetween(String value1, String value2) {
            addCriterion("VC_CAR_COLOR not between", value1, value2, "vcCarColor");
            return (Criteria) this;
        }

        public Criteria andVcCarBodyPhotoAddressIsNull() {
            addCriterion("VC_CAR_BODY_PHOTO_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andVcCarBodyPhotoAddressIsNotNull() {
            addCriterion("VC_CAR_BODY_PHOTO_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andVcCarBodyPhotoAddressEqualTo(String value) {
            addCriterion("VC_CAR_BODY_PHOTO_ADDRESS =", value, "vcCarBodyPhotoAddress");
            return (Criteria) this;
        }

        public Criteria andVcCarBodyPhotoAddressNotEqualTo(String value) {
            addCriterion("VC_CAR_BODY_PHOTO_ADDRESS <>", value, "vcCarBodyPhotoAddress");
            return (Criteria) this;
        }

        public Criteria andVcCarBodyPhotoAddressGreaterThan(String value) {
            addCriterion("VC_CAR_BODY_PHOTO_ADDRESS >", value, "vcCarBodyPhotoAddress");
            return (Criteria) this;
        }

        public Criteria andVcCarBodyPhotoAddressGreaterThanOrEqualTo(String value) {
            addCriterion("VC_CAR_BODY_PHOTO_ADDRESS >=", value, "vcCarBodyPhotoAddress");
            return (Criteria) this;
        }

        public Criteria andVcCarBodyPhotoAddressLessThan(String value) {
            addCriterion("VC_CAR_BODY_PHOTO_ADDRESS <", value, "vcCarBodyPhotoAddress");
            return (Criteria) this;
        }

        public Criteria andVcCarBodyPhotoAddressLessThanOrEqualTo(String value) {
            addCriterion("VC_CAR_BODY_PHOTO_ADDRESS <=", value, "vcCarBodyPhotoAddress");
            return (Criteria) this;
        }

        public Criteria andVcCarBodyPhotoAddressLike(String value) {
            addCriterion("VC_CAR_BODY_PHOTO_ADDRESS like", value, "vcCarBodyPhotoAddress");
            return (Criteria) this;
        }

        public Criteria andVcCarBodyPhotoAddressNotLike(String value) {
            addCriterion("VC_CAR_BODY_PHOTO_ADDRESS not like", value, "vcCarBodyPhotoAddress");
            return (Criteria) this;
        }

        public Criteria andVcCarBodyPhotoAddressIn(List<String> values) {
            addCriterion("VC_CAR_BODY_PHOTO_ADDRESS in", values, "vcCarBodyPhotoAddress");
            return (Criteria) this;
        }

        public Criteria andVcCarBodyPhotoAddressNotIn(List<String> values) {
            addCriterion("VC_CAR_BODY_PHOTO_ADDRESS not in", values, "vcCarBodyPhotoAddress");
            return (Criteria) this;
        }

        public Criteria andVcCarBodyPhotoAddressBetween(String value1, String value2) {
            addCriterion("VC_CAR_BODY_PHOTO_ADDRESS between", value1, value2, "vcCarBodyPhotoAddress");
            return (Criteria) this;
        }

        public Criteria andVcCarBodyPhotoAddressNotBetween(String value1, String value2) {
            addCriterion("VC_CAR_BODY_PHOTO_ADDRESS not between", value1, value2, "vcCarBodyPhotoAddress");
            return (Criteria) this;
        }

        public Criteria andVcDrivingLicensePhotoAddressIsNull() {
            addCriterion("VC_DRIVING_LICENSE_PHOTO_ADDRESS is null");
            return (Criteria) this;
        }

        public Criteria andVcDrivingLicensePhotoAddressIsNotNull() {
            addCriterion("VC_DRIVING_LICENSE_PHOTO_ADDRESS is not null");
            return (Criteria) this;
        }

        public Criteria andVcDrivingLicensePhotoAddressEqualTo(String value) {
            addCriterion("VC_DRIVING_LICENSE_PHOTO_ADDRESS =", value, "vcDrivingLicensePhotoAddress");
            return (Criteria) this;
        }

        public Criteria andVcDrivingLicensePhotoAddressNotEqualTo(String value) {
            addCriterion("VC_DRIVING_LICENSE_PHOTO_ADDRESS <>", value, "vcDrivingLicensePhotoAddress");
            return (Criteria) this;
        }

        public Criteria andVcDrivingLicensePhotoAddressGreaterThan(String value) {
            addCriterion("VC_DRIVING_LICENSE_PHOTO_ADDRESS >", value, "vcDrivingLicensePhotoAddress");
            return (Criteria) this;
        }

        public Criteria andVcDrivingLicensePhotoAddressGreaterThanOrEqualTo(String value) {
            addCriterion("VC_DRIVING_LICENSE_PHOTO_ADDRESS >=", value, "vcDrivingLicensePhotoAddress");
            return (Criteria) this;
        }

        public Criteria andVcDrivingLicensePhotoAddressLessThan(String value) {
            addCriterion("VC_DRIVING_LICENSE_PHOTO_ADDRESS <", value, "vcDrivingLicensePhotoAddress");
            return (Criteria) this;
        }

        public Criteria andVcDrivingLicensePhotoAddressLessThanOrEqualTo(String value) {
            addCriterion("VC_DRIVING_LICENSE_PHOTO_ADDRESS <=", value, "vcDrivingLicensePhotoAddress");
            return (Criteria) this;
        }

        public Criteria andVcDrivingLicensePhotoAddressLike(String value) {
            addCriterion("VC_DRIVING_LICENSE_PHOTO_ADDRESS like", value, "vcDrivingLicensePhotoAddress");
            return (Criteria) this;
        }

        public Criteria andVcDrivingLicensePhotoAddressNotLike(String value) {
            addCriterion("VC_DRIVING_LICENSE_PHOTO_ADDRESS not like", value, "vcDrivingLicensePhotoAddress");
            return (Criteria) this;
        }

        public Criteria andVcDrivingLicensePhotoAddressIn(List<String> values) {
            addCriterion("VC_DRIVING_LICENSE_PHOTO_ADDRESS in", values, "vcDrivingLicensePhotoAddress");
            return (Criteria) this;
        }

        public Criteria andVcDrivingLicensePhotoAddressNotIn(List<String> values) {
            addCriterion("VC_DRIVING_LICENSE_PHOTO_ADDRESS not in", values, "vcDrivingLicensePhotoAddress");
            return (Criteria) this;
        }

        public Criteria andVcDrivingLicensePhotoAddressBetween(String value1, String value2) {
            addCriterion("VC_DRIVING_LICENSE_PHOTO_ADDRESS between", value1, value2, "vcDrivingLicensePhotoAddress");
            return (Criteria) this;
        }

        public Criteria andVcDrivingLicensePhotoAddressNotBetween(String value1, String value2) {
            addCriterion("VC_DRIVING_LICENSE_PHOTO_ADDRESS not between", value1, value2, "vcDrivingLicensePhotoAddress");
            return (Criteria) this;
        }

        public Criteria andVcEngineNoIsNull() {
            addCriterion("VC_ENGINE_NO is null");
            return (Criteria) this;
        }

        public Criteria andVcEngineNoIsNotNull() {
            addCriterion("VC_ENGINE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andVcEngineNoEqualTo(String value) {
            addCriterion("VC_ENGINE_NO =", value, "vcEngineNo");
            return (Criteria) this;
        }

        public Criteria andVcEngineNoNotEqualTo(String value) {
            addCriterion("VC_ENGINE_NO <>", value, "vcEngineNo");
            return (Criteria) this;
        }

        public Criteria andVcEngineNoGreaterThan(String value) {
            addCriterion("VC_ENGINE_NO >", value, "vcEngineNo");
            return (Criteria) this;
        }

        public Criteria andVcEngineNoGreaterThanOrEqualTo(String value) {
            addCriterion("VC_ENGINE_NO >=", value, "vcEngineNo");
            return (Criteria) this;
        }

        public Criteria andVcEngineNoLessThan(String value) {
            addCriterion("VC_ENGINE_NO <", value, "vcEngineNo");
            return (Criteria) this;
        }

        public Criteria andVcEngineNoLessThanOrEqualTo(String value) {
            addCriterion("VC_ENGINE_NO <=", value, "vcEngineNo");
            return (Criteria) this;
        }

        public Criteria andVcEngineNoLike(String value) {
            addCriterion("VC_ENGINE_NO like", value, "vcEngineNo");
            return (Criteria) this;
        }

        public Criteria andVcEngineNoNotLike(String value) {
            addCriterion("VC_ENGINE_NO not like", value, "vcEngineNo");
            return (Criteria) this;
        }

        public Criteria andVcEngineNoIn(List<String> values) {
            addCriterion("VC_ENGINE_NO in", values, "vcEngineNo");
            return (Criteria) this;
        }

        public Criteria andVcEngineNoNotIn(List<String> values) {
            addCriterion("VC_ENGINE_NO not in", values, "vcEngineNo");
            return (Criteria) this;
        }

        public Criteria andVcEngineNoBetween(String value1, String value2) {
            addCriterion("VC_ENGINE_NO between", value1, value2, "vcEngineNo");
            return (Criteria) this;
        }

        public Criteria andVcEngineNoNotBetween(String value1, String value2) {
            addCriterion("VC_ENGINE_NO not between", value1, value2, "vcEngineNo");
            return (Criteria) this;
        }

        public Criteria andVcVinNoIsNull() {
            addCriterion("VC_VIN_NO is null");
            return (Criteria) this;
        }

        public Criteria andVcVinNoIsNotNull() {
            addCriterion("VC_VIN_NO is not null");
            return (Criteria) this;
        }

        public Criteria andVcVinNoEqualTo(String value) {
            addCriterion("VC_VIN_NO =", value, "vcVinNo");
            return (Criteria) this;
        }

        public Criteria andVcVinNoNotEqualTo(String value) {
            addCriterion("VC_VIN_NO <>", value, "vcVinNo");
            return (Criteria) this;
        }

        public Criteria andVcVinNoGreaterThan(String value) {
            addCriterion("VC_VIN_NO >", value, "vcVinNo");
            return (Criteria) this;
        }

        public Criteria andVcVinNoGreaterThanOrEqualTo(String value) {
            addCriterion("VC_VIN_NO >=", value, "vcVinNo");
            return (Criteria) this;
        }

        public Criteria andVcVinNoLessThan(String value) {
            addCriterion("VC_VIN_NO <", value, "vcVinNo");
            return (Criteria) this;
        }

        public Criteria andVcVinNoLessThanOrEqualTo(String value) {
            addCriterion("VC_VIN_NO <=", value, "vcVinNo");
            return (Criteria) this;
        }

        public Criteria andVcVinNoLike(String value) {
            addCriterion("VC_VIN_NO like", value, "vcVinNo");
            return (Criteria) this;
        }

        public Criteria andVcVinNoNotLike(String value) {
            addCriterion("VC_VIN_NO not like", value, "vcVinNo");
            return (Criteria) this;
        }

        public Criteria andVcVinNoIn(List<String> values) {
            addCriterion("VC_VIN_NO in", values, "vcVinNo");
            return (Criteria) this;
        }

        public Criteria andVcVinNoNotIn(List<String> values) {
            addCriterion("VC_VIN_NO not in", values, "vcVinNo");
            return (Criteria) this;
        }

        public Criteria andVcVinNoBetween(String value1, String value2) {
            addCriterion("VC_VIN_NO between", value1, value2, "vcVinNo");
            return (Criteria) this;
        }

        public Criteria andVcVinNoNotBetween(String value1, String value2) {
            addCriterion("VC_VIN_NO not between", value1, value2, "vcVinNo");
            return (Criteria) this;
        }

        public Criteria andDatRegistDateIsNull() {
            addCriterion("DAT_REGIST_DATE is null");
            return (Criteria) this;
        }

        public Criteria andDatRegistDateIsNotNull() {
            addCriterion("DAT_REGIST_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andDatRegistDateEqualTo(Date value) {
            addCriterion("DAT_REGIST_DATE =", value, "datRegistDate");
            return (Criteria) this;
        }

        public Criteria andDatRegistDateNotEqualTo(Date value) {
            addCriterion("DAT_REGIST_DATE <>", value, "datRegistDate");
            return (Criteria) this;
        }

        public Criteria andDatRegistDateGreaterThan(Date value) {
            addCriterion("DAT_REGIST_DATE >", value, "datRegistDate");
            return (Criteria) this;
        }

        public Criteria andDatRegistDateGreaterThanOrEqualTo(Date value) {
            addCriterion("DAT_REGIST_DATE >=", value, "datRegistDate");
            return (Criteria) this;
        }

        public Criteria andDatRegistDateLessThan(Date value) {
            addCriterion("DAT_REGIST_DATE <", value, "datRegistDate");
            return (Criteria) this;
        }

        public Criteria andDatRegistDateLessThanOrEqualTo(Date value) {
            addCriterion("DAT_REGIST_DATE <=", value, "datRegistDate");
            return (Criteria) this;
        }

        public Criteria andDatRegistDateIn(List<Date> values) {
            addCriterion("DAT_REGIST_DATE in", values, "datRegistDate");
            return (Criteria) this;
        }

        public Criteria andDatRegistDateNotIn(List<Date> values) {
            addCriterion("DAT_REGIST_DATE not in", values, "datRegistDate");
            return (Criteria) this;
        }

        public Criteria andDatRegistDateBetween(Date value1, Date value2) {
            addCriterion("DAT_REGIST_DATE between", value1, value2, "datRegistDate");
            return (Criteria) this;
        }

        public Criteria andDatRegistDateNotBetween(Date value1, Date value2) {
            addCriterion("DAT_REGIST_DATE not between", value1, value2, "datRegistDate");
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