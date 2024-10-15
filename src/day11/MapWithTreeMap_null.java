package day11;

import java.util.Map;
import java.util.TreeMap;

public class MapWithTreeMap_null {

	public static void main(String[] args) {
		Map<String, Integer> m5=new TreeMap<>();
		m5.put("c", 1);
		m5.put("java", null);
		m5.put("selenium", 2);
		//m5.put(null, 3);//key shouldn't null in TreeMap
		System.out.println(m5);
		
	}

}
