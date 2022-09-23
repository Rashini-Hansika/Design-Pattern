package Command;

public class RemoteController {
	Command[] onCommands;
	Command[] offCommands;

	public RemoteController() {
		onCommands = new Command[7];
		offCommands = new Command[7];
		
		for(int i=0; i<7; i++) {
			onCommands[i] = null;
			offCommands[i] = null;
		}
	}
	
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
	
	public void onButtonPushed(int slot) {
		onCommands[slot].execute();
		onCommands[slot].undo();
	}
	
	public void offButtonPushed(int slot) {
		offCommands[slot].execute();
		offCommands[slot].undo();
	}
	
}
