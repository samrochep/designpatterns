package com.sam.design_patterns.builder;


import org.springframework.util.CollectionUtils;

import com.google.common.collect.Lists;
import com.sam.design_patterns.builder.Vacation.VacationBuilder;

public class CityVacationBuilder extends VacationBuilder {
    
	private Event event;
	
	@Override
	public VacationBuilder addTravel(String name) {
		this.travel = new Travel(name);
		return this;
	}

	@Override
	public VacationBuilder travelDuringTheYear(int year) {
		if(this.travel==null) {
			throw new IllegalStateException("You cannot reserve traval without giving travel name");
		}
		if(this.travel.reservation==null){
			this.travel.setReservation(new Reservation());
		}
		this.travel.getReservation().setYear(year);
		return this;
	}

	@Override
	public VacationBuilder travelDuringTheMonth(int month) {
		if(this.travel==null) {
			throw new IllegalStateException("You cannot reserve traval without giving travel name");
		}
		if(this.travel.reservation==null){
			this.travel.setReservation(new Reservation());
		}
		this.travel.getReservation().setMonth(month);
		return this;
	}

	@Override
	public VacationBuilder travelOnAday(int day) {
		if(this.travel==null) {
			throw new IllegalStateException("You cannot reserve traval without giving travel name");
		}
		if(this.travel.reservation==null){
			this.travel.setReservation(new Reservation());
		}
		this.travel.getReservation().setDay(day);
		return this;
	}

	@Override
	public VacationBuilder addAccommodation(String name) {
		this.accommodation = new Hotel(name);
		return this;
	}

	@Override
	public VacationBuilder bookAccoduringTheYear(int year) {
		if(this.accommodation==null) {
			throw new IllegalStateException("You cannot reserve accommodation without giving accommodation name");
		}
		if(this.accommodation.reservation==null){
			this.accommodation.setReservation(new Reservation());
		}
		this.accommodation.getReservation().setYear(year);
		return this;
	}

	@Override
	public VacationBuilder bookAccoduringTheMonth(int month) {
		if(this.accommodation==null) {
			throw new IllegalStateException("You cannot reserve accommodation without giving accommodation name");
		}
		if(this.accommodation.reservation==null){
			this.accommodation.setReservation(new Reservation());
		}
		this.accommodation.getReservation().setMonth(month);
		return this;	
	}

	@Override
	public VacationBuilder bookAccoOnAday(int day) {
		if(this.accommodation==null) {
			throw new IllegalStateException("You cannot reserve accommodation without giving accommodation name");
		}
		if(this.accommodation.reservation==null){
			this.accommodation.setReservation(new Reservation());
		}
		this.accommodation.getReservation().setDay(day);
		return this;
	}

	@Override
	public VacationBuilder noOfDaysOfStay(int days) {
		if(this.accommodation==null) {
			throw new IllegalStateException("You cannot reserve accommodation without giving accommodation name");
		}
		if(this.accommodation.reservation==null){
			this.accommodation.setReservation(new Reservation());
		}
		this.accommodation.getReservation().setNoOfDays(days);
		return this;
	}

	@Override
	public VacationBuilder atTheLocation(int location) {
		if(this.accommodation==null) {
			throw new IllegalStateException("You cannot reserve accommodation without giving accommodation name");
		}
		this.accommodation.setLocation(location);
		return this;
	}

	@Override
	public VacationBuilder addEvent(String name) {
		this.event = new Event(name);
		if(CollectionUtils.isEmpty(this.events)) {
			this.events=Lists.newArrayList();
		}
		this.events.add(this.event);
		return this;
	}

	@Override
	public VacationBuilder bookEventDuringTheYear(int year) {
		if(this.event==null) {
			throw new IllegalStateException("You cannot reserve for an event without giving event name");
		}
		if(this.event.reservation==null){
			this.event.setReservation(new Reservation());
		}
		this.event.getReservation().setYear(year);
		return this;
	}

	@Override
	public VacationBuilder bookEventDuringTheMonth(int month) {
		if(this.event==null) {
			throw new IllegalStateException("You cannot reserve for an event without giving event name");
		}
		if(this.event.reservation==null){
			this.event.setReservation(new Reservation());
		}
		this.event.getReservation().setMonth(month);
		return this;
	}

	@Override
	public VacationBuilder bookEventDOnADay(int day) {
		if(this.event==null) {
			throw new IllegalStateException("You cannot reserve for an event without giving event name");
		}
		if(this.event.reservation==null){
			this.event.setReservation(new Reservation());
		}
		this.event.getReservation().setDay(day);
		return this;
	}
	
}
