package assignments1;

public class StringvalueOfMethod {

	public static void main(String[] args) {

		String a[] = { "Java", "is", "base", "of", "Selenium", "4" };
		System.out.println("value of valueOf method is : " + Integer.valueOf(a[5]));

		String p = "Java is base of Selenium 4";
		String p1[] = p.split(" ");
		System.out.println("output after replace method : " + p.replace('J', 'j'));
		System.out.println("value of 5th index of String : " + p1[5]);

		System.out.println("String length is : " + p.length());
		System.out.println("Array length is : " + p1.length);
	}

}
