package com.type;

public class PositioningMethodAndUsage {
    public PositioningMethod method;
    public PositioningMode mode;
    public Usage usage;

    public PositioningMethodAndUsage(PositioningMethod method, PositioningMode mode, Usage usage) {
        this.method = method;
        this.mode = mode;
        this.usage = usage;
    }

    public PositioningMethod getMethod() {
        return method;
    }

    public void setMethod(PositioningMethod method) {
        this.method = method;
    }

    public PositioningMode getMode() {
        return mode;
    }

    public void setMode(PositioningMode mode) {
        this.mode = mode;
    }

    public Usage getUsage() {
        return usage;
    }

    public void setUsage(Usage usage) {
        this.usage = usage;
    }
}
