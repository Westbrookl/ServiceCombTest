package com.type;



public class RegistrationContextContainer {
	UeContext ueContext;
	String localTimeZone;
	String anN2IPv4Address;
	String anN2IPv6Addr;
	AccessType anType;
	AllowedNssai allowedNssai;
	public RegistrationContextContainer(UeContext ueContext, AccessType anType) {
		super();
		this.ueContext = ueContext;
		this.anType = anType;
	}
	public UeContext getUeContext() {
		return ueContext;
	}
	public void setUeContext(UeContext ueContext) {
		this.ueContext = ueContext;
	}
	public String getLocalTimeZone() {
		return localTimeZone;
	}
	public void setLocalTimeZone(String localTimeZone) {
		this.localTimeZone = localTimeZone;
	}
	public String getAnN2IPv4Address() {
		return anN2IPv4Address;
	}
	public void setAnN2IPv4Address(String anN2IPv4Address) {
		this.anN2IPv4Address = anN2IPv4Address;
	}
	public String getAnN2IPv6Addr() {
		return anN2IPv6Addr;
	}
	public void setAnN2IPv6Addr(String anN2IPv6Addr) {
		this.anN2IPv6Addr = anN2IPv6Addr;
	}
	public AccessType getAnType() {
		return anType;
	}
	public void setAnType(AccessType anType) {
		this.anType = anType;
	}
	public AllowedNssai getAllowedNssai() {
		return allowedNssai;
	}
	public void setAllowedNssai(AllowedNssai allowedNssai) {
		this.allowedNssai = allowedNssai;
	}
	
	
}
