package day5;

public class ObjArray {

	public static void main(String[] args) {
		Object o[] = { 13, 23.90, 'k', "KRanti", true };

		for (Object obj : o) {
			System.out.println("Values are in array :" + obj);
		}
		System.out.println("Value at index 1 :" + o[1]);
	}

}
