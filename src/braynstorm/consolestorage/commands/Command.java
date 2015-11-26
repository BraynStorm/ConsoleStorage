package braynstorm.consolestorage.commands;

import java.util.ArrayList;
import java.util.List;

public abstract class Command {
	public static final List<Command> commands = new ArrayList<>();
	public final List<String> aliases;
	
	public Command(){
		aliases = new ArrayList<>();
		Command.add(this);
	}
	
	public static final Command find(String name) throws NoSuchCommandException {
		for(Command cmd : commands) {
			if(cmd.isMe(name))
				return cmd;
		}
		
		throw new NoSuchCommandException(name);
	}
	
	public static final boolean exists(String name) {
		
	}
	
	public boolean isMe(String cmd) {
		return aliases.contains(cmd);
	}
	
	public abstract void invoke(String args);

	protected static void add(Command cmd) {
		commands.add(cmd);
	}
}
