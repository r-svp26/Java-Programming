package com.string.in;

import java.util.HashMap;
import java.util.Map;
//import java.util.Scanner;

public class CountWords {
	
	public static int countWord(String st){
		int count=1;
		for(int i=0;i<st.length();i++){
			if(st.charAt(i) == ' ' && i<st.length() -1 && st.charAt(i+1)!=' '){
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) {
		String str = "I love love java java programming";

		Map<String, Integer> map = new HashMap<String, Integer>();
		Integer count = 1;
		String[] arr = str.split(" ");

		for (int i = 0; i < arr.length; i++) {
			if (!map.containsKey(arr[i])) {
				map.put(arr[i], count);
			} else {
				map.put(arr[i], count + 1);
			}
		}
		// Printing output...
		for (String st : map.keySet()) {
			System.out.println("The count of word:" + st + "=" + map.get(st));
		}
		
		// To See total numbers of Words in sentence
		System.out.println("The total number of words are:"+countWord(str));
	}
}
