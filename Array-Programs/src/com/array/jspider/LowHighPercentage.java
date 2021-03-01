package com.array.jspider;

// WAJP to read N students percentage and display the lowest and highest percentage

import java.util.Scanner;

public class LowHighPercentage {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the size of array:");

		int n = sc.nextInt();
		double[] per = new double[n];
		System.out.println("Enter " + n + " students percentage one by one");

		for (int i = 0; i < n; i++) {
			per[i] = sc.nextDouble();
		}
		
		double low = per[0];
		double high = per[1];
		
		for (int i = 1; i < n; i++) {
			
			if (per[i] < low) {
				low = per[i];
			} else if (per[i] > high) {
				high = per[i];
			}
		}
		System.out.println("Lowest percentage is: " + low);
		System.out.println("Highest percentage is: " + high);
		sc.close();
	}
}
