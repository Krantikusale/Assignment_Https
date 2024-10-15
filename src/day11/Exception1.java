package day11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter num.1");
			int num1 = sc.nextInt();

			System.out.println("Enter num.2");
			int num2 = sc.nextInt();
			int result = num1 / num2;
			System.out.println("result is :" + result);
		} 
		catch (ArithmeticException e) {
			System.out.println("Please enter positive num" + e.getMessage());
		} 
		catch (InputMismatchException e) {
			System.out.println("Plz enter num not string " + e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println("Something went wrong ");
		}
		finally {
		System.out.println("Close the connection");
		sc.close();
		}
	}
}
