package com.sam.design_patterns.templatemethod;


public class MySqlTemplate extends ConnectionTemplate {

	@Override
	public void setDBDriver() {
		System.out.println("Setting MySQL DB driver...");
	}

	@Override
	public void setCredentials() {
		System.out.println("Setting MySQL credentials...");
	}
	
	@Override
	public void disableLogging() {
	    this.loggingDisabled = Boolean.FALSE;
	}
}
