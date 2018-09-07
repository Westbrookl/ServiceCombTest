package com.type;

import java.util.ArrayList;



public class AssignEbiFailed {
	PduSessionId pduSessionId;
	ArrayList<Arp> failedArpList;
	public AssignEbiFailed(PduSessionId pduSessionId) {
		super();
		this.pduSessionId = pduSessionId;
	}
	public PduSessionId getPduSessionId() {
		return pduSessionId;
	}
	public void setPduSessionId(PduSessionId pduSessionId) {
		this.pduSessionId = pduSessionId;
	}
	public ArrayList<Arp> getFailedArpList() {
		return failedArpList;
	}
	public void setFailedArpList(ArrayList<Arp> failedArpList) {
		this.failedArpList = failedArpList;
	}
	
}
