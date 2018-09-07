package com.type;
/*
 * SupportedFeatures  supportedFeatures
 * SupportedFeatures	string
 * In an OpenAPI Specification [3] schema, the format shall be designated as "SupportedFeatures".
 * The string shall contain a bitmask indicating supported features in hexadecimal representation: Each character in the string shall take a value of "0" to "9" or "A" to "F" 
 * and shall represent the support of 4 features as described in table 5.2.2-3. 
 */

import java.util.ArrayList;




public class N2InformationTransferReqData {
	Tai tai;
	Ecgi ecgi;
	Ncgi ncgi;
	ArrayList<GlobalRanNodeId> globalRanNodeId;
	N2InfoContainer n2Information;
	String  supportedFeatures;
	public N2InformationTransferReqData(N2InfoContainer n2Information) {
		super();
		this.n2Information = n2Information;
	}
	public Tai getTai() {
		return tai;
	}
	public void setTai(Tai tai) {
		this.tai = tai;
	}
	public Ecgi getEcgi() {
		return ecgi;
	}
	public void setEcgi(Ecgi ecgi) {
		this.ecgi = ecgi;
	}
	public Ncgi getNcgi() {
		return ncgi;
	}
	public void setNcgi(Ncgi ncgi) {
		this.ncgi = ncgi;
	}
	public ArrayList<GlobalRanNodeId> getGlobalRanNodeId() {
		return globalRanNodeId;
	}
	public void setGlobalRanNodeId(ArrayList<GlobalRanNodeId> globalRanNodeId) {
		this.globalRanNodeId = globalRanNodeId;
	}
	public N2InfoContainer getN2Information() {
		return n2Information;
	}
	public void setN2Information(N2InfoContainer n2Information) {
		this.n2Information = n2Information;
	}
	public String getSupportedFeatures() {
		return supportedFeatures;
	}
	public void setSupportedFeatures(String supportedFeatures) {
		this.supportedFeatures = supportedFeatures;
	}
	
}
