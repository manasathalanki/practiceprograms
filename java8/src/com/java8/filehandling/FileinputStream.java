package com.java8.filehandling;

import java.io.FileInputStream;
import java.io.IOException;

public class FileinputStream {

	public static void main(String[] args) throws IOException {
	//	byte[] b=new byte[100];
		
		FileInputStream file=new FileInputStream("C:\\\\\\\\Users\\\\\\\\006299\\\\\\\\PracticePrograms\\\\\\\\java8\\\\\\\\textfiles\\\\\\\\h1.txt");
		int i=file.read();
		while(i!=-1)
		{
			System.out.println(i+" ");
			i=file.read();
		}
		
		file.close();

	}

}
