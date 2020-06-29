package com.basic.in;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Year: ");

		int yr = sc.nextInt();

		if ( yr % 400 == 0 || yr % 4 == 0 && yr % 100 != 0 )
			System.out.println(yr + "," + " Is a leap Year");
		else
			System.out.println(yr + "," + " Not a leap Year");
		sc.close();
	}
}
