package com.sam.design_patterns.builder;

public class Event {
	
	protected String name;
	protected Reservation reservation;
	
	public Event(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Reservation getReservation() {
		return reservation;
	}
	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}
	public String toString() {
		StringBuffer display = new StringBuffer();
		display
		  .append("Event-> ")
		  .append(this.name);
		if(this.reservation!=null) {
			display.
			append(System.getProperty("line.separator"))
			.append(this.reservation);
		}
		return display.toString();

	}

}
