package day6;

public class EmpClass {

	public static void main(String[] args) {
		EmpClass emp = new EmpClass();
		emp.maintain();
		emp.testing();
		emp.coding();
	}

	public void testing() {
		System.out.println("I can test the code");
	}

	public void coding() {
		System.out.println("I can write codes");
	}

	public void maintain() {
		System.out.println("I can maintain the code");
	}
}
