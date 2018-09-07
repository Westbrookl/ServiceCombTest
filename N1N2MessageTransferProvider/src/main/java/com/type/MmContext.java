package com.type;

import java.util.ArrayList;



public class MmContext {
	AccessType accessType;
	NasSecurityMode nasSecurityMode;
	int nasDownlinkCount;
	int nasUplinkCount;
	byte[] gmmCapability;
	MobilityRestrictions mobilityRestrictions;
	byte[] ueSecurityCapability;
	byte[] s1UeNetworkCapability;
	ArrayList<Snssai> allowedNssai;
	ArrayList<NssaiMapping> nssaiMapping;
	ArrayList<String>  nsInstances;
	public MmContext(AccessType accessType) {
		super();
		this.accessType = accessType;
	}
	public AccessType getAccessType() {
		return accessType;
	}
	public void setAccessType(AccessType accessType) {
		this.accessType = accessType;
	}
	public NasSecurityMode getNasSecurityMode() {
		return nasSecurityMode;
	}
	public void setNasSecurityMode(NasSecurityMode nasSecurityMode) {
		this.nasSecurityMode = nasSecurityMode;
	}
	public int getNasDownlinkCount() {
		return nasDownlinkCount;
	}
	public void setNasDownlinkCount(int nasDownlinkCount) {
		this.nasDownlinkCount = nasDownlinkCount;
	}
	public int getNasUplinkCount() {
		return nasUplinkCount;
	}
	public void setNasUplinkCount(int nasUplinkCount) {
		this.nasUplinkCount = nasUplinkCount;
	}
	public byte[] getGmmCapability() {
		return gmmCapability;
	}
	public void setGmmCapability(byte[] gmmCapability) {
		this.gmmCapability = gmmCapability;
	}
	public MobilityRestrictions getMobilityRestrictions() {
		return mobilityRestrictions;
	}
	public void setMobilityRestrictions(MobilityRestrictions mobilityRestrictions) {
		this.mobilityRestrictions = mobilityRestrictions;
	}
	public byte[] getUeSecurityCapability() {
		return ueSecurityCapability;
	}
	public void setUeSecurityCapability(byte[] ueSecurityCapability) {
		this.ueSecurityCapability = ueSecurityCapability;
	}
	public byte[] getS1UeNetworkCapability() {
		return s1UeNetworkCapability;
	}
	public void setS1UeNetworkCapability(byte[] s1UeNetworkCapability) {
		this.s1UeNetworkCapability = s1UeNetworkCapability;
	}
	public ArrayList<Snssai> getAllowedNssai() {
		return allowedNssai;
	}
	public void setAllowedNssai(ArrayList<Snssai> allowedNssai) {
		this.allowedNssai = allowedNssai;
	}
	public ArrayList<NssaiMapping> getNssaiMapping() {
		return nssaiMapping;
	}
	public void setNssaiMapping(ArrayList<NssaiMapping> nssaiMapping) {
		this.nssaiMapping = nssaiMapping;
	}
	public ArrayList<String> getNsInstances() {
		return nsInstances;
	}
	public void setNsInstances(ArrayList<String> nsInstances) {
		this.nsInstances = nsInstances;
	}
	
}
