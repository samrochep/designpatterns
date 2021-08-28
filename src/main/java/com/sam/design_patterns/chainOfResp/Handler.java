package com.sam.design_patterns.chainOfResp;

public abstract class Handler {
	
	protected Handler handler;
	
	public abstract Boolean handle(Request request);

}
