package com.inputstream.org;

/*  WAJP to read the content of the File */

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ContentRead {

	public static void main(String[] args) {

		FileInputStream fis = null;
		try {
			fis = new FileInputStream("V:/Programming/TextFile/InputFile.txt");

			int i;
			while ((i = fis.read()) != -1) {
				System.out.print((char) i);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
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
