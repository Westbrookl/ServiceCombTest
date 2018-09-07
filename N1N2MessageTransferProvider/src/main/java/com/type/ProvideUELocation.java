package com.type;

import java.util.List;

public class ProvideUELocation {
    public GeographicArea locationEstimate;
    public AccuracyFulfilmentIndicator accuracyFulfilmentIndicator;
    public int ageOfLocationEstimate;
    public VelocityEstimate velocityEstimate;
    public List<PositioningMethodAndUsage> positioningData;
    public GnssPositioningMethodAndUsage gnssPositioningData;
    public Ecgi ecgi;
    public Ncgi ncgi;
    public String servingNode;
    public CivicAddress civicAddress;
    public Integer barometricPressure;
    public int supportedFeatures;

    public ProvideUELocation(GeographicArea locationEstimate) {
        this.locationEstimate = locationEstimate;
    }

    public GeographicArea getLocationEstimate() {
        return locationEstimate;
    }

    public void setLocationEstimate(GeographicArea locationEstimate) {
        this.locationEstimate = locationEstimate;
    }

    public AccuracyFulfilmentIndicator getAccuracyFulfilmentIndicator() {
        return accuracyFulfilmentIndicator;
    }

    public void setAccuracyFulfilmentIndicator(AccuracyFulfilmentIndicator accuracyFulfilmentIndicator) {
        this.accuracyFulfilmentIndicator = accuracyFulfilmentIndicator;
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

    public List<PositioningMethodAndUsage> getPositioningData() {
        return positioningData;
    }

    public void setPositioningData(List<PositioningMethodAndUsage> positioningData) {
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

    public Integer getBarometricPressure() {
        return barometricPressure;
    }

    public void setBarometricPressure(Integer barometricPressure) {
        this.barometricPressure = barometricPressure;
    }

    public int getSupportedFeatures() {
        return supportedFeatures;
    }

    public void setSupportedFeatures(int supportedFeatures) {
        this.supportedFeatures = supportedFeatures;
    }
}
