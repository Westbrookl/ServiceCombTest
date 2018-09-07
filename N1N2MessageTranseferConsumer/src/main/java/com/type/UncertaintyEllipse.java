package com.type;

public class UncertaintyEllipse {
    public Number semiMajor;
    public Number semiMinor;
    public int orientationMajor;

    public UncertaintyEllipse(Number semiMajor, Number semiMinor, int orientationMajor) {
        this.semiMajor = semiMajor;
        this.semiMinor = semiMinor;
        this.orientationMajor = orientationMajor;
    }

    public Number getSemiMajor() {
        return semiMajor;
    }

    public void setSemiMajor(Number semiMajor) {
        this.semiMajor = semiMajor;
    }

    public Number getSemiMinor() {
        return semiMinor;
    }

    public void setSemiMinor(Number semiMinor) {
        this.semiMinor = semiMinor;
    }

    public int getOrientationMajor() {
        return orientationMajor;
    }

    public void setOrientationMajor(int orientationMajor) {
        this.orientationMajor = orientationMajor;
    }
}
