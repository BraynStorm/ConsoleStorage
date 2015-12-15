package braynstorm.consolestorage.exceptions;

public class FieldAlreadyUsedException extends Exception {
	private static final long serialVersionUID = -8046490993655266769L;

	public FieldAlreadyUsedException() {
		super();
	}
	
	public FieldAlreadyUsedException(String fieldName) {
		super(fieldName);
	}
}
