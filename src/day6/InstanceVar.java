package day6;

public class InstanceVar {
	String name;
	int empID;// Instance var

	public static void main(String[] args) {
		InstanceVar i = new InstanceVar();
		i.displayInfo();
	}

	public void displayInfo() {
		System.out.println("String Default value is : " + name);
		System.out.println("int Default value is : " + empID);
	}
}
