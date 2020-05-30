package com.flightreservation.reservationservice.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;

public class Flight {

	// Decide how to include seats at every airport and decide how to calculate fare
	// for different classes - economy , business, etc

	private int id;

	private String operatingAirline;

	private String flightNumber;

	// mamy to many with airport - will consist both arrival and departure airport -
	// arrival or departure time can be set to 0 accordingly
	// duration to be caluclated in business logic
	// this will help in getting the schedule
	@OneToMany(mappedBy = "flight", cascade = CascadeType.ALL)
	private Set<FlightRoster> flightRosters;

	// active / inactive
	private String status;

	private Audit audit;

	private long depatureDate;

	private long arrivalDate;

	private long inactivatedAt;

	private int inactivatedBy;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOperatingAirline() {
		return operatingAirline;
	}

	public void setOperatingAirline(String operatingAirline) {
		this.operatingAirline = operatingAirline;
	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public Set<FlightRoster> getFlightRoster() {
		return flightRosters;
	}

	public void setFlightRoster(Set<FlightRoster> flightRosters) {
		this.flightRosters = flightRosters;
	}

	public Set<FlightRoster> getFlightRosters() {
		return flightRosters;
	}

	public void setFlightRosters(Set<FlightRoster> flightRosters) {
		this.flightRosters = flightRosters;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Audit getAudit() {
		return audit;
	}

	public void setAudit(Audit audit) {
		this.audit = audit;
	}

	public long getDepatureDate() {
		return depatureDate;
	}

	public void setDepatureDate(long depatureDate) {
		this.depatureDate = depatureDate;
	}

	public long getArrivalDate() {
		return arrivalDate;
	}

	public void setArrivalDate(long arrivalDate) {
		this.arrivalDate = arrivalDate;
	}

	public long getInactivatedAt() {
		return inactivatedAt;
	}

	public void setInactivatedAt(long inactivatedAt) {
		this.inactivatedAt = inactivatedAt;
	}

	public int getInactivatedBy() {
		return inactivatedBy;
	}

	public void setInactivatedBy(int inactivatedBy) {
		this.inactivatedBy = inactivatedBy;
	}

}
