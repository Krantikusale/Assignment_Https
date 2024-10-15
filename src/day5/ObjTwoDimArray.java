package day5;

public class ObjTwoDimArray {

	public static void main(String[] args) {
		Object obj[][] = new Object[2][2];
		obj[0][0] = 120;
		obj[0][1] = 121.90;
		obj[1][0] = 'k';
		obj[1][1] = "PK";

		System.out.println(obj[0][0]);
		System.out.println("           ");

		for (Object o[] : obj) {
			for (Object element : o) {
				System.out.println(element);
			}
		}

	}

}
