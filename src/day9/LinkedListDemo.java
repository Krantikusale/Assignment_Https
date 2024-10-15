package day9;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> l1=new LinkedList<>();
		l1.add("c");
		l1.add("c++");
		l1.add("java");
		l1.add("c");
		l1.add("c++");
		l1.add("java");
		System.out.println(l1);
		l1.addFirst("jmeter");
		System.out.println(l1);
		l1.addLast("jenkins");
		System.out.println(l1);
		System.out.println(l1.contains("c"));
		l1.remove("c++");
		System.out.println(l1);
		System.out.println(l1.get(2));
		System.out.println(l1.size());
		int a =l1.indexOf("java");
		System.out.println(a  );
		
	}

}
