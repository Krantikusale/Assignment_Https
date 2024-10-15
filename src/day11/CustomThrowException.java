package day11;

public class CustomThrowException {

	public static void main(String[] args) {
		int age =3;
		if(age<18)
		{
			System.out.println("Not allowed");
			throw new ArithmeticException();
		}
		else {
			System.out.println("welcome to the club");
		}
	}

}
