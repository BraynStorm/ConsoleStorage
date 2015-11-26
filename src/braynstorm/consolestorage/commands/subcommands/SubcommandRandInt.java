package braynstorm.consolestorage.commands.subcommands;

import java.util.Random;

public class SubcommandRandInt extends Subcommand {

	private static final Random rng = new Random();
	
	@Override
	public boolean isMe(String cmd) {
		return false;
	}

	@Override
	public String getValue(String... args) {
		int max = Integer.MAX_VALUE;
		
		if(args.length >= 1)
			max = Integer.parseInt(args[0]);
		
		return rng.nextInt(max) + "";
	}

}
