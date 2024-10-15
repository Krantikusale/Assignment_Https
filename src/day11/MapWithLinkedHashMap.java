package day11;

import java.util.LinkedHashMap;
import java.util.Map;

public class MapWithLinkedHashMap {

	public static void main(String[] args) {

		Map<Integer, String> m1 = new LinkedHashMap<>();
		m1.put(1, "java");
		m1.put(2, "Selenium");
		m1.put(3, "c");
		m1.put(3, "c1");//if the key already exists in the map, the value associated with that key will be updated to the new value.
		m1.put(4, "c++");
		m1.put(20, null);//Multiple null values are allowed and can be associated with different keys.
		m1.put(null, "TestNG");//Only one null key can be present. If you attempt to put another entry with a null key, it will overwrite the previous entry.
		m1.put(null, "python");//If you put a new entry with null as the key, it overwrites the previous entry with null as the key.
		m1.put(21, null);

		System.out.println(m1);

	}

}
