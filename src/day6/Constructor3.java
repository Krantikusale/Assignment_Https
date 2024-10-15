package day6;

public class Constructor3 {
	int empId;
	String empEmail;
	String name;
	

	public Constructor3(int eID, String eEmail, String nm) {
		System.out.println("Const.");
		
		empId = eID;
		empEmail = eEmail;
		name = nm;
	}

	public static void main(String[] args) {
		Constructor3 c = new Constructor3(101, "kk@gmail.com", "Kranti");
		System.out.println(c.empId);
		System.out.println("************************");
		Constructor3 c1 = new Constructor3(103, "kp@gmail.com", "Pratap");
		System.out.println(c1.name);
	}

}
