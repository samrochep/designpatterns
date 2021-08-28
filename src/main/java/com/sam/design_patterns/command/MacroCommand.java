package com.sam.design_patterns.command;

import java.util.List;

public class MacroCommand implements Command {
	
	private List<Command> commands;
	
	MacroCommand(List<Command> commands) {
		this.commands=commands;
	}
	@Override
	public void execute() {
		for(Command command:this.commands) {
			command.execute();
		}
	}

	@Override
	public void undo() {
		for(Command command:this.commands) {
			command.undo();
		}
	}

}
