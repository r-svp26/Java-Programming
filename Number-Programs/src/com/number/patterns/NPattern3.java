package com.number.patterns;

import java.util.Scanner;
	
	/*  1 
		2 3 
		4 5 6 
		7 8 9 10 
		11 12 13 14 15  */

public class NPattern3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number:");
		int num=sc.nextInt();
		int count=0;
		
		for(int i=1;i<=num;i++){
			for(int j=1;j<=i;j++)
			{
				count=count+1;
				System.out.print(count+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}