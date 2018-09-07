package com.type;

public class AssignEbiError {
	ProblemDetails error;
	AssignEbiFailed failureDetails;
	public AssignEbiError(ProblemDetails error, AssignEbiFailed failureDetails) {
		super();
		this.error = error;
		this.failureDetails = failureDetails;
	}
	public ProblemDetails getError() {
		return error;
	}
	public void setError(ProblemDetails error) {
		this.error = error;
	}
	public AssignEbiFailed getFailureDetails() {
		return failureDetails;
	}
	public void setFailureDetails(AssignEbiFailed failureDetails) {
		this.failureDetails = failureDetails;
	}
	
}
