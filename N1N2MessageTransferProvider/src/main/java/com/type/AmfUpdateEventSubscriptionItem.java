package com.type;

public class AmfUpdateEventSubscriptionItem {
    public String op;
    public String path;
    public AmfEvent value;

    public AmfUpdateEventSubscriptionItem(String op, String path) {
        this.op = op;
        this.path = path;
    }

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public AmfEvent getValue() {
        return value;
    }

    public void setValue(AmfEvent value) {
        this.value = value;
    }
}
