package com.sam.design_patterns.state;

import org.springframework.stereotype.Service;

@Service
public class MobileNightState extends MobileState {

	@Override
	public void execute(MobileContext context) {
		this.mobileContext=context;
		executeNightModeState();
	}
	
	private void executeNightModeState() {
		System.out.println("Night mode");
		this.mobileContext.process();	
	}

}
