package com.number.program;

import java.util.Scanner;

public class DigitCount {

	public static int count(int num) {
		int count = 0;
		while (num > 0) {
			num = num / 10;
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int x = sc.nextInt();
		System.out.println(DigitCount.count(x));
		sc.close();
	}
}
