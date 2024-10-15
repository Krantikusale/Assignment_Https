package day10;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetWithHashSet {

	public static void main(String[] args) {
		Set<Integer> s1=new HashSet<>();
		s1.add(10);
		s1.add(12);
		s1.add(23);
		s1.add(90);
		s1.add(34);
		s1.add(98);
		s1.add(null);
		s1.add(null);//null allow only once
		System.out.println(s1);//HashSet doesn't maintain the insertion order

	}

}