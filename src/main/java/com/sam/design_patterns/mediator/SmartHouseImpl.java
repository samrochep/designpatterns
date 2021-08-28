package com.sam.design_patterns.mediator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SmartHouseImpl implements SmartHouse{
	
	@Autowired
	private Calendar calendar;

	@Autowired
	private CoffeeMaker coffeeMaker;

	@Autowired
	private Gym gym;
	
	@Autowired
	private Alarm alarm;
	
	@Autowired
	private Shower shower;
	
	@Autowired
	private HomeTheatre homeTheatre;

	@Override
	public void automate(String dayOfWeek) {
		calendar.setDayOfWeek(dayOfWeek);
		System.out.println("Day of the week=== "+dayOfWeek);
		alarm.startEvent();
		coffeeMaker.startEvent();
		gym.startEvent();
		shower.startEvent();
		homeTheatre.startEvent();
	}

}
