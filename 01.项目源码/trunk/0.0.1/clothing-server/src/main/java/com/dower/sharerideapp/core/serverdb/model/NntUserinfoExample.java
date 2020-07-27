package com.dower.sharerideapp.core.serverdb.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NntUserinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public NntUserinfoExample() {
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

        public Criteria andNumUserinfoIdIsNull() {
            addCriterion("NUM_USERINFO_ID is null");
            return (Criteria) this;
        }

        public Criteria andNumUserinfoIdIsNotNull() {
            addCriterion("NUM_USERINFO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andNumUserinfoIdEqualTo(Integer value) {
            addCriterion("NUM_USERINFO_ID =", value, "numUserinfoId");
            return (Criteria) this;
        }

        public Criteria andNumUserinfoIdNotEqualTo(Integer value) {
            addCriterion("NUM_USERINFO_ID <>", value, "numUserinfoId");
            return (Criteria) this;
        }

        public Criteria andNumUserinfoIdGreaterThan(Integer value) {
            addCriterion("NUM_USERINFO_ID >", value, "numUserinfoId");
            return (Criteria) this;
        }

        public Criteria andNumUserinfoIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("NUM_USERINFO_ID >=", value, "numUserinfoId");
            return (Criteria) this;
        }

        public Criteria andNumUserinfoIdLessThan(Integer value) {
            addCriterion("NUM_USERINFO_ID <", value, "numUserinfoId");
            return (Criteria) this;
        }

        public Criteria andNumUserinfoIdLessThanOrEqualTo(Integer value) {
            addCriterion("NUM_USERINFO_ID <=", value, "numUserinfoId");
            return (Criteria) this;
        }

        public Criteria andNumUserinfoIdIn(List<Integer> values) {
            addCriterion("NUM_USERINFO_ID in", values, "numUserinfoId");
            return (Criteria) this;
        }

        public Criteria andNumUserinfoIdNotIn(List<Integer> values) {
            addCriterion("NUM_USERINFO_ID not in", values, "numUserinfoId");
            return (Criteria) this;
        }

        public Criteria andNumUserinfoIdBetween(Integer value1, Integer value2) {
            addCriterion("NUM_USERINFO_ID between", value1, value2, "numUserinfoId");
            return (Criteria) this;
        }

        public Criteria andNumUserinfoIdNotBetween(Integer value1, Integer value2) {
            addCriterion("NUM_USERINFO_ID not between", value1, value2, "numUserinfoId");
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

        public Criteria andNumUserIdEqualTo(String value) {
            addCriterion("NUM_USER_ID =", value, "numUserId");
            return (Criteria) this;
        }

        public Criteria andNumUserIdNotEqualTo(String value) {
            addCriterion("NUM_USER_ID <>", value, "numUserId");
            return (Criteria) this;
        }

        public Criteria andNumUserIdGreaterThan(String value) {
            addCriterion("NUM_USER_ID >", value, "numUserId");
            return (Criteria) this;
        }

        public Criteria andNumUserIdGreaterThanOrEqualTo(String value) {
            addCriterion("NUM_USER_ID >=", value, "numUserId");
            return (Criteria) this;
        }

        public Criteria andNumUserIdLessThan(String value) {
            addCriterion("NUM_USER_ID <", value, "numUserId");
            return (Criteria) this;
        }

        public Criteria andNumUserIdLessThanOrEqualTo(String value) {
            addCriterion("NUM_USER_ID <=", value, "numUserId");
            return (Criteria) this;
        }

        public Criteria andNumUserIdLike(String value) {
            addCriterion("NUM_USER_ID like", value, "numUserId");
            return (Criteria) this;
        }

        public Criteria andNumUserIdNotLike(String value) {
            addCriterion("NUM_USER_ID not like", value, "numUserId");
            return (Criteria) this;
        }

        public Criteria andNumUserIdIn(List<String> values) {
            addCriterion("NUM_USER_ID in", values, "numUserId");
            return (Criteria) this;
        }

        public Criteria andNumUserIdNotIn(List<String> values) {
            addCriterion("NUM_USER_ID not in", values, "numUserId");
            return (Criteria) this;
        }

        public Criteria andNumUserIdBetween(String value1, String value2) {
            addCriterion("NUM_USER_ID between", value1, value2, "numUserId");
            return (Criteria) this;
        }

        public Criteria andNumUserIdNotBetween(String value1, String value2) {
            addCriterion("NUM_USER_ID not between", value1, value2, "numUserId");
            return (Criteria) this;
        }

        public Criteria andVcNameIsNull() {
            addCriterion("VC_NAME is null");
            return (Criteria) this;
        }

        public Criteria andVcNameIsNotNull() {
            addCriterion("VC_NAME is not null");
            return (Criteria) this;
        }

        public Criteria andVcNameEqualTo(String value) {
            addCriterion("VC_NAME =", value, "vcName");
            return (Criteria) this;
        }

        public Criteria andVcNameNotEqualTo(String value) {
            addCriterion("VC_NAME <>", value, "vcName");
            return (Criteria) this;
        }

        public Criteria andVcNameGreaterThan(String value) {
            addCriterion("VC_NAME >", value, "vcName");
            return (Criteria) this;
        }

        public Criteria andVcNameGreaterThanOrEqualTo(String value) {
            addCriterion("VC_NAME >=", value, "vcName");
            return (Criteria) this;
        }

        public Criteria andVcNameLessThan(String value) {
            addCriterion("VC_NAME <", value, "vcName");
            return (Criteria) this;
        }

        public Criteria andVcNameLessThanOrEqualTo(String value) {
            addCriterion("VC_NAME <=", value, "vcName");
            return (Criteria) this;
        }

        public Criteria andVcNameLike(String value) {
            addCriterion("VC_NAME like", value, "vcName");
            return (Criteria) this;
        }

        public Criteria andVcNameNotLike(String value) {
            addCriterion("VC_NAME not like", value, "vcName");
            return (Criteria) this;
        }

        public Criteria andVcNameIn(List<String> values) {
            addCriterion("VC_NAME in", values, "vcName");
            return (Criteria) this;
        }

        public Criteria andVcNameNotIn(List<String> values) {
            addCriterion("VC_NAME not in", values, "vcName");
            return (Criteria) this;
        }

        public Criteria andVcNameBetween(String value1, String value2) {
            addCriterion("VC_NAME between", value1, value2, "vcName");
            return (Criteria) this;
        }

        public Criteria andVcNameNotBetween(String value1, String value2) {
            addCriterion("VC_NAME not between", value1, value2, "vcName");
            return (Criteria) this;
        }

        public Criteria andNumIdcardTypeIsNull() {
            addCriterion("NUM_IDCARD_TYPE is null");
            return (Criteria) this;
        }

        public Criteria andNumIdcardTypeIsNotNull() {
            addCriterion("NUM_IDCARD_TYPE is not null");
            return (Criteria) this;
        }

        public Criteria andNumIdcardTypeEqualTo(Byte value) {
            addCriterion("NUM_IDCARD_TYPE =", value, "numIdcardType");
            return (Criteria) this;
        }

        public Criteria andNumIdcardTypeNotEqualTo(Byte value) {
            addCriterion("NUM_IDCARD_TYPE <>", value, "numIdcardType");
            return (Criteria) this;
        }

        public Criteria andNumIdcardTypeGreaterThan(Byte value) {
            addCriterion("NUM_IDCARD_TYPE >", value, "numIdcardType");
            return (Criteria) this;
        }

        public Criteria andNumIdcardTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("NUM_IDCARD_TYPE >=", value, "numIdcardType");
            return (Criteria) this;
        }

        public Criteria andNumIdcardTypeLessThan(Byte value) {
            addCriterion("NUM_IDCARD_TYPE <", value, "numIdcardType");
            return (Criteria) this;
        }

        public Criteria andNumIdcardTypeLessThanOrEqualTo(Byte value) {
            addCriterion("NUM_IDCARD_TYPE <=", value, "numIdcardType");
            return (Criteria) this;
        }

        public Criteria andNumIdcardTypeIn(List<Byte> values) {
            addCriterion("NUM_IDCARD_TYPE in", values, "numIdcardType");
            return (Criteria) this;
        }

        public Criteria andNumIdcardTypeNotIn(List<Byte> values) {
            addCriterion("NUM_IDCARD_TYPE not in", values, "numIdcardType");
            return (Criteria) this;
        }

        public Criteria andNumIdcardTypeBetween(Byte value1, Byte value2) {
            addCriterion("NUM_IDCARD_TYPE between", value1, value2, "numIdcardType");
            return (Criteria) this;
        }

        public Criteria andNumIdcardTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("NUM_IDCARD_TYPE not between", value1, value2, "numIdcardType");
            return (Criteria) this;
        }

        public Criteria andVcIdcardNoIsNull() {
            addCriterion("VC_IDCARD_NO is null");
            return (Criteria) this;
        }

        public Criteria andVcIdcardNoIsNotNull() {
            addCriterion("VC_IDCARD_NO is not null");
            return (Criteria) this;
        }

        public Criteria andVcIdcardNoEqualTo(String value) {
            addCriterion("VC_IDCARD_NO =", value, "vcIdcardNo");
            return (Criteria) this;
        }

        public Criteria andVcIdcardNoNotEqualTo(String value) {
            addCriterion("VC_IDCARD_NO <>", value, "vcIdcardNo");
            return (Criteria) this;
        }

        public Criteria andVcIdcardNoGreaterThan(String value) {
            addCriterion("VC_IDCARD_NO >", value, "vcIdcardNo");
            return (Criteria) this;
        }

        public Criteria andVcIdcardNoGreaterThanOrEqualTo(String value) {
            addCriterion("VC_IDCARD_NO >=", value, "vcIdcardNo");
            return (Criteria) this;
        }

        public Criteria andVcIdcardNoLessThan(String value) {
            addCriterion("VC_IDCARD_NO <", value, "vcIdcardNo");
            return (Criteria) this;
        }

        public Criteria andVcIdcardNoLessThanOrEqualTo(String value) {
            addCriterion("VC_IDCARD_NO <=", value, "vcIdcardNo");
            return (Criteria) this;
        }

        public Criteria andVcIdcardNoLike(String value) {
            addCriterion("VC_IDCARD_NO like", value, "vcIdcardNo");
            return (Criteria) this;
        }

        public Criteria andVcIdcardNoNotLike(String value) {
            addCriterion("VC_IDCARD_NO not like", value, "vcIdcardNo");
            return (Criteria) this;
        }

        public Criteria andVcIdcardNoIn(List<String> values) {
            addCriterion("VC_IDCARD_NO in", values, "vcIdcardNo");
            return (Criteria) this;
        }

        public Criteria andVcIdcardNoNotIn(List<String> values) {
            addCriterion("VC_IDCARD_NO not in", values, "vcIdcardNo");
            return (Criteria) this;
        }

        public Criteria andVcIdcardNoBetween(String value1, String value2) {
            addCriterion("VC_IDCARD_NO between", value1, value2, "vcIdcardNo");
            return (Criteria) this;
        }

        public Criteria andVcIdcardNoNotBetween(String value1, String value2) {
            addCriterion("VC_IDCARD_NO not between", value1, value2, "vcIdcardNo");
            return (Criteria) this;
        }

        public Criteria andVcMobilePhoneIsNull() {
            addCriterion("VC_MOBILE_PHONE is null");
            return (Criteria) this;
        }

        public Criteria andVcMobilePhoneIsNotNull() {
            addCriterion("VC_MOBILE_PHONE is not null");
            return (Criteria) this;
        }

        public Criteria andVcMobilePhoneEqualTo(String value) {
            addCriterion("VC_MOBILE_PHONE =", value, "vcMobilePhone");
            return (Criteria) this;
        }

        public Criteria andVcMobilePhoneNotEqualTo(String value) {
            addCriterion("VC_MOBILE_PHONE <>", value, "vcMobilePhone");
            return (Criteria) this;
        }

        public Criteria andVcMobilePhoneGreaterThan(String value) {
            addCriterion("VC_MOBILE_PHONE >", value, "vcMobilePhone");
            return (Criteria) this;
        }

        public Criteria andVcMobilePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("VC_MOBILE_PHONE >=", value, "vcMobilePhone");
            return (Criteria) this;
        }

        public Criteria andVcMobilePhoneLessThan(String value) {
            addCriterion("VC_MOBILE_PHONE <", value, "vcMobilePhone");
            return (Criteria) this;
        }

        public Criteria andVcMobilePhoneLessThanOrEqualTo(String value) {
            addCriterion("VC_MOBILE_PHONE <=", value, "vcMobilePhone");
            return (Criteria) this;
        }

        public Criteria andVcMobilePhoneLike(String value) {
            addCriterion("VC_MOBILE_PHONE like", value, "vcMobilePhone");
            return (Criteria) this;
        }

        public Criteria andVcMobilePhoneNotLike(String value) {
            addCriterion("VC_MOBILE_PHONE not like", value, "vcMobilePhone");
            return (Criteria) this;
        }

        public Criteria andVcMobilePhoneIn(List<String> values) {
            addCriterion("VC_MOBILE_PHONE in", values, "vcMobilePhone");
            return (Criteria) this;
        }

        public Criteria andVcMobilePhoneNotIn(List<String> values) {
            addCriterion("VC_MOBILE_PHONE not in", values, "vcMobilePhone");
            return (Criteria) this;
        }

        public Criteria andVcMobilePhoneBetween(String value1, String value2) {
            addCriterion("VC_MOBILE_PHONE between", value1, value2, "vcMobilePhone");
            return (Criteria) this;
        }

        public Criteria andVcMobilePhoneNotBetween(String value1, String value2) {
            addCriterion("VC_MOBILE_PHONE not between", value1, value2, "vcMobilePhone");
            return (Criteria) this;
        }

        public Criteria andVcEmailIsNull() {
            addCriterion("VC_EMAIL is null");
            return (Criteria) this;
        }

        public Criteria andVcEmailIsNotNull() {
            addCriterion("VC_EMAIL is not null");
            return (Criteria) this;
        }

        public Criteria andVcEmailEqualTo(String value) {
            addCriterion("VC_EMAIL =", value, "vcEmail");
            return (Criteria) this;
        }

        public Criteria andVcEmailNotEqualTo(String value) {
            addCriterion("VC_EMAIL <>", value, "vcEmail");
            return (Criteria) this;
        }

        public Criteria andVcEmailGreaterThan(String value) {
            addCriterion("VC_EMAIL >", value, "vcEmail");
            return (Criteria) this;
        }

        public Criteria andVcEmailGreaterThanOrEqualTo(String value) {
            addCriterion("VC_EMAIL >=", value, "vcEmail");
            return (Criteria) this;
        }

        public Criteria andVcEmailLessThan(String value) {
            addCriterion("VC_EMAIL <", value, "vcEmail");
            return (Criteria) this;
        }

        public Criteria andVcEmailLessThanOrEqualTo(String value) {
            addCriterion("VC_EMAIL <=", value, "vcEmail");
            return (Criteria) this;
        }

        public Criteria andVcEmailLike(String value) {
            addCriterion("VC_EMAIL like", value, "vcEmail");
            return (Criteria) this;
        }

        public Criteria andVcEmailNotLike(String value) {
            addCriterion("VC_EMAIL not like", value, "vcEmail");
            return (Criteria) this;
        }

        public Criteria andVcEmailIn(List<String> values) {
            addCriterion("VC_EMAIL in", values, "vcEmail");
            return (Criteria) this;
        }

        public Criteria andVcEmailNotIn(List<String> values) {
            addCriterion("VC_EMAIL not in", values, "vcEmail");
            return (Criteria) this;
        }

        public Criteria andVcEmailBetween(String value1, String value2) {
            addCriterion("VC_EMAIL between", value1, value2, "vcEmail");
            return (Criteria) this;
        }

        public Criteria andVcEmailNotBetween(String value1, String value2) {
            addCriterion("VC_EMAIL not between", value1, value2, "vcEmail");
            return (Criteria) this;
        }

        public Criteria andNumGenderIsNull() {
            addCriterion("NUM_GENDER is null");
            return (Criteria) this;
        }

        public Criteria andNumGenderIsNotNull() {
            addCriterion("NUM_GENDER is not null");
            return (Criteria) this;
        }

        public Criteria andNumGenderEqualTo(String value) {
            addCriterion("NUM_GENDER =", value, "numGender");
            return (Criteria) this;
        }

        public Criteria andNumGenderNotEqualTo(String value) {
            addCriterion("NUM_GENDER <>", value, "numGender");
            return (Criteria) this;
        }

        public Criteria andNumGenderGreaterThan(String value) {
            addCriterion("NUM_GENDER >", value, "numGender");
            return (Criteria) this;
        }

        public Criteria andNumGenderGreaterThanOrEqualTo(String value) {
            addCriterion("NUM_GENDER >=", value, "numGender");
            return (Criteria) this;
        }

        public Criteria andNumGenderLessThan(String value) {
            addCriterion("NUM_GENDER <", value, "numGender");
            return (Criteria) this;
        }

        public Criteria andNumGenderLessThanOrEqualTo(String value) {
            addCriterion("NUM_GENDER <=", value, "numGender");
            return (Criteria) this;
        }

        public Criteria andNumGenderLike(String value) {
            addCriterion("NUM_GENDER like", value, "numGender");
            return (Criteria) this;
        }

        public Criteria andNumGenderNotLike(String value) {
            addCriterion("NUM_GENDER not like", value, "numGender");
            return (Criteria) this;
        }

        public Criteria andNumGenderIn(List<String> values) {
            addCriterion("NUM_GENDER in", values, "numGender");
            return (Criteria) this;
        }

        public Criteria andNumGenderNotIn(List<String> values) {
            addCriterion("NUM_GENDER not in", values, "numGender");
            return (Criteria) this;
        }

        public Criteria andNumGenderBetween(String value1, String value2) {
            addCriterion("NUM_GENDER between", value1, value2, "numGender");
            return (Criteria) this;
        }

        public Criteria andNumGenderNotBetween(String value1, String value2) {
            addCriterion("NUM_GENDER not between", value1, value2, "numGender");
            return (Criteria) this;
        }

        public Criteria andNumUserPointIsNull() {
            addCriterion("NUM_USER_POINT is null");
            return (Criteria) this;
        }

        public Criteria andNumUserPointIsNotNull() {
            addCriterion("NUM_USER_POINT is not null");
            return (Criteria) this;
        }

        public Criteria andNumUserPointEqualTo(Integer value) {
            addCriterion("NUM_USER_POINT =", value, "numUserPoint");
            return (Criteria) this;
        }

        public Criteria andNumUserPointNotEqualTo(Integer value) {
            addCriterion("NUM_USER_POINT <>", value, "numUserPoint");
            return (Criteria) this;
        }

        public Criteria andNumUserPointGreaterThan(Integer value) {
            addCriterion("NUM_USER_POINT >", value, "numUserPoint");
            return (Criteria) this;
        }

        public Criteria andNumUserPointGreaterThanOrEqualTo(Integer value) {
            addCriterion("NUM_USER_POINT >=", value, "numUserPoint");
            return (Criteria) this;
        }

        public Criteria andNumUserPointLessThan(Integer value) {
            addCriterion("NUM_USER_POINT <", value, "numUserPoint");
            return (Criteria) this;
        }

        public Criteria andNumUserPointLessThanOrEqualTo(Integer value) {
            addCriterion("NUM_USER_POINT <=", value, "numUserPoint");
            return (Criteria) this;
        }

        public Criteria andNumUserPointIn(List<Integer> values) {
            addCriterion("NUM_USER_POINT in", values, "numUserPoint");
            return (Criteria) this;
        }

        public Criteria andNumUserPointNotIn(List<Integer> values) {
            addCriterion("NUM_USER_POINT not in", values, "numUserPoint");
            return (Criteria) this;
        }

        public Criteria andNumUserPointBetween(Integer value1, Integer value2) {
            addCriterion("NUM_USER_POINT between", value1, value2, "numUserPoint");
            return (Criteria) this;
        }

        public Criteria andNumUserPointNotBetween(Integer value1, Integer value2) {
            addCriterion("NUM_USER_POINT not between", value1, value2, "numUserPoint");
            return (Criteria) this;
        }

        public Criteria andDatRegisterTimeIsNull() {
            addCriterion("DAT_REGISTER_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDatRegisterTimeIsNotNull() {
            addCriterion("DAT_REGISTER_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDatRegisterTimeEqualTo(Date value) {
            addCriterion("DAT_REGISTER_TIME =", value, "datRegisterTime");
            return (Criteria) this;
        }

        public Criteria andDatRegisterTimeNotEqualTo(Date value) {
            addCriterion("DAT_REGISTER_TIME <>", value, "datRegisterTime");
            return (Criteria) this;
        }

        public Criteria andDatRegisterTimeGreaterThan(Date value) {
            addCriterion("DAT_REGISTER_TIME >", value, "datRegisterTime");
            return (Criteria) this;
        }

        public Criteria andDatRegisterTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("DAT_REGISTER_TIME >=", value, "datRegisterTime");
            return (Criteria) this;
        }

        public Criteria andDatRegisterTimeLessThan(Date value) {
            addCriterion("DAT_REGISTER_TIME <", value, "datRegisterTime");
            return (Criteria) this;
        }

        public Criteria andDatRegisterTimeLessThanOrEqualTo(Date value) {
            addCriterion("DAT_REGISTER_TIME <=", value, "datRegisterTime");
            return (Criteria) this;
        }

        public Criteria andDatRegisterTimeIn(List<Date> values) {
            addCriterion("DAT_REGISTER_TIME in", values, "datRegisterTime");
            return (Criteria) this;
        }

        public Criteria andDatRegisterTimeNotIn(List<Date> values) {
            addCriterion("DAT_REGISTER_TIME not in", values, "datRegisterTime");
            return (Criteria) this;
        }

        public Criteria andDatRegisterTimeBetween(Date value1, Date value2) {
            addCriterion("DAT_REGISTER_TIME between", value1, value2, "datRegisterTime");
            return (Criteria) this;
        }

        public Criteria andDatRegisterTimeNotBetween(Date value1, Date value2) {
            addCriterion("DAT_REGISTER_TIME not between", value1, value2, "datRegisterTime");
            return (Criteria) this;
        }

        public Criteria andDatBirthdayIsNull() {
            addCriterion("DAT_BIRTHDAY is null");
            return (Criteria) this;
        }

        public Criteria andDatBirthdayIsNotNull() {
            addCriterion("DAT_BIRTHDAY is not null");
            return (Criteria) this;
        }

        public Criteria andDatBirthdayEqualTo(Date value) {
            addCriterion("DAT_BIRTHDAY =", value, "datBirthday");
            return (Criteria) this;
        }

        public Criteria andDatBirthdayNotEqualTo(Date value) {
            addCriterion("DAT_BIRTHDAY <>", value, "datBirthday");
            return (Criteria) this;
        }

        public Criteria andDatBirthdayGreaterThan(Date value) {
            addCriterion("DAT_BIRTHDAY >", value, "datBirthday");
            return (Criteria) this;
        }

        public Criteria andDatBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterion("DAT_BIRTHDAY >=", value, "datBirthday");
            return (Criteria) this;
        }

        public Criteria andDatBirthdayLessThan(Date value) {
            addCriterion("DAT_BIRTHDAY <", value, "datBirthday");
            return (Criteria) this;
        }

        public Criteria andDatBirthdayLessThanOrEqualTo(Date value) {
            addCriterion("DAT_BIRTHDAY <=", value, "datBirthday");
            return (Criteria) this;
        }

        public Criteria andDatBirthdayIn(List<Date> values) {
            addCriterion("DAT_BIRTHDAY in", values, "datBirthday");
            return (Criteria) this;
        }

        public Criteria andDatBirthdayNotIn(List<Date> values) {
            addCriterion("DAT_BIRTHDAY not in", values, "datBirthday");
            return (Criteria) this;
        }

        public Criteria andDatBirthdayBetween(Date value1, Date value2) {
            addCriterion("DAT_BIRTHDAY between", value1, value2, "datBirthday");
            return (Criteria) this;
        }

        public Criteria andDatBirthdayNotBetween(Date value1, Date value2) {
            addCriterion("DAT_BIRTHDAY not between", value1, value2, "datBirthday");
            return (Criteria) this;
        }

        public Criteria andNumUserLevelIsNull() {
            addCriterion("NUM_USER_LEVEL is null");
            return (Criteria) this;
        }

        public Criteria andNumUserLevelIsNotNull() {
            addCriterion("NUM_USER_LEVEL is not null");
            return (Criteria) this;
        }

        public Criteria andNumUserLevelEqualTo(Byte value) {
            addCriterion("NUM_USER_LEVEL =", value, "numUserLevel");
            return (Criteria) this;
        }

        public Criteria andNumUserLevelNotEqualTo(Byte value) {
            addCriterion("NUM_USER_LEVEL <>", value, "numUserLevel");
            return (Criteria) this;
        }

        public Criteria andNumUserLevelGreaterThan(Byte value) {
            addCriterion("NUM_USER_LEVEL >", value, "numUserLevel");
            return (Criteria) this;
        }

        public Criteria andNumUserLevelGreaterThanOrEqualTo(Byte value) {
            addCriterion("NUM_USER_LEVEL >=", value, "numUserLevel");
            return (Criteria) this;
        }

        public Criteria andNumUserLevelLessThan(Byte value) {
            addCriterion("NUM_USER_LEVEL <", value, "numUserLevel");
            return (Criteria) this;
        }

        public Criteria andNumUserLevelLessThanOrEqualTo(Byte value) {
            addCriterion("NUM_USER_LEVEL <=", value, "numUserLevel");
            return (Criteria) this;
        }

        public Criteria andNumUserLevelIn(List<Byte> values) {
            addCriterion("NUM_USER_LEVEL in", values, "numUserLevel");
            return (Criteria) this;
        }

        public Criteria andNumUserLevelNotIn(List<Byte> values) {
            addCriterion("NUM_USER_LEVEL not in", values, "numUserLevel");
            return (Criteria) this;
        }

        public Criteria andNumUserLevelBetween(Byte value1, Byte value2) {
            addCriterion("NUM_USER_LEVEL between", value1, value2, "numUserLevel");
            return (Criteria) this;
        }

        public Criteria andNumUserLevelNotBetween(Byte value1, Byte value2) {
            addCriterion("NUM_USER_LEVEL not between", value1, value2, "numUserLevel");
            return (Criteria) this;
        }

        public Criteria andNumUserMoneyIsNull() {
            addCriterion("NUM_USER_MONEY is null");
            return (Criteria) this;
        }

        public Criteria andNumUserMoneyIsNotNull() {
            addCriterion("NUM_USER_MONEY is not null");
            return (Criteria) this;
        }

        public Criteria andNumUserMoneyEqualTo(Long value) {
            addCriterion("NUM_USER_MONEY =", value, "numUserMoney");
            return (Criteria) this;
        }

        public Criteria andNumUserMoneyNotEqualTo(Long value) {
            addCriterion("NUM_USER_MONEY <>", value, "numUserMoney");
            return (Criteria) this;
        }

        public Criteria andNumUserMoneyGreaterThan(Long value) {
            addCriterion("NUM_USER_MONEY >", value, "numUserMoney");
            return (Criteria) this;
        }

        public Criteria andNumUserMoneyGreaterThanOrEqualTo(Long value) {
            addCriterion("NUM_USER_MONEY >=", value, "numUserMoney");
            return (Criteria) this;
        }

        public Criteria andNumUserMoneyLessThan(Long value) {
            addCriterion("NUM_USER_MONEY <", value, "numUserMoney");
            return (Criteria) this;
        }

        public Criteria andNumUserMoneyLessThanOrEqualTo(Long value) {
            addCriterion("NUM_USER_MONEY <=", value, "numUserMoney");
            return (Criteria) this;
        }

        public Criteria andNumUserMoneyIn(List<Long> values) {
            addCriterion("NUM_USER_MONEY in", values, "numUserMoney");
            return (Criteria) this;
        }

        public Criteria andNumUserMoneyNotIn(List<Long> values) {
            addCriterion("NUM_USER_MONEY not in", values, "numUserMoney");
            return (Criteria) this;
        }

        public Criteria andNumUserMoneyBetween(Long value1, Long value2) {
            addCriterion("NUM_USER_MONEY between", value1, value2, "numUserMoney");
            return (Criteria) this;
        }

        public Criteria andNumUserMoneyNotBetween(Long value1, Long value2) {
            addCriterion("NUM_USER_MONEY not between", value1, value2, "numUserMoney");
            return (Criteria) this;
        }

        public Criteria andDatModifiedTimeIsNull() {
            addCriterion("DAT_MODIFIED_TIME is null");
            return (Criteria) this;
        }

        public Criteria andDatModifiedTimeIsNotNull() {
            addCriterion("DAT_MODIFIED_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andDatModifiedTimeEqualTo(Date value) {
            addCriterion("DAT_MODIFIED_TIME =", value, "datModifiedTime");
            return (Criteria) this;
        }

        public Criteria andDatModifiedTimeNotEqualTo(Date value) {
            addCriterion("DAT_MODIFIED_TIME <>", value, "datModifiedTime");
            return (Criteria) this;
        }

        public Criteria andDatModifiedTimeGreaterThan(Date value) {
            addCriterion("DAT_MODIFIED_TIME >", value, "datModifiedTime");
            return (Criteria) this;
        }

        public Criteria andDatModifiedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("DAT_MODIFIED_TIME >=", value, "datModifiedTime");
            return (Criteria) this;
        }

        public Criteria andDatModifiedTimeLessThan(Date value) {
            addCriterion("DAT_MODIFIED_TIME <", value, "datModifiedTime");
            return (Criteria) this;
        }

        public Criteria andDatModifiedTimeLessThanOrEqualTo(Date value) {
            addCriterion("DAT_MODIFIED_TIME <=", value, "datModifiedTime");
            return (Criteria) this;
        }

        public Criteria andDatModifiedTimeIn(List<Date> values) {
            addCriterion("DAT_MODIFIED_TIME in", values, "datModifiedTime");
            return (Criteria) this;
        }

        public Criteria andDatModifiedTimeNotIn(List<Date> values) {
            addCriterion("DAT_MODIFIED_TIME not in", values, "datModifiedTime");
            return (Criteria) this;
        }

        public Criteria andDatModifiedTimeBetween(Date value1, Date value2) {
            addCriterion("DAT_MODIFIED_TIME between", value1, value2, "datModifiedTime");
            return (Criteria) this;
        }

        public Criteria andDatModifiedTimeNotBetween(Date value1, Date value2) {
            addCriterion("DAT_MODIFIED_TIME not between", value1, value2, "datModifiedTime");
            return (Criteria) this;
        }

        public Criteria andNumUserStateIsNull() {
            addCriterion("NUM_USER_STATE is null");
            return (Criteria) this;
        }

        public Criteria andNumUserStateIsNotNull() {
            addCriterion("NUM_USER_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andNumUserStateEqualTo(Byte value) {
            addCriterion("NUM_USER_STATE =", value, "numUserState");
            return (Criteria) this;
        }

        public Criteria andNumUserStateNotEqualTo(Byte value) {
            addCriterion("NUM_USER_STATE <>", value, "numUserState");
            return (Criteria) this;
        }

        public Criteria andNumUserStateGreaterThan(Byte value) {
            addCriterion("NUM_USER_STATE >", value, "numUserState");
            return (Criteria) this;
        }

        public Criteria andNumUserStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("NUM_USER_STATE >=", value, "numUserState");
            return (Criteria) this;
        }

        public Criteria andNumUserStateLessThan(Byte value) {
            addCriterion("NUM_USER_STATE <", value, "numUserState");
            return (Criteria) this;
        }

        public Criteria andNumUserStateLessThanOrEqualTo(Byte value) {
            addCriterion("NUM_USER_STATE <=", value, "numUserState");
            return (Criteria) this;
        }

        public Criteria andNumUserStateIn(List<Byte> values) {
            addCriterion("NUM_USER_STATE in", values, "numUserState");
            return (Criteria) this;
        }

        public Criteria andNumUserStateNotIn(List<Byte> values) {
            addCriterion("NUM_USER_STATE not in", values, "numUserState");
            return (Criteria) this;
        }

        public Criteria andNumUserStateBetween(Byte value1, Byte value2) {
            addCriterion("NUM_USER_STATE between", value1, value2, "numUserState");
            return (Criteria) this;
        }

        public Criteria andNumUserStateNotBetween(Byte value1, Byte value2) {
            addCriterion("NUM_USER_STATE not between", value1, value2, "numUserState");
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