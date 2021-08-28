package com.sam.design_patterns.mediator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Shower implements HouseEvent {

	@Autowired
	private Mediator mediator;

	private Boolean isGeyserOn = Boolean.FALSE;

	@Override
	public void startEvent() {
		mediator.startShowerEvent();
	}

	public void switchOnGeyser() {
		this.isGeyserOn=Boolean.TRUE;
		System.out.println("Geyser is on");
	}

	public void automateShower() {
		switchOnLights();
		checkTempOfGeyser();
		switchOnShower();
	}
	public Boolean isGeyserON(){
		return this.isGeyserOn;
	}

	private void switchOnLights() {
		System.out.println("Shower Lights are on");
	}

	private void checkTempOfGeyser() {
		System.out.println("Geyser temp is good");

	}

	private void switchOnShower() {
		System.out.println("Shower is on");

	}

}
