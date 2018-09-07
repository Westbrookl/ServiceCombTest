package com.type;

/*
 * 1 ��short ������Uint16
 *  	Uint16 messageIdentifier;
	 Uint16 serialNumber;
 * 2 OmcIdentifier String
					minLength: 1 
					maxLength: 20
					The OMC Identifier indicates the identity of an Operation
				 and Maintenance Centre to which Trace Records shall be sent.
				 
 * 	 OmcIdentifier omcId
 * 
 */
public class PwsInformation {
	short messageIdentifier;
	short serialNumber;
	N2InfoContent pwsContainer;
	boolean sendN2Container;
	String  omcId;
	public PwsInformation(short messageIdentifier, short serialNumber, N2InfoContent pwsContainer) {
		super();
		this.messageIdentifier = messageIdentifier;
		this.serialNumber = serialNumber;
		this.pwsContainer = pwsContainer;
	}
	public short getMessageIdentifier() {
		return messageIdentifier;
	}
	public void setMessageIdentifier(short messageIdentifier) {
		this.messageIdentifier = messageIdentifier;
	}
	public short getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(short serialNumber) {
		this.serialNumber = serialNumber;
	}
	public N2InfoContent getPwsContainer() {
		return pwsContainer;
	}
	public void setPwsContainer(N2InfoContent pwsContainer) {
		this.pwsContainer = pwsContainer;
	}
	public boolean isSendN2Container() {
		return sendN2Container;
	}
	public void setSendN2Container(boolean sendN2Container) {
		this.sendN2Container = sendN2Container;
	}
	public String getOmcId() {
		return omcId;
	}
	public void setOmcId(String omcId) {
		this.omcId = omcId;
	}
	
}
