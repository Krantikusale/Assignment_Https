package day6;

public class ConstructorEx2 {
	int a;
	int b;

	public ConstructorEx2(int num1, int num2) {
		System.out.println("Constructor Created");
		a = num1;
		b = num2;
	}

	public static void main(String[] args) {
		ConstructorEx2 c = new ConstructorEx2(2,5 );
		c.calcy();
		ConstructorEx2 c1 = new ConstructorEx2(12, 25);
		c1.calcy();
		System.out.println(c.a);
		System.out.println(c1.b);
	}

	public void calcy()

	{
		int result = a + b;
		System.out.println(result);

	}
}
