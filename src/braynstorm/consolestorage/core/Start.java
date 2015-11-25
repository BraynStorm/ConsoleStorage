package braynstorm.consolestorage.core;

import braynstorm.consolestorage.views.View;
import braynstorm.consolestorage.views.ViewConsole;

public class Start {
	public static void main(String[] args) {
		View view = new ViewConsole();
		
		while (view.mainLoop()){ }
		
	}
}
