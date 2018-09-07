package com.type;

public class SeafData {
	NgKsi ngKsi;
	String nh;
	short ncc;
	KeyAmf KeyAmf;
	boolean keyAmfChangeInd;
	//Input (FFS) Input (FFS);
	public SeafData(NgKsi ngKsi, String nh, short ncc, KeyAmf keyAmf) {
		super();
		this.ngKsi = ngKsi;
		this.nh = nh;
		this.ncc = ncc;
		KeyAmf = keyAmf;
	}
	public NgKsi getNgKsi() {
		return ngKsi;
	}
	public void setNgKsi(NgKsi ngKsi) {
		this.ngKsi = ngKsi;
	}
	public String getNh() {
		return nh;
	}
	public void setNh(String nh) {
		this.nh = nh;
	}
	public short getNcc() {
		return ncc;
	}
	public void setNcc(short ncc) {
		this.ncc = ncc;
	}
	public KeyAmf getKeyAmf() {
		return KeyAmf;
	}
	public void setKeyAmf(KeyAmf keyAmf) {
		KeyAmf = keyAmf;
	}
	public boolean isKeyAmfChangeInd() {
		return keyAmfChangeInd;
	}
	public void setKeyAmfChangeInd(boolean keyAmfChangeInd) {
		this.keyAmfChangeInd = keyAmfChangeInd;
	}
	
}
