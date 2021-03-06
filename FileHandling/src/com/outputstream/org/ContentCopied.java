package com.outputstream.org;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ContentCopied {

	public static void main(String[] args) {

		FileInputStream fin = null;
		FileOutputStream fout = null;

		try {

			fin = new FileInputStream("V:/Programming/TextFile/OriginalFile.txt");
			fout = new FileOutputStream("V:/Programming/TextFile/CopiedFile.txt");

			int i;
			while ((i = fin.read()) != -1) {
				Thread.sleep(40);
				System.out.print((char) i + "");
			}
			// System.out.println("Text copied successfully !");

		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException x) {
			System.out.println(x.getMessage());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} finally {
			try {
				fout.flush();
				fin.close();
				fout.close();

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
