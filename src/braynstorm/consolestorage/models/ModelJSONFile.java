package braynstorm.consolestorage.models;

import org.json.JSONException;
import org.json.JSONObject;

import braynstorm.consolestorage.core.Start;

public class ModelJSONFile extends Model {
	private JSONObject data;
	private static String startPath = Start.class.getProtectionDomain().getCodeSource().getLocation().toString();
	
	public ModelJSONFile(String path) {
		
		try {
			data = new JSONObject(startPath + "/" + path);
		} catch(JSONException e) {
			System.err.println("'So just chill... (--_--) ... till the next exception.");
			e.printStackTrace();
		}
		
	}

	@Override
	public boolean putData(String fieldName, String data) {
		this.data.put(fieldName, data);
		return true;
	}

	@Override
	public Object getData(String fieldName) throws NoSuchFieldException {
		if(data.has(fieldName))
			return data.getString(fieldName);
		
		throw new NoSuchFieldException();
	}
}
