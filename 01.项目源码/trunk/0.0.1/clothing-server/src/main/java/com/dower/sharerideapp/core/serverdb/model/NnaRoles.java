package com.dower.sharerideapp.core.serverdb.model;

public class NnaRoles {
    private Integer numRoleId;

    private String vcRoleName;

    private String vcRoleDesc;

    private Integer numRoleState;

    public Integer getNumRoleId() {
        return numRoleId;
    }

    public void setNumRoleId(Integer numRoleId) {
        this.numRoleId = numRoleId;
    }

    public String getVcRoleName() {
        return vcRoleName;
    }

    public void setVcRoleName(String vcRoleName) {
        this.vcRoleName = vcRoleName == null ? null : vcRoleName.trim();
    }

    public String getVcRoleDesc() {
        return vcRoleDesc;
    }

    public void setVcRoleDesc(String vcRoleDesc) {
        this.vcRoleDesc = vcRoleDesc == null ? null : vcRoleDesc.trim();
    }

    public Integer getNumRoleState() {
        return numRoleState;
    }

    public void setNumRoleState(Integer numRoleState) {
        this.numRoleState = numRoleState;
    }
}