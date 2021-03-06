package com.number.program;

import java.util.Scanner;

public class StrongNumber {

	public static boolean isStrong(int num) {
		
		int sum = 0, temp = num;
		
		do {
			int rem = num % 10;
			int fact = 1;
			while (rem > 1) {
				fact = fact * rem;
				rem--;
			}
			sum = sum + fact;
			num = num / 10;
		} while (num != 0);

		if (sum == temp) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE NUMBER");
		int num = sc.nextInt();

		boolean rs = isStrong(num);
		System.out.println(rs);
		sc.close();
	}
}
