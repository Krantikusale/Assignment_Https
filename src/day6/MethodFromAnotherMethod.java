package day6;

public class MethodFromAnotherMethod {

	public static void main(String[] args) {
		MethodFromAnotherMethod emp = new MethodFromAnotherMethod();
		emp.maintain();
	
	}

	public void testing() {
		System.out.println("I can test the code");
	}

	public void coding() {
		System.out.println("I can write codes");
	}

	public void maintain() {
		System.out.println("I can maintain the code");
		testing();
		coding();
	}
}


	
