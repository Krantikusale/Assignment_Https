package day11;

import java.util.Map;
import java.util.TreeMap;

public class BooleanTreeMap {

	public static void main(String[] args) {
		Map<Boolean, String> m3 = new TreeMap<>();
		m3.put(true, "Selenium");
		m3.put(false, "c");

		System.out.println(m3);/*
								 * using Boolean as a key in a TreeMap is limited due to the fact that Boolean
								 * can only have two distinct values: true and false. This limitation means that
								 * you can only store two entries in the TreeMap if you're using Boolean keys.
								 * Once you've added records for both true and false, you cannot add additional
								 * distinct boolean keys because there are no other boolean values.
								 */

	}

}
