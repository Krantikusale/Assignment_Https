package assignments3;

import java.util.ArrayList;
import java.util.List;

public class IntegerList {

	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		list1.add(100);
		list1.add(101);
		list1.add(102);
		list1.add(103);
		System.out.println(list1);

		System.out.println("****************");
		for (Integer num : list1) // Using for each loop
		{

			System.out.println(num);
		}
		System.out.println("****************");
		for (int i = 0; i < list1.size(); i++)// Using for loop
		{
			System.out.println(list1.get(i));

		}

	}

}
