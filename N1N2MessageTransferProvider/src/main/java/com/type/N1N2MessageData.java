package com.type;

public class N1N2MessageData {
	N1MessageContainer n1MessageContainer;
	N2InfoContainer n2InfoContainer;
	boolean lastMsgIndication;
	String sessionId;
	AccessType anType;
	int ppi;
	Arp arp;
	int qi;
	String n1n2FailureTxfNotifURI;
	String supportedFeatures;
	public N1MessageContainer getN1MessageContainer() {
		return n1MessageContainer;
	}
	public void setN1MessageContainer(N1MessageContainer n1MessageContainer) {
		this.n1MessageContainer = n1MessageContainer;
	}
	public N2InfoContainer getN2InfoContainer() {
		return n2InfoContainer;
	}
	public void setN2InfoContainer(N2InfoContainer n2InfoContainer) {
		this.n2InfoContainer = n2InfoContainer;
	}
	public boolean isLastMsgIndication() {
		return lastMsgIndication;
	}
	public void setLastMsgIndication(boolean lastMsgIndication) {
		this.lastMsgIndication = lastMsgIndication;
	}
	public String getSessionId() {
		return sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	public AccessType getAnType() {
		return anType;
	}
	public void setAnType(AccessType anType) {
		this.anType = anType;
	}
	public int getPpi() {
		return ppi;
	}
	public void setPpi(int ppi) {
		this.ppi = ppi;
	}
	public Arp getArp() {
		return arp;
	}
	public void setArp(Arp arp) {
		this.arp = arp;
	}
	public int getQi() {
		return qi;
	}
	public void setQi(int qi) {
		this.qi = qi;
	}
	public String getN1n2FailureTxfNotifURI() {
		return n1n2FailureTxfNotifURI;
	}
	public void setN1n2FailureTxfNotifURI(String n1n2FailureTxfNotifURI) {
		this.n1n2FailureTxfNotifURI = n1n2FailureTxfNotifURI;
	}
	public String getSupportedFeatures() {
		return supportedFeatures;
	}
	public void setSupportedFeatures(String supportedFeatures) {
		this.supportedFeatures = supportedFeatures;
	}
	
}
