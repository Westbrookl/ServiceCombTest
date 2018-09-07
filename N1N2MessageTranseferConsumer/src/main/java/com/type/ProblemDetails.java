package com.type;

import java.util.ArrayList;

public class ProblemDetails {
	String type;//Uri
	String title;
	int status;
	String detail;
	String instance;//String providing an URI formatted according to 
	String cause;
	ArrayList<InvalidParam> invalidParams;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public String getInstance() {
		return instance;
	}
	public void setInstance(String instance) {
		this.instance = instance;
	}
	public String getCause() {
		return cause;
	}
	public void setCause(String cause) {
		this.cause = cause;
	}
	public ArrayList<InvalidParam> getInvalidParams() {
		return invalidParams;
	}
	public void setInvalidParams(ArrayList<InvalidParam> invalidParams) {
		this.invalidParams = invalidParams;
	}
}
