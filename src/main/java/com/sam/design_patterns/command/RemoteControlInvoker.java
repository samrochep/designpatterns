package com.sam.design_patterns.command;

public interface RemoteControlInvoker {
	
	void setCommand(int slot,Command onCommand,Command offCommand);
	void on(int slot);
	void off(int slot);
	void undo();

}
