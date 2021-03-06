package com.map.collection;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		Map<Integer, String> tmap = new TreeMap<>();

		tmap.put(1, "Kaur");
		tmap.put(2, "Krishna Murthy");
		tmap.put(4, "Mitali");
		tmap.put(3, "Verma");
		tmap.put(5, "Mandhana");

		System.out.println("TreeMap Element " + tmap);

		System.out.println("-------------------------------------------------------------------------");
		System.out.println("TreeMap Iteration Using entrySet()");

		Set<Entry<Integer, String>> entryset = tmap.entrySet();
		for (Entry<Integer, String> entry : entryset) {
			// Integer key = entry.getKey();
			// String value = entry.getValue();
			// System.out.println("Key:" + key + " Value=" + value);

			System.out.println(entry);
		}

	}
}
