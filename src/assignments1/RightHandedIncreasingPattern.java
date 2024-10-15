package assignments1;

public class RightHandedIncreasingPattern {
	public static void main(String[] args) {

		int row = 6;
		for (int a = 1; a <= row; a++) {
			for (int b = 1; b <= a; b++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}
}