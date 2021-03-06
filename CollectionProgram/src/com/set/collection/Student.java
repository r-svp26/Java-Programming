package com.set.collection;

public class Student {

	private int id;
	private String name;
	private String loc;

	public Student(int id, String name, String loc) {
		super();
		this.id = id;
		this.name = name;
		this.loc = loc;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	@Override
	public boolean equals(Object st) {
		boolean resp = false;

		if (st instanceof Student) {

			Student student = (Student) st;
			if (this.name == student.name)
				resp = true;
		}
		return resp;
	}

	public static void main(String[] args) {

		Student s1 = new Student(1, "Ritesh Yadav", "Bengaluru");
		Student s2 = new Student(2, "Ritesh Yadav", "Bhopal");
		Student s3 = new Student(3, "Khusi Yadav", "Patna");

		System.out.println(s1.getId() + " " + s1.getName() + " " + s1.loc);
		System.out.println(s2.getId() + " " + s2.getName() + " " + s2.loc);
		System.out.println(s3.getId() + " " + s3.getName() + " " + s3.loc);
		System.out.println("-------------------------------");

		System.out.println("Checking Object equality based on the content.....");
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));

	}
}
