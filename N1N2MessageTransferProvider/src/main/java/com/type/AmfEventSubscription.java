package com.type;

import java.util.ArrayList;
import java.util.List;

public class AmfEventSubscription {
    public List<AmfEvent> events;
    public String notifyUri;
    public String notifyCorelationld;
    public String nfld;
    public String subsChangeNotifyUri;
    public String supi;
    public String groupid;
    public String gpsi;
    public String pei;
    public boolean anyUE;

    public AmfEventSubscription(List<AmfEvent> events, String notifyUri, String notifyCorelationld, String nfld) {
        this.events = events;
        this.notifyUri = notifyUri;
        this.notifyCorelationld = notifyCorelationld;
        this.nfld = nfld;
    }

    public List<AmfEvent> getEvents() {
        return events;
    }

    public void setEvents(List<AmfEvent> events) {
        this.events = events;
    }

    public String getNotifyUri() {
        return notifyUri;
    }

    public void setNotifyUri(String notifyUri) {
        this.notifyUri = notifyUri;
    }

    public String getNotifyCorelationld() {
        return notifyCorelationld;
    }

    public void setNotifyCorelationld(String notifyCorelationld) {
        this.notifyCorelationld = notifyCorelationld;
    }

    public String getNfld() {
        return nfld;
    }

    public void setNfld(String nfld) {
        this.nfld = nfld;
    }

    public String getSubsChangeNotifyUri() {
        return subsChangeNotifyUri;
    }

    public void setSubsChangeNotifyUri(String subsChangeNotifyUri) {
        this.subsChangeNotifyUri = subsChangeNotifyUri;
    }

    public String getSupi() {
        return supi;
    }

    public void setSupi(String supi) {
        this.supi = supi;
    }

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid;
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

    public boolean isAnyUE() {
        return anyUE;
    }

    public void setAnyUE(boolean anyUE) {
        this.anyUE = anyUE;
    }
}
