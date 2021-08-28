package com.sam.design_patterns.state;

public abstract class MobileContext {
	
	protected MobileState state;
	
	abstract void setMobileState(MobileState state);
	abstract void execute();
	
	abstract void process();
	

}
