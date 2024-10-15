package day9;

import java.util.ArrayList;

public class ArrayListwithArrayList {

	public static void main(String[] args) {
		ArrayList<String> jsAutomation=new ArrayList<>();
		jsAutomation.add("cypress");
		jsAutomation.add("PW");
		jsAutomation.add("WDIO");
		
		ArrayList<String> Automation=new ArrayList<>(jsAutomation);
		Automation.add("selenium");
		Automation.add("java");
		Automation.add("jenkins");
		Automation.add("jmeter");
		System.out.println(Automation);
	}

}
