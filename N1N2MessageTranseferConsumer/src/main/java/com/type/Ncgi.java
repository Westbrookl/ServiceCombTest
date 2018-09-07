package com.type;

/*`		NrCellId nrCellId;
 *      NrCellId:
      	type: string
      	pattern: '^[A-Fa-f0-9]{9}$'
 */
public class Ncgi {
	PlmnId plmnId;
	String nrCellId;
	public Ncgi(PlmnId plmnId, String nrCellId) {
		super();
		this.plmnId = plmnId;
		this.nrCellId = nrCellId;
	}
	public PlmnId getPlmnId() {
		return plmnId;
	}
	public void setPlmnId(PlmnId plmnId) {
		this.plmnId = plmnId;
	}
	public String getNrCellId() {
		return nrCellId;
	}
	public void setNrCellId(String nrCellId) {
		this.nrCellId = nrCellId;
	}	
	
}
