package com.type;

public class AmfCreatedEventSubscription {
    public AmfEventSubscription subscription;
    public AmfEventReport reports;
    public String supportedFeatures;

    public AmfCreatedEventSubscription(AmfEventSubscription subscription) {
        this.subscription = subscription;
    }

    public AmfEventSubscription getSubscription() {
        return subscription;
    }

    public void setSubscription(AmfEventSubscription subscription) {
        this.subscription = subscription;
    }

    public AmfEventReport getReports() {
        return reports;
    }

    public void setReports(AmfEventReport reports) {
        this.reports = reports;
    }

    public String getSupportedFeatures() {
        return supportedFeatures;
    }

    public void setSupportedFeatures(String supportedFeatures) {
        this.supportedFeatures = supportedFeatures;
    }
}
