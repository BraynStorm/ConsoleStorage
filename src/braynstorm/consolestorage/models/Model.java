package braynstorm.consolestorage.models;

public abstract class Model {
	public abstract boolean putData(String fieldName, String data);
	public abstract Object getData(String fieldName) throws NoSuchFieldException;
}
