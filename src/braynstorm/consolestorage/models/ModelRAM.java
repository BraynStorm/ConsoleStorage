package braynstorm.consolestorage.models;

import java.util.HashMap;

import braynstorm.consolestorage.exceptions.NoSuchFieldException;
import braynstorm.consolestorage.exceptions.OOMException;

public class ModelRAM extends Model{
	
	protected HashMap<String, Object> data;
	
	public ModelRAM() {
		super();
		data = new HashMap<>();
	}
	
	@Override
	public void putData(String fieldName, Object data) throws OOMException {
		// TODO: add option to limit the memory for the model.
		this.data.put(fieldName, data);
	}

	@Override
	public Object getData(String fieldName) throws NoSuchFieldException {
		if(!hasField(fieldName))
			throw new NoSuchFieldException(fieldName);
		return data.get(fieldName);
	}

	@Override
	public boolean hasField(String fieldName) {
		return data.containsKey(fieldName) && data.get(fieldName) != null;
	}

}
