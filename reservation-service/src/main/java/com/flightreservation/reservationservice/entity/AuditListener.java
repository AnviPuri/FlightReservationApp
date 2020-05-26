package com.flightreservation.reservationservice.entity;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

import com.flightreservation.userservice.utility.Utility;

public class AuditListener {

	@PrePersist
	public void setCreatedAt(Auditable auditable) {

		Audit audit = auditable.getAudit();
		if (audit == null) {
			audit = new Audit();
			auditable.setAudit(audit);
		}
		audit.setCreatedAt(Utility.getEpochTime());
//        audit.setCreatedBy(LoggedUser.get());
	}

	@PreUpdate
	public void setUpdatedOn(Auditable auditable) {

		Audit audit = auditable.getAudit();
		audit.setUpdatedAt(Utility.getEpochTime());
//		audit.setUpdatedBy(LoggedUser.get());
	}

}
