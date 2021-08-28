package com.sam.design_patterns.mediator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Alarm implements HouseEvent{
	
	@Autowired
	private Mediator mediator;
	
	private Boolean isAlarmOn=Boolean.FALSE;
	
	private String alarmString;

	@Override
	public void startEvent() {
		mediator.startAlarmEvent();
		triggerAlarm();
	}
	
	public Boolean isAlaramOn() {
		return this.isAlarmOn;
	}

	public String getAlarmString() {
		return alarmString;
	}

	public void setAlarm(String alarmString) {
		this.alarmString=alarmString;
	}
	

	private void triggerAlarm() {
		this.isAlarmOn=Boolean.TRUE;
	}

}
