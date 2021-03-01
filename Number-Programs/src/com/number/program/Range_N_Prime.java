package com.number.program;

public class Range_N_Prime {

	public static boolean isPrime(int num) {

		int i = 2;
		while (i <= num / 2) {
			if (num % i == 0)
				return false;
			i++;
		}
		return true;
	}

	public static void main(String[] args) {

		int count=0;
		for (int i = 2; i <= 50; i++) {
			boolean rs = isPrime(i);
			if (rs) {
				count++;
				System.out.print(i + " ");
				if (count == 15)
					break;
			}
		}
	}
}
