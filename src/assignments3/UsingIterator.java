package assignments3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UsingIterator {

	public static void main(String[] args) {
		List<Integer> list2 = new ArrayList<>();
		list2.add(200);
		list2.add(201);
		list2.add(202);
		list2.add(203);
		System.out.println(list2);

		System.out.println("****************");
		
		Iterator<Integer> itr = list2.iterator();
		while (itr.hasNext()) {
			Integer i = itr.next();
			System.out.println(i);
		}

	}

}
