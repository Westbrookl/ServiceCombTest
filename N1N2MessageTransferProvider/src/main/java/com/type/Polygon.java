package com.type;

public class Polygon {
    public SupportedGADShapes shape;
    public GeographicalCoordinates pointList;

    public Polygon(SupportedGADShapes shape, GeographicalCoordinates pointList) {
        this.shape = shape;
        this.pointList = pointList;
    }

    public SupportedGADShapes getShape() {
        return shape;
    }

    public void setShape(SupportedGADShapes shape) {
        this.shape = shape;
    }

    public GeographicalCoordinates getPointList() {
        return pointList;
    }

    public void setPointList(GeographicalCoordinates pointList) {
        this.pointList = pointList;
    }
}
