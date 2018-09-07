package com.type;

public class AmfCreateEventSubscription {
    public AmfEventSubscription subscription;
    public String supportedFeatures;

    public AmfCreateEventSubscription(AmfEventSubscription subscription) {
        this.subscription = subscription;
    }

    public AmfEventSubscription getSubscription() {
        return subscription;
    }

    public void setSubscription(AmfEventSubscription subscription) {
        this.subscription = subscription;
    }

    public String getSupportedFeatures() {
        return supportedFeatures;
    }

    public void setSupportedFeatures(String supportedFeatures) {
        this.supportedFeatures = supportedFeatures;
    }
}
