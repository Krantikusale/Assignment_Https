package day9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class IteratorList {

	public static void main(String[] args) {
		List<String> names=new ArrayList<>();
		names.add("kk");
		names.add("pk");
		names.add("pg");
		Iterator<String> a=names.iterator();
		while(a.hasNext())
		{String b=a.next();
		System.out.println(b);}
		
		System.out.println("*******************");
		
		List<String> a1=Arrays.asList("java","js","python");
		Iterator<String> a2=a1.iterator();
		while(a2.hasNext())
		{String b=a2.next();
		System.out.println(b);}
	}

}
