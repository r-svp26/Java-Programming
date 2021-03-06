package com.array.interview;

import java.util.Scanner;

public class ConvertNum2String {

	public static void numToString(int num, String st) {

		String[] one = { "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven",
				"Twelve", "Thirteen", "Fouteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen" };

		String[] two = { "", "", "Twenty", "Thirty", "Fourty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };

		if (num < 20)
			System.out.print(one[num]);
		else
			System.out.print(two[num / 10] + one[num % 10]);

		if (num != 0)
			System.out.print(st + " ");
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number:");
		int n = sc.nextInt();

		numToString(n / 10000000, "Crore");
		numToString(n / 100000 % 100, "Lacs");
		numToString(n / 1000 % 100, "Thousand");
		numToString(n / 100 % 10, "Hundred");
		numToString(n % 100, "");
		sc.close();
	}
}
