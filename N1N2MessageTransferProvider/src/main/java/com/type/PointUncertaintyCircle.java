package com.type;

public class PointUncertaintyCircle {
    public SupportedGADShapes shape;
    public GeographicalCoordinates point;
    public Number uncertainty;

    public PointUncertaintyCircle(SupportedGADShapes shape, GeographicalCoordinates point, Number uncertainty) {
        this.shape = shape;
        this.point = point;
        this.uncertainty = uncertainty;
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

    public Number getUncertainty() {
        return uncertainty;
    }

    public void setUncertainty(Number uncertainty) {
        this.uncertainty = uncertainty;
    }
}
