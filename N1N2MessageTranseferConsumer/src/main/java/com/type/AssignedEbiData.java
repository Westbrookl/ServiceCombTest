package com.type;
/*
 * EpsBearerId	Uinteger
 * ArrayList<EpsBearerId> releasedEbiList;
 * Unsigned integer identifying an EPS bearer, within the range 0 to 15,
 */
import java.util.ArrayList;



public class AssignedEbiData {
	PduSessionId pduSessionId;
	ArrayList<EbiArpMapping> assignedEbis;
	ArrayList<Arp> failedArpList;
	ArrayList<Integer> releasedEbiList;
	public AssignedEbiData(PduSessionId pduSessionId, ArrayList<EbiArpMapping> assignedEbis) {
		super();
		this.pduSessionId = pduSessionId;
		this.assignedEbis = assignedEbis;
	}
	public PduSessionId getPduSessionId() {
		return pduSessionId;
	}
	public void setPduSessionId(PduSessionId pduSessionId) {
		this.pduSessionId = pduSessionId;
	}
	public ArrayList<EbiArpMapping> getAssignedEbis() {
		return assignedEbis;
	}
	public void setAssignedEbis(ArrayList<EbiArpMapping> assignedEbis) {
		this.assignedEbis = assignedEbis;
	}
	public ArrayList<Arp> getFailedArpList() {
		return failedArpList;
	}
	public void setFailedArpList(ArrayList<Arp> failedArpList) {
		this.failedArpList = failedArpList;
	}
	public ArrayList<Integer> getReleasedEbiList() {
		return releasedEbiList;
	}
	public void setReleasedEbiList(ArrayList<Integer> releasedEbiList) {
		this.releasedEbiList = releasedEbiList;
	}
	
}
