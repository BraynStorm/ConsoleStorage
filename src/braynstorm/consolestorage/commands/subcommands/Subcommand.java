package braynstorm.consolestorage.commands.subcommands;

public abstract class Subcommand {
	public abstract boolean isMe(String cmd);
	public abstract String getValue(String... args);
}
