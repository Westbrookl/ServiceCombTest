package com.type;

public class UeContextTransferRspData {
	UeContext ueContext;
	String regCompleteNotifyUri;
	String supportedFeatures;
	public UeContextTransferRspData(UeContext ueContext, String regCompleteNotifyUri) {
		super();
		this.ueContext = ueContext;
		this.regCompleteNotifyUri = regCompleteNotifyUri;
	}
	public UeContext getUeContext() {
		return ueContext;
	}
	public void setUeContext(UeContext ueContext) {
		this.ueContext = ueContext;
	}
	public String getRegCompleteNotifyUri() {
		return regCompleteNotifyUri;
	}
	public void setRegCompleteNotifyUri(String regCompleteNotifyUri) {
		this.regCompleteNotifyUri = regCompleteNotifyUri;
	}
	public String getSupportedFeatures() {
		return supportedFeatures;
	}
	public void setSupportedFeatures(String supportedFeatures) {
		this.supportedFeatures = supportedFeatures;
	}
	
}
