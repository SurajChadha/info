package info;

import java.util.HashMap;
import java.util.Map;

public class HashMapGetSet extends HashMap<String, Object> implements Map<String, Object>{


	public  HashMapGetSet (){
	}

	public  HashMapGetSet(Map<String, Object> map) {
		if (null == map) {
			map = new  HashMapGetSet();
		}
		for (Entry<String, Object> entry : map.entrySet()) {
			this.set(entry.getKey(), entry.getValue());
		}
	}
    public  HashMapGetSet set(String key, Object value) {
		super.put(key, value);
		return this;
	}
	public  HashMapGetSet setAll(Map<String,Object> map) {
		super.putAll(map);
		return this;
	}
	public  HashMapGetSet put(String key, Object value) {
		return this.set(key, value);
	}
}