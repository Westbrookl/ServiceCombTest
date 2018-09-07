package com.type;

public class AmfStatusInfo {
	Guami guamis;
	StatusChange statusChange;
	AmfName targetamfName;
	public AmfStatusInfo(Guami guamis, StatusChange statusChange) {
		super();
		this.guamis = guamis;
		this.statusChange = statusChange;
	}
	public Guami getGuamis() {
		return guamis;
	}
	public void setGuamis(Guami guamis) {
		this.guamis = guamis;
	}
	public StatusChange getStatusChange() {
		return statusChange;
	}
	public void setStatusChange(StatusChange statusChange) {
		this.statusChange = statusChange;
	}
	public AmfName getTargetamfName() {
		return targetamfName;
	}
	public void setTargetamfName(AmfName targetamfName) {
		this.targetamfName = targetamfName;
	}
	
}
