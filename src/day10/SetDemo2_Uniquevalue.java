package day10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SetDemo2_Uniquevalue {

	public static void main(String[] args) {
		List<String> l1=new ArrayList<>();
		l1.add("pk");
		l1.add("pk");
		l1.add("kk");
		l1.add("pg");
		System.out.println("list is :"+l1);
		
		HashSet<String> s1=new HashSet<>(l1);//way 1 to add values from list to set
		System.out.println("set is :"+s1);
		
		HashSet<String> s2=new HashSet<>();
		s2.addAll(s1);
		s2.add("vk");
		s2.add("rk");
		System.out.println("set is : "+s2);
		
	}

}
