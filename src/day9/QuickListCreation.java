package day9;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuickListCreation {

	public static void main(String[] args) {
		List<String> a1 = new ArrayList<>();
		a1.add("java");
		a1.add("c");

		List<String> a = Arrays.asList("KK", "PK", "PG");
		System.out.println(a1);
		System.out.println(a);

		List<Integer> b = Arrays.asList(12, 2, 232, 56);
		System.out.println(b);
	}

}
