package com.type;

public class EutraLocation {
	Tai tai;//Tracking Area Identity
	Ecgi ecgi;//E-UTRA Cell Identity
	public EutraLocation(Tai tai, Ecgi ecgi) {
		super();
		this.tai = tai;
		this.ecgi = ecgi;
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
	
}
