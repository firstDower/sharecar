package com.dower.sharerideapp.core.serverdb.model;

import java.util.ArrayList;
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

        public Criteria andVcBackCardNumberIsNull() {
            addCriterion("VC_BACK_CARD_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andVcBackCardNumberIsNotNull() {
            addCriterion("VC_BACK_CARD_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andVcBackCardNumberEqualTo(String value) {
            addCriterion("VC_BACK_CARD_NUMBER =", value, "vcBackCardNumber");
            return (Criteria) this;
        }

        public Criteria andVcBackCardNumberNotEqualTo(String value) {
            addCriterion("VC_BACK_CARD_NUMBER <>", value, "vcBackCardNumber");
            return (Criteria) this;
        }

        public Criteria andVcBackCardNumberGreaterThan(String value) {
            addCriterion("VC_BACK_CARD_NUMBER >", value, "vcBackCardNumber");
            return (Criteria) this;
        }

        public Criteria andVcBackCardNumberGreaterThanOrEqualTo(String value) {
            addCriterion("VC_BACK_CARD_NUMBER >=", value, "vcBackCardNumber");
            return (Criteria) this;
        }

        public Criteria andVcBackCardNumberLessThan(String value) {
            addCriterion("VC_BACK_CARD_NUMBER <", value, "vcBackCardNumber");
            return (Criteria) this;
        }

        public Criteria andVcBackCardNumberLessThanOrEqualTo(String value) {
            addCriterion("VC_BACK_CARD_NUMBER <=", value, "vcBackCardNumber");
            return (Criteria) this;
        }

        public Criteria andVcBackCardNumberLike(String value) {
            addCriterion("VC_BACK_CARD_NUMBER like", value, "vcBackCardNumber");
            return (Criteria) this;
        }

        public Criteria andVcBackCardNumberNotLike(String value) {
            addCriterion("VC_BACK_CARD_NUMBER not like", value, "vcBackCardNumber");
            return (Criteria) this;
        }

        public Criteria andVcBackCardNumberIn(List<String> values) {
            addCriterion("VC_BACK_CARD_NUMBER in", values, "vcBackCardNumber");
            return (Criteria) this;
        }

        public Criteria andVcBackCardNumberNotIn(List<String> values) {
            addCriterion("VC_BACK_CARD_NUMBER not in", values, "vcBackCardNumber");
            return (Criteria) this;
        }

        public Criteria andVcBackCardNumberBetween(String value1, String value2) {
            addCriterion("VC_BACK_CARD_NUMBER between", value1, value2, "vcBackCardNumber");
            return (Criteria) this;
        }

        public Criteria andVcBackCardNumberNotBetween(String value1, String value2) {
            addCriterion("VC_BACK_CARD_NUMBER not between", value1, value2, "vcBackCardNumber");
            return (Criteria) this;
        }

        public Criteria andVcIdcardNumberIsNull() {
            addCriterion("VC_IDCARD_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andVcIdcardNumberIsNotNull() {
            addCriterion("VC_IDCARD_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andVcIdcardNumberEqualTo(String value) {
            addCriterion("VC_IDCARD_NUMBER =", value, "vcIdcardNumber");
            return (Criteria) this;
        }

        public Criteria andVcIdcardNumberNotEqualTo(String value) {
            addCriterion("VC_IDCARD_NUMBER <>", value, "vcIdcardNumber");
            return (Criteria) this;
        }

        public Criteria andVcIdcardNumberGreaterThan(String value) {
            addCriterion("VC_IDCARD_NUMBER >", value, "vcIdcardNumber");
            return (Criteria) this;
        }

        public Criteria andVcIdcardNumberGreaterThanOrEqualTo(String value) {
            addCriterion("VC_IDCARD_NUMBER >=", value, "vcIdcardNumber");
            return (Criteria) this;
        }

        public Criteria andVcIdcardNumberLessThan(String value) {
            addCriterion("VC_IDCARD_NUMBER <", value, "vcIdcardNumber");
            return (Criteria) this;
        }

        public Criteria andVcIdcardNumberLessThanOrEqualTo(String value) {
            addCriterion("VC_IDCARD_NUMBER <=", value, "vcIdcardNumber");
            return (Criteria) this;
        }

        public Criteria andVcIdcardNumberLike(String value) {
            addCriterion("VC_IDCARD_NUMBER like", value, "vcIdcardNumber");
            return (Criteria) this;
        }

        public Criteria andVcIdcardNumberNotLike(String value) {
            addCriterion("VC_IDCARD_NUMBER not like", value, "vcIdcardNumber");
            return (Criteria) this;
        }

        public Criteria andVcIdcardNumberIn(List<String> values) {
            addCriterion("VC_IDCARD_NUMBER in", values, "vcIdcardNumber");
            return (Criteria) this;
        }

        public Criteria andVcIdcardNumberNotIn(List<String> values) {
            addCriterion("VC_IDCARD_NUMBER not in", values, "vcIdcardNumber");
            return (Criteria) this;
        }

        public Criteria andVcIdcardNumberBetween(String value1, String value2) {
            addCriterion("VC_IDCARD_NUMBER between", value1, value2, "vcIdcardNumber");
            return (Criteria) this;
        }

        public Criteria andVcIdcardNumberNotBetween(String value1, String value2) {
            addCriterion("VC_IDCARD_NUMBER not between", value1, value2, "vcIdcardNumber");
            return (Criteria) this;
        }

        public Criteria andVcDriverLicenseNoIsNull() {
            addCriterion("VC_DRIVER_LICENSE_NO is null");
            return (Criteria) this;
        }

        public Criteria andVcDriverLicenseNoIsNotNull() {
            addCriterion("VC_DRIVER_LICENSE_NO is not null");
            return (Criteria) this;
        }

        public Criteria andVcDriverLicenseNoEqualTo(String value) {
            addCriterion("VC_DRIVER_LICENSE_NO =", value, "vcDriverLicenseNo");
            return (Criteria) this;
        }

        public Criteria andVcDriverLicenseNoNotEqualTo(String value) {
            addCriterion("VC_DRIVER_LICENSE_NO <>", value, "vcDriverLicenseNo");
            return (Criteria) this;
        }

        public Criteria andVcDriverLicenseNoGreaterThan(String value) {
            addCriterion("VC_DRIVER_LICENSE_NO >", value, "vcDriverLicenseNo");
            return (Criteria) this;
        }

        public Criteria andVcDriverLicenseNoGreaterThanOrEqualTo(String value) {
            addCriterion("VC_DRIVER_LICENSE_NO >=", value, "vcDriverLicenseNo");
            return (Criteria) this;
        }

        public Criteria andVcDriverLicenseNoLessThan(String value) {
            addCriterion("VC_DRIVER_LICENSE_NO <", value, "vcDriverLicenseNo");
            return (Criteria) this;
        }

        public Criteria andVcDriverLicenseNoLessThanOrEqualTo(String value) {
            addCriterion("VC_DRIVER_LICENSE_NO <=", value, "vcDriverLicenseNo");
            return (Criteria) this;
        }

        public Criteria andVcDriverLicenseNoLike(String value) {
            addCriterion("VC_DRIVER_LICENSE_NO like", value, "vcDriverLicenseNo");
            return (Criteria) this;
        }

        public Criteria andVcDriverLicenseNoNotLike(String value) {
            addCriterion("VC_DRIVER_LICENSE_NO not like", value, "vcDriverLicenseNo");
            return (Criteria) this;
        }

        public Criteria andVcDriverLicenseNoIn(List<String> values) {
            addCriterion("VC_DRIVER_LICENSE_NO in", values, "vcDriverLicenseNo");
            return (Criteria) this;
        }

        public Criteria andVcDriverLicenseNoNotIn(List<String> values) {
            addCriterion("VC_DRIVER_LICENSE_NO not in", values, "vcDriverLicenseNo");
            return (Criteria) this;
        }

        public Criteria andVcDriverLicenseNoBetween(String value1, String value2) {
            addCriterion("VC_DRIVER_LICENSE_NO between", value1, value2, "vcDriverLicenseNo");
            return (Criteria) this;
        }

        public Criteria andVcDriverLicenseNoNotBetween(String value1, String value2) {
            addCriterion("VC_DRIVER_LICENSE_NO not between", value1, value2, "vcDriverLicenseNo");
            return (Criteria) this;
        }

        public Criteria andVcIdcardPicturePathAIsNull() {
            addCriterion("VC_IDCARD_PICTURE_PATH_A is null");
            return (Criteria) this;
        }

        public Criteria andVcIdcardPicturePathAIsNotNull() {
            addCriterion("VC_IDCARD_PICTURE_PATH_A is not null");
            return (Criteria) this;
        }

        public Criteria andVcIdcardPicturePathAEqualTo(String value) {
            addCriterion("VC_IDCARD_PICTURE_PATH_A =", value, "vcIdcardPicturePathA");
            return (Criteria) this;
        }

        public Criteria andVcIdcardPicturePathANotEqualTo(String value) {
            addCriterion("VC_IDCARD_PICTURE_PATH_A <>", value, "vcIdcardPicturePathA");
            return (Criteria) this;
        }

        public Criteria andVcIdcardPicturePathAGreaterThan(String value) {
            addCriterion("VC_IDCARD_PICTURE_PATH_A >", value, "vcIdcardPicturePathA");
            return (Criteria) this;
        }

        public Criteria andVcIdcardPicturePathAGreaterThanOrEqualTo(String value) {
            addCriterion("VC_IDCARD_PICTURE_PATH_A >=", value, "vcIdcardPicturePathA");
            return (Criteria) this;
        }

        public Criteria andVcIdcardPicturePathALessThan(String value) {
            addCriterion("VC_IDCARD_PICTURE_PATH_A <", value, "vcIdcardPicturePathA");
            return (Criteria) this;
        }

        public Criteria andVcIdcardPicturePathALessThanOrEqualTo(String value) {
            addCriterion("VC_IDCARD_PICTURE_PATH_A <=", value, "vcIdcardPicturePathA");
            return (Criteria) this;
        }

        public Criteria andVcIdcardPicturePathALike(String value) {
            addCriterion("VC_IDCARD_PICTURE_PATH_A like", value, "vcIdcardPicturePathA");
            return (Criteria) this;
        }

        public Criteria andVcIdcardPicturePathANotLike(String value) {
            addCriterion("VC_IDCARD_PICTURE_PATH_A not like", value, "vcIdcardPicturePathA");
            return (Criteria) this;
        }

        public Criteria andVcIdcardPicturePathAIn(List<String> values) {
            addCriterion("VC_IDCARD_PICTURE_PATH_A in", values, "vcIdcardPicturePathA");
            return (Criteria) this;
        }

        public Criteria andVcIdcardPicturePathANotIn(List<String> values) {
            addCriterion("VC_IDCARD_PICTURE_PATH_A not in", values, "vcIdcardPicturePathA");
            return (Criteria) this;
        }

        public Criteria andVcIdcardPicturePathABetween(String value1, String value2) {
            addCriterion("VC_IDCARD_PICTURE_PATH_A between", value1, value2, "vcIdcardPicturePathA");
            return (Criteria) this;
        }

        public Criteria andVcIdcardPicturePathANotBetween(String value1, String value2) {
            addCriterion("VC_IDCARD_PICTURE_PATH_A not between", value1, value2, "vcIdcardPicturePathA");
            return (Criteria) this;
        }

        public Criteria andVcIdcardPicturePathBIsNull() {
            addCriterion("VC_IDCARD_PICTURE_PATH_B is null");
            return (Criteria) this;
        }

        public Criteria andVcIdcardPicturePathBIsNotNull() {
            addCriterion("VC_IDCARD_PICTURE_PATH_B is not null");
            return (Criteria) this;
        }

        public Criteria andVcIdcardPicturePathBEqualTo(String value) {
            addCriterion("VC_IDCARD_PICTURE_PATH_B =", value, "vcIdcardPicturePathB");
            return (Criteria) this;
        }

        public Criteria andVcIdcardPicturePathBNotEqualTo(String value) {
            addCriterion("VC_IDCARD_PICTURE_PATH_B <>", value, "vcIdcardPicturePathB");
            return (Criteria) this;
        }

        public Criteria andVcIdcardPicturePathBGreaterThan(String value) {
            addCriterion("VC_IDCARD_PICTURE_PATH_B >", value, "vcIdcardPicturePathB");
            return (Criteria) this;
        }

        public Criteria andVcIdcardPicturePathBGreaterThanOrEqualTo(String value) {
            addCriterion("VC_IDCARD_PICTURE_PATH_B >=", value, "vcIdcardPicturePathB");
            return (Criteria) this;
        }

        public Criteria andVcIdcardPicturePathBLessThan(String value) {
            addCriterion("VC_IDCARD_PICTURE_PATH_B <", value, "vcIdcardPicturePathB");
            return (Criteria) this;
        }

        public Criteria andVcIdcardPicturePathBLessThanOrEqualTo(String value) {
            addCriterion("VC_IDCARD_PICTURE_PATH_B <=", value, "vcIdcardPicturePathB");
            return (Criteria) this;
        }

        public Criteria andVcIdcardPicturePathBLike(String value) {
            addCriterion("VC_IDCARD_PICTURE_PATH_B like", value, "vcIdcardPicturePathB");
            return (Criteria) this;
        }

        public Criteria andVcIdcardPicturePathBNotLike(String value) {
            addCriterion("VC_IDCARD_PICTURE_PATH_B not like", value, "vcIdcardPicturePathB");
            return (Criteria) this;
        }

        public Criteria andVcIdcardPicturePathBIn(List<String> values) {
            addCriterion("VC_IDCARD_PICTURE_PATH_B in", values, "vcIdcardPicturePathB");
            return (Criteria) this;
        }

        public Criteria andVcIdcardPicturePathBNotIn(List<String> values) {
            addCriterion("VC_IDCARD_PICTURE_PATH_B not in", values, "vcIdcardPicturePathB");
            return (Criteria) this;
        }

        public Criteria andVcIdcardPicturePathBBetween(String value1, String value2) {
            addCriterion("VC_IDCARD_PICTURE_PATH_B between", value1, value2, "vcIdcardPicturePathB");
            return (Criteria) this;
        }

        public Criteria andVcIdcardPicturePathBNotBetween(String value1, String value2) {
            addCriterion("VC_IDCARD_PICTURE_PATH_B not between", value1, value2, "vcIdcardPicturePathB");
            return (Criteria) this;
        }

        public Criteria andVcDriverLicensePathAIsNull() {
            addCriterion("VC_DRIVER_LICENSE_PATH_A is null");
            return (Criteria) this;
        }

        public Criteria andVcDriverLicensePathAIsNotNull() {
            addCriterion("VC_DRIVER_LICENSE_PATH_A is not null");
            return (Criteria) this;
        }

        public Criteria andVcDriverLicensePathAEqualTo(String value) {
            addCriterion("VC_DRIVER_LICENSE_PATH_A =", value, "vcDriverLicensePathA");
            return (Criteria) this;
        }

        public Criteria andVcDriverLicensePathANotEqualTo(String value) {
            addCriterion("VC_DRIVER_LICENSE_PATH_A <>", value, "vcDriverLicensePathA");
            return (Criteria) this;
        }

        public Criteria andVcDriverLicensePathAGreaterThan(String value) {
            addCriterion("VC_DRIVER_LICENSE_PATH_A >", value, "vcDriverLicensePathA");
            return (Criteria) this;
        }

        public Criteria andVcDriverLicensePathAGreaterThanOrEqualTo(String value) {
            addCriterion("VC_DRIVER_LICENSE_PATH_A >=", value, "vcDriverLicensePathA");
            return (Criteria) this;
        }

        public Criteria andVcDriverLicensePathALessThan(String value) {
            addCriterion("VC_DRIVER_LICENSE_PATH_A <", value, "vcDriverLicensePathA");
            return (Criteria) this;
        }

        public Criteria andVcDriverLicensePathALessThanOrEqualTo(String value) {
            addCriterion("VC_DRIVER_LICENSE_PATH_A <=", value, "vcDriverLicensePathA");
            return (Criteria) this;
        }

        public Criteria andVcDriverLicensePathALike(String value) {
            addCriterion("VC_DRIVER_LICENSE_PATH_A like", value, "vcDriverLicensePathA");
            return (Criteria) this;
        }

        public Criteria andVcDriverLicensePathANotLike(String value) {
            addCriterion("VC_DRIVER_LICENSE_PATH_A not like", value, "vcDriverLicensePathA");
            return (Criteria) this;
        }

        public Criteria andVcDriverLicensePathAIn(List<String> values) {
            addCriterion("VC_DRIVER_LICENSE_PATH_A in", values, "vcDriverLicensePathA");
            return (Criteria) this;
        }

        public Criteria andVcDriverLicensePathANotIn(List<String> values) {
            addCriterion("VC_DRIVER_LICENSE_PATH_A not in", values, "vcDriverLicensePathA");
            return (Criteria) this;
        }

        public Criteria andVcDriverLicensePathABetween(String value1, String value2) {
            addCriterion("VC_DRIVER_LICENSE_PATH_A between", value1, value2, "vcDriverLicensePathA");
            return (Criteria) this;
        }

        public Criteria andVcDriverLicensePathANotBetween(String value1, String value2) {
            addCriterion("VC_DRIVER_LICENSE_PATH_A not between", value1, value2, "vcDriverLicensePathA");
            return (Criteria) this;
        }

        public Criteria andVcDriverLicensePathBIsNull() {
            addCriterion("VC_DRIVER_LICENSE_PATH_B is null");
            return (Criteria) this;
        }

        public Criteria andVcDriverLicensePathBIsNotNull() {
            addCriterion("VC_DRIVER_LICENSE_PATH_B is not null");
            return (Criteria) this;
        }

        public Criteria andVcDriverLicensePathBEqualTo(String value) {
            addCriterion("VC_DRIVER_LICENSE_PATH_B =", value, "vcDriverLicensePathB");
            return (Criteria) this;
        }

        public Criteria andVcDriverLicensePathBNotEqualTo(String value) {
            addCriterion("VC_DRIVER_LICENSE_PATH_B <>", value, "vcDriverLicensePathB");
            return (Criteria) this;
        }

        public Criteria andVcDriverLicensePathBGreaterThan(String value) {
            addCriterion("VC_DRIVER_LICENSE_PATH_B >", value, "vcDriverLicensePathB");
            return (Criteria) this;
        }

        public Criteria andVcDriverLicensePathBGreaterThanOrEqualTo(String value) {
            addCriterion("VC_DRIVER_LICENSE_PATH_B >=", value, "vcDriverLicensePathB");
            return (Criteria) this;
        }

        public Criteria andVcDriverLicensePathBLessThan(String value) {
            addCriterion("VC_DRIVER_LICENSE_PATH_B <", value, "vcDriverLicensePathB");
            return (Criteria) this;
        }

        public Criteria andVcDriverLicensePathBLessThanOrEqualTo(String value) {
            addCriterion("VC_DRIVER_LICENSE_PATH_B <=", value, "vcDriverLicensePathB");
            return (Criteria) this;
        }

        public Criteria andVcDriverLicensePathBLike(String value) {
            addCriterion("VC_DRIVER_LICENSE_PATH_B like", value, "vcDriverLicensePathB");
            return (Criteria) this;
        }

        public Criteria andVcDriverLicensePathBNotLike(String value) {
            addCriterion("VC_DRIVER_LICENSE_PATH_B not like", value, "vcDriverLicensePathB");
            return (Criteria) this;
        }

        public Criteria andVcDriverLicensePathBIn(List<String> values) {
            addCriterion("VC_DRIVER_LICENSE_PATH_B in", values, "vcDriverLicensePathB");
            return (Criteria) this;
        }

        public Criteria andVcDriverLicensePathBNotIn(List<String> values) {
            addCriterion("VC_DRIVER_LICENSE_PATH_B not in", values, "vcDriverLicensePathB");
            return (Criteria) this;
        }

        public Criteria andVcDriverLicensePathBBetween(String value1, String value2) {
            addCriterion("VC_DRIVER_LICENSE_PATH_B between", value1, value2, "vcDriverLicensePathB");
            return (Criteria) this;
        }

        public Criteria andVcDriverLicensePathBNotBetween(String value1, String value2) {
            addCriterion("VC_DRIVER_LICENSE_PATH_B not between", value1, value2, "vcDriverLicensePathB");
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