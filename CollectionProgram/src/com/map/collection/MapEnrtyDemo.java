package com.map.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapEnrtyDemo {

	public static void main(String[] args) {
		
		Map<Integer, String> map=new HashMap<>();
		
		map.put(1, "Dhoni");
		map.put(2, "Kohli");
		
		System.out.println(map);
		System.out.println("---------------");
		
		map.replace(2, "Rohit");
		System.out.println(map);
		
		Set<Integer> key=map.keySet();
		System.out.println(key);
		
		Collection<String> value=map.values();
		System.out.println(value);
		
		System.out.println("<-----------Entry Set-------------->");
		Set<Entry<Integer, String>> entry=map.entrySet();
		System.out.println(entry);
		
		
		
		
		
		
		
	}
}
