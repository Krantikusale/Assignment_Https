package day7;

import java.util.Scanner;

public class ScannerSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1");
		float num1=sc.nextFloat();
		
		System.out.println("Enter num2");
		int num2=sc.nextInt();
		
		System.out.println("Enter num3");
		double num3=sc.nextDouble();
		
		System.out.println("Enter String");
		String a =sc.next();
		
		String result=num1+num2+num3+" "+a;
		System.out.println("Sum is "+result);
		sc.close();
	}

}
