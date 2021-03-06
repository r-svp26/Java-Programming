package com.map.collection;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapDemo {

	public static void main(String[] args) {

		Map<Integer, String> map = new LinkedHashMap<>();

		map.put(1, "Kaur");
		map.put(2, "Krishna Murthy");
		map.put(4, "Mitali");
		map.put(3, "Verma");
		map.put(6, null);
		map.put(5, "Mandhana");

		System.out.println("LinkedHashMap Element " + map);

		System.out.println("--------------------------------------------------------------------------------");
		System.out.println("LinkedHashMap Iteration Using entrySet()");

		Set<Entry<Integer, String>> entryset = map.entrySet();
		for (Entry<Integer, String> entry : entryset) {
			// Integer key = entry.getKey();
			// String value = entry.getValue();
			// System.out.println("Key:" + key + " Value=" + value);

			System.out.println(entry);
		}

	}
}
