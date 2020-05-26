package com.flightreservation.reservationservice.entity;

public interface Auditable {

	public Audit getAudit();

	public void setAudit(Audit audit);

}
