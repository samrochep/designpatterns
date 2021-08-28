package com.sam.design_patterns.chainOfResp2;

public abstract class Handler {
	
	protected Handler handler;
	
	public abstract void handle(Request request);

}
