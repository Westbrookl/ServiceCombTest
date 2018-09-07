package com.type;
/*
 * EpsBearerId	Uinteger
 * ArrayList<EpsBearerId> releasedEbiList;
 * Unsigned integer identifying an EPS bearer, within the range 0 to 15,
 */
import java.util.ArrayList;



public class AssignEbiData {
	PduSessionId pduSessionId;
	ArrayList<Arp> arps;
	ArrayList<Integer> releasedEbiList;
	public AssignEbiData(PduSessionId pduSessionId) {
		super();
		this.pduSessionId = pduSessionId;
	}
	public PduSessionId getPduSessionId() {
		return pduSessionId;
	}
	public void setPduSessionId(PduSessionId pduSessionId) {
		this.pduSessionId = pduSessionId;
	}
	public ArrayList<Arp> getArps() {
		return arps;
	}
	public void setArps(ArrayList<Arp> arps) {
		this.arps = arps;
	}
	public ArrayList<Integer> getReleasedEbiList() {
		return releasedEbiList;
	}
	public void setReleasedEbiList(ArrayList<Integer> releasedEbiList) {
		this.releasedEbiList = releasedEbiList;
	}
	
}
