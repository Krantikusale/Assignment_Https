package day8;

public class SBIBLR implements SBI {

	public static void main(String[] args) {
		SBIBLR obj1 = new SBIBLR();
		obj1.deposit();
		obj1.loan();
		obj1.withdraw();
		obj1.goldLoan();
		System.out.println("***************");
		SBI obj2=new SBIBLR();
		obj2.deposit();
		obj2.withdraw();
		obj2.loan();
		System.out.println("***************");
		RBI obj3=new SBIBLR();
		obj3.deposit();
		obj3.withdraw();
		
		//RBI o=new RBI();//We can't create obj ofinterface
		//SBI o=new RBI();//We can't create obj ofinterface
	}

	public void goldLoan() {
		System.out.println("Person can apply for gold loan");
	}

	@Override
	public void deposit() {
		System.out.println("person can deposit money");

	}

	@Override
	public void withdraw() {
		System.out.println("person can withdraw money");

	}

	@Override
	public void loan() {
		System.out.println("person can get loan");

	}

}
