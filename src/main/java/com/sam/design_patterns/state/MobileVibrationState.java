package com.sam.design_patterns.state;

import org.springframework.stereotype.Service;

@Service
public class MobileVibrationState extends MobileState {

	@Override
	public void execute(MobileContext context) {
		this.mobileContext=context;
		executeVibrationModeState();
	}
	
	private void executeVibrationModeState() {
		System.out.println("Vibration mode");
		this.mobileContext.process();	
	}

}
