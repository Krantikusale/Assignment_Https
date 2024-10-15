package day11;

import java.util.HashMap;
import java.util.Map;

public class MapWithHashMap_null {

	public static void main(String[] args) {
		Map<Integer, String> m4 = new HashMap<>();
		m4.put(null, null);
		m4.put(12, null);
		m4.put(12, "c");// if the key already exists in the map, the value associated with that key will be updated to the new value. This means that the old value is replaced by the new value.
		m4.put(35, null);
		m4.put(null, "Selenium");
		System.out.println(m4);
		System.out.println("keyset is "+m4.keySet());
		System.out.println(m4.values());
		System.out.println(m4.containsKey(35));
		System.out.println(m4.containsValue("c"));
		System.out.println(m4.size());
	}

}
