package org.comparable.interfaces;

public class Product {
	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		Integer x = a;
		Integer y = b;
		System.out.println(x.compareTo(y));

		Double d1 = 10.0;
		Double d2 = 10.0;
		System.out.println(d1.compareTo(d2));

		Long l1 = 9907296689L;
		Long l2 = 7987210395L;
		System.out.println(l1.compareTo(l2));

		Integer m = 20;
		Integer n = 10;
		System.out.println(m.compareTo(n));
		
	}
}
