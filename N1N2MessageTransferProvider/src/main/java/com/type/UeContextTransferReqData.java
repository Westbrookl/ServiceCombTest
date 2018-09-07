package com.type;

public class UeContextTransferReqData {
	TransferReason reason;
	N1MessageContainer regRequest;
	String supportedFeatures;
	public UeContextTransferReqData(TransferReason reason) {
		super();
		this.reason = reason;
	}
	public TransferReason getReason() {
		return reason;
	}
	public void setReason(TransferReason reason) {
		this.reason = reason;
	}
	public N1MessageContainer getRegRequest() {
		return regRequest;
	}
	public void setRegRequest(N1MessageContainer regRequest) {
		this.regRequest = regRequest;
	}
	public String getSupportedFeatures() {
		return supportedFeatures;
	}
	public void setSupportedFeatures(String supportedFeatures) {
		this.supportedFeatures = supportedFeatures;
	}
	
}
