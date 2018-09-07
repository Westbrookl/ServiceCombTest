package com.type;

public class PointAltitudeUncertainty {
    public SupportedGADShapes shape;
    public GeographicalCoordinates point;
    public Number altitude;
    public UncertaintyEllipse uncertaintyEllipse;
    public Number uncertaintyAltitude;
    public int confidence;

    public PointAltitudeUncertainty(SupportedGADShapes shape, GeographicalCoordinates point, Number altitude, UncertaintyEllipse uncertaintyEllipse, Number uncertaintyAltitude, int confidence) {
        this.shape = shape;
        this.point = point;
        this.altitude = altitude;
        this.uncertaintyEllipse = uncertaintyEllipse;
        this.uncertaintyAltitude = uncertaintyAltitude;
        this.confidence = confidence;
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

    public UncertaintyEllipse getUncertaintyEllipse() {
        return uncertaintyEllipse;
    }

    public void setUncertaintyEllipse(UncertaintyEllipse uncertaintyEllipse) {
        this.uncertaintyEllipse = uncertaintyEllipse;
    }

    public Number getUncertaintyAltitude() {
        return uncertaintyAltitude;
    }

    public void setUncertaintyAltitude(Number uncertaintyAltitude) {
        this.uncertaintyAltitude = uncertaintyAltitude;
    }

    public int getConfidence() {
        return confidence;
    }

    public void setConfidence(int confidence) {
        this.confidence = confidence;
    }
}
