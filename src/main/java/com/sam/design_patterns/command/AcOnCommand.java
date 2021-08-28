package com.sam.design_patterns.command;

public class AcOnCommand implements Command {
	
	private Ac ac;

	AcOnCommand(Ac ac) {
		this.ac = ac;
	}

	@Override
	public void execute() {
		this.ac.on();
	}
	
	@Override
	public void undo() {
		this.ac.off();
	}
	
	public String toString(){
		return new StringBuffer(ac.location)
				.append("Ac On Command is configured at slot ").toString();
				
	}

}
