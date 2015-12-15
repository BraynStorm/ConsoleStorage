package braynstorm.consolestorage.exceptions;

public class NoSuchFieldException extends Exception {
	public NoSuchFieldException(String fieldName) {
		super(fieldName);
	}

	private static final long serialVersionUID = 1271266033949719816L;
	
}
