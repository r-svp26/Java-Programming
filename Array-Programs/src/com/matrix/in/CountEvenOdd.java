package com.matrix.in;

public class CountEvenOdd {

	public static void main(String[] args) {

		int[][] mat = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		int ecount = 0, ocount = 0;
		
		System.out.println("USER ENTERED MATRIX");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print(mat[i][j] + " ");
				if (mat[i][j] % 2 == 0)
					ecount++;
				else
					ocount++;
			}
			System.out.println();
		}
		System.out.println("The Number of Even Element is:" + ecount);
		System.out.println("The Number of Even Element is:" + ocount);
	}
}
