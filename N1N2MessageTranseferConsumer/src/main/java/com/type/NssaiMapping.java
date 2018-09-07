package com.type;


public class NssaiMapping {
	Snssai mappedSnssai;
	Snssai hSnssai;
	public NssaiMapping(Snssai mappedSnssai, Snssai hSnssai) {
		super();
		this.mappedSnssai = mappedSnssai;
		this.hSnssai = hSnssai;
	}
	public Snssai getMappedSnssai() {
		return mappedSnssai;
	}
	public void setMappedSnssai(Snssai mappedSnssai) {
		this.mappedSnssai = mappedSnssai;
	}
	public Snssai gethSnssai() {
		return hSnssai;
	}
	public void sethSnssai(Snssai hSnssai) {
		this.hSnssai = hSnssai;
	}
	
}
