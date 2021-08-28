package com.sam.design_patterns.mediator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Gym implements HouseEvent {
	
	@Autowired
	private Mediator mediator;
	
	private Boolean isGymEventCompleted = Boolean.FALSE;

	@Override
	public void startEvent() {
		mediator.startGymEvent();

	}
	public void gymEventIsCompleted() {
		this.isGymEventCompleted=Boolean.TRUE;
	}
	
	public Boolean isGymEventCompleted() {
		return this.isGymEventCompleted;
	}
	
	public void automateGym() {
		switchOnLights();
		switchOnAc();	
	}

	private void switchOnLights() {
		System.out.println("Gym Lights are on");
	}

	private void switchOnAc() {
		System.out.println("Gym AC is swictched on");
	}

}
