package braynstorm.consolestorage.controllers;

import java.util.ArrayList;
import java.util.List;

import braynstorm.consolestorage.commands.Command;

public class ControllerStorage extends Controller {
	
	private static final List<Command> commands = new ArrayList<>();
	
	public static void initialize() {
		if(!initialized){
			commands.add(new Command("add", "+", "insert", "ins"));
			commands.add(new Command("remove", "-", "delete", "del", "rm"));
			commands.add(new Command("update", "~", "u"));
			commands.add(new Command("get", "?", "return", "cat")); // bash - cat.
			commands.add(new Command("help", "?!", "???", "h"));
			
			initialized = true;
		}
	}
	
	public ControllerStorage() {
		initialize();
	}
	
	public List<String> getCommands() {
		return null;
	}
	
	public void executeCommand() {
		
	}
}
