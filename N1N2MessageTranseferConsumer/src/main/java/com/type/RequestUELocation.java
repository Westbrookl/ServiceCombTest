package com.type;

import com.sun.jndi.toolkit.url.Uri;

public class RequestUELocation {
    public String lcsClientType;
    public LocationType lcsLocation;
    public String supi;
    public String gpsi;
    public LcsPriority priority;
    public LocationQoS lcsQoS;
    public VelocityRequested velocityRequested;
    public SupportedGADShapes lcsSupportedGADShapes;
    public String locationNotificationUri;
    public String supportedFeatures;

    public RequestUELocation(String lcsClientType, LocationType lcsLocation) {
        this.lcsClientType = lcsClientType;
        this.lcsLocation = lcsLocation;
    }

    public String getLcsClientType() {
        return lcsClientType;
    }

    public void setLcsClientType(String lcsClientType) {
        this.lcsClientType = lcsClientType;
    }

    public LocationType getLcsLocation() {
        return lcsLocation;
    }

    public void setLcsLocation(LocationType lcsLocation) {
        this.lcsLocation = lcsLocation;
    }

    public String getSupi() {
        return supi;
    }

    public void setSupi(String supi) {
        this.supi = supi;
    }

    public String getGpsi() {
        return gpsi;
    }

    public void setGpsi(String gpsi) {
        this.gpsi = gpsi;
    }

    public LcsPriority getPriority() {
        return priority;
    }

    public void setPriority(LcsPriority priority) {
        this.priority = priority;
    }

    public LocationQoS getLcsQoS() {
        return lcsQoS;
    }

    public void setLcsQoS(LocationQoS lcsQoS) {
        this.lcsQoS = lcsQoS;
    }

    public VelocityRequested getVelocityRequested() {
        return velocityRequested;
    }

    public void setVelocityRequested(VelocityRequested velocityRequested) {
        this.velocityRequested = velocityRequested;
    }

    public SupportedGADShapes getLcsSupportedGADShapes() {
        return lcsSupportedGADShapes;
    }

    public void setLcsSupportedGADShapes(SupportedGADShapes lcsSupportedGADShapes) {
        this.lcsSupportedGADShapes = lcsSupportedGADShapes;
    }

    public String getLocationNotificationUri() {
        return locationNotificationUri;
    }

    public void setLocationNotificationUri(String locationNotificationUri) {
        this.locationNotificationUri = locationNotificationUri;
    }

    public String getSupportedFeatures() {
        return supportedFeatures;
    }

    public void setSupportedFeatures(String supportedFeatures) {
        this.supportedFeatures = supportedFeatures;
    }
}
