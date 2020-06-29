package com.number.program;

import java.util.Scanner;

public class Special2Digit {

	public static boolean isSpl2Digit(int num) {
		
		int a=num%10;
		int b=num/10;
		int splDigit=((a+b)+(a*b));
		
		if(splDigit==num){
		return true;
		}
		return false;
	}
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int n = sc.nextInt();

		boolean rs = isSpl2Digit(n);
		System.out.println(rs);
		sc.close();
	}
}
