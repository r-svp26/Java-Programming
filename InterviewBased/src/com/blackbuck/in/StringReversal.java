package com.blackbuck.in;

import java.util.Scanner;

public class StringReversal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the String:");
		String st = sc.nextLine();

		char[] ch = st.toCharArray();
		String rst = "";

		for (int i = ch.length - 1; i >= 0; i--) {
			int j =i;
			while (i >= 0 && ch[i] != ' ') 
				i--;

			int k = i + 1;
			while (k <= j) {
				rst = rst + ch[k];
				k++;
			}
			if (i >= 0)
				rst = rst + " ";
		}
		
		char[] rev = rst.toCharArray();		
		for(int i=0;i<rev.length;i++){
			if(rev[0] >= 'a' && rev[0] <= 'z')
				rev[0] = (char) (rev[0] - 32);
		}
		String string=new String(rev);
		System.out.println(string);
		sc.close();
	}
}
