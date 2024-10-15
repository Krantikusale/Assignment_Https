package day3;

public class IfElseIf {

	public static void main(String[] args) {
		int mark = 190;
		
		if (mark > 0) {
			if (mark > 90 && mark<=100) {
				System.out.println("A++");
			} else if (mark <= 90 && mark >= 70) {
				System.out.println("A");
			} else if (mark <= 70 && mark > 50) {
				System.out.println("B");
			} else if (mark <= 50 && mark >= 35) {
				System.out.println("C");
			} else if (mark < 35) {
				System.out.println("Fail");
			} else {
				System.out.println("Invalid number");
			}
			
		}
	}
}