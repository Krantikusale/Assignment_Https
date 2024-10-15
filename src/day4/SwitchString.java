package day4;

public class SwitchString {

	public static void main(String[] args) {
		String browser = "FF";

		switch (browser) {
		case "FF":
			System.out.println("FF launched");
			break;

		case "Chrome":
			System.out.println("Chrome launched");
			break;

		case "Safari":
			System.out.println("Safari launched");
			break;

		default:
			System.out.println("Please enter valid browser");

		}

	}

}
