package com.array.interview;

public class PerfectCount {

	public static boolean isPerfect(int n) {

		int sum = 0, i = 1;
		while (i <= n / 2) {
			if (n % i == 0)
				sum = sum + i;
			i++;
		}
		if (sum == n)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {

		int[] arr = { 2, 3, 5, 6, 28, 35 };
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			boolean rs = isPerfect(arr[i]);
			if (rs == true)
				count++;
		}
		System.out.println("PerfectNumber present in the Array:" + count);
	}
}
