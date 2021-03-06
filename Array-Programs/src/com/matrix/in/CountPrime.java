package com.matrix.in;

import java.util.Scanner;

public class CountPrime {

	public static int[][] readMatrix() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Row and Column of  the Matrix:");
		int row = sc.nextInt();
		int col = sc.nextInt();

		int[][] mat = new int[row][col];

		System.out.println("Enter the " + (row * col) + " Matrix elements:");

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		sc.close();
		return mat;
	}

	public static void displayMatrix(int[][] mat) {

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static boolean isPrime(int n) {
		if (n <= 1) {
			return false;
		}
		for (int i = 2; i <=n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static int countPrime(int[][] mat) {
		int pcount = 0;

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (isPrime(mat[i][j])){
					System.out.println("Prime Number present in the Matrix:"+mat[i][j]+" ");
					pcount++;
				}
			}
		}
		return pcount;
	}

	public static void main(String[] args) {
		int[][] mat = readMatrix();

		System.out.println("USER ENTERED MATRIX");
		displayMatrix(mat);

		int pcount = countPrime(mat);
		System.out.print("The Number of Prime Number Present in the Matrix:" + pcount);
	}
}
