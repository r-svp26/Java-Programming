package org.file.in;

import java.io.File;

public class FileDemo {

	public static void main(String[] args) {

		try {
			File file = new File("V:/Programming/TextFile");

			System.out.println(file.exists());
			System.out.println(file.getAbsolutePath());

			System.out.println("-------------------------------------");

			String[] files = file.list();
			int count = 0;

			for (int i = 0; i < files.length; i++) {
				if (files[i].endsWith(".java")) {
					count++;
					System.out.println(files[i]);
				}
			}
			System.out.println("Number of .java files in the Folder:" + count);
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
	}
}
