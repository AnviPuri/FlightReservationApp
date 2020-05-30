package com.flightreservation.reservationservice.entity;

import javax.persistence.Embedded;

public class Passenger {

	private int id;

	// a reservation can have many passengers - one to many
	private Reservation reservation;

	@Embedded
	private Name name;

	private int age;

	private String gender;

	private String email;

	@Embedded
	private Phone phone;

	@Embedded
	private Address address;

	@Embedded
	private Extras extras;

	@Embedded
	private Audit audit;

	//cancelled/ booked
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

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Phone getPhone() {
		return phone;
	}

	public void setPhone(Phone phone) {
		this.phone = phone;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Extras getExtras() {
		return extras;
	}

	public void setExtras(Extras extras) {
		this.extras = extras;
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
