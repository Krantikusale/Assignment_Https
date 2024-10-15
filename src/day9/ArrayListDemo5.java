package day9;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayListDemo5 {

	public static void main(String[] args) {
		ArrayList<String> a=new ArrayList<>();
		a.add("java");
		
		List<String>b=new ArrayList<>();
		b.add("js");
		
		Collection<String>c=new ArrayList<>();
		c.add("cypress");
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
	}

}
