package com.type;
/*
 * NgApCause Uinteger
 * 
 * 
 * 
 */
import java.util.ArrayList;



public class UeContextCreatedData {
	UeContext ueContext;
	N2InfoContainer targetToSourceData;
	ArrayList<N2SmInformation> pduSessions;
	int ngapCause;
	ArrayList<PduSessionId> failedSessions;
	String supportedFeatures;
	public UeContextCreatedData(UeContext ueContext, N2InfoContainer targetToSourceData,
                                ArrayList<N2SmInformation> pduSessions) {
		super();
		this.ueContext = ueContext;
		this.targetToSourceData = targetToSourceData;
		this.pduSessions = pduSessions;
	}
	public UeContext getUeContext() {
		return ueContext;
	}
	public void setUeContext(UeContext ueContext) {
		this.ueContext = ueContext;
	}
	public N2InfoContainer getTargetToSourceData() {
		return targetToSourceData;
	}
	public void setTargetToSourceData(N2InfoContainer targetToSourceData) {
		this.targetToSourceData = targetToSourceData;
	}
	public ArrayList<N2SmInformation> getPduSessions() {
		return pduSessions;
	}
	public void setPduSessions(ArrayList<N2SmInformation> pduSessions) {
		this.pduSessions = pduSessions;
	}
	public int getNgapCause() {
		return ngapCause;
	}
	public void setNgapCause(int ngapCause) {
		this.ngapCause = ngapCause;
	}
	public ArrayList<PduSessionId> getFailedSessions() {
		return failedSessions;
	}
	public void setFailedSessions(ArrayList<PduSessionId> failedSessions) {
		this.failedSessions = failedSessions;
	}
	public String getSupportedFeatures() {
		return supportedFeatures;
	}
	public void setSupportedFeatures(String supportedFeatures) {
		this.supportedFeatures = supportedFeatures;
	}
	
}
