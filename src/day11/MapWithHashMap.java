package day11;

import java.util.HashMap;
import java.util.Map;

public class MapWithHashMap {

	public static void main(String[] args) {
		Map<Object, String> m2=new HashMap<>();
		m2.put("Java", "c");
		m2.put(true,"selenium");
		m2.put(13, "jenkins");
		m2.put(34.0, "c++");
		System.out.println(m2);
		

	}

}
