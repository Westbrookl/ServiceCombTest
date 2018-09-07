package com.type;

public class Point {
    public SupportedGADShapes shape;
    public GeographicalCoordinates point;

    public Point(SupportedGADShapes shape, GeographicalCoordinates point) {
        this.shape = shape;
        this.point = point;
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
}
