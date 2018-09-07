package com.type;

/*
 * 
 * 
NfInstanceId	string				String uniquely identifying a NF instance.
 									The format of the NF Instance ID shall be a Universally 
 									Unique Identifier (UUID) version 4, as described in 
 									IETF RFC 4122 [15].
 NfInstanceId lmfId;	
 */
public class N1MessageContainer {
	N1MessageClass n1MessageClass;
	RefToBinaryData n1MessageContent;
	String lmfId;
	public N1MessageContainer(N1MessageClass n1MessageClass, RefToBinaryData n1MessageContent) {
		super();
		this.n1MessageClass = n1MessageClass;
		this.n1MessageContent = n1MessageContent;
	}
	public N1MessageClass getN1MessageClass() {
		return n1MessageClass;
	}
	public void setN1MessageClass(N1MessageClass n1MessageClass) {
		this.n1MessageClass = n1MessageClass;
	}
	public RefToBinaryData getN1MessageContent() {
		return n1MessageContent;
	}
	public void setN1MessageContent(RefToBinaryData n1MessageContent) {
		this.n1MessageContent = n1MessageContent;
	}
	public String getLmfId() {
		return lmfId;
	}
	public void setLmfId(String lmfId) {
		this.lmfId = lmfId;
	}
	
}
