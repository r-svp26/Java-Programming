package org.Matrix;
/*...WAJPT PRINT HOW TO PRINT MATRIX AND ITS LENGTH OF ROW AND LENGTH OF COLOMN...*/
public class Matrix_2 {
	public static void main(String[] args) {
		int arr[][]=new int [4][3];
		System.out.println("no of rows: "+arr.length);
		System.out.println("no. of column: "+arr[0].length);
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
}
