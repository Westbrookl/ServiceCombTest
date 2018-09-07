package com.type;

public class N2SmInformation {
	PduSessionId pduSessionId;	
	N2InfoContent n2InfoContent;
	N1MessageContainer nasPdu;
	Snssai sNssai;
	boolean subjectToHo;
	public N2SmInformation(PduSessionId pduSessionId) {
		super();
		this.pduSessionId = pduSessionId;
	}
	public PduSessionId getPduSessionId() {
		return pduSessionId;
	}
	public void setPduSessionId(PduSessionId pduSessionId) {
		this.pduSessionId = pduSessionId;
	}
	public N2InfoContent getN2InfoContent() {
		return n2InfoContent;
	}
	public void setN2InfoContent(N2InfoContent n2InfoContent) {
		this.n2InfoContent = n2InfoContent;
	}
	public N1MessageContainer getNasPdu() {
		return nasPdu;
	}
	public void setNasPdu(N1MessageContainer nasPdu) {
		this.nasPdu = nasPdu;
	}
	public Snssai getsNssai() {
		return sNssai;
	}
	public void setsNssai(Snssai sNssai) {
		this.sNssai = sNssai;
	}
	public boolean isSubjectToHo() {
		return subjectToHo;
	}
	public void setSubjectToHo(boolean subjectToHo) {
		this.subjectToHo = subjectToHo;
	}
	
}
