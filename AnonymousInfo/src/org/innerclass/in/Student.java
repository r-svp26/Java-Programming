package org.innerclass.in;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student {

	public static void main(String[] args) {

		List<String> lst = new ArrayList<String>();

		lst.add("Rama");
		lst.add("Shyama");
		lst.add("Radha");
		lst.add("Khusi");
		lst.add("Jack");

		System.out.println("Student " + lst);

		System.out.println("Sorting in Ascending order !");
		Collections.sort(lst);
		System.out.println("Student " + lst);

		System.out.println("----------------------");

		List<String> ls = new ArrayList<String>();

		ls.add("Rama");
		ls.add("Shyama");
		ls.add("Radha");
		ls.add("Khusi");
		ls.add("Jack");
		System.out.println("Name " + lst);

		/* LOcal Inner Class */
		class MyComparator implements Comparator<String> {

			@Override
			public int compare(String s1, String s2) {
				return -s1.compareTo(s2); // Put - for in Descending order.
			}
		}

		Comparator<String> cmptr = new MyComparator();

		System.out.println("Sorting in Decending order !");
		Collections.sort(ls, cmptr);
		System.out.println("Name " + ls);
	}
}
