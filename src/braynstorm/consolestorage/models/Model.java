package braynstorm.consolestorage.models;

import braynstorm.consolestorage.exceptions.NoSuchFieldException;

public abstract class Model {
	public abstract void putData(String fieldName, Object data);
	public abstract Object getData(String fieldName) throws NoSuchFieldException;
	public abstract boolean hasField(String fieldName);
}
