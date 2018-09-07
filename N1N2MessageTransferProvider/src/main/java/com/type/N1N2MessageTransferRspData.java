package com.type;

public class N1N2MessageTransferRspData {
	N1N2MessageTransferCause cause;
	String supportedFeatures;
	public N1N2MessageTransferRspData(N1N2MessageTransferCause cause) {
		super();
		this.cause = cause;
	}
	public N1N2MessageTransferCause getCause() {
		return cause;
	}
	public void setCause(N1N2MessageTransferCause cause) {
		this.cause = cause;
	}
	public String getSupportedFeatures() {
		return supportedFeatures;
	}
	public void setSupportedFeatures(String supportedFeatures) {
		this.supportedFeatures = supportedFeatures;
	}
	
}
