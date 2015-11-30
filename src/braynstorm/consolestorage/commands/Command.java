package braynstorm.consolestorage.commands;

import java.util.ArrayList;
import java.util.List;

public abstract class Command {
	public static final List<Command> commands = new ArrayList<>();
	public final List<String> aliases;
	
	protected Command(){
		aliases = new ArrayList<>();
		commands.add(this);
	}
	
	public static final Command find(String name) throws NoSuchCommandException {
		for(Command cmd : commands) {
			if(cmd.isMe(name))
				return cmd;
		}
		
		throw new NoSuchCommandException(name);
	}
	
	public boolean isMe(String name) {
		return aliases.contains(name);
	}
	
	public abstract void invoke(String args);
}
