package com.sam.design_patterns.protectedproxy;

public class RealInternet implements Internet {

	@Override
	public void connectTo(String site) {
		System.out.println("Connect to "+site);
	}

}
