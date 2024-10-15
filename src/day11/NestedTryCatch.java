package day11;

import java.util.InputMismatchException;

public class NestedTryCatch {

	public static void main(String[] args) {
		try {
			double x = 98.8;
			double y = 0;
			double t = x / y;
			System.out.println(t);
			try {

				int a = 10;
				int b = 0;
				int c = a / b;
				System.out.println(c);
			} catch (ArithmeticException e) {
				System.out.println("enter +ve num." + e.getMessage());
			}
		} catch (InputMismatchException e) {
			System.out.println("Entr num not string");
		}
	}

}
