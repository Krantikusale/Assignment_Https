package day10;

import java.util.HashMap;

public class HashMap1 {

	public static void main(String[] args) {
HashMap<Integer, String> m1 = new HashMap<>();
m1.put(1, "kk");
m1.put(2, "kk1");
m1.put(3, "kk2");
m1.put(4, "kk3");
System.out.println(m1);
System.out.println(m1.get(2));
System.out.println(m1.get(4));
System.out.println(m1.containsKey(2));
System.out.println(m1.containsValue("kk2"));
System.out.println(m1.containsValue("KK2"));
System.out.println(m1.size());
System.out.println(m1.remove(2));
System.out.println(m1);
	}

}
