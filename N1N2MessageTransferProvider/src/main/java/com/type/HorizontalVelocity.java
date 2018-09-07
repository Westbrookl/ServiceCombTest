package com.type;

public class HorizontalVelocity {
    public Number hSpeed;
    public int bearing;

    public HorizontalVelocity(Number hSpeed, int bearing) {
        this.hSpeed = hSpeed;
        this.bearing = bearing;
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
}
