package com.flightreservation.reservationservice.entity;

import javax.persistence.Embeddable;

@Embeddable
public class Extras {

	private String specialNeeds;

	private boolean meal;

	private boolean assistance;

	public String getSpecialNeeds() {
		return specialNeeds;
	}

	public void setSpecialNeeds(String specialNeeds) {
		this.specialNeeds = specialNeeds;
	}

	public boolean isMeal() {
		return meal;
	}

	public void setMeal(boolean meal) {
		this.meal = meal;
	}

	public boolean isAssistance() {
		return assistance;
	}

	public void setAssistance(boolean assistance) {
		this.assistance = assistance;
	}

}
