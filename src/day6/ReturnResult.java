package day6;

public class ReturnResult {

	public static void main(String[] args) {
		ReturnResult obj = new ReturnResult();//Step 2 : Class Object Creation 
		int a = obj.sum(2, 10);//Step 3 : Calling obj and Storing it
		int b = obj.div(2, 3);
		int c = obj.mul(4, 5);
		int d = obj.sub(5, 2);
		String nm = obj.getName("kk","pk");
		
		System.out.println("__________________");

		System.out.println("Sum is : "+a);//Step 4 : Printing obj value
		System.out.println("Div is : "+b);
		System.out.println("Mul is : "+c);
		System.out.println("Sub is : "+d);
		System.out.println("Name is : "+nm);

	}

	public int sum(int a, int b) {//Step 1 : Methods Creation
		int result = a + b;
		System.out.println("result is : " + (a + b));
		return result;

	}

	public int sub(int a, int b) {
		int result = a - b;
		System.out.println("result is : " + (a - b));
		return result;
	}

	public int div(int a, int b) {
		int result = a / b;
		System.out.println("result is : " + (a / b));
		return result;
	}

	public int mul(int a, int b) {
		int result = a * b;
		System.out.println("result is : " + (a * b));
		return result;
	}

	public String getName(String fname, String lname) {
		String result = fname +" "+lname;
		System.out.println("result is : " + (fname+" "+lname));
		return result;
	}
}
