package com.type;

/*
 * 
 * EpsBearerId
 * OpenAPI Specification [15] schema, the format shall be designated as "EpsBearerId".
 * within the range 0 to 15, 
 */
public class EbiArpMapping {
	int epsBearerId;
	Arp arp;
	public EbiArpMapping(int epsBearerId, Arp arp) {
		super();
		this.epsBearerId = epsBearerId;
		this.arp = arp;
	}
	public int getEpsBearerId() {
		return epsBearerId;
	}
	public void setEpsBearerId(int epsBearerId) {
		this.epsBearerId = epsBearerId;
	}
	public Arp getArp() {
		return arp;
	}
	public void setArp(Arp arp) {
		this.arp = arp;
	}
}
