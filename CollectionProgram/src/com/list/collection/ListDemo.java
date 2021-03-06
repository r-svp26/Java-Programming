package com.list.collection;

import java.util.LinkedList;

public class ListDemo {

	public static void main(String[] args) {

		Product p1 = new Product(500, 2, "WaterBottle");
		Product p2 = new Product(1200, 1, "Milton Jug");

		LinkedList<Product> lst = new LinkedList<Product>();
		lst.add(p1);
		lst.add(p2);
		
		Product p10=new Product(2100,2,"Milk Port");
		
		lst.add(1, p10);
		
		for(Product p:lst){
			System.out.println(p.price+" "+p.qty+" "+" "+p.type);
		}
	}
}
