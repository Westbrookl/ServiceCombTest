package com.type;

public class Guami {
	PlmnId plmnId;
	String amfId;//Pattern: '^[A-Fa-f0-9]{6}$'
	public Guami(PlmnId plmnId, String amfId) {
		super();
		this.plmnId = plmnId;
		this.amfId = amfId;
	}
	public PlmnId getPlmnId() {
		return plmnId;
	}
	public void setPlmnId(PlmnId plmnId) {
		this.plmnId = plmnId;
	}
	public String getAmfId() {
		return amfId;
	}
	public void setAmfId(String amfId) {
		this.amfId = amfId;
	}
}
