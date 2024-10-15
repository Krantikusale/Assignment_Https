package day5;

public class ForEachLoop_Array {

	public static void main(String[] args) {
		String k[] = {"abc","xyz","pqr","efg"};
		for(String str:k)
		{
			System.out.println("Container values are :" +str);
		}
		
		boolean b[]= {true,false};
		for(boolean b1:b)
		{
			System.out.println("Values are in array is :" +b1);
		}
	}

}
