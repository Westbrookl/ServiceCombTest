package com.type;

public class UeN1N2InfoSubscriptionCreateData {
	N2InformationClass n2InformationClass;
	String n2NotifyCallbackUri;
	N1MessageClass n1MessageClass;
	String n1NotifyCallbackUri;
	String lmfId;
	String supportedFeatures;
	public N2InformationClass getN2InformationClass() {
		return n2InformationClass;
	}
	public void setN2InformationClass(N2InformationClass n2InformationClass) {
		this.n2InformationClass = n2InformationClass;
	}
	public String getN2NotifyCallbackUri() {
		return n2NotifyCallbackUri;
	}
	public void setN2NotifyCallbackUri(String n2NotifyCallbackUri) {
		this.n2NotifyCallbackUri = n2NotifyCallbackUri;
	}
	public N1MessageClass getN1MessageClass() {
		return n1MessageClass;
	}
	public void setN1MessageClass(N1MessageClass n1MessageClass) {
		this.n1MessageClass = n1MessageClass;
	}
	public String getN1NotifyCallbackUri() {
		return n1NotifyCallbackUri;
	}
	public void setN1NotifyCallbackUri(String n1NotifyCallbackUri) {
		this.n1NotifyCallbackUri = n1NotifyCallbackUri;
	}
	public String getLmfId() {
		return lmfId;
	}
	public void setLmfId(String lmfId) {
		this.lmfId = lmfId;
	}
	public String getSupportedFeatures() {
		return supportedFeatures;
	}
	public void setSupportedFeatures(String supportedFeatures) {
		this.supportedFeatures = supportedFeatures;
	}
	
}
