package com.type;

public class AmfEventMode {
    public String trigger;
    public int maxReports;
    public int duration;

    public AmfEventMode(String trigger) {
        this.trigger = trigger;
    }

    public String getTrigger() {
        return trigger;
    }

    public void setTrigger(String trigger) {
        this.trigger = trigger;
    }

    public int getMaxReports() {
        return maxReports;
    }

    public void setMaxReports(int maxReports) {
        this.maxReports = maxReports;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
