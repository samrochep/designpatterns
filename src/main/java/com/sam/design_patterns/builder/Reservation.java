package com.sam.design_patterns.builder;

public class Reservation {
	

	private int year;
	private int month;
	private int day;
	private int noOfDays;
	
    public int getNoOfDays() {
		return noOfDays;
	}

	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}
	
	private Boolean isDateEmpty() {
		return (this.year<0 && this.month<0 && this.day<0);
	}
	
	public String toString() {
		if(!isDateEmpty()) {
			StringBuffer display = new StringBuffer();
			display
			 .append("On ")
			 .append(this.year>0?this.year:"NA")
			 .append("-")
			 .append(this.month>0?this.month:"NA")
			 .append("-")
			 .append(this.day>0?this.day:"NA")
			 .append(System.getProperty("line.separator"));
			 if(this.noOfDays>0) {
				 display
				  .append("for ")
				  .append(this.noOfDays);
			 }
			 
			 
			return display.toString();
		}
        return "";
	}



}
