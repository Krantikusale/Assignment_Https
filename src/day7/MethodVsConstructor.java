package day7;

public class MethodVsConstructor {
	int m1, m2;

	public static void main(String[] args) {
		MethodVsConstructor m=new MethodVsConstructor(10,20);
		m.cal();
		
		MethodVsConstructor c1=new MethodVsConstructor(200,900);
		c1.cal();
	}

	public void cal() {
		int r = m1 + m2;
		System.out.println("Value of r is : " +r);
	}
	public MethodVsConstructor(int a,int b)
	{
		m1=a;
		m2=b;
		System.out.println("Constructor called");
	}
	
}
