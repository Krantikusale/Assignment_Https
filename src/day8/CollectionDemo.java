package day8;

import java.io.Serializable;
import java.util.ArrayList;

public class CollectionDemo {

	public static void main(String[] args) {
		ArrayList<Serializable> a = new ArrayList();
		a.add('k');
		a.add("kranti");
		a.add(12);
		a.add(true);
		a.add(98.09);
		System.out.println(a.contains(true));
		System.out.println(a.add(87));// appending the element at the end of list

		a.set(0, 'a');// Replace the element at index 0 ("k") with 'a'

		System.out.println("output is :" + a);
		System.out.println(a.get(3));

		ArrayList a1 = new ArrayList();
		a1.add('k');
		a1.add(true);
		a1.add(98.09);
		System.out.println(a1);

		a.addAll(a1);// Use addAll to add all elements from a1 to a
		System.out.println("Output of addAll :" + a);
		a.add(a1);// Use add to add a1 (which is a list) to a
		System.out.println("Output of add : " + a);

		a.remove(1);
		System.out.println(a);
	}

}
