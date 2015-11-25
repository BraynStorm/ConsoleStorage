package braynstorm.consolestorage.commands;

import java.util.Arrays;
import java.util.List;

public class CommandAdd {
	public static List<String> aliases;
	public static List<Subcommand> subcommands;
	public static String description;
	
	static {
		aliases = Arrays.asList("add", "+", "insert", "ins");
		subcommands = Arrays.asList(new SubcommandUTC());
		
		description  = "Command: ADD\n";
		description += "  Usage:\n";
		description += "    add fieldname1 {data | _TIMESTAMP | _RANDINT [min [, max]] | _RANDFLOAT }\n\n";
		description += "  Aliases:\n";
		
		aliases.forEach(alias -> {
			description += "    " + alias + "\n";
		});
		
		description += "\n  Description:\n";
		description += "    ADD attempts to insert the given data into the specified field.\n";
		description += "    If there already is a field of the same name add will NOT replace it's contents and will exit .\n";
		description += "    Data cannot start with an underscore.\n";
		description += "    Field names consist of 'a-z', 'A-Z', '0-9', '_'.\n\n";
		description += "  Subcommands:\n";
		description += "    _TIMESTAMP - Inserts the current Unix Timestamp into the field.\n";
		description += "    _RANDINT [min [, max]] - Inserts a pseudo-randomly generated integer into the field.\n";
		description += "      Default min = Integer.MIN_VALUE.\n";
		description += "      Default max = Integer.MAX_VALUE.\n";
		description += "    _RANDFLOAT [min [, max]] - Inserts a pseudo-randomly generated floating-point number into the field.\n";
		description += "  Examples:\n";
		description += "    add field_1 This is an example and no one will look at";
	}
	
}
