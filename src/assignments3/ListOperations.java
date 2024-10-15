package assignments3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListOperations {

	public static void main(String[] args) {
		List<Integer> list1 = new LinkedList<>();
		list1.add(33);
		list1.add(44);
		list1.add(55);
		list1.add(66);
		list1.add(77);
		list1.add(88);
		
		System.out.println("Original list is : "+list1);
		
		System.out.println(list1.remove(1));// Removal of second element from list using index
		System.out.println("After removing element at index 1: "+list1);
		
		System.out.println(list1.remove(2));// Removal of second element from list using value
		System.out.println("After removing element at index 1:"+list1);
		
		list1.add(3, 90);// Addition of 90 at index 3
		System.out.println(list1);
		
		System.out.println("Size of the list is : " + list1.size());
		
		for (Integer num : list1) {
			System.out.println(num);
		}
		System.out.println("*******************");
		for (int i = 0; i < list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		
		System.out.println("*******************");
		
		ArrayList<Integer> list2 = new ArrayList<>(list1);
		System.out.println("Converted list into array is : " + list2);

	}

}
