package com.type;

/*
 * NgApCause integer 
 * 
 * 
 */
public class UeContextCreateData {
	UeContext ueContext;
	NgRanTargetId targetId;
	N2InfoContainer sourceToTargetData;
	N2SmInformation pduSessions;
	int ngapCause;
	String supportedFeatures;
	public UeContextCreateData(UeContext ueContext, NgRanTargetId targetId, N2InfoContainer sourceToTargetData,
                               N2SmInformation pduSessions) {
		super();
		this.ueContext = ueContext;
		this.targetId = targetId;
		this.sourceToTargetData = sourceToTargetData;
		this.pduSessions = pduSessions;
	}
	public UeContext getUeContext() {
		return ueContext;
	}
	public void setUeContext(UeContext ueContext) {
		this.ueContext = ueContext;
	}
	public NgRanTargetId getTargetId() {
		return targetId;
	}
	public void setTargetId(NgRanTargetId targetId) {
		this.targetId = targetId;
	}
	public N2InfoContainer getSourceToTargetData() {
		return sourceToTargetData;
	}
	public void setSourceToTargetData(N2InfoContainer sourceToTargetData) {
		this.sourceToTargetData = sourceToTargetData;
	}
	public N2SmInformation getPduSessions() {
		return pduSessions;
	}
	public void setPduSessions(N2SmInformation pduSessions) {
		this.pduSessions = pduSessions;
	}
	public int getNgapCause() {
		return ngapCause;
	}
	public void setNgapCause(int ngapCause) {
		this.ngapCause = ngapCause;
	}
	public String getSupportedFeatures() {
		return supportedFeatures;
	}
	public void setSupportedFeatures(String supportedFeatures) {
		this.supportedFeatures = supportedFeatures;
	}
	
}
