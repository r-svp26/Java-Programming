package com.map.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapIteration {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();

		map.put(1, "Kaur");
		map.put(2, "Krishna Murthy");
		map.put(4, "Mitali");
		map.put(3, "Verma");
		map.put(5, "Mandhana");

		System.out.println("Map Element " + map);
		
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Iterating Map Using keySet()");
		Set<Integer> keyset = map.keySet();
		for (Integer key : keyset) {
			System.out.println("Key: " + key);
		}
		
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Iterating Map Using values()");
		Collection<String> values = map.values();
		for (String value : values) {
			System.out.println("Value= " + value);
		}
		
		System.out.println("----------------------------------------------------------------------");
		System.out.println("Iterating Map Using entrySet()");
		Set<Entry<Integer, String>> entryset = map.entrySet();
		for (Entry<Integer, String> entry : entryset) {
			Integer key = entry.getKey();
			String value = entry.getValue();
			System.out.println("Key: " + key + " Value= " + value);
		}

	}
}
