package com.type;

public class CommunicationFailure {
    public String nasReleaseCode;
    public int ranReleaseCode;

    public CommunicationFailure(String nasReleaseCode) {
        this.nasReleaseCode = nasReleaseCode;
    }

    public String getNasReleaseCode() {
        return nasReleaseCode;
    }

    public void setNasReleaseCode(String nasReleaseCode) {
        this.nasReleaseCode = nasReleaseCode;
    }

    public int getRanReleaseCode() {
        return ranReleaseCode;
    }

    public void setRanReleaseCode(int ranReleaseCode) {
        this.ranReleaseCode = ranReleaseCode;
    }
}
