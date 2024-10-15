package day10;

import java.util.Set;
import java.util.TreeSet;

public class SetWithTreeSet {

	public static void main(String[] args) {
		Set<Integer> s2 = new TreeSet<>();
		s2.add(12);
		s2.add(12);//no duplicate allow
		s2.add(122);
		s2.add(412);
		s2.add(123);
		System.out.println(s2);

		Set<String> s3 = new TreeSet<>();
		s3.add("Java");
		//s3.add(null);//null not allow
		s3.add("Python");//no duplicate allow
		s3.add("c");
		System.out.println(s3);
	}

}
