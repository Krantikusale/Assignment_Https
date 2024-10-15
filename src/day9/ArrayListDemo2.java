package day9;

import java.util.ArrayList;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList<String> automationTools = new ArrayList<>();
		automationTools.add("java");
		automationTools.add("selenium");
		automationTools.add("oops");
		System.out.println("List with String : "+automationTools);
		
		ArrayList<Integer> marks=new ArrayList<>();
		marks.add(10);
		marks.add(23);
		marks.add(25);
		marks.add(45);
		System.out.println("List with int :"+marks);
		
		ArrayList<Double> marks1=new ArrayList<>();
		marks1.add(23.4);
		marks1.add(25.67);
		marks1.add(90.93);
		marks1.add(100.989);
		System.out.println("List with Double :"+marks1);
	}

}
