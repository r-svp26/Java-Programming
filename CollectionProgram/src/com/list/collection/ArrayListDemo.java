package com.list.collection;

import java.util.ArrayList;

public class ArrayListDemo {
	public static void main(String[] args) {

		ArrayList<String> al = new ArrayList<String>();
		al.add("Abhinav Kumar");
		al.add("Ritesh Kumar");
		al.add(null);
		al.add("Khusi Yadav");
		al.add(null);
		al.add("Suhani Yadav");
		al.add("Suhani Yadav");
		
		System.out.println("ARRAYLIST ELEMENTS "+al);
		System.out.println("-----------------------------------");

		System.out.println("Iteration in the Forward Direction");
		for (int i = 0; i < al.size(); i++) {
			String info = al.get(i);
			System.out.println(info);
		}
		
		System.out.println("-----------------------------------");
		
		System.out.println("Iteration in the Backward Direction");
		for(int i=al.size()-1;i>=0;i--){
			String info=al.get(i);
			System.out.println(info);
		}
	}
}
