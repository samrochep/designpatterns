/*package com.sam.design_patterns.builder;

import java.util.List;

public abstract class VacationBuilder {
	
	protected Travel travel;
	protected Accommodation accommodation;
	protected List<Event> events;
	
	public abstract VacationBuilder addTravel(String name);
	public abstract VacationBuilder travelDuringTheYear(int year);
	public abstract VacationBuilder travelDuringTheMonth(int month);
	public abstract VacationBuilder travelOnAday(int day);
	
	public abstract VacationBuilder addAccommodation(String name);
	public abstract VacationBuilder bookAccoduringTheYear(int year);
	public abstract VacationBuilder bookAccoduringTheMonth(int month);
	public abstract VacationBuilder bookAccoOnAday(int day);
	public abstract VacationBuilder noOfDaysOfStay(int days);
	public abstract VacationBuilder atTheLocation(int location);
	
	public abstract VacationBuilder addEvent(String name);
	public abstract VacationBuilder bookEventDuringTheYear(int year);
	public abstract VacationBuilder bookEventDuringTheMonth(int month);
	public abstract VacationBuilder bookEventDOnADay(int day);
	

	public Vacation getVacation() {
		Vacation vacation = new Vacation();
		vacation.setTravel(this.travel);
		vacation.setAccommodation(this.accommodation);
		vacation.setEvents(this.events);
		return vacation;
	}

}
*/