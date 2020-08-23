package com.inputstream.org;

/*  WAJP to count Number of character in a File */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CountFileCharacter {

	public static void main(String[] args) {

		FileInputStream fis = null;

		try {

			fis = new FileInputStream("V:/Programming/TextFile/InputFile.txt");
			System.out.println(fis.available());

		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
