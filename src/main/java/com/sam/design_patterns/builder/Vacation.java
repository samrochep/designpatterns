package com.sam.design_patterns.builder;

import java.util.List;

import org.springframework.util.CollectionUtils;

public final class Vacation {

	private Travel travel;
	private Accommodation accommodation;
	private List<Event> events;

	private Vacation() {

	}

	public static abstract class VacationBuilder {

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

	public Travel getTravel() {
		return travel;
	}

	public void setTravel(Travel travel) {
		this.travel = travel;
	}

	public Accommodation getAccommodation() {
		return accommodation;
	}

	public void setAccommodation(Accommodation accommodation) {
		this.accommodation = accommodation;
	}

	public List<Event> getEvents() {
		return events;
	}

	public void setEvents(List<Event> events) {
		this.events = events;
	}

	public String toString() {
		StringBuffer display = new StringBuffer();
		if (this.travel != null) {
			display.
			 append(System.getProperty("line.separator"))
			.append(this.travel);
		}
		if (this.accommodation != null) {
			display.append(this.accommodation).append(System.getProperty("line.separator"));
		}
		if (!CollectionUtils.isEmpty(this.events)) {
			display.append(System.getProperty("line.separator")).append("****Event Details****");
			for (Event event : events) {
				display.append(System.getProperty("line.separator")).append(event);
			}
		}
		return display.toString();

	}

}
