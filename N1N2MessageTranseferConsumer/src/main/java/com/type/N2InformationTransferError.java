package com.type;

public class N2InformationTransferError {
	ProblemDetails error;
	PWSErrorData pwsErrorInfo;
	public N2InformationTransferError(ProblemDetails error) {
		super();
		this.error = error;
	}
	public ProblemDetails getError() {
		return error;
	}
	public void setError(ProblemDetails error) {
		this.error = error;
	}
	public PWSErrorData getPwsErrorInfo() {
		return pwsErrorInfo;
	}
	public void setPwsErrorInfo(PWSErrorData pwsErrorInfo) {
		this.pwsErrorInfo = pwsErrorInfo;
	}
	
}
