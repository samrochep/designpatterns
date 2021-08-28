package com.sam.design_patterns.templatemethod;

public abstract class ConnectionTemplate{
	
	protected Boolean loggingDisabled;
	
	ConnectionTemplate() {
		disableLogging();
	}
	
	public final void run(String texFile) {
		setDBDriver();
		logging("logger-->Set DB driver");
		setCredentials();
		logging("logger-->Set Credentials");
		connect();
		logging("logger-->Connected");
		preparedStatement();
		logging("logger-->Prepared insert statement");
		insertData(texFile);
		logging("logger-->Inserted data");
		closeConnection();
		logging("logger-->Connection closed");
		destroyConnection();
		logging("logger-->Destroyed Connection");
	}

	abstract protected void setDBDriver();
	abstract protected void setCredentials();
	
	protected void connect() {
		System.out.println("Set connection...");
	}
	protected void preparedStatement() {
		System.out.println("Prepared insert statement...");
	}
	protected void insertData(String textFile) {
		System.out.println("Inserted data...");
	}
	protected void closeConnection() {
		System.out.println("Closed connection...");
	}
	protected void destroyConnection() {
		System.out.println("Destroyed connection...");
	}
	
    protected void disableLogging() {
    	this.loggingDisabled = Boolean.TRUE;
	}

	
	private void logging(String text) {
		if(!this.loggingDisabled){
			System.out.println(text);
		}
	}

}
