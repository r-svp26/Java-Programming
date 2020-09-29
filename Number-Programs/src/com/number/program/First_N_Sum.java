package com.number.program;

import java.util.Scanner;

public class First_N_Sum {

	public static int addRange(int num) {
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum = sum + i;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int x = sc.nextInt();
		System.out.println(First_N_Sum.addRange(x));
		sc.close();
	}
}

// int i = 1;
// while (num >= i) {
// sum = sum + i;
// i++;
// }