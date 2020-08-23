package org.Matrix;
/* WAJPT PRINT MATRIX*/
public class Matrix_1 {
	public static void main(String[] args) {
		int mat [][]= {{2,4,6,8},{3,6,9,12},{4,8,12,16}};
		
		System.out.println(mat[1][2]);
		System.out.println(mat[2][3]);
		
		System.out.println("no. of rows: "+mat.length);
		System.out.println("no. of element of in the first row: "+mat[0].length);
		System.out.println("no. of element in the second row: "+mat[1].length);
		
		for(int i=0;i<mat.length;i++) {  //NO. OF ROW.
			for(int j=0;j<mat[i].length;j++) {  //NO. OF ELEMENTS IN EACH ROW.
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
