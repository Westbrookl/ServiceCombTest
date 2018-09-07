package com.type;

public class AmfEventState {
    public boolean active;
    public int remainReports;
    public int remainDuration;

    public AmfEventState(boolean active) {
        this.active = active;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getRemainReports() {
        return remainReports;
    }

    public void setRemainReports(int remainReports) {
        this.remainReports = remainReports;
    }

    public int getRemainDuration() {
        return remainDuration;
    }

    public void setRemainDuration(int remainDuration) {
        this.remainDuration = remainDuration;
    }
}
