package com.filehandling.in;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadTextFile {
	public static void main(String[] args) {
		try {
			FileReader rd=new FileReader("E:\\love.txt");
			BufferedReader br=new BufferedReader(rd);
			
			String st="";
			
			while((st=br.readLine())!=null){
				System.out.println(st);
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
