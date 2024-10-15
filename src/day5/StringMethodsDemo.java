package day5;

public class StringMethodsDemo {

	public static void main(String[] args) {
		String msg = "I love Automation,I can Aautomate any web Application";
		String msg1 = "i love Automation,I can Aautomate any web Application";
		String msg2 = " i love Automation,I can Aautomate any web Application ";
		
		
		System.out.println(msg.isEmpty());
		System.out.println(msg.startsWith("I"));
		System.out.println(msg.startsWith("i"));
		System.out.println(msg.endsWith("Application"));
		System.out.println(msg.endsWith("application"));
		System.out.println(msg.endsWith("pplication"));
		System.out.println(msg.contains("Application"));
		System.out.println(msg.equalsIgnoreCase(msg1)); 
		System.out.println(msg.equals(msg1));
		System.out.println(msg.equalsIgnoreCase(msg2));
	
	}

}
