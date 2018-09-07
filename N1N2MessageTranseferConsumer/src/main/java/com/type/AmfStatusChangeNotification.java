package com.type;

public class AmfStatusChangeNotification {
	AmfStatusInfo amfStatusInfo;

	public AmfStatusChangeNotification(AmfStatusInfo amfStatusInfo) {
		super();
		this.amfStatusInfo = amfStatusInfo;
	}

	public AmfStatusInfo getAmfStatusInfo() {
		return amfStatusInfo;
	}

	public void setAmfStatusInfo(AmfStatusInfo amfStatusInfo) {
		this.amfStatusInfo = amfStatusInfo;
	}
	
}	
