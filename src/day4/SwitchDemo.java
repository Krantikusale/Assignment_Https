package day4;

public class SwitchDemo {

	public static void main(String[] args) {
		int day = 4;

		switch (day) {
		case 1:
			System.out.println("monday");
			break;

		case 2:
			System.out.println("tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("thursday");
			break;
		case 5:
			System.out.println("friday");
			break;
		case 6:
			System.out.println("satday");
			break;
		case 7:
			System.out.println("sunday");
			break;
		default:
			System.out.println("Please enter valid day");
			break;
		}
	}

}
