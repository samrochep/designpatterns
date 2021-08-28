package com.sam.design_patterns.mediator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CoffeeMaker implements HouseEvent {
	
	@Autowired
	private Mediator mediator;
	
	private Boolean isCoffeeReady = Boolean.FALSE;

	@Override
	public void startEvent() {
		mediator.startCofferMakerEvent();
	}
	
	public Boolean isCoffeeReady() {
		return this.isCoffeeReady;
	}

	public void makeCoffee() {
		this.isCoffeeReady = Boolean.TRUE;
		System.out.println("Coffee is ready");
	}

}
