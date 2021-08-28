package com.sam.design_patterns.state;

public abstract class MobileState {
	
	protected MobileContext mobileContext;
	
	abstract void execute(MobileContext context);

}
