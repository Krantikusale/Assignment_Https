package day6;

public class Calcy {

	public static void main(String[] args) {
		Calcy obj = new Calcy();
		obj.sum(2, 10);
		obj.div(2, 3);
		obj.mul(4, 5);
		obj.sub(5, 2);

	}

	public void sum(int a, int b) {
		System.out.println("result is : " + (a + b));
	}

	public void sub(int a, int b) {
		System.out.println("result is : " + (a - b));
	}

	public void div(int a, int b) {
		System.out.println("result is : " + (a / b));
	}

	public void mul(int a, int b) {
		System.out.println("result is : " + (a * b));
	}
}
