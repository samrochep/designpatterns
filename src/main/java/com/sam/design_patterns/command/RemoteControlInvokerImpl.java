package com.sam.design_patterns.command;

import java.util.List;

import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;

@Service
public class RemoteControlInvokerImpl implements RemoteControlInvoker {

	private static final int NO_OF_SLOTS = 9;

	private List<Command> onCommands = Lists.newArrayListWithCapacity(NO_OF_SLOTS);
	private List<Command> offCommands = Lists.newArrayListWithCapacity(NO_OF_SLOTS);

	private Command undoCommand = null;
	
	RemoteControlInvokerImpl() {
		for(int slot=0;slot<NO_OF_SLOTS;slot++) {
			onCommands.add(slot,new NoCommand());
			offCommands.add(slot,new NoCommand());
		}
	}

	@Override
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands.add(slot, onCommand);
		offCommands.add(slot, offCommand);
	}

	@Override
	public void on(int slot) {
		onCommands.get(slot).execute();
		undoCommand = onCommands.get(slot);
	}

	@Override
	public void off(int slot) {
		offCommands.get(slot).execute();
		undoCommand = onCommands.get(slot);
	}

	@Override
	public void undo() {
		undoCommand.undo();
	}

}
