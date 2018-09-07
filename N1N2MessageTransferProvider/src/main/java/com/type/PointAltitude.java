package com.type;

public class PointAltitude {
    public SupportedGADShapes shape;
    public GeographicalCoordinates point;
    public Number altitude;

    public PointAltitude(SupportedGADShapes shape, GeographicalCoordinates point, Number altitude) {
        this.shape = shape;
        this.point = point;
        this.altitude = altitude;
    }

    public SupportedGADShapes getShape() {
        return shape;
    }

    public void setShape(SupportedGADShapes shape) {
        this.shape = shape;
    }

    public GeographicalCoordinates getPoint() {
        return point;
    }

    public void setPoint(GeographicalCoordinates point) {
        this.point = point;
    }

    public Number getAltitude() {
        return altitude;
    }

    public void setAltitude(Number altitude) {
        this.altitude = altitude;
    }
}
