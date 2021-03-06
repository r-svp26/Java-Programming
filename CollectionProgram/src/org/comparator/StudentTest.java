package org.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentTest {

	public static void main(String[] args) {

		List<Student> student = new ArrayList<Student>();

		student.add(new Student(1, "Ritesh", "CS", "BTM"));
		student.add(new Student(4, "Khusi", "EC", "Delhi"));
		student.add(new Student(2, "Shyama", "IS", "Pune"));
		student.add(new Student(3, "Deepika", "BEE", "Patna"));
		student.add(new Student(5, "Radha", "CE", "Bhopal"));

		System.out.println("Sorting using Student ID: Comparator");
		
		Comparator<Student> id_cmptr = new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				if (s1.getId() > s2.getId())
					return 1;
				else if (s1.getId() < s2.getId())
					return -1;
				else
					return 0;
			}
		};
		Collections.sort(student, id_cmptr);
		for (Student s : student) {
			System.out.println(s);
		}

		System.out.println("------------------------------------------------------");

		System.out.println("Sorting using Student Name: Comparator");
		
		Comparator<Student> name_cmptr = new Comparator<Student>() {
			@Override
			public int compare(Student s1, Student s2) {
				return s1.getName().compareTo(s2.getName());
			}
		};
		Collections.sort(student, name_cmptr);
		for (Student s : student) {
			System.out.println(s);
		}
	}
}
