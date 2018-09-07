package com.type;

import java.util.ArrayList;



public class PWSResponseData {
	int ngapMessageType;
	int serialNumber;
	int messageIdentifier;
	ArrayList<Tai> unknownTAIList;
	public PWSResponseData(int ngapMessageType, int serialNumber, int messageIdentifier) {
		super();
		this.ngapMessageType = ngapMessageType;
		this.serialNumber = serialNumber;
		this.messageIdentifier = messageIdentifier;
	}
	public int getNgapMessageType() {
		return ngapMessageType;
	}
	public void setNgapMessageType(int ngapMessageType) {
		this.ngapMessageType = ngapMessageType;
	}
	public int getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}
	public int getMessageIdentifier() {
		return messageIdentifier;
	}
	public void setMessageIdentifier(int messageIdentifier) {
		this.messageIdentifier = messageIdentifier;
	}
	public ArrayList<Tai> getUnknownTAIList() {
		return unknownTAIList;
	}
	public void setUnknownTAIList(ArrayList<Tai> unknownTAIList) {
		this.unknownTAIList = unknownTAIList;
	}
	
}
