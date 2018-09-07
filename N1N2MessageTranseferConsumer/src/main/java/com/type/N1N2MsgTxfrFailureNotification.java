package com.type;

public class N1N2MsgTxfrFailureNotification {
	N1N2MessageTransferCause cause;
	String n1n2MsgDataUri;
	public N1N2MsgTxfrFailureNotification(N1N2MessageTransferCause cause, String n1n2MsgDataUri) {
		super();
		this.cause = cause;
		this.n1n2MsgDataUri = n1n2MsgDataUri;
	}
	public N1N2MessageTransferCause getCause() {
		return cause;
	}
	public void setCause(N1N2MessageTransferCause cause) {
		this.cause = cause;
	}
	public String getN1n2MsgDataUri() {
		return n1n2MsgDataUri;
	}
	public void setN1n2MsgDataUri(String n1n2MsgDataUri) {
		this.n1n2MsgDataUri = n1n2MsgDataUri;
	}
	
}
