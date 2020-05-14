package com.dower.product.core.serverdb.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NntCarOwnerInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NntCarOwnerInfoExample() {
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

        public Criteria andVcDrivingLicenseNoIsNull() {
            addCriterion("VC_DRIVING_LICENSE_NO is null");
            return (Criteria) this;
        }

        public Criteria andVcDrivingLicenseNoIsNotNull() {
            addCriterion("VC_DRIVING_LICENSE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andVcDrivingLicenseNoEqualTo(String value) {
            addCriterion("VC_DRIVING_LICENSE_NO =", value, "vcDrivingLicenseNo");
            return (Criteria) this;
        }

        public Criteria andVcDrivingLicenseNoNotEqualTo(String value) {
            addCriterion("VC_DRIVING_LICENSE_NO <>", value, "vcDrivingLicenseNo");
            return (Criteria) this;
        }

        public Criteria andVcDrivingLicenseNoGreaterThan(String value) {
            addCriterion("VC_DRIVING_LICENSE_NO >", value, "vcDrivingLicenseNo");
            return (Criteria) this;
        }

        public Criteria andVcDrivingLicenseNoGreaterThanOrEqualTo(String value) {
            addCriterion("VC_DRIVING_LICENSE_NO >=", value, "vcDrivingLicenseNo");
            return (Criteria) this;
        }

        public Criteria andVcDrivingLicenseNoLessThan(String value) {
            addCriterion("VC_DRIVING_LICENSE_NO <", value, "vcDrivingLicenseNo");
            return (Criteria) this;
        }

        public Criteria andVcDrivingLicenseNoLessThanOrEqualTo(String value) {
            addCriterion("VC_DRIVING_LICENSE_NO <=", value, "vcDrivingLicenseNo");
            return (Criteria) this;
        }

        public Criteria andVcDrivingLicenseNoLike(String value) {
            addCriterion("VC_DRIVING_LICENSE_NO like", value, "vcDrivingLicenseNo");
            return (Criteria) this;
        }

        public Criteria andVcDrivingLicenseNoNotLike(String value) {
            addCriterion("VC_DRIVING_LICENSE_NO not like", value, "vcDrivingLicenseNo");
            return (Criteria) this;
        }

        public Criteria andVcDrivingLicenseNoIn(List<String> values) {
            addCriterion("VC_DRIVING_LICENSE_NO in", values, "vcDrivingLicenseNo");
            return (Criteria) this;
        }

        public Criteria andVcDrivingLicenseNoNotIn(List<String> values) {
            addCriterion("VC_DRIVING_LICENSE_NO not in", values, "vcDrivingLicenseNo");
            return (Criteria) this;
        }

        public Criteria andVcDrivingLicenseNoBetween(String value1, String value2) {
            addCriterion("VC_DRIVING_LICENSE_NO between", value1, value2, "vcDrivingLicenseNo");
            return (Criteria) this;
        }

        public Criteria andVcDrivingLicenseNoNotBetween(String value1, String value2) {
            addCriterion("VC_DRIVING_LICENSE_NO not between", value1, value2, "vcDrivingLicenseNo");
            return (Criteria) this;
        }

        public Criteria andDatCertificationStartDateIsNull() {
            addCriterion("DAT_CERTIFICATION_START_DATE is null");
            return (Criteria) this;
        }

        public Criteria andDatCertificationStartDateIsNotNull() {
            addCriterion("DAT_CERTIFICATION_START_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andDatCertificationStartDateEqualTo(Date value) {
            addCriterion("DAT_CERTIFICATION_START_DATE =", value, "datCertificationStartDate");
            return (Criteria) this;
        }

        public Criteria andDatCertificationStartDateNotEqualTo(Date value) {
            addCriterion("DAT_CERTIFICATION_START_DATE <>", value, "datCertificationStartDate");
            return (Criteria) this;
        }

        public Criteria andDatCertificationStartDateGreaterThan(Date value) {
            addCriterion("DAT_CERTIFICATION_START_DATE >", value, "datCertificationStartDate");
            return (Criteria) this;
        }

        public Criteria andDatCertificationStartDateGreaterThanOrEqualTo(Date value) {
            addCriterion("DAT_CERTIFICATION_START_DATE >=", value, "datCertificationStartDate");
            return (Criteria) this;
        }

        public Criteria andDatCertificationStartDateLessThan(Date value) {
            addCriterion("DAT_CERTIFICATION_START_DATE <", value, "datCertificationStartDate");
            return (Criteria) this;
        }

        public Criteria andDatCertificationStartDateLessThanOrEqualTo(Date value) {
            addCriterion("DAT_CERTIFICATION_START_DATE <=", value, "datCertificationStartDate");
            return (Criteria) this;
        }

        public Criteria andDatCertificationStartDateIn(List<Date> values) {
            addCriterion("DAT_CERTIFICATION_START_DATE in", values, "datCertificationStartDate");
            return (Criteria) this;
        }

        public Criteria andDatCertificationStartDateNotIn(List<Date> values) {
            addCriterion("DAT_CERTIFICATION_START_DATE not in", values, "datCertificationStartDate");
            return (Criteria) this;
        }

        public Criteria andDatCertificationStartDateBetween(Date value1, Date value2) {
            addCriterion("DAT_CERTIFICATION_START_DATE between", value1, value2, "datCertificationStartDate");
            return (Criteria) this;
        }

        public Criteria andDatCertificationStartDateNotBetween(Date value1, Date value2) {
            addCriterion("DAT_CERTIFICATION_START_DATE not between", value1, value2, "datCertificationStartDate");
            return (Criteria) this;
        }

        public Criteria andDatCertificationEndDateIsNull() {
            addCriterion("DAT_CERTIFICATION_END_DATE is null");
            return (Criteria) this;
        }

        public Criteria andDatCertificationEndDateIsNotNull() {
            addCriterion("DAT_CERTIFICATION_END_DATE is not null");
            return (Criteria) this;
        }

        public Criteria andDatCertificationEndDateEqualTo(Date value) {
            addCriterion("DAT_CERTIFICATION_END_DATE =", value, "datCertificationEndDate");
            return (Criteria) this;
        }

        public Criteria andDatCertificationEndDateNotEqualTo(Date value) {
            addCriterion("DAT_CERTIFICATION_END_DATE <>", value, "datCertificationEndDate");
            return (Criteria) this;
        }

        public Criteria andDatCertificationEndDateGreaterThan(Date value) {
            addCriterion("DAT_CERTIFICATION_END_DATE >", value, "datCertificationEndDate");
            return (Criteria) this;
        }

        public Criteria andDatCertificationEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("DAT_CERTIFICATION_END_DATE >=", value, "datCertificationEndDate");
            return (Criteria) this;
        }

        public Criteria andDatCertificationEndDateLessThan(Date value) {
            addCriterion("DAT_CERTIFICATION_END_DATE <", value, "datCertificationEndDate");
            return (Criteria) this;
        }

        public Criteria andDatCertificationEndDateLessThanOrEqualTo(Date value) {
            addCriterion("DAT_CERTIFICATION_END_DATE <=", value, "datCertificationEndDate");
            return (Criteria) this;
        }

        public Criteria andDatCertificationEndDateIn(List<Date> values) {
            addCriterion("DAT_CERTIFICATION_END_DATE in", values, "datCertificationEndDate");
            return (Criteria) this;
        }

        public Criteria andDatCertificationEndDateNotIn(List<Date> values) {
            addCriterion("DAT_CERTIFICATION_END_DATE not in", values, "datCertificationEndDate");
            return (Criteria) this;
        }

        public Criteria andDatCertificationEndDateBetween(Date value1, Date value2) {
            addCriterion("DAT_CERTIFICATION_END_DATE between", value1, value2, "datCertificationEndDate");
            return (Criteria) this;
        }

        public Criteria andDatCertificationEndDateNotBetween(Date value1, Date value2) {
            addCriterion("DAT_CERTIFICATION_END_DATE not between", value1, value2, "datCertificationEndDate");
            return (Criteria) this;
        }

        public Criteria andVcRealNameIsNull() {
            addCriterion("VC_REAL_NAME is null");
            return (Criteria) this;
        }

        public Criteria andVcRealNameIsNotNull() {
            addCriterion("VC_REAL_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andVcRealNameEqualTo(String value) {
            addCriterion("VC_REAL_NAME =", value, "vcRealName");
            return (Criteria) this;
        }

        public Criteria andVcRealNameNotEqualTo(String value) {
            addCriterion("VC_REAL_NAME <>", value, "vcRealName");
            return (Criteria) this;
        }

        public Criteria andVcRealNameGreaterThan(String value) {
            addCriterion("VC_REAL_NAME >", value, "vcRealName");
            return (Criteria) this;
        }

        public Criteria andVcRealNameGreaterThanOrEqualTo(String value) {
            addCriterion("VC_REAL_NAME >=", value, "vcRealName");
            return (Criteria) this;
        }

        public Criteria andVcRealNameLessThan(String value) {
            addCriterion("VC_REAL_NAME <", value, "vcRealName");
            return (Criteria) this;
        }

        public Criteria andVcRealNameLessThanOrEqualTo(String value) {
            addCriterion("VC_REAL_NAME <=", value, "vcRealName");
            return (Criteria) this;
        }

        public Criteria andVcRealNameLike(String value) {
            addCriterion("VC_REAL_NAME like", value, "vcRealName");
            return (Criteria) this;
        }

        public Criteria andVcRealNameNotLike(String value) {
            addCriterion("VC_REAL_NAME not like", value, "vcRealName");
            return (Criteria) this;
        }

        public Criteria andVcRealNameIn(List<String> values) {
            addCriterion("VC_REAL_NAME in", values, "vcRealName");
            return (Criteria) this;
        }

        public Criteria andVcRealNameNotIn(List<String> values) {
            addCriterion("VC_REAL_NAME not in", values, "vcRealName");
            return (Criteria) this;
        }

        public Criteria andVcRealNameBetween(String value1, String value2) {
            addCriterion("VC_REAL_NAME between", value1, value2, "vcRealName");
            return (Criteria) this;
        }

        public Criteria andVcRealNameNotBetween(String value1, String value2) {
            addCriterion("VC_REAL_NAME not between", value1, value2, "vcRealName");
            return (Criteria) this;
        }

        public Criteria andVcIdentityNoIsNull() {
            addCriterion("VC_IDENTITY_NO is null");
            return (Criteria) this;
        }

        public Criteria andVcIdentityNoIsNotNull() {
            addCriterion("VC_IDENTITY_NO is not null");
            return (Criteria) this;
        }

        public Criteria andVcIdentityNoEqualTo(String value) {
            addCriterion("VC_IDENTITY_NO =", value, "vcIdentityNo");
            return (Criteria) this;
        }

        public Criteria andVcIdentityNoNotEqualTo(String value) {
            addCriterion("VC_IDENTITY_NO <>", value, "vcIdentityNo");
            return (Criteria) this;
        }

        public Criteria andVcIdentityNoGreaterThan(String value) {
            addCriterion("VC_IDENTITY_NO >", value, "vcIdentityNo");
            return (Criteria) this;
        }

        public Criteria andVcIdentityNoGreaterThanOrEqualTo(String value) {
            addCriterion("VC_IDENTITY_NO >=", value, "vcIdentityNo");
            return (Criteria) this;
        }

        public Criteria andVcIdentityNoLessThan(String value) {
            addCriterion("VC_IDENTITY_NO <", value, "vcIdentityNo");
            return (Criteria) this;
        }

        public Criteria andVcIdentityNoLessThanOrEqualTo(String value) {
            addCriterion("VC_IDENTITY_NO <=", value, "vcIdentityNo");
            return (Criteria) this;
        }

        public Criteria andVcIdentityNoLike(String value) {
            addCriterion("VC_IDENTITY_NO like", value, "vcIdentityNo");
            return (Criteria) this;
        }

        public Criteria andVcIdentityNoNotLike(String value) {
            addCriterion("VC_IDENTITY_NO not like", value, "vcIdentityNo");
            return (Criteria) this;
        }

        public Criteria andVcIdentityNoIn(List<String> values) {
            addCriterion("VC_IDENTITY_NO in", values, "vcIdentityNo");
            return (Criteria) this;
        }

        public Criteria andVcIdentityNoNotIn(List<String> values) {
            addCriterion("VC_IDENTITY_NO not in", values, "vcIdentityNo");
            return (Criteria) this;
        }

        public Criteria andVcIdentityNoBetween(String value1, String value2) {
            addCriterion("VC_IDENTITY_NO between", value1, value2, "vcIdentityNo");
            return (Criteria) this;
        }

        public Criteria andVcIdentityNoNotBetween(String value1, String value2) {
            addCriterion("VC_IDENTITY_NO not between", value1, value2, "vcIdentityNo");
            return (Criteria) this;
        }

        public Criteria andVcInviteCodeIsNull() {
            addCriterion("VC_INVITE_CODE is null");
            return (Criteria) this;
        }

        public Criteria andVcInviteCodeIsNotNull() {
            addCriterion("VC_INVITE_CODE is not null");
            return (Criteria) this;
        }

        public Criteria andVcInviteCodeEqualTo(String value) {
            addCriterion("VC_INVITE_CODE =", value, "vcInviteCode");
            return (Criteria) this;
        }

        public Criteria andVcInviteCodeNotEqualTo(String value) {
            addCriterion("VC_INVITE_CODE <>", value, "vcInviteCode");
            return (Criteria) this;
        }

        public Criteria andVcInviteCodeGreaterThan(String value) {
            addCriterion("VC_INVITE_CODE >", value, "vcInviteCode");
            return (Criteria) this;
        }

        public Criteria andVcInviteCodeGreaterThanOrEqualTo(String value) {
            addCriterion("VC_INVITE_CODE >=", value, "vcInviteCode");
            return (Criteria) this;
        }

        public Criteria andVcInviteCodeLessThan(String value) {
            addCriterion("VC_INVITE_CODE <", value, "vcInviteCode");
            return (Criteria) this;
        }

        public Criteria andVcInviteCodeLessThanOrEqualTo(String value) {
            addCriterion("VC_INVITE_CODE <=", value, "vcInviteCode");
            return (Criteria) this;
        }

        public Criteria andVcInviteCodeLike(String value) {
            addCriterion("VC_INVITE_CODE like", value, "vcInviteCode");
            return (Criteria) this;
        }

        public Criteria andVcInviteCodeNotLike(String value) {
            addCriterion("VC_INVITE_CODE not like", value, "vcInviteCode");
            return (Criteria) this;
        }

        public Criteria andVcInviteCodeIn(List<String> values) {
            addCriterion("VC_INVITE_CODE in", values, "vcInviteCode");
            return (Criteria) this;
        }

        public Criteria andVcInviteCodeNotIn(List<String> values) {
            addCriterion("VC_INVITE_CODE not in", values, "vcInviteCode");
            return (Criteria) this;
        }

        public Criteria andVcInviteCodeBetween(String value1, String value2) {
            addCriterion("VC_INVITE_CODE between", value1, value2, "vcInviteCode");
            return (Criteria) this;
        }

        public Criteria andVcInviteCodeNotBetween(String value1, String value2) {
            addCriterion("VC_INVITE_CODE not between", value1, value2, "vcInviteCode");
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