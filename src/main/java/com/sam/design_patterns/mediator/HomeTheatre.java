package com.sam.design_patterns.mediator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HomeTheatre implements HouseEvent {
	
	@Autowired
	private Mediator mediator;
	
	@Override
	public void startEvent() {
		mediator.startHomeTheatreEvent();
	}
	
	public void switchOnPopcornPopper(){
		System.out.println("Popcorn popper is on");
	}

	public void automateHomeTheatre() {
		switchOnLights();
		switchOnAc();
		UpScreen();
		switchOnProjector();
	}

	private void switchOnLights() {
		System.out.println("Home theatre Lights are on");
	}

	private void switchOnAc() {
		System.out.println("Home theatre is switched on");
	}
	
	private void UpScreen() {
		System.out.println("Home theatre screen is up");
	}
	private void switchOnProjector() {
		System.out.println("Projector is on");
	}

	

}
