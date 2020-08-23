package org.serialization.in;

/* WAJP to write one file to another file with help of File Extension(.java) */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

public class FileInfoCopied {

	@SuppressWarnings({ "rawtypes", "unchecked", "resource" })
	public static void main(String[] args) throws IOException {

		File file = new File("V:/Programming/TextFile");
		File[] files = file.listFiles();

		Vector vector = new Vector();

		for (int i = 0; i < files.length; i++) {
			if (files[i].getName().endsWith(".java")) {
				FileInputStream fin = new FileInputStream(files[i]);
				vector.add(fin);
			}
		}

		FileOutputStream fout = new FileOutputStream("V:/Programming/TextFile/MyNote");

		Enumeration element = vector.elements();
		SequenceInputStream sis = new SequenceInputStream(element);

		int i;
		while ((i = sis.read()) != -1) {
			fout.write(i);
		}
		fout.flush();
		fout.close();

		System.out.println("Successfully copied.....");
	}
}
