package com.type;

public class PointUncertaintyEllipse {
    public SupportedGADShapes shape;
    public GeographicalCoordinates point;
    public UncertaintyEllipse uncertaintyEllipse;
    public int confidence;

    public PointUncertaintyEllipse(SupportedGADShapes shape, GeographicalCoordinates point, UncertaintyEllipse uncertaintyEllipse, int confidence) {
        this.shape = shape;
        this.point = point;
        this.uncertaintyEllipse = uncertaintyEllipse;
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

    public UncertaintyEllipse getUncertaintyEllipse() {
        return uncertaintyEllipse;
    }

    public void setUncertaintyEllipse(UncertaintyEllipse uncertaintyEllipse) {
        this.uncertaintyEllipse = uncertaintyEllipse;
    }

    public int getConfidence() {
        return confidence;
    }

    public void setConfidence(int confidence) {
        this.confidence = confidence;
    }
}
