package com.number.in;

import java.util.Scanner;

public class NPattern22 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number:");
		int n = sc.nextInt();
		
		int sp=0, ele=n;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=sp;j++){
				System.out.print("  ");
			}
			for(int k=1;k<=ele;k++){
				System.out.print(k+" ");
			}
			if(i<=n/2){
				sp++;
				ele=ele-2;
			}else{
				sp--;
				ele=ele+2;
			}
			System.out.println();
		}
		sc.close();
	}
}
