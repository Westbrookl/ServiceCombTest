package com.type;

public class HorizontalWithVerticalVelocityAndUncertainty {
    public Number hSpeed;
    public int bearing;
    public Number vSpeed;
    public VerticalDirection vDirection;
    public Number hUncertainty;
    public Number vUncertainty;

    public HorizontalWithVerticalVelocityAndUncertainty(Number hSpeed, int bearing, Number vSpeed, VerticalDirection vDirection, Number hUncertainty, Number vUncertainty) {
        this.hSpeed = hSpeed;
        this.bearing = bearing;
        this.vSpeed = vSpeed;
        this.vDirection = vDirection;
        this.hUncertainty = hUncertainty;
        this.vUncertainty = vUncertainty;
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

    public Number getvSpeed() {
        return vSpeed;
    }

    public void setvSpeed(Number vSpeed) {
        this.vSpeed = vSpeed;
    }

    public VerticalDirection getvDirection() {
        return vDirection;
    }

    public void setvDirection(VerticalDirection vDirection) {
        this.vDirection = vDirection;
    }

    public Number gethUncertainty() {
        return hUncertainty;
    }

    public void sethUncertainty(Number hUncertainty) {
        this.hUncertainty = hUncertainty;
    }

    public Number getvUncertainty() {
        return vUncertainty;
    }

    public void setvUncertainty(Number vUncertainty) {
        this.vUncertainty = vUncertainty;
    }
}
