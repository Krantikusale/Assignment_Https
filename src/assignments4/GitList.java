package assignments4;

import java.util.ArrayList;
import java.util.List;

public class GitList {

	public static void main(String[] args) {
		List<String> list2 = new ArrayList<>();
		list2.add("Git");
		list2.add("Github");
		list2.add("GitLab");
		list2.add("GitBash");
		list2.add("Selenium");
		list2.add("Java");
		list2.add("Maven");
		System.out.println("list2 is : " + list2);
System.out.println("***********************************");
		List<String> list3 = new ArrayList<>(list2);
		// System.out.println("list3 is : " +list3);
		//System.out.println(list3.contains("Git"));
		for (String str : list3) {
			if (str.startsWith("Git")) {
				System.out.println(str);

			}
		}

	}
}
