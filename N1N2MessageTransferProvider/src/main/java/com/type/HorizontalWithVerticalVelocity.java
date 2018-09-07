package com.type;

public class HorizontalWithVerticalVelocity {
    public Number hSpeed;
    public int bearing;
    public Number vSpeed;
    public VerticalDirection vDirection;

    public HorizontalWithVerticalVelocity(Number hSpeed, int bearing, Number vSpeed, VerticalDirection vDirection) {
        this.hSpeed = hSpeed;
        this.bearing = bearing;
        this.vSpeed = vSpeed;
        this.vDirection = vDirection;
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
}
