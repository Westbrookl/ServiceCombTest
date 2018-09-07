package com.type;

public class NonUeN2InfoSubscriptionCreatedData {
	String n2NotifySubscriptionId;
	String supportedFeatures;
	public NonUeN2InfoSubscriptionCreatedData(String n2NotifySubscriptionId) {
		super();
		this.n2NotifySubscriptionId = n2NotifySubscriptionId;
	}
	public String getN2NotifySubscriptionId() {
		return n2NotifySubscriptionId;
	}
	public void setN2NotifySubscriptionId(String n2NotifySubscriptionId) {
		this.n2NotifySubscriptionId = n2NotifySubscriptionId;
	}
	public String getSupportedFeatures() {
		return supportedFeatures;
	}
	public void setSupportedFeatures(String supportedFeatures) {
		this.supportedFeatures = supportedFeatures;
	}
	
}
