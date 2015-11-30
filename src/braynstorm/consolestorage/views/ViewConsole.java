package braynstorm.consolestorage.views;

import java.util.Scanner;

import braynstorm.consolestorage.commands.Command;
import braynstorm.consolestorage.commands.NoSuchCommandException;
import braynstorm.consolestorage.controllers.ControllerStorage;

public class ViewConsole extends View {
	private Scanner input;
	private ControllerStorage controller;
	
	public ViewConsole() {
		input = new Scanner(System.in);
		
		System.out.println("##############################");
		System.out.println("#       Console Storage      #");
		System.out.println("##############################\n");
		
		controller = ControllerStorage.getInstance();
	}
	
	@Override
	public boolean mainLoop() {
		String line = input.nextLine();
		String[] parts = line.split(" ", 2);
		
		try {
			Command c = Command.find(parts[0]);
			controller.executeCommand(c, parts[1]);
		} catch (NoSuchCommandException e) {
			e.printFormatted();
			return true;
		}
		
		return true;
	}
	
}
