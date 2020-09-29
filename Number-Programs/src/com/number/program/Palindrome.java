package com.number.program;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int num = sc.nextInt();

		int temp= num;
		int rev = 0;

		while (num > 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		if (temp == rev)
			System.out.println(temp + " is a Palindrome");
		else
			System.out.println(temp + " is not a Palindrome");
		sc.close();
		
	}
}
