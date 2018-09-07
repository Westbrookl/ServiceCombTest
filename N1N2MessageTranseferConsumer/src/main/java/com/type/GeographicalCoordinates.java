package com.type;

public class GeographicalCoordinates {
    public Number lon;
    public Number lat;

    public GeographicalCoordinates(Number lon, Number lat) {
        this.lon = lon;
        this.lat = lat;
    }

    public Number getLon() {
        return lon;
    }

    public void setLon(Number lon) {
        this.lon = lon;
    }

    public Number getLat() {
        return lat;
    }

    public void setLat(Number lat) {
        this.lat = lat;
    }
}
