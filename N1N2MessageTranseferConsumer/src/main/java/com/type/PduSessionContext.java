package com.type;

import java.util.ArrayList;



public class PduSessionContext {
	PduSessionId pduSessionId;
	String smContextRef;
	Snssai sNssai;
	String dnn;
	AccessType accessType;
	ArrayList<EbiArpMapping> allocatedEbiList;
	String hsmfId;
	String vsmfId;
	String  nsInstance;
	public PduSessionContext(PduSessionId pduSessionId, String smContextRef, Snssai sNssai, String dnn,
                             AccessType accessType, ArrayList<EbiArpMapping> allocatedEbiList) {
		super();
		this.pduSessionId = pduSessionId;
		this.smContextRef = smContextRef;
		this.sNssai = sNssai;
		this.dnn = dnn;
		this.accessType = accessType;
		this.allocatedEbiList = allocatedEbiList;
	}
	public PduSessionId getPduSessionId() {
		return pduSessionId;
	}
	public void setPduSessionId(PduSessionId pduSessionId) {
		this.pduSessionId = pduSessionId;
	}
	public String getSmContextRef() {
		return smContextRef;
	}
	public void setSmContextRef(String smContextRef) {
		this.smContextRef = smContextRef;
	}
	public Snssai getsNssai() {
		return sNssai;
	}
	public void setsNssai(Snssai sNssai) {
		this.sNssai = sNssai;
	}
	public String getDnn() {
		return dnn;
	}
	public void setDnn(String dnn) {
		this.dnn = dnn;
	}
	public AccessType getAccessType() {
		return accessType;
	}
	public void setAccessType(AccessType accessType) {
		this.accessType = accessType;
	}
	public ArrayList<EbiArpMapping> getAllocatedEbiList() {
		return allocatedEbiList;
	}
	public void setAllocatedEbiList(ArrayList<EbiArpMapping> allocatedEbiList) {
		this.allocatedEbiList = allocatedEbiList;
	}
	public String getHsmfId() {
		return hsmfId;
	}
	public void setHsmfId(String hsmfId) {
		this.hsmfId = hsmfId;
	}
	public String getVsmfId() {
		return vsmfId;
	}
	public void setVsmfId(String vsmfId) {
		this.vsmfId = vsmfId;
	}
	public String getNsInstance() {
		return nsInstance;
	}
	public void setNsInstance(String nsInstance) {
		this.nsInstance = nsInstance;
	}
	
}
