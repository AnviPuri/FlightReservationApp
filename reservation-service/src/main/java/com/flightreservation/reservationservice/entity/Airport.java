package com.flightreservation.reservationservice.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.OneToMany;

public class Airport {

	private int id;

	@Embedded
	private Address address;

	private String airportName;

	private String airportCode;

	@OneToMany(mappedBy = "airport", cascade = CascadeType.ALL)
	private Set<FlightRoster> flightRosters;

	// open /temporarily closed/closed
	private String status;

	private Audit audit;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getAirportName() {
		return airportName;
	}

	public void setAirportName(String airportName) {
		this.airportName = airportName;
	}

	public String getAirportCode() {
		return airportCode;
	}

	public void setAirportCode(String airportCode) {
		this.airportCode = airportCode;
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

}
