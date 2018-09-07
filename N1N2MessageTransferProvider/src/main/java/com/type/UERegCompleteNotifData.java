package com.type;

public class UERegCompleteNotifData {
	UeContextTransferStatus transferStatus;

	public UERegCompleteNotifData(UeContextTransferStatus transferStatus) {
		super();
		this.transferStatus = transferStatus;
	}

	public UeContextTransferStatus getTransferStatus() {
		return transferStatus;
	}

	public void setTransferStatus(UeContextTransferStatus transferStatus) {
		this.transferStatus = transferStatus;
	}
	
}	
