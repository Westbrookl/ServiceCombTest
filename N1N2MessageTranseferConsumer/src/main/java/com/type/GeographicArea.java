package com.type;

public class GeographicArea {
    public Point point;
    public PointUncertaintyCircle puc;
    public PointUncertaintyEllipse pue;
    public Polygon polygon;
    public PointAltitude pa;
    public PointAltitudeUncertainty pau;
    public EllipsoidArc ea;

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public PointUncertaintyCircle getPuc() {
        return puc;
    }

    public void setPuc(PointUncertaintyCircle puc) {
        this.puc = puc;
    }

    public PointUncertaintyEllipse getPue() {
        return pue;
    }

    public void setPue(PointUncertaintyEllipse pue) {
        this.pue = pue;
    }

    public Polygon getPolygon() {
        return polygon;
    }

    public void setPolygon(Polygon polygon) {
        this.polygon = polygon;
    }

    public PointAltitude getPa() {
        return pa;
    }

    public void setPa(PointAltitude pa) {
        this.pa = pa;
    }

    public PointAltitudeUncertainty getPau() {
        return pau;
    }

    public void setPau(PointAltitudeUncertainty pau) {
        this.pau = pau;
    }

    public EllipsoidArc getEa() {
        return ea;
    }

    public void setEa(EllipsoidArc ea) {
        this.ea = ea;
    }
}
