package com.type;

public class EllipsoidArc {
    public SupportedGADShapes shape;
    public GeographicalCoordinates point;
    public int innerRadius;
    public int uncertaintyRadius;
    public int offsetAngle;
    public int includedAngle;
    public int confidence;

    public EllipsoidArc(SupportedGADShapes shape, GeographicalCoordinates point, int innerRadius, int uncertaintyRadius, int offsetAngle, int includedAngle, int confidence) {
        this.shape = shape;
        this.point = point;
        this.innerRadius = innerRadius;
        this.uncertaintyRadius = uncertaintyRadius;
        this.offsetAngle = offsetAngle;
        this.includedAngle = includedAngle;
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

    public int getInnerRadius() {
        return innerRadius;
    }

    public void setInnerRadius(int innerRadius) {
        this.innerRadius = innerRadius;
    }

    public int getUncertaintyRadius() {
        return uncertaintyRadius;
    }

    public void setUncertaintyRadius(int uncertaintyRadius) {
        this.uncertaintyRadius = uncertaintyRadius;
    }

    public int getOffsetAngle() {
        return offsetAngle;
    }

    public void setOffsetAngle(int offsetAngle) {
        this.offsetAngle = offsetAngle;
    }

    public int getIncludedAngle() {
        return includedAngle;
    }

    public void setIncludedAngle(int includedAngle) {
        this.includedAngle = includedAngle;
    }

    public int getConfidence() {
        return confidence;
    }

    public void setConfidence(int confidence) {
        this.confidence = confidence;
    }
}
