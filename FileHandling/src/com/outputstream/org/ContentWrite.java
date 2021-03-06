package com.outputstream.org;

/* WAJP to write the text in a File */

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ContentWrite {

	public static void main(String[] args) {

		String st = "Text is written through Java code.";
		FileOutputStream fout = null;

		try {
			fout = new FileOutputStream("V:/Programming/TextFile/OutputFile.txt");
			byte[] b = st.getBytes();

			fout.write(b);
			fout.flush();
			System.out.println("Successfully,Content is written!");

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
