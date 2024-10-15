package assignments4;

import java.util.ArrayList;
import java.util.List;

public class ReverseStringList {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		list1.add("Java");
		list1.add("Selenium");
		list1.add("TestNG");
		list1.add("Git");
		list1.add("Github");
		System.out.println("Original List :" + list1);

		for (int i = list1.size() - 1; i >= 0; i--)

		{
			System.out.println(list1.get(i));
		}

	}

}
