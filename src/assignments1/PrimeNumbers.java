package assignments1;

public class PrimeNumbers {

	public static void main(String[] args) {
		for (int i = 2; i<= 1000; i++) {
			boolean isPrime = true; // Assume c is prime initially

			// Check for factors from 2 to i-1
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false; // Found a factor, so c is not prime
					break; // No need to check further
				}
			}

			// Print c if it is prime
			if (isPrime) {
				System.out.println(i + " ");
			}
		}
	}
}
