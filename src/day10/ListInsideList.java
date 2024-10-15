package day10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListInsideList {

	public static void main(String[] args) {
		
		List<List<Integer>> allList = new ArrayList<>();
		
		List<Integer> l1 = Arrays.asList(12, 23, 24);
		List<Integer> l2 = Arrays.asList(120, 230, 240);
		List<Integer> l3 = Arrays.asList(112, 123, 124);
		
		allList.add(l1);
		allList.add(l2);
		allList.add(l3);

		System.out.println(allList);
		System.out.println("Value at 1st index of l2 list is :"+allList.get(1).get(1));
	}

}
