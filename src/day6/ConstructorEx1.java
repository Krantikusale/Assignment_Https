package day6;

public class ConstructorEx1 {
	String a;
	int b;//Step 1 : Instance var.

	public ConstructorEx1(String ename, int ID) {//2.Parameterized Constructor
		System.out.println("Constructor called");
		
		a = ename;//3.assigning
		b = ID;
	}

	public static void main(String[] args) {
		ConstructorEx1 c = new ConstructorEx1("kk", 11);//4.Obj creation
		ConstructorEx1 c1 = new ConstructorEx1("kp", 12);
		ConstructorEx1 c2 = new ConstructorEx1("pk", 13);
		c.info();//6.method calling via obj
		c1.info();
		c2.info();
	}

	public void info() {//5.method creation
		System.out.println("name is :" + a);
		System.out.println("id is :" + b);
	}

}
