package com.sam.design_patterns.command;

public class Light extends Receiver{

	
	Light(String location) {
		this.location=location;
	}
	
	@Override
	public void on() {
		System.out.println(location+" light is switched on");
	}
	
	@Override
    public void off() {
    	System.out.println(location+" light is switched off");
	}

}
