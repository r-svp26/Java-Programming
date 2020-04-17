package com.javabean.in;

public class TestBean {
	
	public static void main(String[] args) {
		
		Student s = new Student();
		s.setId(101);
		s.setName("Khusi Yadav");
		s.setBranch("CSE");
		s.setPhone(9907296689l);
		
		Student s1 = new Student();
		s1.setId(102);
		s1.setName("Ritesh Yadav");
		s1.setBranch("ECE");
		s1.setPhone(7987210395l);
		
		System.out.println(s.getId());
		System.out.println(s.getName());
		System.out.println(s.getBranch());
		System.out.println(s.getPhone());
		
		System.out.println("...............");
		
		System.out.println(s1.getId());
		System.out.println(s1.getName());
		System.out.println(s1.getBranch());
		System.out.println(s1.getPhone());
	}

}
