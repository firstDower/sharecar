package com.dower.sharerideapp.core.serverdb.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductInfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProductInfoExample() {
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

        public Criteria andProductIdIsNull() {
            addCriterion("product_id is null");
            return (Criteria) this;
        }

        public Criteria andProductIdIsNotNull() {
            addCriterion("product_id is not null");
            return (Criteria) this;
        }

        public Criteria andProductIdEqualTo(Integer value) {
            addCriterion("product_id =", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotEqualTo(Integer value) {
            addCriterion("product_id <>", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThan(Integer value) {
            addCriterion("product_id >", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_id >=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThan(Integer value) {
            addCriterion("product_id <", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdLessThanOrEqualTo(Integer value) {
            addCriterion("product_id <=", value, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdIn(List<Integer> values) {
            addCriterion("product_id in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotIn(List<Integer> values) {
            addCriterion("product_id not in", values, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdBetween(Integer value1, Integer value2) {
            addCriterion("product_id between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductIdNotBetween(Integer value1, Integer value2) {
            addCriterion("product_id not between", value1, value2, "productId");
            return (Criteria) this;
        }

        public Criteria andProductCoreIsNull() {
            addCriterion("product_core is null");
            return (Criteria) this;
        }

        public Criteria andProductCoreIsNotNull() {
            addCriterion("product_core is not null");
            return (Criteria) this;
        }

        public Criteria andProductCoreEqualTo(String value) {
            addCriterion("product_core =", value, "productCore");
            return (Criteria) this;
        }

        public Criteria andProductCoreNotEqualTo(String value) {
            addCriterion("product_core <>", value, "productCore");
            return (Criteria) this;
        }

        public Criteria andProductCoreGreaterThan(String value) {
            addCriterion("product_core >", value, "productCore");
            return (Criteria) this;
        }

        public Criteria andProductCoreGreaterThanOrEqualTo(String value) {
            addCriterion("product_core >=", value, "productCore");
            return (Criteria) this;
        }

        public Criteria andProductCoreLessThan(String value) {
            addCriterion("product_core <", value, "productCore");
            return (Criteria) this;
        }

        public Criteria andProductCoreLessThanOrEqualTo(String value) {
            addCriterion("product_core <=", value, "productCore");
            return (Criteria) this;
        }

        public Criteria andProductCoreLike(String value) {
            addCriterion("product_core like", value, "productCore");
            return (Criteria) this;
        }

        public Criteria andProductCoreNotLike(String value) {
            addCriterion("product_core not like", value, "productCore");
            return (Criteria) this;
        }

        public Criteria andProductCoreIn(List<String> values) {
            addCriterion("product_core in", values, "productCore");
            return (Criteria) this;
        }

        public Criteria andProductCoreNotIn(List<String> values) {
            addCriterion("product_core not in", values, "productCore");
            return (Criteria) this;
        }

        public Criteria andProductCoreBetween(String value1, String value2) {
            addCriterion("product_core between", value1, value2, "productCore");
            return (Criteria) this;
        }

        public Criteria andProductCoreNotBetween(String value1, String value2) {
            addCriterion("product_core not between", value1, value2, "productCore");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNull() {
            addCriterion("product_name is null");
            return (Criteria) this;
        }

        public Criteria andProductNameIsNotNull() {
            addCriterion("product_name is not null");
            return (Criteria) this;
        }

        public Criteria andProductNameEqualTo(String value) {
            addCriterion("product_name =", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotEqualTo(String value) {
            addCriterion("product_name <>", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThan(String value) {
            addCriterion("product_name >", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameGreaterThanOrEqualTo(String value) {
            addCriterion("product_name >=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThan(String value) {
            addCriterion("product_name <", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLessThanOrEqualTo(String value) {
            addCriterion("product_name <=", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameLike(String value) {
            addCriterion("product_name like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotLike(String value) {
            addCriterion("product_name not like", value, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameIn(List<String> values) {
            addCriterion("product_name in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotIn(List<String> values) {
            addCriterion("product_name not in", values, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameBetween(String value1, String value2) {
            addCriterion("product_name between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andProductNameNotBetween(String value1, String value2) {
            addCriterion("product_name not between", value1, value2, "productName");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNull() {
            addCriterion("category_id is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNotNull() {
            addCriterion("category_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdEqualTo(Short value) {
            addCriterion("category_id =", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotEqualTo(Short value) {
            addCriterion("category_id <>", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThan(Short value) {
            addCriterion("category_id >", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThanOrEqualTo(Short value) {
            addCriterion("category_id >=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThan(Short value) {
            addCriterion("category_id <", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThanOrEqualTo(Short value) {
            addCriterion("category_id <=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIn(List<Short> values) {
            addCriterion("category_id in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotIn(List<Short> values) {
            addCriterion("category_id not in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdBetween(Short value1, Short value2) {
            addCriterion("category_id between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotBetween(Short value1, Short value2) {
            addCriterion("category_id not between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andNumSchoolIdIsNull() {
            addCriterion("num_school_id is null");
            return (Criteria) this;
        }

        public Criteria andNumSchoolIdIsNotNull() {
            addCriterion("num_school_id is not null");
            return (Criteria) this;
        }

        public Criteria andNumSchoolIdEqualTo(Integer value) {
            addCriterion("num_school_id =", value, "numSchoolId");
            return (Criteria) this;
        }

        public Criteria andNumSchoolIdNotEqualTo(Integer value) {
            addCriterion("num_school_id <>", value, "numSchoolId");
            return (Criteria) this;
        }

        public Criteria andNumSchoolIdGreaterThan(Integer value) {
            addCriterion("num_school_id >", value, "numSchoolId");
            return (Criteria) this;
        }

        public Criteria andNumSchoolIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("num_school_id >=", value, "numSchoolId");
            return (Criteria) this;
        }

        public Criteria andNumSchoolIdLessThan(Integer value) {
            addCriterion("num_school_id <", value, "numSchoolId");
            return (Criteria) this;
        }

        public Criteria andNumSchoolIdLessThanOrEqualTo(Integer value) {
            addCriterion("num_school_id <=", value, "numSchoolId");
            return (Criteria) this;
        }

        public Criteria andNumSchoolIdIn(List<Integer> values) {
            addCriterion("num_school_id in", values, "numSchoolId");
            return (Criteria) this;
        }

        public Criteria andNumSchoolIdNotIn(List<Integer> values) {
            addCriterion("num_school_id not in", values, "numSchoolId");
            return (Criteria) this;
        }

        public Criteria andNumSchoolIdBetween(Integer value1, Integer value2) {
            addCriterion("num_school_id between", value1, value2, "numSchoolId");
            return (Criteria) this;
        }

        public Criteria andNumSchoolIdNotBetween(Integer value1, Integer value2) {
            addCriterion("num_school_id not between", value1, value2, "numSchoolId");
            return (Criteria) this;
        }

        public Criteria andNumModelIdIsNull() {
            addCriterion("num_model_id is null");
            return (Criteria) this;
        }

        public Criteria andNumModelIdIsNotNull() {
            addCriterion("num_model_id is not null");
            return (Criteria) this;
        }

        public Criteria andNumModelIdEqualTo(Long value) {
            addCriterion("num_model_id =", value, "numModelId");
            return (Criteria) this;
        }

        public Criteria andNumModelIdNotEqualTo(Long value) {
            addCriterion("num_model_id <>", value, "numModelId");
            return (Criteria) this;
        }

        public Criteria andNumModelIdGreaterThan(Long value) {
            addCriterion("num_model_id >", value, "numModelId");
            return (Criteria) this;
        }

        public Criteria andNumModelIdGreaterThanOrEqualTo(Long value) {
            addCriterion("num_model_id >=", value, "numModelId");
            return (Criteria) this;
        }

        public Criteria andNumModelIdLessThan(Long value) {
            addCriterion("num_model_id <", value, "numModelId");
            return (Criteria) this;
        }

        public Criteria andNumModelIdLessThanOrEqualTo(Long value) {
            addCriterion("num_model_id <=", value, "numModelId");
            return (Criteria) this;
        }

        public Criteria andNumModelIdIn(List<Long> values) {
            addCriterion("num_model_id in", values, "numModelId");
            return (Criteria) this;
        }

        public Criteria andNumModelIdNotIn(List<Long> values) {
            addCriterion("num_model_id not in", values, "numModelId");
            return (Criteria) this;
        }

        public Criteria andNumModelIdBetween(Long value1, Long value2) {
            addCriterion("num_model_id between", value1, value2, "numModelId");
            return (Criteria) this;
        }

        public Criteria andNumModelIdNotBetween(Long value1, Long value2) {
            addCriterion("num_model_id not between", value1, value2, "numModelId");
            return (Criteria) this;
        }

        public Criteria andNumClouthTypeIdIsNull() {
            addCriterion("num_clouth_type_id is null");
            return (Criteria) this;
        }

        public Criteria andNumClouthTypeIdIsNotNull() {
            addCriterion("num_clouth_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andNumClouthTypeIdEqualTo(Long value) {
            addCriterion("num_clouth_type_id =", value, "numClouthTypeId");
            return (Criteria) this;
        }

        public Criteria andNumClouthTypeIdNotEqualTo(Long value) {
            addCriterion("num_clouth_type_id <>", value, "numClouthTypeId");
            return (Criteria) this;
        }

        public Criteria andNumClouthTypeIdGreaterThan(Long value) {
            addCriterion("num_clouth_type_id >", value, "numClouthTypeId");
            return (Criteria) this;
        }

        public Criteria andNumClouthTypeIdGreaterThanOrEqualTo(Long value) {
            addCriterion("num_clouth_type_id >=", value, "numClouthTypeId");
            return (Criteria) this;
        }

        public Criteria andNumClouthTypeIdLessThan(Long value) {
            addCriterion("num_clouth_type_id <", value, "numClouthTypeId");
            return (Criteria) this;
        }

        public Criteria andNumClouthTypeIdLessThanOrEqualTo(Long value) {
            addCriterion("num_clouth_type_id <=", value, "numClouthTypeId");
            return (Criteria) this;
        }

        public Criteria andNumClouthTypeIdIn(List<Long> values) {
            addCriterion("num_clouth_type_id in", values, "numClouthTypeId");
            return (Criteria) this;
        }

        public Criteria andNumClouthTypeIdNotIn(List<Long> values) {
            addCriterion("num_clouth_type_id not in", values, "numClouthTypeId");
            return (Criteria) this;
        }

        public Criteria andNumClouthTypeIdBetween(Long value1, Long value2) {
            addCriterion("num_clouth_type_id between", value1, value2, "numClouthTypeId");
            return (Criteria) this;
        }

        public Criteria andNumClouthTypeIdNotBetween(Long value1, Long value2) {
            addCriterion("num_clouth_type_id not between", value1, value2, "numClouthTypeId");
            return (Criteria) this;
        }

        public Criteria andPublishStatusIsNull() {
            addCriterion("publish_status is null");
            return (Criteria) this;
        }

        public Criteria andPublishStatusIsNotNull() {
            addCriterion("publish_status is not null");
            return (Criteria) this;
        }

        public Criteria andPublishStatusEqualTo(Byte value) {
            addCriterion("publish_status =", value, "publishStatus");
            return (Criteria) this;
        }

        public Criteria andPublishStatusNotEqualTo(Byte value) {
            addCriterion("publish_status <>", value, "publishStatus");
            return (Criteria) this;
        }

        public Criteria andPublishStatusGreaterThan(Byte value) {
            addCriterion("publish_status >", value, "publishStatus");
            return (Criteria) this;
        }

        public Criteria andPublishStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("publish_status >=", value, "publishStatus");
            return (Criteria) this;
        }

        public Criteria andPublishStatusLessThan(Byte value) {
            addCriterion("publish_status <", value, "publishStatus");
            return (Criteria) this;
        }

        public Criteria andPublishStatusLessThanOrEqualTo(Byte value) {
            addCriterion("publish_status <=", value, "publishStatus");
            return (Criteria) this;
        }

        public Criteria andPublishStatusIn(List<Byte> values) {
            addCriterion("publish_status in", values, "publishStatus");
            return (Criteria) this;
        }

        public Criteria andPublishStatusNotIn(List<Byte> values) {
            addCriterion("publish_status not in", values, "publishStatus");
            return (Criteria) this;
        }

        public Criteria andPublishStatusBetween(Byte value1, Byte value2) {
            addCriterion("publish_status between", value1, value2, "publishStatus");
            return (Criteria) this;
        }

        public Criteria andPublishStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("publish_status not between", value1, value2, "publishStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIsNull() {
            addCriterion("audit_status is null");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIsNotNull() {
            addCriterion("audit_status is not null");
            return (Criteria) this;
        }

        public Criteria andAuditStatusEqualTo(Byte value) {
            addCriterion("audit_status =", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotEqualTo(Byte value) {
            addCriterion("audit_status <>", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusGreaterThan(Byte value) {
            addCriterion("audit_status >", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("audit_status >=", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLessThan(Byte value) {
            addCriterion("audit_status <", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusLessThanOrEqualTo(Byte value) {
            addCriterion("audit_status <=", value, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusIn(List<Byte> values) {
            addCriterion("audit_status in", values, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotIn(List<Byte> values) {
            addCriterion("audit_status not in", values, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusBetween(Byte value1, Byte value2) {
            addCriterion("audit_status between", value1, value2, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andAuditStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("audit_status not between", value1, value2, "auditStatus");
            return (Criteria) this;
        }

        public Criteria andDescriptIsNull() {
            addCriterion("descript is null");
            return (Criteria) this;
        }

        public Criteria andDescriptIsNotNull() {
            addCriterion("descript is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptEqualTo(String value) {
            addCriterion("descript =", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptNotEqualTo(String value) {
            addCriterion("descript <>", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptGreaterThan(String value) {
            addCriterion("descript >", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptGreaterThanOrEqualTo(String value) {
            addCriterion("descript >=", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptLessThan(String value) {
            addCriterion("descript <", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptLessThanOrEqualTo(String value) {
            addCriterion("descript <=", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptLike(String value) {
            addCriterion("descript like", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptNotLike(String value) {
            addCriterion("descript not like", value, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptIn(List<String> values) {
            addCriterion("descript in", values, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptNotIn(List<String> values) {
            addCriterion("descript not in", values, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptBetween(String value1, String value2) {
            addCriterion("descript between", value1, value2, "descript");
            return (Criteria) this;
        }

        public Criteria andDescriptNotBetween(String value1, String value2) {
            addCriterion("descript not between", value1, value2, "descript");
            return (Criteria) this;
        }

        public Criteria andIntroductionIsNull() {
            addCriterion("introduction is null");
            return (Criteria) this;
        }

        public Criteria andIntroductionIsNotNull() {
            addCriterion("introduction is not null");
            return (Criteria) this;
        }

        public Criteria andIntroductionEqualTo(String value) {
            addCriterion("introduction =", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotEqualTo(String value) {
            addCriterion("introduction <>", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionGreaterThan(String value) {
            addCriterion("introduction >", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("introduction >=", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLessThan(String value) {
            addCriterion("introduction <", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLessThanOrEqualTo(String value) {
            addCriterion("introduction <=", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLike(String value) {
            addCriterion("introduction like", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotLike(String value) {
            addCriterion("introduction not like", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionIn(List<String> values) {
            addCriterion("introduction in", values, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotIn(List<String> values) {
            addCriterion("introduction not in", values, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionBetween(String value1, String value2) {
            addCriterion("introduction between", value1, value2, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotBetween(String value1, String value2) {
            addCriterion("introduction not between", value1, value2, "introduction");
            return (Criteria) this;
        }

        public Criteria andShareIntroductionIsNull() {
            addCriterion("share_introduction is null");
            return (Criteria) this;
        }

        public Criteria andShareIntroductionIsNotNull() {
            addCriterion("share_introduction is not null");
            return (Criteria) this;
        }

        public Criteria andShareIntroductionEqualTo(String value) {
            addCriterion("share_introduction =", value, "shareIntroduction");
            return (Criteria) this;
        }

        public Criteria andShareIntroductionNotEqualTo(String value) {
            addCriterion("share_introduction <>", value, "shareIntroduction");
            return (Criteria) this;
        }

        public Criteria andShareIntroductionGreaterThan(String value) {
            addCriterion("share_introduction >", value, "shareIntroduction");
            return (Criteria) this;
        }

        public Criteria andShareIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("share_introduction >=", value, "shareIntroduction");
            return (Criteria) this;
        }

        public Criteria andShareIntroductionLessThan(String value) {
            addCriterion("share_introduction <", value, "shareIntroduction");
            return (Criteria) this;
        }

        public Criteria andShareIntroductionLessThanOrEqualTo(String value) {
            addCriterion("share_introduction <=", value, "shareIntroduction");
            return (Criteria) this;
        }

        public Criteria andShareIntroductionLike(String value) {
            addCriterion("share_introduction like", value, "shareIntroduction");
            return (Criteria) this;
        }

        public Criteria andShareIntroductionNotLike(String value) {
            addCriterion("share_introduction not like", value, "shareIntroduction");
            return (Criteria) this;
        }

        public Criteria andShareIntroductionIn(List<String> values) {
            addCriterion("share_introduction in", values, "shareIntroduction");
            return (Criteria) this;
        }

        public Criteria andShareIntroductionNotIn(List<String> values) {
            addCriterion("share_introduction not in", values, "shareIntroduction");
            return (Criteria) this;
        }

        public Criteria andShareIntroductionBetween(String value1, String value2) {
            addCriterion("share_introduction between", value1, value2, "shareIntroduction");
            return (Criteria) this;
        }

        public Criteria andShareIntroductionNotBetween(String value1, String value2) {
            addCriterion("share_introduction not between", value1, value2, "shareIntroduction");
            return (Criteria) this;
        }

        public Criteria andProductUrlIsNull() {
            addCriterion("product_url is null");
            return (Criteria) this;
        }

        public Criteria andProductUrlIsNotNull() {
            addCriterion("product_url is not null");
            return (Criteria) this;
        }

        public Criteria andProductUrlEqualTo(String value) {
            addCriterion("product_url =", value, "productUrl");
            return (Criteria) this;
        }

        public Criteria andProductUrlNotEqualTo(String value) {
            addCriterion("product_url <>", value, "productUrl");
            return (Criteria) this;
        }

        public Criteria andProductUrlGreaterThan(String value) {
            addCriterion("product_url >", value, "productUrl");
            return (Criteria) this;
        }

        public Criteria andProductUrlGreaterThanOrEqualTo(String value) {
            addCriterion("product_url >=", value, "productUrl");
            return (Criteria) this;
        }

        public Criteria andProductUrlLessThan(String value) {
            addCriterion("product_url <", value, "productUrl");
            return (Criteria) this;
        }

        public Criteria andProductUrlLessThanOrEqualTo(String value) {
            addCriterion("product_url <=", value, "productUrl");
            return (Criteria) this;
        }

        public Criteria andProductUrlLike(String value) {
            addCriterion("product_url like", value, "productUrl");
            return (Criteria) this;
        }

        public Criteria andProductUrlNotLike(String value) {
            addCriterion("product_url not like", value, "productUrl");
            return (Criteria) this;
        }

        public Criteria andProductUrlIn(List<String> values) {
            addCriterion("product_url in", values, "productUrl");
            return (Criteria) this;
        }

        public Criteria andProductUrlNotIn(List<String> values) {
            addCriterion("product_url not in", values, "productUrl");
            return (Criteria) this;
        }

        public Criteria andProductUrlBetween(String value1, String value2) {
            addCriterion("product_url between", value1, value2, "productUrl");
            return (Criteria) this;
        }

        public Criteria andProductUrlNotBetween(String value1, String value2) {
            addCriterion("product_url not between", value1, value2, "productUrl");
            return (Criteria) this;
        }

        public Criteria andProductShareUrlIsNull() {
            addCriterion("product_share_url is null");
            return (Criteria) this;
        }

        public Criteria andProductShareUrlIsNotNull() {
            addCriterion("product_share_url is not null");
            return (Criteria) this;
        }

        public Criteria andProductShareUrlEqualTo(String value) {
            addCriterion("product_share_url =", value, "productShareUrl");
            return (Criteria) this;
        }

        public Criteria andProductShareUrlNotEqualTo(String value) {
            addCriterion("product_share_url <>", value, "productShareUrl");
            return (Criteria) this;
        }

        public Criteria andProductShareUrlGreaterThan(String value) {
            addCriterion("product_share_url >", value, "productShareUrl");
            return (Criteria) this;
        }

        public Criteria andProductShareUrlGreaterThanOrEqualTo(String value) {
            addCriterion("product_share_url >=", value, "productShareUrl");
            return (Criteria) this;
        }

        public Criteria andProductShareUrlLessThan(String value) {
            addCriterion("product_share_url <", value, "productShareUrl");
            return (Criteria) this;
        }

        public Criteria andProductShareUrlLessThanOrEqualTo(String value) {
            addCriterion("product_share_url <=", value, "productShareUrl");
            return (Criteria) this;
        }

        public Criteria andProductShareUrlLike(String value) {
            addCriterion("product_share_url like", value, "productShareUrl");
            return (Criteria) this;
        }

        public Criteria andProductShareUrlNotLike(String value) {
            addCriterion("product_share_url not like", value, "productShareUrl");
            return (Criteria) this;
        }

        public Criteria andProductShareUrlIn(List<String> values) {
            addCriterion("product_share_url in", values, "productShareUrl");
            return (Criteria) this;
        }

        public Criteria andProductShareUrlNotIn(List<String> values) {
            addCriterion("product_share_url not in", values, "productShareUrl");
            return (Criteria) this;
        }

        public Criteria andProductShareUrlBetween(String value1, String value2) {
            addCriterion("product_share_url between", value1, value2, "productShareUrl");
            return (Criteria) this;
        }

        public Criteria andProductShareUrlNotBetween(String value1, String value2) {
            addCriterion("product_share_url not between", value1, value2, "productShareUrl");
            return (Criteria) this;
        }

        public Criteria andIsShareIsNull() {
            addCriterion("is_share is null");
            return (Criteria) this;
        }

        public Criteria andIsShareIsNotNull() {
            addCriterion("is_share is not null");
            return (Criteria) this;
        }

        public Criteria andIsShareEqualTo(Byte value) {
            addCriterion("is_share =", value, "isShare");
            return (Criteria) this;
        }

        public Criteria andIsShareNotEqualTo(Byte value) {
            addCriterion("is_share <>", value, "isShare");
            return (Criteria) this;
        }

        public Criteria andIsShareGreaterThan(Byte value) {
            addCriterion("is_share >", value, "isShare");
            return (Criteria) this;
        }

        public Criteria andIsShareGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_share >=", value, "isShare");
            return (Criteria) this;
        }

        public Criteria andIsShareLessThan(Byte value) {
            addCriterion("is_share <", value, "isShare");
            return (Criteria) this;
        }

        public Criteria andIsShareLessThanOrEqualTo(Byte value) {
            addCriterion("is_share <=", value, "isShare");
            return (Criteria) this;
        }

        public Criteria andIsShareIn(List<Byte> values) {
            addCriterion("is_share in", values, "isShare");
            return (Criteria) this;
        }

        public Criteria andIsShareNotIn(List<Byte> values) {
            addCriterion("is_share not in", values, "isShare");
            return (Criteria) this;
        }

        public Criteria andIsShareBetween(Byte value1, Byte value2) {
            addCriterion("is_share between", value1, value2, "isShare");
            return (Criteria) this;
        }

        public Criteria andIsShareNotBetween(Byte value1, Byte value2) {
            addCriterion("is_share not between", value1, value2, "isShare");
            return (Criteria) this;
        }

        public Criteria andIndateIsNull() {
            addCriterion("indate is null");
            return (Criteria) this;
        }

        public Criteria andIndateIsNotNull() {
            addCriterion("indate is not null");
            return (Criteria) this;
        }

        public Criteria andIndateEqualTo(Date value) {
            addCriterion("indate =", value, "indate");
            return (Criteria) this;
        }

        public Criteria andIndateNotEqualTo(Date value) {
            addCriterion("indate <>", value, "indate");
            return (Criteria) this;
        }

        public Criteria andIndateGreaterThan(Date value) {
            addCriterion("indate >", value, "indate");
            return (Criteria) this;
        }

        public Criteria andIndateGreaterThanOrEqualTo(Date value) {
            addCriterion("indate >=", value, "indate");
            return (Criteria) this;
        }

        public Criteria andIndateLessThan(Date value) {
            addCriterion("indate <", value, "indate");
            return (Criteria) this;
        }

        public Criteria andIndateLessThanOrEqualTo(Date value) {
            addCriterion("indate <=", value, "indate");
            return (Criteria) this;
        }

        public Criteria andIndateIn(List<Date> values) {
            addCriterion("indate in", values, "indate");
            return (Criteria) this;
        }

        public Criteria andIndateNotIn(List<Date> values) {
            addCriterion("indate not in", values, "indate");
            return (Criteria) this;
        }

        public Criteria andIndateBetween(Date value1, Date value2) {
            addCriterion("indate between", value1, value2, "indate");
            return (Criteria) this;
        }

        public Criteria andIndateNotBetween(Date value1, Date value2) {
            addCriterion("indate not between", value1, value2, "indate");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeIsNull() {
            addCriterion("modified_time is null");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeIsNotNull() {
            addCriterion("modified_time is not null");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeEqualTo(Date value) {
            addCriterion("modified_time =", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeNotEqualTo(Date value) {
            addCriterion("modified_time <>", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeGreaterThan(Date value) {
            addCriterion("modified_time >", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("modified_time >=", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeLessThan(Date value) {
            addCriterion("modified_time <", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeLessThanOrEqualTo(Date value) {
            addCriterion("modified_time <=", value, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeIn(List<Date> values) {
            addCriterion("modified_time in", values, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeNotIn(List<Date> values) {
            addCriterion("modified_time not in", values, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeBetween(Date value1, Date value2) {
            addCriterion("modified_time between", value1, value2, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andModifiedTimeNotBetween(Date value1, Date value2) {
            addCriterion("modified_time not between", value1, value2, "modifiedTime");
            return (Criteria) this;
        }

        public Criteria andPicUrlIsNull() {
            addCriterion("pic_url is null");
            return (Criteria) this;
        }

        public Criteria andPicUrlIsNotNull() {
            addCriterion("pic_url is not null");
            return (Criteria) this;
        }

        public Criteria andPicUrlEqualTo(String value) {
            addCriterion("pic_url =", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotEqualTo(String value) {
            addCriterion("pic_url <>", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlGreaterThan(String value) {
            addCriterion("pic_url >", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlGreaterThanOrEqualTo(String value) {
            addCriterion("pic_url >=", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLessThan(String value) {
            addCriterion("pic_url <", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLessThanOrEqualTo(String value) {
            addCriterion("pic_url <=", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlLike(String value) {
            addCriterion("pic_url like", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotLike(String value) {
            addCriterion("pic_url not like", value, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlIn(List<String> values) {
            addCriterion("pic_url in", values, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotIn(List<String> values) {
            addCriterion("pic_url not in", values, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlBetween(String value1, String value2) {
            addCriterion("pic_url between", value1, value2, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrlNotBetween(String value1, String value2) {
            addCriterion("pic_url not between", value1, value2, "picUrl");
            return (Criteria) this;
        }

        public Criteria andPicUrl2IsNull() {
            addCriterion("pic_url2 is null");
            return (Criteria) this;
        }

        public Criteria andPicUrl2IsNotNull() {
            addCriterion("pic_url2 is not null");
            return (Criteria) this;
        }

        public Criteria andPicUrl2EqualTo(String value) {
            addCriterion("pic_url2 =", value, "picUrl2");
            return (Criteria) this;
        }

        public Criteria andPicUrl2NotEqualTo(String value) {
            addCriterion("pic_url2 <>", value, "picUrl2");
            return (Criteria) this;
        }

        public Criteria andPicUrl2GreaterThan(String value) {
            addCriterion("pic_url2 >", value, "picUrl2");
            return (Criteria) this;
        }

        public Criteria andPicUrl2GreaterThanOrEqualTo(String value) {
            addCriterion("pic_url2 >=", value, "picUrl2");
            return (Criteria) this;
        }

        public Criteria andPicUrl2LessThan(String value) {
            addCriterion("pic_url2 <", value, "picUrl2");
            return (Criteria) this;
        }

        public Criteria andPicUrl2LessThanOrEqualTo(String value) {
            addCriterion("pic_url2 <=", value, "picUrl2");
            return (Criteria) this;
        }

        public Criteria andPicUrl2Like(String value) {
            addCriterion("pic_url2 like", value, "picUrl2");
            return (Criteria) this;
        }

        public Criteria andPicUrl2NotLike(String value) {
            addCriterion("pic_url2 not like", value, "picUrl2");
            return (Criteria) this;
        }

        public Criteria andPicUrl2In(List<String> values) {
            addCriterion("pic_url2 in", values, "picUrl2");
            return (Criteria) this;
        }

        public Criteria andPicUrl2NotIn(List<String> values) {
            addCriterion("pic_url2 not in", values, "picUrl2");
            return (Criteria) this;
        }

        public Criteria andPicUrl2Between(String value1, String value2) {
            addCriterion("pic_url2 between", value1, value2, "picUrl2");
            return (Criteria) this;
        }

        public Criteria andPicUrl2NotBetween(String value1, String value2) {
            addCriterion("pic_url2 not between", value1, value2, "picUrl2");
            return (Criteria) this;
        }

        public Criteria andPicUrl3IsNull() {
            addCriterion("pic_url3 is null");
            return (Criteria) this;
        }

        public Criteria andPicUrl3IsNotNull() {
            addCriterion("pic_url3 is not null");
            return (Criteria) this;
        }

        public Criteria andPicUrl3EqualTo(String value) {
            addCriterion("pic_url3 =", value, "picUrl3");
            return (Criteria) this;
        }

        public Criteria andPicUrl3NotEqualTo(String value) {
            addCriterion("pic_url3 <>", value, "picUrl3");
            return (Criteria) this;
        }

        public Criteria andPicUrl3GreaterThan(String value) {
            addCriterion("pic_url3 >", value, "picUrl3");
            return (Criteria) this;
        }

        public Criteria andPicUrl3GreaterThanOrEqualTo(String value) {
            addCriterion("pic_url3 >=", value, "picUrl3");
            return (Criteria) this;
        }

        public Criteria andPicUrl3LessThan(String value) {
            addCriterion("pic_url3 <", value, "picUrl3");
            return (Criteria) this;
        }

        public Criteria andPicUrl3LessThanOrEqualTo(String value) {
            addCriterion("pic_url3 <=", value, "picUrl3");
            return (Criteria) this;
        }

        public Criteria andPicUrl3Like(String value) {
            addCriterion("pic_url3 like", value, "picUrl3");
            return (Criteria) this;
        }

        public Criteria andPicUrl3NotLike(String value) {
            addCriterion("pic_url3 not like", value, "picUrl3");
            return (Criteria) this;
        }

        public Criteria andPicUrl3In(List<String> values) {
            addCriterion("pic_url3 in", values, "picUrl3");
            return (Criteria) this;
        }

        public Criteria andPicUrl3NotIn(List<String> values) {
            addCriterion("pic_url3 not in", values, "picUrl3");
            return (Criteria) this;
        }

        public Criteria andPicUrl3Between(String value1, String value2) {
            addCriterion("pic_url3 between", value1, value2, "picUrl3");
            return (Criteria) this;
        }

        public Criteria andPicUrl3NotBetween(String value1, String value2) {
            addCriterion("pic_url3 not between", value1, value2, "picUrl3");
            return (Criteria) this;
        }

        public Criteria andNumStateIsNull() {
            addCriterion("NUM_STATE is null");
            return (Criteria) this;
        }

        public Criteria andNumStateIsNotNull() {
            addCriterion("NUM_STATE is not null");
            return (Criteria) this;
        }

        public Criteria andNumStateEqualTo(Byte value) {
            addCriterion("NUM_STATE =", value, "numState");
            return (Criteria) this;
        }

        public Criteria andNumStateNotEqualTo(Byte value) {
            addCriterion("NUM_STATE <>", value, "numState");
            return (Criteria) this;
        }

        public Criteria andNumStateGreaterThan(Byte value) {
            addCriterion("NUM_STATE >", value, "numState");
            return (Criteria) this;
        }

        public Criteria andNumStateGreaterThanOrEqualTo(Byte value) {
            addCriterion("NUM_STATE >=", value, "numState");
            return (Criteria) this;
        }

        public Criteria andNumStateLessThan(Byte value) {
            addCriterion("NUM_STATE <", value, "numState");
            return (Criteria) this;
        }

        public Criteria andNumStateLessThanOrEqualTo(Byte value) {
            addCriterion("NUM_STATE <=", value, "numState");
            return (Criteria) this;
        }

        public Criteria andNumStateIn(List<Byte> values) {
            addCriterion("NUM_STATE in", values, "numState");
            return (Criteria) this;
        }

        public Criteria andNumStateNotIn(List<Byte> values) {
            addCriterion("NUM_STATE not in", values, "numState");
            return (Criteria) this;
        }

        public Criteria andNumStateBetween(Byte value1, Byte value2) {
            addCriterion("NUM_STATE between", value1, value2, "numState");
            return (Criteria) this;
        }

        public Criteria andNumStateNotBetween(Byte value1, Byte value2) {
            addCriterion("NUM_STATE not between", value1, value2, "numState");
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

        public Criteria andNumProductPriceIsNull() {
            addCriterion("num_product_price is null");
            return (Criteria) this;
        }

        public Criteria andNumProductPriceIsNotNull() {
            addCriterion("num_product_price is not null");
            return (Criteria) this;
        }

        public Criteria andNumProductPriceEqualTo(Integer value) {
            addCriterion("num_product_price =", value, "numProductPrice");
            return (Criteria) this;
        }

        public Criteria andNumProductPriceNotEqualTo(Integer value) {
            addCriterion("num_product_price <>", value, "numProductPrice");
            return (Criteria) this;
        }

        public Criteria andNumProductPriceGreaterThan(Integer value) {
            addCriterion("num_product_price >", value, "numProductPrice");
            return (Criteria) this;
        }

        public Criteria andNumProductPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("num_product_price >=", value, "numProductPrice");
            return (Criteria) this;
        }

        public Criteria andNumProductPriceLessThan(Integer value) {
            addCriterion("num_product_price <", value, "numProductPrice");
            return (Criteria) this;
        }

        public Criteria andNumProductPriceLessThanOrEqualTo(Integer value) {
            addCriterion("num_product_price <=", value, "numProductPrice");
            return (Criteria) this;
        }

        public Criteria andNumProductPriceIn(List<Integer> values) {
            addCriterion("num_product_price in", values, "numProductPrice");
            return (Criteria) this;
        }

        public Criteria andNumProductPriceNotIn(List<Integer> values) {
            addCriterion("num_product_price not in", values, "numProductPrice");
            return (Criteria) this;
        }

        public Criteria andNumProductPriceBetween(Integer value1, Integer value2) {
            addCriterion("num_product_price between", value1, value2, "numProductPrice");
            return (Criteria) this;
        }

        public Criteria andNumProductPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("num_product_price not between", value1, value2, "numProductPrice");
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