package day11;

public class HandleException {

	public static void main(String[] args) {
		int age = 15;
		try {
			validation(age);
		} catch (InvalidAgeException e) {
			System.out.println("Exception : "  + e.getMessage());
		}

	}

	public static void validation(int age) throws InvalidAgeException {
		if (age < 18) {
			throw new InvalidAgeException("study");
		} else {
			System.out.println("welcome");
		}
	}
}
