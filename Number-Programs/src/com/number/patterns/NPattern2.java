package com.number.patterns;

import java.util.Scanner;

	/*	1
		22
		333
		4444
		55555   */
	          
public class NPattern2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number:");
		int num=sc.nextInt();
		
		for(int i=1;i<=num;i++){
			for(int j=1;j<=i;j++)
			{
				System.out.print(i);
			}
			System.out.println("");
		}
		sc.close();
	}
}
