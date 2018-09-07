package com.type;

import java.util.List;

public class AmfEventReport {
    public AmfEventType type;
    public AmfEventState state;
    public boolean anyUE;
    public String supi;
    public List<AmfEventArea> area;
    public String gpsi;
    public String pei;
    public UserLocation location;
    public String timezone;
    public String accessTypes;
    public RmInfo rmInfos;
    public CmInfo cmInfos;
    public String reachability;
    public SubscribedData subscribedData;
    public CommunicationFailure communicationFailure;
    public int numberOfUes;

    public AmfEventReport(AmfEventType type, AmfEventState state) {
        this.type = type;
        this.state = state;
    }

    public AmfEventType getType() {
        return type;
    }

    public void setType(AmfEventType type) {
        this.type = type;
    }

    public AmfEventState getState() {
        return state;
    }

    public void setState(AmfEventState state) {
        this.state = state;
    }

    public boolean isAnyUE() {
        return anyUE;
    }

    public void setAnyUE(boolean anyUE) {
        this.anyUE = anyUE;
    }

    public String getSupi() {
        return supi;
    }

    public void setSupi(String supi) {
        this.supi = supi;
    }

    public List<AmfEventArea> getArea() {
        return area;
    }

    public void setArea(List<AmfEventArea> area) {
        this.area = area;
    }

    public String getGpsi() {
        return gpsi;
    }

    public void setGpsi(String gpsi) {
        this.gpsi = gpsi;
    }

    public String getPei() {
        return pei;
    }

    public void setPei(String pei) {
        this.pei = pei;
    }

    public UserLocation getLocation() {
        return location;
    }

    public void setLocation(UserLocation location) {
        this.location = location;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public String getAccessTypes() {
        return accessTypes;
    }

    public void setAccessTypes(String accessTypes) {
        this.accessTypes = accessTypes;
    }

    public RmInfo getRmInfos() {
        return rmInfos;
    }

    public void setRmInfos(RmInfo rmInfos) {
        this.rmInfos = rmInfos;
    }

    public CmInfo getCmInfos() {
        return cmInfos;
    }

    public void setCmInfos(CmInfo cmInfos) {
        this.cmInfos = cmInfos;
    }

    public String getReachability() {
        return reachability;
    }

    public void setReachability(String reachability) {
        this.reachability = reachability;
    }

    public SubscribedData getSubscribedData() {
        return subscribedData;
    }

    public void setSubscribedData(SubscribedData subscribedData) {
        this.subscribedData = subscribedData;
    }

    public CommunicationFailure getCommunicationFailure() {
        return communicationFailure;
    }

    public void setCommunicationFailure(CommunicationFailure communicationFailure) {
        this.communicationFailure = communicationFailure;
    }

    public int getNumberOfUes() {
        return numberOfUes;
    }

    public void setNumberOfUes(int numberOfUes) {
        this.numberOfUes = numberOfUes;
    }
}
