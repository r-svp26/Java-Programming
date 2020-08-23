package com.inputstream.org;

/*  WAJP to display the keyboard character/inputs in a File */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class DisplayInputCharacter {

	public static void main(String[] args) {

		FileInputStream fis = null;
		try {
			fis = new FileInputStream("V:/Programming/TextFile/InputFile.txt");

			byte[] b = new byte[129];
			fis.read(b);

			for (int i = 0; i < b.length; i++) {
				
				//if(i>=65 && i<=90 || i>=97 && i<=122 || i>=48 && i<=57)
				System.out.print((char)i+" ");
			}

		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			System.out.println(e);
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
