package braynstorm.consolestorage.commands;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Command {
	public static final List<Command> commands = new ArrayList<>();
	
	private List<String> names;
	private String description;

	public Command(String name, String description, String... aliases) {
		this.names = Arrays.asList(aliases);
		this.names.add(name);
		this.description = description;
		
	}
	
	public boolean isMe(String cmd) {
		return names.contains(cmd);
	}
	
	public abstract void invoke();
}
