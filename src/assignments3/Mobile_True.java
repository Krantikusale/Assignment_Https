package assignments3;

import java.util.LinkedList;
import java.util.List;

public class Mobile_True {

	public static void main(String[] args) {
		List<String> subjects = new LinkedList<>();
		subjects.add("Web Automation");
		subjects.add("API Automation");
		subjects.add("Mobile Automation");
		
		System.out.println(subjects);

		boolean data= subjects.contains("Mobile Automation");
		System.out.println("output of contains method is : "+data);

		if (data) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}

}
