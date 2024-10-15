package day8;

public class CarLoan extends LoanCalcy{

	public static void main(String[] args) {
		CarLoan c= new CarLoan();
		c.add();
		c.sub();
		c.div();
		c.mul();
		

	}

	@Override
	public void div() {
		System.out.println("Division of num");
		
	}

	@Override
	public void mul() {
		System.out.println("Multiplication of num");
		
	}

}
