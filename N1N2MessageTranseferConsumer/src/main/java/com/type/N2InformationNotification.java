package com.type;

public class N2InformationNotification {
	String n2NotifySubscriptionId;
	N2InfoContainer n2InfoContainer;
	CorelationID lcsCorrelationId;
	public N2InformationNotification(String n2NotifySubscriptionId, N2InfoContainer n2InfoContainer) {
		super();
		this.n2NotifySubscriptionId = n2NotifySubscriptionId;
		this.n2InfoContainer = n2InfoContainer;
	}
	public String getN2NotifySubscriptionId() {
		return n2NotifySubscriptionId;
	}
	public void setN2NotifySubscriptionId(String n2NotifySubscriptionId) {
		this.n2NotifySubscriptionId = n2NotifySubscriptionId;
	}
	public N2InfoContainer getN2InfoContainer() {
		return n2InfoContainer;
	}
	public void setN2InfoContainer(N2InfoContainer n2InfoContainer) {
		this.n2InfoContainer = n2InfoContainer;
	}
	public CorelationID getLcsCorrelationId() {
		return lcsCorrelationId;
	}
	public void setLcsCorrelationId(CorelationID lcsCorrelationId) {
		this.lcsCorrelationId = lcsCorrelationId;
	}
	
}
