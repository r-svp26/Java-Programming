package com.map.collection;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {

		Map<Integer, String> hsmap = new HashMap<>();

		hsmap.put(1, "Kohli");
		hsmap.put(2, "Dhoni");
		hsmap.put(5, "Raina");
		hsmap.put(4, "Mandhana");
		hsmap.put(6, "Kaur");
		hsmap.put(7, "Rohit");
		hsmap.put(3, "Raina");

		System.out.println(hsmap);
		System.out.println("Size of the Map:" + hsmap.size());
		System.out.println(hsmap.isEmpty());

		int code = hsmap.hashCode();
		System.out.println(code);

		hsmap.replace(3, "Deepika");
		System.out.println("-----------------------------------------------------------------------");
		System.out.println(hsmap);
		
		hsmap.remove(7);   // Rohit: Removed
		System.out.println("------------------------------------------------------------------------");
		System.out.println(hsmap);
		
		Map<Integer, String> iplmap = new HashMap<>();
		
		iplmap.put(10, "MI");
		iplmap.put(11, "CSK");
		iplmap.put(12, "KKR");
		
		System.out.println("--------------------------------------------------------------------------");
		iplmap.putAll(hsmap);
		
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println(iplmap);
		
		System.out.println("-------------------------------------------------------------------------------------");
		System.out.println(iplmap.containsKey(8));  // false
		System.out.println(iplmap.containsKey(10)); // true
		System.out.println(iplmap.containsValue("Deepika"));  // true
		System.out.println(iplmap.containsValue("Rohit"));  // false
		System.out.println(hsmap.containsValue("Rohit"));  // false
		System.out.println("-------------------------------------------------------------------------------------");
		
		System.out.println(iplmap.isEmpty()); // false
		System.out.println(iplmap.size()); // 9
		System.out.println(iplmap.get(10)); // MI
		
		
	}
}
