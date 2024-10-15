package day10;

import java.util.HashSet;

public class SetDemo1_Methods {

	public static void main(String[] args) {
		HashSet<String> s1 = new HashSet<>();
		s1.add(null);
		s1.add(null);// only 1 null allow
		s1.add("java");
		s1.add("java");// no duplicate value
		s1.add("JAva");// case sensetive/output is on content
		s1.add("MAven");

		System.out.println(s1);
		System.out.println(s1.size());
		System.out.println(s1.remove("java"));
		System.out.println(s1.isEmpty());
		System.out.println(s1);

		for (String d : s1) {
			System.out.println("values are :" + d);
		}

	}

}
