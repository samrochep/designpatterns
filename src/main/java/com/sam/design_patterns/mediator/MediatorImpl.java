package com.sam.design_patterns.mediator;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MediatorImpl implements Mediator{
	
	@Autowired
	private Calendar calendar;
	
	@Autowired
	private Alarm alarm;

	@Autowired
	private CoffeeMaker coffeeMaker;

	@Autowired
	private Gym gym;
	
	@Autowired
	private Shower shower;
	
	@Autowired
	private HomeTheatre homeTheatre;

	@Override
	public void startAlarmEvent() {
		if(StringUtils.equals(calendar.getTypeOfDay(),"WEEKEND")) {
			alarm.setAlarm("Set the alaram at 11 AM");
			System.out.println(alarm.getAlarmString());
			shower.switchOnGeyser();
		}
		if(StringUtils.equals(calendar.getTypeOfDay(),"NORMALDAY")) {
			alarm.setAlarm("Set the alaram at 7 AM");
			System.out.println(alarm.getAlarmString());
		}
		if(StringUtils.equals(calendar.getTypeOfDay(),"BUSYDAY")) {
			alarm.setAlarm("Set the alaram at 6 AM");
			System.out.println(alarm.getAlarmString());
		}
	}

	@Override
	public void startCofferMakerEvent() {
		if(!calendar.isWeekend() && alarm.isAlaramOn()) {
			if(calendar.isBusyDay()) {
				shower.switchOnGeyser();
			}
			coffeeMaker.makeCoffee();
		}
	}

	@Override
	public void startGymEvent() {
		if(calendar.isNormalDay() && coffeeMaker.isCoffeeReady()) {
			gym.automateGym();
			shower.switchOnGeyser();
			alarm.setAlarm("Set the alarm after 1 hr of workout");
			System.out.println(alarm.getAlarmString());
			gym.gymEventIsCompleted();
		}
	}

	@Override
	public void startShowerEvent() {
		if (((calendar.isWeekend() && alarm.isAlaramOn()) || (calendar.isNormalDay() && gym.isGymEventCompleted())
				|| (calendar.isBusyDay() && coffeeMaker.isCoffeeReady())) && shower.isGeyserON()) {
			if(calendar.isWeekend()) {
				homeTheatre.switchOnPopcornPopper();
			}
			shower.automateShower();
		}
	}

	@Override
	public void startHomeTheatreEvent() {
		if(calendar.isWeekend() && this.alarm.isAlaramOn()) {
			homeTheatre.automateHomeTheatre();
		}
	}

}
