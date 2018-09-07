package com.type;

import java.util.ArrayList;



public class NonUeN2InfoSubscriptionCreateData {
	ArrayList<GlobalRanNodeId> globalRanNodeId;
	ArrayList<AccessType> anType;
	N2InformationClass n2InformationClass;
	String n2NotifyCallbackUri;
	String lmfId;
	String supportedFeatures;
	public NonUeN2InfoSubscriptionCreateData(N2InformationClass n2InformationClass, String n2NotifyCallbackUri) {
		super();
		this.n2InformationClass = n2InformationClass;
		this.n2NotifyCallbackUri = n2NotifyCallbackUri;
	}
	public ArrayList<GlobalRanNodeId> getGlobalRanNodeId() {
		return globalRanNodeId;
	}
	public void setGlobalRanNodeId(ArrayList<GlobalRanNodeId> globalRanNodeId) {
		this.globalRanNodeId = globalRanNodeId;
	}
	public ArrayList<AccessType> getAnType() {
		return anType;
	}
	public void setAnType(ArrayList<AccessType> anType) {
		this.anType = anType;
	}
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
