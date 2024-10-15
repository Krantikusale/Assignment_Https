package assignments3;

import java.util.Arrays;
import java.util.List;

public class SumOfList {

	public static void main(String[] args) {
		List<Integer> num=Arrays.asList(12,23,34,45);
		int sum = num.get(0)+num.get(1)+num.get(2)+num.get(3);
		System.out.println("Sum of List numbers is : "+sum);
	}

}
