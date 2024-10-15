package assignments4;

import java.util.LinkedList;
import java.util.List;

public class ListValues {

	public static void main(String[] args) {
		List<Integer> list5=new LinkedList<>();
		list5.add(10);
		list5.add(45);
		list5.add(90);
		list5.add(45);
		list5.add(23);
		list5.add(90);
		list5.add(44);
		System.out.println("Original list is :"+list5);
		System.out.println(list5.get(1));
		System.out.println(list5.get(5));
	}

}
