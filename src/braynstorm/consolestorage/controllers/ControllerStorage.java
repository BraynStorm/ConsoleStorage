package braynstorm.consolestorage.controllers;

import braynstorm.consolestorage.commands.Command;
import braynstorm.consolestorage.commands.CommandAdd;
import braynstorm.consolestorage.exceptions.CommandFailedException;
import braynstorm.consolestorage.exceptions.FieldAlreadyUsedException;
import braynstorm.consolestorage.exceptions.ModelException;
import braynstorm.consolestorage.models.Model;
import braynstorm.consolestorage.models.ModelRAM;

public class ControllerStorage extends Controller {
	
	private Model model;
	
	public static ControllerStorage getInstance(){
		if(instance == null)
			instance = new ControllerStorage();
		return instance;
	}
	
	private static ControllerStorage instance;
	
	private ControllerStorage() {
		//model = new ModelJSONFile("db.json");
		model = new ModelRAM();
		
		CommandAdd.getInstance();
	}
	
	public void executeCommand(Command cmd, String args) throws CommandFailedException {
		cmd.invoke(args);
	}

	public void storeData(String fieldName, Object data) throws FieldAlreadyUsedException, ModelException {
		// Data checks.
		if(model.hasField(fieldName)){
			
		} else
			model.putData(fieldName, data);
	}
}
