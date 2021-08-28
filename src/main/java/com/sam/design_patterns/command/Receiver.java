package com.sam.design_patterns.command;

public abstract class Receiver {
	
	protected String location;
	
	abstract void on();
	abstract void off();
}
