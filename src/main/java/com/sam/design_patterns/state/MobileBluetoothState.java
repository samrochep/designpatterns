package com.sam.design_patterns.state;

import org.springframework.stereotype.Service;

@Service
public class MobileBluetoothState extends MobileState {

	@Override
	public void execute(MobileContext context) {
		this.mobileContext=context;
		executeBlueToothModeModeModeState();
	}
	
	private void executeBlueToothModeModeModeState() {
		System.out.println("Bluetooth mode");
		this.mobileContext.process();	
	}

}
