package com.type;

import java.awt.*;
import java.util.List;

public class AmfEvent {
    public AmfEventType type;
    public AmfEventMode options;
    public boolean immediateFlag;
    public List<AmfEventArea> area;
    public LocationFilter locationFilters;
    public SubscribedDataFilter subscribedDataFilters;

    public AmfEvent(AmfEventType type, AmfEventMode options) {
        this.type = type;
        this.options = options;
    }

    public AmfEventType getType() {
        return type;
    }

    public void setType(AmfEventType type) {
        this.type = type;
    }

    public AmfEventMode getOptions() {
        return options;
    }

    public void setOptions(AmfEventMode options) {
        this.options = options;
    }

    public boolean isImmediateFlag() {
        return immediateFlag;
    }

    public void setImmediateFlag(boolean immediateFlag) {
        this.immediateFlag = immediateFlag;
    }

    public List<AmfEventArea> getArea() {
        return area;
    }

    public void setArea(List<AmfEventArea> area) {
        this.area = area;
    }

    public LocationFilter getLocationFilters() {
        return locationFilters;
    }

    public void setLocationFilters(LocationFilter locationFilters) {
        this.locationFilters = locationFilters;
    }

    public SubscribedDataFilter getSubscribedDataFilters() {
        return subscribedDataFilters;
    }

    public void setSubscribedDataFilters(SubscribedDataFilter subscribedDataFilters) {
        this.subscribedDataFilters = subscribedDataFilters;
    }
}
