package com.type;

public class VelocityEstimate {
    public HorizontalVelocity hv;
    public HorizontalWithVerticalVelocity hwv;
    public HorizontalVelocityWithUncertainty hvw;
    public HorizontalWithVerticalVelocityAndUncertainty hwvau;

    public HorizontalVelocity getHv() {
        return hv;
    }

    public void setHv(HorizontalVelocity hv) {
        this.hv = hv;
    }

    public HorizontalWithVerticalVelocity getHwv() {
        return hwv;
    }

    public void setHwv(HorizontalWithVerticalVelocity hwv) {
        this.hwv = hwv;
    }

    public HorizontalVelocityWithUncertainty getHvw() {
        return hvw;
    }

    public void setHvw(HorizontalVelocityWithUncertainty hvw) {
        this.hvw = hvw;
    }

    public HorizontalWithVerticalVelocityAndUncertainty getHwvau() {
        return hwvau;
    }

    public void setHwvau(HorizontalWithVerticalVelocityAndUncertainty hwvau) {
        this.hwvau = hwvau;
    }
}
