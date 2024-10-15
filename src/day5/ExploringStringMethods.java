package day5;

public class ExploringStringMethods {

	public static void main(String[] args) {
		String str="Selenium works with Web Automation.";
		
		System.out.println("character at 6th index is : "+str.charAt(6));
		System.out.println("String After replace method is : "+str.replace('S', 's'));
		System.out.println("Original String is :"+str);
        
		String a =str.indent(3);//Added spaces
        System.out.println(a);
System.out.println(str.trim());//remove any leading and trailing whitespace characters (spaces, tabs, etc.) from a string
	}

}
