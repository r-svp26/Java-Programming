package com.array.jspider;

//WAJP to calculate average price of fruits.

public class AveragePrice {

	public static void main(String[] args) {

		int[] price = { 853, 564, 845, 254, 325 };
		
		double total = 0;
		int n = price.length;
		
		for (int i = 0; i < n; i++) {
			total = total + price[i];
		}
		
		System.out.println("Total price: " + total);
		System.out.println("Average price: " + total / n);
	}
}
