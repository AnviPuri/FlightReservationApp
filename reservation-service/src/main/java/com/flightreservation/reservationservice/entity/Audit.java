package com.flightreservation.reservationservice.entity;

import javax.persistence.Embeddable;

@Embeddable
public class Audit {

	private long createdAt;

	private long updatedAt;

	public long getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(long createdAt) {
		this.createdAt = createdAt;
	}

	public long getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(long updatedAt) {
		this.updatedAt = updatedAt;
	}

//ADD LATER
//refer https://vladmihalcea.com/how-to-emulate-createdby-and-lastmodifiedby-from-spring-data-using-the-generatortype-hibernate-annotation/
//    private int createdBy;
// 
//    private int updatedBy;

}
