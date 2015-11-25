package braynstorm.consolestorage.commands;

public abstract class Subcommand {
	public abstract boolean isMe(String cmd);
	public abstract String getValue(String... args);
}
