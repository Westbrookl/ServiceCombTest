package com.type;

public class N1N2MessageTransferError {
	ProblemDetails error;
	N2N2MsgTxfrErrDetail errInfo;
	public N1N2MessageTransferError(ProblemDetails error) {
		super();
		this.error = error;
	}
	public ProblemDetails getError() {
		return error;
	}
	public void setError(ProblemDetails error) {
		this.error = error;
	}
	public N2N2MsgTxfrErrDetail getErrInfo() {
		return errInfo;
	}
	public void setErrInfo(N2N2MsgTxfrErrDetail errInfo) {
		this.errInfo = errInfo;
	}
	
}
