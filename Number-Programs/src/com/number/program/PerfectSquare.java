package com.number.program;

import java.util.Scanner;


public class PerfectSquare {

	public static boolean isPerfect(int num) {

		for (int i = 1; i <= num/2; i++) {
			int perfect;
			if (num % i == 0) {
				perfect = i * i;
				
				if (num == perfect)
					return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		
		int p = sc.nextInt();
		System.out.println(PerfectSquare.isPerfect(p));
		sc.close();
	}
}