package com.sam.design_patterns.builder;

public final class Hotel extends Accommodation {
	
	
	private Hotel() {
		
	}

	public Hotel(String name) {
		this.name=name;
	}

	public String toString() {
		StringBuffer display = new StringBuffer();
		display
		.append("****Accommodation Details****")
		.append(System.getProperty("line.separator"))
		.append("Hotel -> ")
		.append(this.name)
		.append(System.getProperty("line.separator"));
		 if(this.location>0) {
			 display
			 .append("Room No-> ")
			 .append(this.location);
		 }
		
		
		if(this.reservation!=null) {
			display
			.append(System.getProperty("line.separator"))
			.append(this.reservation);
		}
		return display.toString();

	}

}
