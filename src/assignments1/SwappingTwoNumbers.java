package assignments1;

public class SwappingTwoNumbers {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int temp;
		System.out.println("a's value before swapping : " + a);
		System.out.println("b's value before swapping : " + b);

		temp = a;
		a = b;
		b = temp;
		System.out.println("*************************");
		System.out.println("a's value after swapping : " + a);
		System.out.println("b's value after swapping : " + b);

		/*Another Way
		 * a=a+b;
		 * b=a-b; 
		 * a=a-b;
		 * System.out.println("a is "+a +"\n" +"b is "+b );
		 */
	}

}
