package org.comparable.interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentTest {

	public static void main(String[] args) {

		List<Student> lst = new ArrayList<>();
		Student s1 = new Student(1, "Ritesh Yadav", "CS", "BTM");
		
		lst.add(s1);
		lst.add(new Student(2, "Khusi Yadav", "EC", "Patna"));
		lst.add(new Student(5, "Radha", "IS", "Bhopal"));
		lst.add(new Student(3, "Shyama ", "ME", "Delhi"));
		lst.add(new Student(4, "Deepika", "ECE", "Pune"));

		Collections.sort(lst);

		System.out.println("Sorting Using Comparable Interface........");
		for (Student s : lst) {
			System.out.println(s);
		}
	}
}
