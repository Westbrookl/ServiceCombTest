package com.type;


public class N1MessageNotification {
	String n1NotifySubscriptionId;
	N1MessageContainer n1MessageContainer;
	CorelationID lcsCorrelationId;
	RegistrationContextContainer registrationCtxtContainer;
	public N1MessageNotification(String n1NotifySubscriptionId, N1MessageContainer n1MessageContainer) {
		super();
		this.n1NotifySubscriptionId = n1NotifySubscriptionId;
		this.n1MessageContainer = n1MessageContainer;
	}
	public String getN1NotifySubscriptionId() {
		return n1NotifySubscriptionId;
	}
	public void setN1NotifySubscriptionId(String n1NotifySubscriptionId) {
		this.n1NotifySubscriptionId = n1NotifySubscriptionId;
	}
	public N1MessageContainer getN1MessageContainer() {
		return n1MessageContainer;
	}
	public void setN1MessageContainer(N1MessageContainer n1MessageContainer) {
		this.n1MessageContainer = n1MessageContainer;
	}
	public CorelationID getLcsCorrelationId() {
		return lcsCorrelationId;
	}
	public void setLcsCorrelationId(CorelationID lcsCorrelationId) {
		this.lcsCorrelationId = lcsCorrelationId;
	}
	public RegistrationContextContainer getRegistrationCtxtContainer() {
		return registrationCtxtContainer;
	}
	public void setRegistrationCtxtContainer(RegistrationContextContainer registrationCtxtContainer) {
		this.registrationCtxtContainer = registrationCtxtContainer;
	}
	
}
