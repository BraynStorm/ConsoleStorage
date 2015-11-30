package braynstorm.consolestorage.controllers;

import braynstorm.consolestorage.commands.Command;
import braynstorm.consolestorage.commands.CommandAdd;
import braynstorm.consolestorage.models.Model;
import braynstorm.consolestorage.models.ModelJSONFile;

public class ControllerStorage extends Controller {
	
	private Model model;
	
	public static ControllerStorage getInstance(){
		if(instance == null)
			instance = new ControllerStorage();
		return instance;
	}
	
	private static ControllerStorage instance;
	
	private ControllerStorage() {
		model = new ModelJSONFile("db.json");
		
		CommandAdd.getInstance();
	}
	
	public void executeCommand(Command cmd, String args) {
		cmd.invoke(args);
	}

	public void storeData(String fieldName, String data) {
		// Data checks.
		model.putData(fieldName, data);
	}
}
