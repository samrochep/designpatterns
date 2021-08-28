package com.sam.design_patterns.command;

public class Tv extends Receiver{
	
    Tv(String location) {
		this.location=location;
	}
	
    @Override
	public void on() {
		System.out.println(location+" Tv is switched on");
	}
	
    @Override
    public void off() {
    	System.out.println(location+" Tv is switched off");
	}

}
