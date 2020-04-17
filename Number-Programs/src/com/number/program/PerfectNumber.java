package com.number.program;

import java.util.Scanner;

public class PerfectNumber {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int num= sc.nextInt();
		int sum = 1;
		
		for (int i = 2; i <= num/ 2; i++) {
			if (num % i == 0) {
				sum = sum + i;
			}
		}
		if (sum == num) {
			System.out.println("The given number is perfect");
		} else {
			System.out.println("The given number is not a perfect");
			}
		sc.close();
		}
	}

