package com.sam.design_patterns.command;

public class Ac extends Receiver {
	
    Ac(String location) {
		this.location=location;
	}
	
    @Override
	public void on() {
		System.out.println(location+" Ac is switched on");
	}
	
    @Override
    public void off() {
    	System.out.println(location+" Ac is switched off");
	}
    
    public void setTemperature() {
    	
    }

}
