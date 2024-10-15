package day10;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetWithLinkedHashSet {

	public static void main(String[] args) {
		Set<Integer> s1=new LinkedHashSet<>();
		s1.add(10);
		s1.add(12);
		s1.add(23);
		s1.add(90);
		s1.add(34);
		s1.add(98);
		System.out.println(s1);//LinkedHashSet maintain the insertion order

	}

}
