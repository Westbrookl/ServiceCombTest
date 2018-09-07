package com.type;

public class N2InformationTransferRspData {
	N2InformationTransferResult result;
	String supportedFeatures;
	PWSResponseData pwsRspData;
	public N2InformationTransferRspData(N2InformationTransferResult result) {
		super();
		this.result = result;
	}
	public N2InformationTransferResult getResult() {
		return result;
	}
	public void setResult(N2InformationTransferResult result) {
		this.result = result;
	}
	public String getSupportedFeatures() {
		return supportedFeatures;
	}
	public void setSupportedFeatures(String supportedFeatures) {
		this.supportedFeatures = supportedFeatures;
	}
	public PWSResponseData getPwsRspData() {
		return pwsRspData;
	}
	public void setPwsRspData(PWSResponseData pwsRspData) {
		this.pwsRspData = pwsRspData;
	}
	
}
