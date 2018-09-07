package com.type;

import java.util.ArrayList;

public class AllowedNssai {
	ArrayList<AllowedNssai> allowedSNssai;

	public AllowedNssai(ArrayList<AllowedNssai> allowedSNssai) {
		super();
		this.allowedSNssai = allowedSNssai;
	}

	public ArrayList<AllowedNssai> getAllowedSNssai() {
		return allowedSNssai;
	}

	public void setAllowedSNssai(ArrayList<AllowedNssai> allowedSNssai) {
		this.allowedSNssai = allowedSNssai;
	}
	
}
