package com.number.program;

import java.util.Scanner;

// 153, 370, 371, 407......

public class ArmstrongNumber {

	public static boolean isArmstrong(int num) {

		int sum = 0, temp = num;

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
