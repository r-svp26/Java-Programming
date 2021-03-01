package com.blackbuck;

import java.time.Instant;
import java.util.Scanner;

//import java.text.SimpleDateFormat;
//import java.time.Instant;
//import java.util.Calendar;

public class EpochTime {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the human readable date:");
		String stamp=sc.nextLine();
		System.out.println(stamp);
		
		long now = Instant.now().toEpochMilli();
		System.out.println(now);
		
		
		
		
		
		
		
/*		String timeStamp = new SimpleDateFormat("dd-MM-yyyy").format(Calendar.getInstance().getTime());
		System.out.println(timeStamp);
		
		long now = Instant.now().toEpochMilli();
		System.out.println(now);
*/
	sc.close();
		
	}
}
