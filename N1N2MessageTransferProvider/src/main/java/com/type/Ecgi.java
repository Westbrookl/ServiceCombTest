package com.type;

public class Ecgi {
	PlmnId plmnId;
	String  eutraCellId;
	public Ecgi(PlmnId plmnId, String eutraCellId) {
		super();
		this.plmnId = plmnId;
		this.eutraCellId = eutraCellId;
	}
	public PlmnId getPlmnId() {
		return plmnId;
	}
	public void setPlmnId(PlmnId plmnId) {
		this.plmnId = plmnId;
	}
	public String getEutraCellId() {
		return eutraCellId;
	}
	public void setEutraCellId(String eutraCellId) {
		this.eutraCellId = eutraCellId;
	}
	
}
