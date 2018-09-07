package com.type;

public class NasSecurityMode {
	IntegrityAlgorithm integrityAlgorithm;
	CipheringAlgorithm cipheringAlgorithm;
	public NasSecurityMode(IntegrityAlgorithm integrityAlgorithm, CipheringAlgorithm cipheringAlgorithm) {
		super();
		this.integrityAlgorithm = integrityAlgorithm;
		this.cipheringAlgorithm = cipheringAlgorithm;
	}
	public IntegrityAlgorithm getIntegrityAlgorithm() {
		return integrityAlgorithm;
	}
	public void setIntegrityAlgorithm(IntegrityAlgorithm integrityAlgorithm) {
		this.integrityAlgorithm = integrityAlgorithm;
	}
	public CipheringAlgorithm getCipheringAlgorithm() {
		return cipheringAlgorithm;
	}
	public void setCipheringAlgorithm(CipheringAlgorithm cipheringAlgorithm) {
		this.cipheringAlgorithm = cipheringAlgorithm;
	}
	
	
}
