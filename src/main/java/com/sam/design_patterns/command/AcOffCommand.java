package com.sam.design_patterns.command;

public class AcOffCommand implements Command {

	private Ac ac;

	AcOffCommand(Ac ac) {
		this.ac = ac;
	}

	@Override
	public void execute() {
		this.ac.off();
	}
	
	@Override
	public void undo() {
		this.ac.on();
	}
	
	public String toString(){
		return new StringBuffer(ac.location)
				.append("Ac Off Command is configured at slot ").toString();
				
	}

	

}
