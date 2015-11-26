package braynstorm.consolestorage.commands;

import java.util.Arrays;
import java.util.List;

import braynstorm.consolestorage.commands.subcommands.Subcommand;
import braynstorm.consolestorage.commands.subcommands.SubcommandUTC;

public class CommandAdd extends Command{
	public List<Subcommand> subcommands;
	public String description;
	
	private static CommandAdd instance;
	private CommandAdd() {
		super();
		subcommands = Arrays.asList(new SubcommandUTC());
		
		description  = "Command: ADD\n";
		description += "  Usage:\n";
		description += "    add fieldname1 {\"data\" | _TIMESTAMP | _RANDINT [min [, max]] | _RANDFLOAT }\n\n";
		description += "  Aliases:\n";
		description += "    add\n";
		description += "    +\n";
		description += "    insert\n";
		description += "    ins\n";
		
		description += "\n  Description:\n";
		description += "    ADD attempts to insert the given data into the specified field.\n";
		description += "    If there already is a field of the same name add will NOT replace it's contents and will exit .\n";
		description += "    Data cannot start with an underscore and MUST BE surrounded by double-quotes (*1).\n";
		description += "    Field names consist of 'a-z', 'A-Z', '0-9', '_'.\n\n";
		description += "    Note: *1 - double-quotes can be escaped (\\\")\n";
		description += "  Subcommands:\n";
		description += "    _TIMESTAMP - Inserts the current Unix Timestamp into the field.\n";
		description += "    _RANDINT [max] - Inserts a pseudo-randomly generated integer into the field. Range: [0 - max].\n";
		description += "      Default max = Integer.MAX_VALUE.\n";
		description += "    _RANDFLOAT [min [, max]] - Inserts a pseudo-randomly generated floating-point number into the field.\n";
		description += "  Examples:\n";
		description += "    add field_1 This is an example and no one will look at";
	}
	
	public static CommandAdd getInstance(){
		if(instance == null)
			instance = new CommandAdd();
		
		return instance;
	}
	
	
	
	@Override
	public void invoke(String arguments) {
		String[] parts = arguments.split(" ", 2);
		
		for(String s : parts){
			System.out.println("ARG: " + s);
		}
		
	}
	
}
