package com.flightreservation.userservice.enity;

import java.util.Date;

import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

public class AuditListener {

	@PrePersist
	public void setCreatedAt(Auditable auditable) {

		Audit audit = auditable.getAudit();
		if (audit == null) {
			audit = new Audit();
			auditable.setAudit(audit);
		}
		audit.setCreatedAt(getEpochTime());
//        audit.setCreatedBy(LoggedUser.get());
	}

	@PreUpdate
	public void setUpdatedOn(Auditable auditable) {

		Audit audit = auditable.getAudit();
		audit.setUpdatedAt(getEpochTime());
//		audit.setUpdatedBy(LoggedUser.get());
	}

	private long getEpochTime() {
		Date currentDate = new Date();
		long epochTime = currentDate.getTime() / 1000;
		return epochTime;
	}

}
