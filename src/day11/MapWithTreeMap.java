package day11;

import java.util.Map;
import java.util.TreeMap;

public class MapWithTreeMap {

	public static void main(String[] args) {
		Map<Double,String> m3=new TreeMap<>();
		m3.put(23.4, "Selenium");
		m3.put(45.6,"c");
		m3.put(23.5, "c++");
		m3.put(12.5, "jemter");
		System.out.println(m3);
		
	}

}
