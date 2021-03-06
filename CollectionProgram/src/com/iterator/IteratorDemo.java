package com.iterator;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class IteratorDemo {

	public static void main(String[] args) {

		List<String> lst = new ArrayList<>();
		lst.add("Rama");
		lst.add("Khusi");
		lst.add("null");
		lst.add("Rama");
		lst.add("Radha");
		lst.add("Shyama");

		System.out.println("LIST ELEMENT " + lst);

		Iterator<String> itr = lst.iterator();

		while (itr.hasNext()) {
			String name = itr.next();
			System.out.println(name);
			if (name == "Radha")
				itr.remove();
		}
		System.out.println("--------------------------------------------------------");
		System.out.println("LIST AFTER ITERATION " + lst);

		
		System.out.println("-----------------------SET STARTED----------------------------");
		/* Iteration using Iterator: HashSet */
		Set<String> hs = new HashSet<>();
		hs.add("Rama");
		hs.add("Khusi");
		hs.add("null");
		hs.add("Rama");
		hs.add("Radha");
		hs.add("Shyama");

		System.out.println("SET ELEMENT " + hs);

		Iterator<String> itrs = hs.iterator();

		while (itrs.hasNext()) {
			String name = itrs.next();
			System.out.println(name);
			if (name == "Radha")
				itrs.remove();
		}
		System.out.println("--------------------------------------------------------");
		System.out.println("SET AFTER ITERATION " + hs);
	}
}
