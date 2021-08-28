package com.sam.design_patterns.command;

public class LightOnCommand implements Command {
	
    private Light light;
	
	LightOnCommand(Light light) {
		this.light=light;
	}

	@Override
	public void execute() {
		this.light.on();
	}
	
	@Override
	public void undo() {
		this.light.off();
	}
	
	public String toString(){
		return new StringBuffer(light.location)
				.append("light On Command is configured at slot ").toString();
				
	}

}
