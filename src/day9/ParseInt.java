package day9;

public class ParseInt {

	public static void main(String[] args) {
		int a = 10;
		Integer b = 100;
		System.out.println("a is : "+a);
		System.out.println("b is : "+b);

		String num1 = "1001";
		int c = Integer.parseInt(num1);
		String num2 = "2002";
		int d = Integer.parseInt(num2);
		System.out.println("sum of String numbers are : "+num1 + num2);
		System.out.println("sum of int numbers are : "+(c+d));

	}

}
