package com.type;

public class NotifiedUELocation {
    public LocationEvent locationEvent;
    public String supi;
    public String gpsi;
    public String pei;
    public GeographicArea locationEstimate;
    public int ageOfLocationEstimate;
    public VelocityEstimate velocityEstimate;
    public PositioningMethodAndUsage positioningData;
    public GnssPositioningMethodAndUsage gnssPositioningData;
    public Ecgi ecgi;
    public Ncgi ncgi;
    public String servingNode;
    public CivicAddress civicAddress;
    public int barometricPressure;

    public NotifiedUELocation(LocationEvent locationEvent) {
        this.locationEvent = locationEvent;
    }

    public LocationEvent getLocationEvent() {
        return locationEvent;
    }

    public void setLocationEvent(LocationEvent locationEvent) {
        this.locationEvent = locationEvent;
    }

    public String getSupi() {
        return supi;
    }

    public void setSupi(String supi) {
        this.supi = supi;
    }

    public String getGpsi() {
        return gpsi;
    }

    public void setGpsi(String gpsi) {
        this.gpsi = gpsi;
    }

    public String getPei() {
        return pei;
    }

    public void setPei(String pei) {
        this.pei = pei;
    }

    public GeographicArea getLocationEstimate() {
        return locationEstimate;
    }

    public void setLocationEstimate(GeographicArea locationEstimate) {
        this.locationEstimate = locationEstimate;
    }

    public int getAgeOfLocationEstimate() {
        return ageOfLocationEstimate;
    }

    public void setAgeOfLocationEstimate(int ageOfLocationEstimate) {
        this.ageOfLocationEstimate = ageOfLocationEstimate;
    }

    public VelocityEstimate getVelocityEstimate() {
        return velocityEstimate;
    }

    public void setVelocityEstimate(VelocityEstimate velocityEstimate) {
        this.velocityEstimate = velocityEstimate;
    }

    public PositioningMethodAndUsage getPositioningData() {
        return positioningData;
    }

    public void setPositioningData(PositioningMethodAndUsage positioningData) {
        this.positioningData = positioningData;
    }

    public GnssPositioningMethodAndUsage getGnssPositioningData() {
        return gnssPositioningData;
    }

    public void setGnssPositioningData(GnssPositioningMethodAndUsage gnssPositioningData) {
        this.gnssPositioningData = gnssPositioningData;
    }

    public Ecgi getEcgi() {
        return ecgi;
    }

    public void setEcgi(Ecgi ecgi) {
        this.ecgi = ecgi;
    }

    public Ncgi getNcgi() {
        return ncgi;
    }

    public void setNcgi(Ncgi ncgi) {
        this.ncgi = ncgi;
    }

    public String getServingNode() {
        return servingNode;
    }

    public void setServingNode(String servingNode) {
        this.servingNode = servingNode;
    }

    public CivicAddress getCivicAddress() {
        return civicAddress;
    }

    public void setCivicAddress(CivicAddress civicAddress) {
        this.civicAddress = civicAddress;
    }

    public int getBarometricPressure() {
        return barometricPressure;
    }

    public void setBarometricPressure(int barometricPressure) {
        this.barometricPressure = barometricPressure;
    }
}
