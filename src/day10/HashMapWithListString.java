package day10;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class HashMapWithListString {

	public static void main(String[] args) {
		HashMap<Integer, List<String>> m1 = new HashMap<>();
		
		List<String> a = Arrays.asList("c", "c++", "Python");
		List<String> a1 = Arrays.asList("c1", "c++1", "Python1");
		
		m1.put(1, a);
		m1.put(2, a1);
		
		System.out.println(m1);
		
		List<String> m2=m1.get(1);
		String value=m2.get(2);
		System.out.println("value at a list's 2nd index :"+value);
		
		System.out.println("value at a list's 1st index : "+m1.get(1).get(1));
	}

}
