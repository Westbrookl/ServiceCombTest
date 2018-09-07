package com.type;


/*
 * Unsigned integer indicating the ARP Priority Level 
 * (see subclause 5.7.2.2 of 3GPP TS 23.501 [8]),
 *  within the range 1 to 15. 
 * 
 */

public class Arp {
	
	short priorityLevel;//ArpPriorityLevel
	PreemptionCapability preemptCap;
	PreemptionVulnerability preemptVuln;
	public Arp(short priorityLevel, PreemptionCapability preemptCap, PreemptionVulnerability preemptVuln) {
		super();
		this.priorityLevel = priorityLevel;
		this.preemptCap = preemptCap;
		this.preemptVuln = preemptVuln;
	}
	public short getPriorityLevel() {
		return priorityLevel;
	}
	public void setPriorityLevel(short priorityLevel) {
		this.priorityLevel = priorityLevel;
	}
	public PreemptionCapability getPreemptCap() {
		return preemptCap;
	}
	public void setPreemptCap(PreemptionCapability preemptCap) {
		this.preemptCap = preemptCap;
	}
	public PreemptionVulnerability getPreemptVuln() {
		return preemptVuln;
	}
	public void setPreemptVuln(PreemptionVulnerability preemptVuln) {
		this.preemptVuln = preemptVuln;
	}
	
}
