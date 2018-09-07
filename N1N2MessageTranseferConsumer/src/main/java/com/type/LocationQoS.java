package com.type;

public class LocationQoS {
    public Number hAccuracy;
    public Number vAccuracy;
    public boolean vertRequested;
    public ResponseTime responseTime;

    public Number gethAccuracy() {
        return hAccuracy;
    }

    public void sethAccuracy(Number hAccuracy) {
        this.hAccuracy = hAccuracy;
    }

    public Number getvAccuracy() {
        return vAccuracy;
    }

    public void setvAccuracy(Number vAccuracy) {
        this.vAccuracy = vAccuracy;
    }

    public boolean isVertRequested() {
        return vertRequested;
    }

    public void setVertRequested(boolean vertRequested) {
        this.vertRequested = vertRequested;
    }

    public ResponseTime getResponseTime() {
        return responseTime;
    }

    public void setResponseTime(ResponseTime responseTime) {
        this.responseTime = responseTime;
    }
}
