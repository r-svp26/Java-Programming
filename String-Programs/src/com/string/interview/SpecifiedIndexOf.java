package com.string.interview;

import java.util.Scanner;

public class SpecifiedIndexOf {
	
	public static int specifiedIndexOf(String s1,String s2,int occ){
		
		char[] ch1=s1.toCharArray();
		char[] ch2=s2.toCharArray();
		
		for(int i=0;i<ch1.length;i++){
			int j=0;
			int k=i;
			
			while(k<ch1.length&& j<ch2.length && ch1[k]==ch2[j]){
				j++;
				k++;
			}
			if(j==ch2.length){
				occ--;
				if(occ==0)
					return i;
				i=k-1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the First String:");
		String s1=sc.nextLine();
		
		System.out.print("Enter the First String:");
		String s2=sc.nextLine();
		
		int index=specifiedIndexOf(s1,s2,3);
		System.out.println(index);
		
		sc.close();
	}
}
