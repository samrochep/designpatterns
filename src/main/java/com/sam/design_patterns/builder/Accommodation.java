package com.sam.design_patterns.builder;

public abstract class Accommodation {
	
	protected String name;
	protected Reservation reservation;
	protected int location;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Reservation getReservation() {
		return this.reservation;
	}
	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}
	
	public Integer getLocation() {
		return location;
	}
	public void setLocation(Integer location) {
		this.location = location;
	}

}
