package com.flightreservation.userservice.enity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
@EntityListeners(AuditListener.class)
public class User implements Auditable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Embedded
	private Name name;
	
	private int age;
	
	private String gender;

	private String email;

	@Embedded
	private Phone phone;

	@Embedded
	private Address address;

	private String username;

	private String password;

	@Embedded
	private Audit audit;

	private String status;

	private long deactivatedAt;

	private int deactivatedBy;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
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

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public Audit getAudit() {
		return audit;
	}

	@Override
	public void setAudit(Audit audit) {
		this.audit = audit;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public long getDeactivatedAt() {
		return deactivatedAt;
	}

	public void setDeactivatedAt(long deactivatedAt) {
		this.deactivatedAt = deactivatedAt;
	}

	public int getDeactivatedBy() {
		return deactivatedBy;
	}

	public void setDeactivatedBy(int deactivatedBy) {
		this.deactivatedBy = deactivatedBy;
	}

}
