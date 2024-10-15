package day5;

public class ArrayWithCurlyBraces {

	public static void main(String[] args) {
		Object obj[][] = { { 12, 't' }, { "PK", true } };
		System.out.println("Value of Array is : " + obj[0][1]);

		System.out.println("           ");
		for (Object o[] : obj) {
			for (Object Element : o) {
				System.out.println("Values of Array are :" + Element);
			}
		}
	}

}
