package braynstorm.consolestorage.views;

import java.util.ArrayList;
import java.util.Scanner;

public class ViewConsole extends View {
	
	private ArrayList<String> commands;
	private Scanner input;
	
	public ViewConsole() {
		input = new Scanner(System.in);
		commands = new ArrayList<>(); // Yeah, Science!
		
		
	}
	
	public boolean verifyCommand(String command) {
		
		
		return false;
	}
	
	@Override
	public boolean mainLoop() {
		String cmd = input.nextLine();
		
		if(verifyCommand(cmd)){
			
		}
		
		return false;
	}
	
}
