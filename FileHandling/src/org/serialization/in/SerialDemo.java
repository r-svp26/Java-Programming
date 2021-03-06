package org.serialization.in;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerialDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Student student = new Student(2, "Khusi Yadav", 86.20, "Patna");
		System.out.println(student);

		File file = new File("V:/Programming/TextFile/SerialObject.txt");

		/* To Write the Object in the File */
		FileOutputStream fout = new FileOutputStream(file);
		ObjectOutputStream obj_wrt = new ObjectOutputStream(fout);
		obj_wrt.writeObject(student);
		
		/* To Read the Object from the File */
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream obj_rd = new ObjectInputStream(fis);
		Student obj = (Student) obj_rd.readObject();
		System.out.println(obj);

		fout.flush();
		fout.close();
		obj_wrt.close();
		fis.close();

		System.out.println("Successfully Object is Serialized !");
	}
}
