package com.flightreservation.userservice.enity;

public interface Auditable {

	public Audit getAudit();

	public void setAudit(Audit audit);

}
