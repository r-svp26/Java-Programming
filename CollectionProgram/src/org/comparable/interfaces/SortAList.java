package org.comparable.interfaces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortAList {
	public static void main(String[] args) {
		
		List<String> lst=new ArrayList<>();
		
		lst.add("A");
		lst.add("X");
		lst.add("M");
		lst.add("B");
		
		System.out.println("List Element "+lst);
		
		System.out.println("Sorting Using Utility Method in Forward...");
		Collections.sort(lst);
		System.out.println(lst);
		
		System.out.println("Sorting Using Utility Method in Reverse Order...");
		Collections.sort(lst,Collections.reverseOrder());
		System.out.println(lst);
		
	}
}
