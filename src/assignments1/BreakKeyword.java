package assignments1;

public class BreakKeyword {

	public static void main(String[] args) {
		int number[] = new int[5];
		number[0] = 12;
		number[1] = 34;
		number[2] = 66;
		number[3] = 85;
		number[4] = 900;

		for (int numbers : number) {
			if (numbers == 85) {
				System.out.println("Number 85 found,hence breaking the execution");
				break;
			}
			System.out.println(numbers);
		}
	}
}
