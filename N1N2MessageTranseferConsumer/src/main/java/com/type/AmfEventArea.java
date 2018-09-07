package com.type;

import java.util.List;

public class AmfEventArea {
    public PresenceState presence;
    public Tai trackingAreas;
    public String areald;
    public String ladn;
    public List<Ecgi> ecgi;
    public List<Ncgi> ncgi;
    public List<GlobalRanNodeId> globalRanNodeId;

    public PresenceState getPresence() {
        return presence;
    }

    public void setPresence(PresenceState presence) {
        this.presence = presence;
    }

    public Tai getTrackingAreas() {
        return trackingAreas;
    }

    public void setTrackingAreas(Tai trackingAreas) {
        this.trackingAreas = trackingAreas;
    }

    public String getAreald() {
        return areald;
    }

    public void setAreald(String areald) {
        this.areald = areald;
    }

    public String getLadn() {
        return ladn;
    }

    public void setLadn(String ladn) {
        this.ladn = ladn;
    }

    public List<Ecgi> getEcgi() {
        return ecgi;
    }

    public void setEcgi(List<Ecgi> ecgi) {
        this.ecgi = ecgi;
    }

    public List<Ncgi> getNcgi() {
        return ncgi;
    }

    public void setNcgi(List<Ncgi> ncgi) {
        this.ncgi = ncgi;
    }

    public List<GlobalRanNodeId> getGlobalRanNodeId() {
        return globalRanNodeId;
    }

    public void setGlobalRanNodeId(List<GlobalRanNodeId> globalRanNodeId) {
        this.globalRanNodeId = globalRanNodeId;
    }
}
