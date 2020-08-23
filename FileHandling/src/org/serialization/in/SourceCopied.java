package org.serialization.in;

import java.io.FileInputStream;
import java.io.IOException;

/* WAJP to Display Same Program Content( Source Code ) on the Console */

public class SourceCopied {

	public static void main(String[] args) throws IOException {
		System.out.println("Main method Started...");

		FileInputStream fin = new FileInputStream("V:/Programming/FileHandling/src/org/serialization/in/SourceCopied.java");

		int i, count = 0;
		while ((i = fin.read()) != -1) {
			System.out.print((char) i);
			if (i == '\n')
				count++;
		}
		fin.close();
		System.out.println("Number of lines of Source code:" + count);
		
		System.out.println("Main method End!");
	}
}
