package com.sam.design_patterns.builder;

public final class Tent extends Accommodation {

	private Tent() {

	}

	public Tent(String name) {
		this.name = name;
	}

	public String toString() {
		StringBuffer display = new StringBuffer();
		display
		.append("****Accommodation Details****")
		.append(System.getProperty("line.separator"))
		.append("Tent -> ")
		.append(this.name)
		.append(System.getProperty("line.separator"))
		.append("Site No-> ")
		.append(this.location);
		if(this.getReservation()!=null) {
			display
			.append(System.getProperty("line.separator"))
			.append(this.reservation);
		}
		return display.toString();

	}

}
