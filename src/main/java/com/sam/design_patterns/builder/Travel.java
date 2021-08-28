package com.sam.design_patterns.builder;

import org.springframework.util.CollectionUtils;

public class Travel {
	
	protected String name;
	protected Reservation reservation;
	
	public Travel(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
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
	
	public String toString() {
		StringBuffer display = new StringBuffer();
		display.append("****Travel Details****")
		 .append(System.getProperty("line.separator"))
		 .append("Travel By ")
		 .append(this.name);
		if(this.reservation!=null) {
			display.
			append(System.getProperty("line.separator"))
			.append(this.reservation);
		}
		return display.toString();

	}

}
