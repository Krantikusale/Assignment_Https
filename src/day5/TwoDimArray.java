package day5;

public class TwoDimArray {

	public static void main(String[] args) {
		int a[][]=new int[2][2];
		a[0][0]=120;
		a[0][1]=121;
		a[1][0]=122;
		a[1][1]=123;
		System.out.println(a[1][1]);
		System.out.println("          ");
		for(int[] num:a)// Iterate through each row
		{for(int element:num)// Iterate through each element in the row 
			System.out.println(element);
		}
	}

}
