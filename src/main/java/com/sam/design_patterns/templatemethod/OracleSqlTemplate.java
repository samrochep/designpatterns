package com.sam.design_patterns.templatemethod;


public class OracleSqlTemplate extends ConnectionTemplate {

	@Override
	public void setDBDriver() {
		System.out.println("Setting Oracle DB driver...");
	}

	@Override
	public void setCredentials() {
		System.out.println("Setting Oracle credentials...");
	}

}
