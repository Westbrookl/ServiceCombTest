package com.type;

public class RmInfo {
    public String rmState;
    public String accessType;

    public RmInfo(String rmState, String accessType) {
        this.rmState = rmState;
        this.accessType = accessType;
    }

    public String getRmState() {
        return rmState;
    }

    public void setRmState(String rmState) {
        this.rmState = rmState;
    }

    public String getAccessType() {
        return accessType;
    }

    public void setAccessType(String accessType) {
        this.accessType = accessType;
    }
}
