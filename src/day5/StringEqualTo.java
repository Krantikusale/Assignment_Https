package day5;

public class StringEqualTo {

	public static void main(String[] args) {
		String n1="Java";
		String n2="Java";
		System.out.println(n1==n2);//String("Java") content are same hence true 
		
		String a =new String("Java");
		String b =new String("Java");
		System.out.println(a==b);//Reference(a,b) are different hence false
	}

}
