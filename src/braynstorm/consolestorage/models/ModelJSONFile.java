package braynstorm.consolestorage.models;

import org.json.JSONException;
import org.json.JSONObject;

public class ModelJSONFile extends Model {
	private JSONObject data;
	
	public ModelJSONFile(String path) {
		try {
			data = new JSONObject(path);
		} catch(JSONException e) {
			System.err.println("'So just chill... (--_--) ... till the next exception.");
			e.printStackTrace();
		}
		
	}
	
	public Object getField(String name) {
		return data.get(name);
	}
}
