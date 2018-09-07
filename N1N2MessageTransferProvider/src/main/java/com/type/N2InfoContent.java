package com.type;

public class N2InfoContent {
	int ngapMessageType;
	int ngapIeType;
	RefToBinaryData ngapData;
	public N2InfoContent(RefToBinaryData ngapData) {
		super();
		this.ngapData = ngapData;
	}
	public int getNgapMessageType() {
		return ngapMessageType;
	}
	public void setNgapMessageType(int ngapMessageType) {
		this.ngapMessageType = ngapMessageType;
	}
	public int getNgapIeType() {
		return ngapIeType;
	}
	public void setNgapIeType(int ngapIeType) {
		this.ngapIeType = ngapIeType;
	}
	public RefToBinaryData getNgapData() {
		return ngapData;
	}
	public void setNgapData(RefToBinaryData ngapData) {
		this.ngapData = ngapData;
	}
	
}
