package com.type;

import java.util.List;

public class AmfEventNotification {
    public String subscriptionld;
    public String notifCorelationld;
    public List<AmfEventReport> reports;

    public AmfEventNotification(String subscriptionld, String notifCorelationld) {
        this.subscriptionld = subscriptionld;
        this.notifCorelationld = notifCorelationld;
    }

    public String getSubscriptionld() {
        return subscriptionld;
    }

    public void setSubscriptionld(String subscriptionld) {
        this.subscriptionld = subscriptionld;
    }

    public String getNotifCorelationld() {
        return notifCorelationld;
    }

    public void setNotifCorelationld(String notifCorelationld) {
        this.notifCorelationld = notifCorelationld;
    }

    public List<AmfEventReport> getReports() {
        return reports;
    }

    public void setReports(List<AmfEventReport> reports) {
        this.reports = reports;
    }
}
