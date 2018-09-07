package com.type;

/*
 *  
 * NgRanIdentifier String  The string shall be formatted with following pattern: 
'							gNB-[A-Fa-f0-9]{6,8}|
 							Macro-[A-Fa-f0-9]{5}|
 							LMacro-[A-Fa-f0-9]{6}|
 							SMacro-[A-Fa-f0-9]{5}'
 */
public class NgRanTargetId {
	String ranNodeId;

	public NgRanTargetId(String ranNodeId) {
		super();
		this.ranNodeId = ranNodeId;
	}

	public String getRanNodeId() {
		return ranNodeId;
	}

	public void setRanNodeId(String ranNodeId) {
		this.ranNodeId = ranNodeId;
	}
	
}
