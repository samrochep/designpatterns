package com.sam.design_patterns.state;

import org.springframework.stereotype.Service;

@Service
public class MobileDontDisturbState extends MobileState {

	@Override
	public void execute(MobileContext context) {
		this.mobileContext=context;
		executeDontDisturbModeModeState();
	}
	
	private void executeDontDisturbModeModeState() {
		System.out.println("DO not disturb mode");
		this.mobileContext.process();	
		
	}

}
