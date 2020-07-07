package com.jsp.btm;

public class PString {

	public static void main(String[] args) {
		String s="tacocat";
		int count=0;
		char[] ch = s.toCharArray();
		for(int i=0;i<ch.length;i++){
			System.out.print(ch[i]+" ");
			count++;
		}
		System.out.println();
		System.out.println(count);
	}
}
