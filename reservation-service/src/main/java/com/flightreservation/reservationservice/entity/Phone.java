package com.flightreservation.reservationservice.entity;

import javax.persistence.Embeddable;

@Embeddable
public class Phone {

	private String countryCode;

	private String areaCode;

	private String subsciberNumber;

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getSubsciberNumber() {
		return subsciberNumber;
	}

	public void setSubsciberNumber(String subsciberNumber) {
		this.subsciberNumber = subsciberNumber;
	}

}
