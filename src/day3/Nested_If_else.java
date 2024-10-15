package day3;

public class Nested_If_else {

	public static void main(String[] args) {
		int age = 29;
		int marks = 90;

		if (marks > 80) {

			if (age > 20) {
				System.out.println("Eligible");
			} else {
				System.out.println("Not Eligible");
			}
		} else {
			System.out.println("Not Selected");
		}
	}

}
