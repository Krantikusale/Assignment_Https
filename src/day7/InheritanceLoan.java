package day7;

public class InheritanceLoan extends InheritanceCalc {
	public InheritanceLoan() {
		System.out.println("Child class  Constructor called");
	}

	public static void main(String[] args) {
		InheritanceLoan il = new InheritanceLoan();//child class obj.
		il.carLoan();
		il.homeLoan();
		il.eMI();
		il.personalLoan();

		System.out.println("---------------------------");
		System.out.println("InheritanceCalc class methods");
		
		InheritanceCalc li = new InheritanceCalc();//parent class obj 
		li.carLoan();
		li.homeLoan();

		System.out.println("---------------------------");
		System.out.println("InheritanceCalc class methods with InheritanceLoan obj");
		InheritanceCalc l1 = new InheritanceLoan();
		l1.carLoan();
		l1.homeLoan();

		/*
		 * InheritanceLoan l2=new InheritanceCal();It is not possible bcz we can't store
		 * base class obj into child class ref.
		 */
	}

	public void personalLoan() {
		System.out.println("personal Loan");
	}

	public void eMI() {
		System.out.println("EMI");
	}
}
