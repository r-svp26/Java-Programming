package com.number.program;

import java.util.Scanner;

public class Factorial {

	public static int fact(int num) {
		
		int fact = 1;
		while (num > 1) {
			fact = fact * num;
			num--;
		}
		return fact;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int num = sc.nextInt();

		int fact = Factorial.fact(num);
		System.out.println(fact);
		sc.close();
	}
}

/*
 * for(int i=1;i<=n;i++){ fact=fact*i; }
 */