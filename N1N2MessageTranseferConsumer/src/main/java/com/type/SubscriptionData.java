package com.type;

public class SubscriptionData {
	String amfStatusUri;
	Guami guamis;
	public SubscriptionData(String amfStatusUri) {
		super();
		this.amfStatusUri = amfStatusUri;
	}
	public String getAmfStatusUri() {
		return amfStatusUri;
	}
	public void setAmfStatusUri(String amfStatusUri) {
		this.amfStatusUri = amfStatusUri;
	}
	public Guami getGuamis() {
		return guamis;
	}
	public void setGuamis(Guami guamis) {
		this.guamis = guamis;
	}
	
}
