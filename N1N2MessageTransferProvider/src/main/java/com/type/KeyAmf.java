package com.type;

public class KeyAmf {
	KeyAmfType keyType;
	String keyVal;
	public KeyAmf(KeyAmfType keyType, String keyVal) {
		super();
		this.keyType = keyType;
		this.keyVal = keyVal;
	}
	public KeyAmfType getKeyType() {
		return keyType;
	}
	public void setKeyType(KeyAmfType keyType) {
		this.keyType = keyType;
	}
	public String getKeyVal() {
		return keyVal;
	}
	public void setKeyVal(String keyVal) {
		this.keyVal = keyVal;
	}
	
}
