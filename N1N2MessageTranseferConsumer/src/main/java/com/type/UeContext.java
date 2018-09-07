package com.type;

import java.util.ArrayList;

public class UeContext {
	String supi;
	boolean supiUnauthInd;
	ArrayList<String> gpsi;
	String pei;
	ArrayList<String> groups;
	byte[] drxParameter;
	int subRfsp;
	int  usedRfsp;
	SmsSupport smsSupport;
	String smsfId;
	SeafData seafData;
	String pcfId;
	String hpcfId;
	ArrayList<AmfEventSubscription> eventSubscriptions;//6.2.6.2.2	Type: AmfEventSubscription
	ArrayList<MmContext> mmContexts;
	ArrayList<PduSessionContext> sessionContexts;
	public UeContext(SmsSupport smsSupport) {
		super();
		this.smsSupport = smsSupport;
	}
	public String getSupi() {
		return supi;
	}
	public void setSupi(String supi) {
		this.supi = supi;
	}
	public boolean isSupiUnauthInd() {
		return supiUnauthInd;
	}
	public void setSupiUnauthInd(boolean supiUnauthInd) {
		this.supiUnauthInd = supiUnauthInd;
	}
	public ArrayList<String> getGpsi() {
		return gpsi;
	}
	public void setGpsi(ArrayList<String> gpsi) {
		this.gpsi = gpsi;
	}
	public String getPei() {
		return pei;
	}
	public void setPei(String pei) {
		this.pei = pei;
	}
	public ArrayList<String> getGroups() {
		return groups;
	}
	public void setGroups(ArrayList<String> groups) {
		this.groups = groups;
	}
	public byte[] getDrxParameter() {
		return drxParameter;
	}
	public void setDrxParameter(byte[] drxParameter) {
		this.drxParameter = drxParameter;
	}
	public int getSubRfsp() {
		return subRfsp;
	}
	public void setSubRfsp(int subRfsp) {
		this.subRfsp = subRfsp;
	}
	public int getUsedRfsp() {
		return usedRfsp;
	}
	public void setUsedRfsp(int usedRfsp) {
		this.usedRfsp = usedRfsp;
	}
	public SmsSupport getSmsSupport() {
		return smsSupport;
	}
	public void setSmsSupport(SmsSupport smsSupport) {
		this.smsSupport = smsSupport;
	}
	public String getSmsfId() {
		return smsfId;
	}
	public void setSmsfId(String smsfId) {
		this.smsfId = smsfId;
	}
	public SeafData getSeafData() {
		return seafData;
	}
	public void setSeafData(SeafData seafData) {
		this.seafData = seafData;
	}
	public String getPcfId() {
		return pcfId;
	}
	public void setPcfId(String pcfId) {
		this.pcfId = pcfId;
	}
	public String getHpcfId() {
		return hpcfId;
	}
	public void setHpcfId(String hpcfId) {
		this.hpcfId = hpcfId;
	}
	public ArrayList<AmfEventSubscription> getEventSubscriptions() {
		return eventSubscriptions;
	}
	public void setEventSubscriptions(ArrayList<AmfEventSubscription> eventSubscriptions) {
		this.eventSubscriptions = eventSubscriptions;
	}
	public ArrayList<MmContext> getMmContexts() {
		return mmContexts;
	}
	public void setMmContexts(ArrayList<MmContext> mmContexts) {
		this.mmContexts = mmContexts;
	}
	public ArrayList<PduSessionContext> getSessionContexts() {
		return sessionContexts;
	}
	public void setSessionContexts(ArrayList<PduSessionContext> sessionContexts) {
		this.sessionContexts = sessionContexts;
	}
	
}
