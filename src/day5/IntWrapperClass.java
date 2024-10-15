package day5;

public class IntWrapperClass {

	public static void main(String[] args) {
		String msg = "The Price is 12300 INR";
		String a[]=msg.split(" ");
		
		System.out.println("Value of price is : "+a[3]);
		
		int price =Integer.parseInt(a[3]);
		System.out.println("value of valueOf is :"+Integer.valueOf(a[3]));
		if(price==12300)
		{System.out.println("Pass");}
		else
		{System.out.println("Fail");
	}
}
}