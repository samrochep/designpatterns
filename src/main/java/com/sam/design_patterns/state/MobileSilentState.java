package com.sam.design_patterns.state;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MobileSilentState extends MobileState {
    
	@Autowired
	private MobileState mobileDontDisturbState;
	
	@Override
	public void execute(MobileContext context) {
		this.mobileContext=context;
		executeSilentModeState();
	}
	
	private void executeSilentModeState() {
		System.out.println("Silent mode");
		this.mobileContext.process();
		System.out.println("After 10 mins..");
		this.mobileContext.setMobileState(mobileDontDisturbState);
		this.mobileContext.execute();
	}

}
