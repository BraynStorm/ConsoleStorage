package braynstorm.consolestorage.commands;

import java.util.Random;

public class SubcommandRandInt extends Subcommand {

	private static final Random rng = new Random();
	
	@Override
	public boolean isMe(String cmd) {
		return false;
	}

	@Override
	public String getValue(String... args) {
		int min = Integer.MIN_VALUE;
		int max = Integer.MAX_VALUE;
		
		if(args.length >= 1)
			min = Integer.parseInt(args[0]);
		
		return rng.next
	}

}
