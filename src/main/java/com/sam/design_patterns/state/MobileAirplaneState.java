package com.sam.design_patterns.state;

import org.springframework.stereotype.Service;

@Service
public class MobileAirplaneState extends MobileState {

	@Override
	public void execute(MobileContext context) {
		this.mobileContext=context;
		executeAirplaneModeModeState();
	}
	
	private void executeAirplaneModeModeState() {
		System.out.println("Airplane mode");
		this.mobileContext.process();	
	}

}
