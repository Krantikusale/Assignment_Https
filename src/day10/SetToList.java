package day10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SetToList {

	public static void main(String[] args) {
		HashSet<String> s1 = new HashSet<>();
		s1.add("java");
		s1.add("python");
		s1.add("c++");
		s1.add("c#");
		System.out.println("Elements of s1 set : "+s1);
		
		List<String> l1=new ArrayList<>(s1);
		System.out.println("Elements of l1 list : "+l1);
		System.out.println(l1.get(2));
	}

}
