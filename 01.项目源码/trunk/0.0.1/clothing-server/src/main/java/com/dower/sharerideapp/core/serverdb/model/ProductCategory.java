package com.dower.sharerideapp.core.serverdb.model;

import java.util.Date;

public class ProductCategory {
    private Integer categoryId;

    private String categoryName;

    private String categoryCode;

    private Integer parentId;

    private Integer categoryLevel;

    private Integer categoryStatus;

    private Date modifiedTime;

    private Byte numState;

    private Byte numIsDel;

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName == null ? null : categoryName.trim();
    }

    public String getCategoryCode() {
        return categoryCode;
    }

    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode == null ? null : categoryCode.trim();
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public Integer getCategoryLevel() {
        return categoryLevel;
    }

    public void setCategoryLevel(Integer categoryLevel) {
        this.categoryLevel = categoryLevel;
    }

    public Integer getCategoryStatus() {
        return categoryStatus;
    }

    public void setCategoryStatus(Integer categoryStatus) {
        this.categoryStatus = categoryStatus;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public Byte getNumState() {
        return numState;
    }

    public void setNumState(Byte numState) {
        this.numState = numState;
    }

    public Byte getNumIsDel() {
        return numIsDel;
    }

    public void setNumIsDel(Byte numIsDel) {
        this.numIsDel = numIsDel;
    }
}