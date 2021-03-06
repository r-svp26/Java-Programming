package com.iterator;

import java.util.List;
import java.util.ListIterator;
import java.util.Vector;

public class ListIteratorDemo {

	public static void main(String[] args) {
		
		List<String> lst=new Vector<>();
		lst.add("Rama");
		lst.add("null");
		lst.add("Shyama");
		lst.add("Radha");
		lst.add("Khusi");
		lst.add("Sonam");
		lst.add("null");
		lst.add("Radha");
		
		System.out.println("Vector Elements"+lst);
		System.out.println("----------F---O---R----W----A----R---D---------------------------------");
		
		/* ListIteraror: Iteration in Forward Direction */
		ListIterator<String> itr=lst.listIterator();
		
		while(itr.hasNext()){
			String name=itr.next();
			System.out.println(name);
		}
		System.out.println("----------B--A---C--K---W---A---R----D----------------------------------");
		
		/* ListIteraror: Iteration in Backward Direction */
		ListIterator<String> l_itr=lst.listIterator(lst.size());
		
		while(l_itr.hasPrevious()){
			String info=l_itr.previous();
			System.out.println(info);
		}
	}
}
