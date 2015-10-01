package collection;

import java.util.HashMap;

public class MyDictionnary<K1, K2, Value> {
	HashMap<Key, Object> hm = new HashMap<Key, Object>();

	public Object get(Object k1, Object k2) {
		Key k = new Key(k1, k2);
		return hm.get(k);
	}

	public Object put(Object k1, Object k2, Object value) {
		Key k = new Key(k1,k2);
		hm.put(k, value);
		return hm.get(k);
	}

	public boolean containKey(Object k1, Object k2){
		Key k = new Key(k1, k2);
		return hm.containsKey(k);
	}
}


