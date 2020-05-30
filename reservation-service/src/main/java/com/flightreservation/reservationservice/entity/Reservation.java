
package com.flightreservation.reservationservice.entity;

import java.util.List;

public class Reservation {

	private int id;

	private int userId;

	// many to one with passenger
	private List<Passenger> passengers;

	// one to one with flight
	private Flight flightId;

	private Audit audit;

	private String status;

	private long cancelledAt;

	private int cancelledBy;

	private String cancellationReason;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public List<Passenger> getPassengers() {
		return passengers;
	}

	public void setPassengers(List<Passenger> passengers) {
		this.passengers = passengers;
	}

	public Flight getFlightId() {
		return flightId;
	}

	public void setFlightId(Flight flightId) {
		this.flightId = flightId;
	}

	public Audit getAudit() {
		return audit;
	}

	public void setAudit(Audit audit) {
		this.audit = audit;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public long getCancelledAt() {
		return cancelledAt;
	}

	public void setCancelledAt(long cancelledAt) {
		this.cancelledAt = cancelledAt;
	}

	public int getCancelledBy() {
		return cancelledBy;
	}

	public void setCancelledBy(int cancelledBy) {
		this.cancelledBy = cancelledBy;
	}

	public String getCancellationReason() {
		return cancellationReason;
	}

	public void setCancellationReason(String cancellationReason) {
		this.cancellationReason = cancellationReason;
	}

}
