package day7;

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading m = new MethodOverloading();
		m.add();
		m.add("Kranti");
		m.add(10, "Kranti");
		m.add(12.3, 10.9);
		m.add(1.4, 10);
	}

	public void add() {
		System.out.println("adding ");
	}

	public void add(int a) {
		System.out.println("num");
	}

	public void add(int a, int b)

	{
		int num = a + b;
		System.out.println(num);
	}

	public void add(String a) {
		System.out.println(a);
	}

	public void add(int a, String b) {
		System.out.println("Concatination is : " + a + " " + b);
	}

	public void add(double a, double b) {
		double c = a + b;
		System.out.println(c);
	}
	public void add(double a, int b) {
		double c = a + b;
		System.out.println(c);
	}
}
