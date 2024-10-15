package day4;

public class Array1 {

	public static void main(String[] args) {
	int a[]=new int[4];
	a[0]=10;
	a[1]=100;
	a[2]=102;
	a[3]=103;
	a[3]=109;//overrides the value previously assigned at index 3 and sets it to 109
		
	System.out.println(a[3]);
 	} 
}
