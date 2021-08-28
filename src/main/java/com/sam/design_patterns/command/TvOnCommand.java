package com.sam.design_patterns.command;

public class TvOnCommand implements Command {
	
	private Tv tv;

	TvOnCommand(Tv tv) {
		this.tv = tv;
	}

	@Override
	public void execute() {
		this.tv.on();
	}
	
	@Override
	public void undo() {
		this.tv.off();
	}
	
	public String toString(){
		return new StringBuffer(tv.location)
				.append("tv on Command is configured at slot ").toString();
				
	}

}
