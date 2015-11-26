package braynstorm.consolestorage.views;

import java.util.Scanner;

import braynstorm.consolestorage.commands.Command;
import braynstorm.consolestorage.commands.NoSuchCommandException;

public class ViewConsole extends View {
	private Scanner input;
	
	public ViewConsole() {
		input = new Scanner(System.in);
		
		System.out.println("##############################");
		System.out.println("#       Console Storage      #");
		System.out.println("##############################\n");
	}
	
	@Override
	public boolean mainLoop() {
		String line = input.nextLine();
		String[] parts = line.split(" ", 1);
		
		try {
			Command.exists(command);
		} catch (NoSuchCommandException e) {
			e.printFormatted();
			return false;
		}
		
		return true;
	}
	
}
