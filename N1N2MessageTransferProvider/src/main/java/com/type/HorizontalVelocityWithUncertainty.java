package com.type;

public class HorizontalVelocityWithUncertainty {
    public Number hSpeed;
    public int bearing;
    public Number uncertainty;

    public HorizontalVelocityWithUncertainty(Number hSpeed, int bearing, Number uncertainty) {
        this.hSpeed = hSpeed;
        this.bearing = bearing;
        this.uncertainty = uncertainty;
    }

    public Number gethSpeed() {
        return hSpeed;
    }

    public void sethSpeed(Number hSpeed) {
        this.hSpeed = hSpeed;
    }

    public int getBearing() {
        return bearing;
    }

    public void setBearing(int bearing) {
        this.bearing = bearing;
    }

    public Number getUncertainty() {
        return uncertainty;
    }

    public void setUncertainty(Number uncertainty) {
        this.uncertainty = uncertainty;
    }
}
