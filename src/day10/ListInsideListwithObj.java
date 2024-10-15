package day10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListInsideListwithObj {

	public static void main(String[] args) {
		List<List<Object>> a= new ArrayList<>();
		List<Object> o1=Arrays.asList("kranti",'p',10,true);
		List<Object> o2=Arrays.asList("kp",'k',101.90,false);
		List<Object> o3=Arrays.asList("selenium",'r',1000,true);
		a.add(o1);
		a.add(o2);
		a.add(o3);
		System.out.println("value at 2nd index of o1 list : "+a.get(0).get(2));
		for(Object obj:a)
		{System.out.println("List is : "+obj);
	}}

}
