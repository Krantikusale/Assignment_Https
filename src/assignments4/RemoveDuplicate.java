package assignments4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicate {

	public static void main(String[] args) {
		List<String> list4=new ArrayList<>();
		list4.add("Java");
		list4.add("TestNG");
		list4.add("Maven");
		list4.add("Java");
		System.out.println("Original list4 is : "+list4);
		System.out.println("*******************************");
		Set<String>s1=new HashSet<>(list4);
		Set<String>s2=new TreeSet<>(list4);
		Set<String>s3=new LinkedHashSet<>(list4);
		System.out.println("HashSet values are : "+s1);
		System.out.println("*******************************");
		System.out.println("TreeSet values are : "+s2);
		System.out.println("*******************************");
		System.out.println("LinkedHashSet values are : "+s3);
	}

}
