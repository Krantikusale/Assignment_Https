package assignments1;

public class StringBreak {

	public static void main(String[] args) {
		String a[] = new String[5];
		a[0] = "Java";
		a[1] = "JavaScript";
		a[2] = "Selenium";
		a[3] = "Python";
		a[4] = "Mukesh";

		for (String name : a) {
			if (name == "Selenium") {
				System.out.println("Selenium found, hence Break the execution");
				break;

			}
			System.out.println("Values are : "+name);
		}

	}

}
