package com.number.in;

import java.util.Scanner;

public class ArmstrongNumber {

	public static boolean isArmstrong(int num) {

		int sum = 0;
		int temp = num;

		while (num != 0) {
			int rem = num % 10;
			sum = sum + rem * rem * rem;
			num = num / 10;
		}
		if (sum == temp) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number:");
		int num = sc.nextInt();

		boolean rs = isArmstrong(num);
		System.out.println(rs);
		sc.close();

	}

}
