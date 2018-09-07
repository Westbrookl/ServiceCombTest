package com.type;

public class AmfUpdatedEventSubscription {
    public AmfEventSubscription subscription;

    public AmfUpdatedEventSubscription(AmfEventSubscription subscription) {
        this.subscription = subscription;
    }

    public AmfEventSubscription getSubscription() {
        return subscription;
    }

    public void setSubscription(AmfEventSubscription subscription) {
        this.subscription = subscription;
    }
}
