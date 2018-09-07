package com.type;

/*
 * NgapCause integer
 * 
 */
public class UeContextCreateError {
	ProblemDetails error;
	int ngapCause;
	public UeContextCreateError(ProblemDetails error) {
		super();
		this.error = error;
	}
	public ProblemDetails getError() {
		return error;
	}
	public void setError(ProblemDetails error) {
		this.error = error;
	}
	public int getNgapCause() {
		return ngapCause;
	}
	public void setNgapCause(int ngapCause) {
		this.ngapCause = ngapCause;
	}
	
}
