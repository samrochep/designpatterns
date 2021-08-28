package com.sam.design_patterns.command;

public class TvOffCommand implements Command {
	
	private Tv tv;

	TvOffCommand(Tv tv) {
		this.tv = tv;
	}

	@Override
	public void execute() {
		this.tv.off();
	}
	
	@Override
	public void undo() {
		this.tv.on();
	}
	
	public String toString(){
		return new StringBuffer(tv.location)
				.append("tv off Command is configured at slot ").toString();
				
	}

}
