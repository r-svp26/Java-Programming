package com.set.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetIntrfaceDemo {

	public static void main(String[] args) {

		/* HashSet Operations */
		Set<Integer> hs = new HashSet<Integer>();
		hs.add(1);
		hs.add(3);
		hs.add(2);
		hs.add(null);
		hs.add(3);
		hs.add(null);
		System.out.println(hs);

		System.out.println("-----------------");

		/* LinkedHashSet Operations */
		Set<Integer> lhs = new LinkedHashSet<Integer>();
		lhs.add(1);
		lhs.add(3);
		lhs.add(2);
		lhs.add(null);
		lhs.add(3);
		lhs.add(null);
		System.out.println(lhs);

		System.out.println("-----------------");

		/* TreeSet Operations */
		Set<Integer> ts = new TreeSet<Integer>();
		try{
			ts.add(1);
			ts.add(3);
			ts.add(2);
			ts.add(null);
			ts.add(3);
		}catch(NullPointerException e){
			//e.printStackTrace();
			System.out.println(e);
		}
		System.out.println(ts);
		
	}
}
