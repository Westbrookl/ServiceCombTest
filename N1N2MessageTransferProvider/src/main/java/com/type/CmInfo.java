package com.type;

public class CmInfo {
    public String cmState;
    public String accessType;

    public CmInfo(String cmState, String accessType) {
        this.cmState = cmState;
        this.accessType = accessType;
    }

    public String getCmState() {
        return cmState;
    }

    public void setCmState(String cmState) {
        this.cmState = cmState;
    }

    public String getAccessType() {
        return accessType;
    }

    public void setAccessType(String accessType) {
        this.accessType = accessType;
    }
}
