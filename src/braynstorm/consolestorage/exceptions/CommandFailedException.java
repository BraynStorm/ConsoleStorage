package braynstorm.consolestorage.exceptions;

public class CommandFailedException extends Exception {
	private static final long serialVersionUID = 3211702672372028092L;
	
	public CommandFailedException() {
		super("Unknown error.");
	}
	
	public CommandFailedException(String info) {
		super(info);
	}
	
	public void printFormatted(){
		System.err.println("ERROR: " + getMessage());
	}
}
