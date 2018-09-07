package com.type;

/*
 * 
 * 1 Supi	string  pattern: '(imsi-[0-9]{5,15}|nai-.+|.+)'
 *  Supi supi;
 * 2 NgApCause	 Uinteger	
 *   This represents the NG AP cause code values as specified in 3GPP TS 38.413 [12].
 *   NgApCause ngapCause;
 */
public class UEContextRelease {
	String supi;
	boolean unauthenticatedSupi;
	int ngapCause;
	public UEContextRelease(int ngapCause) {
		super();
		this.ngapCause = ngapCause;
	}
	public String getSupi() {
		return supi;
	}
	public void setSupi(String supi) {
		this.supi = supi;
	}
	public boolean isUnauthenticatedSupi() {
		return unauthenticatedSupi;
	}
	public void setUnauthenticatedSupi(boolean unauthenticatedSupi) {
		this.unauthenticatedSupi = unauthenticatedSupi;
	}
	public int getNgapCause() {
		return ngapCause;
	}
	public void setNgapCause(int ngapCause) {
		this.ngapCause = ngapCause;
	}
}
