package day9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListOperations {

	public static void main(String[] args) {
		// List<String> a = Arrays.asList("c", "c++", "C#");
		// System.out.println(a);
		List<String> b = new ArrayList<>();// dest list
		b.add("jmeter");
		b.add("java");
		b.add("Cypress");
		System.out.println(b);
		System.out.println(b.remove(1));
		System.out.println(b);
		System.out.println(b.remove("jmeter"));
		System.out.println(b);
		System.out.println(b.contains("Cypress"));
		System.out.println(b);
		System.out.println(b.isEmpty());
		b.clear();
		System.out.println(b);
		List<String> a = Arrays.asList("c", "c++", "C#");// src list
		b.addAll(a);
		System.out.println("value in old list : "+b);

		/*for (int i = 0; i < a.size(); i++) {
			b.add(a.get(i));
		}
		System.out.println(b);
		
		/*for (String item : a) {
            b.add(item);
        }*/
        
         Iterator<String> itr = a.iterator();
        while (itr.hasNext()) {
            b.add(itr.next());
        }
        System.out.println("Destination List: " + b);
		 
	}

}
