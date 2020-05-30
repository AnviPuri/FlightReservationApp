package com.flightreservation.reservationservice.entity;

import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class FlightRoster {

	private int id;

	@Id
	@ManyToOne
	@JoinColumn
	private Flight flight;

	@Id
	@ManyToOne
	@JoinColumn
	private Airport airport;

	private long depatureDate;

	private long arrivalDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public Airport getAirport() {
		return airport;
	}

	public void setAirport(Airport airport) {
		this.airport = airport;
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

}
