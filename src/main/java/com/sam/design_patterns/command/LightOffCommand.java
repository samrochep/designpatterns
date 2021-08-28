package com.sam.design_patterns.command;

public class LightOffCommand implements Command{
	
	private Light light;
	
	LightOffCommand(Light light) {
		this.light=light;
	}

	@Override
	public void execute() {
		this.light.off();
	}
	
	@Override
	public void undo() {
		this.light.on();
	}
	
	public String toString(){
		return new StringBuffer(light.location)
				.append("light Off Command is configured at slot ").toString();
				
	}

}
