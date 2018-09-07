package com.type;

import java.util.ArrayList;

public class N2InfoContainer {
	N2InformationClass n2InformationClass;
	ArrayList<N2SmInformation> smInfo;
	NrppaInformation nrppaInfo;
	PwsInformation pwsInfo;
	AreaOfValidity areaOfValidity;
	public N2InfoContainer(N2InformationClass n2InformationClass) {
		super();
		this.n2InformationClass = n2InformationClass;
	}
	public N2InformationClass getN2InformationClass() {
		return n2InformationClass;
	}
	public void setN2InformationClass(N2InformationClass n2InformationClass) {
		this.n2InformationClass = n2InformationClass;
	}
	public ArrayList<N2SmInformation> getSmInfo() {
		return smInfo;
	}
	public void setSmInfo(ArrayList<N2SmInformation> smInfo) {
		this.smInfo = smInfo;
	}
	public NrppaInformation getNrppaInfo() {
		return nrppaInfo;
	}
	public void setNrppaInfo(NrppaInformation nrppaInfo) {
		this.nrppaInfo = nrppaInfo;
	}
	public PwsInformation getPwsInfo() {
		return pwsInfo;
	}
	public void setPwsInfo(PwsInformation pwsInfo) {
		this.pwsInfo = pwsInfo;
	}
	public AreaOfValidity getAreaOfValidity() {
		return areaOfValidity;
	}
	public void setAreaOfValidity(AreaOfValidity areaOfValidity) {
		this.areaOfValidity = areaOfValidity;
	}
	
	
}
