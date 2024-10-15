package day9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo4_Emp {

	public static void main(String[] args) {
		Emp e1 = new Emp(101, "kk", "kk@gmail.com");
		Emp e2 = new Emp(102, "kp", "kp@gmail.com");
		
		ArrayList<Emp> e = new ArrayList<>();
		
		e.add(e1);
		e.add(e2);
		
		System.out.println(e.get(1).email);
		System.out.println(e.get(0).name);
		System.out.println(e1.id);

		List<Emp> a =Arrays.asList(e1,e2);
		
		System.out.println(a.get(0).email);
		
		 System.out.println("List contents:");
	        for (Emp emp : a) {
	            System.out.println(emp); 
	}
	}
}
