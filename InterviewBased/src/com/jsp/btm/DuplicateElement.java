package com.jsp.btm;

import java.util.ArrayList;
import java.util.List;

public class DuplicateElement {

	public static void main(String[] args) {

		List<Integer> lst = new ArrayList<Integer>();

		lst.add(10);
		lst.add(15);
		lst.add(12);
		lst.add(15);
		lst.add(29);
		lst.add(29);

		Object[] arr = lst.toArray();

		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
		}
		System.out.println("Number of Duplicate Element Present:" + count);
	}
}