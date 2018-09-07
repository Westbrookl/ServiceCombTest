package com.type;

/*  Ipv4Addr   String identifying a IPv4 address formatted in the "dotted decimal" notation as defined
 * in in IETF RFC 1166 [4]. In an OpenAPI Specification [3] schema,
 *  the format shall be designated as "Ipv4Addr".
 * Ipv6Addr  OpenAPI Specification [3] schema, the format shall be designated as "Ipv6Addr".
 * 
 */
public class N3gaLocation {
	Tai n3gppTai;
	String n3IwfId;
	String ueIpv4Addr;
	String ueIpv6Addr;
	short portNumber;
	public N3gaLocation(Tai n3gppTai, String n3IwfId) {
		super();
		this.n3gppTai = n3gppTai;
		this.n3IwfId = n3IwfId;
	}
	public String getUeIpv4Addr() {
		return ueIpv4Addr;
	}
	public void setUeIpv4Addr(String ueIpv4Addr) {
		this.ueIpv4Addr = ueIpv4Addr;
	}
	public String getUeIpv6Addr() {
		return ueIpv6Addr;
	}
	public void setUeIpv6Addr(String ueIpv6Addr) {
		this.ueIpv6Addr = ueIpv6Addr;
	}
	public short getPortNumber() {
		return portNumber;
	}
	public void setPortNumber(short portNumber) {
		this.portNumber = portNumber;
	}
	
}
