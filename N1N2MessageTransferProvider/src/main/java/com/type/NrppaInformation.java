package com.type;

/*	NfInstanceId lmfId;
 * NfInstanceId	string	 String uniquely identifying a NF instance. 
 * The format of the NF Instance ID shall be a Universally Unique Identifier (UUID) version 4, 
 * as described in IETF RFC 4122 [15].
 * 
 * 
 */
public class NrppaInformation {
	String lmfId;
	N2InfoContent nrppaPdu;
	public NrppaInformation(String lmfId, N2InfoContent nrppaPdu) {
		super();
		this.lmfId = lmfId;
		this.nrppaPdu = nrppaPdu;
	}
	public String getLmfId() {
		return lmfId;
	}
	public void setLmfId(String lmfId) {
		this.lmfId = lmfId;
	}
	public N2InfoContent getNrppaPdu() {
		return nrppaPdu;
	}
	public void setNrppaPdu(N2InfoContent nrppaPdu) {
		this.nrppaPdu = nrppaPdu;
	}
	
}
