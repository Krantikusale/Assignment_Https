package day9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ForLoopInList {

	public static void main(String[] args) {
		
		List<String>mentor=new ArrayList<>();
		mentor.add("Kranti");
		mentor.add("Pratap");
		mentor.add("ghatage");
		for(int i=0;i<mentor.size();i++)
		{
			System.out.println(mentor.get(i));
		}
		
		System.out.println("*****************");
		
		List<String>a=Arrays.asList("pk","kk","po","mo");
		
		for(int a1=0;a1<a.size();a1++)
		{
			System.out.println(a.get(a1));
		}
		
		System.out.println("*****************");
		for(String m:a)
		{
			System.out.println(m);
		}
	}

}
