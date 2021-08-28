package com.sam.design_patterns.state;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MobileNormalState extends MobileState {
   
	@Autowired
	private MobileState mobileSilentState;
	
	@Override
	void execute(MobileContext context) {
		this.mobileContext=context;
		executeNormalStateModeState();
	}

	private void executeNormalStateModeState() {
		System.out.println("Normal State");
		this.mobileContext.process();	
		System.out.println("After 10 mins..");
		this.mobileContext.setMobileState(mobileSilentState);
		this.mobileContext.execute();
	}

}
