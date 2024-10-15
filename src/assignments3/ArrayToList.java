package assignments3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayToList {

	public static void main(String[] args) {
		ArrayList<String> a1= new ArrayList<>();
		a1.add("Selenium");
		a1.add("Java");
		a1.add("Cypress");
		a1.add("Jmeter");
		//System.out.println(a1);
		
		List<String> l1=new LinkedList<>(a1);
		System.out.println("Values from Array are : "+ l1);
		

	}

}
