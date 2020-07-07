package com.dower.sharerideapp.core.serverdb.model;

public class NntUsers {
    private Integer numUserId;

    private String vcNickname;

    private String vcOpenid;

    private String vcPhone;

    private String vcRemark;

    private Integer numLevel;

    private String vcRealName;

    private Integer numState;

    private String vcHeadImgUrl;

    private String vcUnionid;

    private String vcSubscribeScene;

    public Integer getNumUserId() {
        return numUserId;
    }

    public void setNumUserId(Integer numUserId) {
        this.numUserId = numUserId;
    }

    public String getVcNickname() {
        return vcNickname;
    }

    public void setVcNickname(String vcNickname) {
        this.vcNickname = vcNickname == null ? null : vcNickname.trim();
    }

    public String getVcOpenid() {
        return vcOpenid;
    }

    public void setVcOpenid(String vcOpenid) {
        this.vcOpenid = vcOpenid == null ? null : vcOpenid.trim();
    }

    public String getVcPhone() {
        return vcPhone;
    }

    public void setVcPhone(String vcPhone) {
        this.vcPhone = vcPhone == null ? null : vcPhone.trim();
    }

    public String getVcRemark() {
        return vcRemark;
    }

    public void setVcRemark(String vcRemark) {
        this.vcRemark = vcRemark == null ? null : vcRemark.trim();
    }

    public Integer getNumLevel() {
        return numLevel;
    }

    public void setNumLevel(Integer numLevel) {
        this.numLevel = numLevel;
    }

    public String getVcRealName() {
        return vcRealName;
    }

    public void setVcRealName(String vcRealName) {
        this.vcRealName = vcRealName == null ? null : vcRealName.trim();
    }

    public Integer getNumState() {
        return numState;
    }

    public void setNumState(Integer numState) {
        this.numState = numState;
    }

    public String getVcHeadImgUrl() {
        return vcHeadImgUrl;
    }

    public void setVcHeadImgUrl(String vcHeadImgUrl) {
        this.vcHeadImgUrl = vcHeadImgUrl == null ? null : vcHeadImgUrl.trim();
    }

    public String getVcUnionid() {
        return vcUnionid;
    }

    public void setVcUnionid(String vcUnionid) {
        this.vcUnionid = vcUnionid == null ? null : vcUnionid.trim();
    }

    public String getVcSubscribeScene() {
        return vcSubscribeScene;
    }

    public void setVcSubscribeScene(String vcSubscribeScene) {
        this.vcSubscribeScene = vcSubscribeScene == null ? null : vcSubscribeScene.trim();
    }
}