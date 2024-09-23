package com.java8.filehandling;

import java.io.File;
import java.io.IOException;

public class FileInputOutput {
	public static void main(String[] args) throws IOException {

		//bcoz of this file wont be created
		//whenever file is created then it will create with this name
		
		File file = new File("textfiles");
		
			//file.createNewFile();
		//for making the dir 
	//	file.mkdir();
		
		//to check whether the file exist or not
		System.out.println(file.exists());
		// to get the path of the file created
		
		System.out.println(file.getCanonicalPath());
		
		
		
		
		File f=new File("textfiles", "h.txt");
		System.out.println(f.createNewFile());
		System.out.println(f.isFile());
		System.out.println(f.isDirectory());
		System.out.println(f.canRead());
		System.out.println(f.canWrite());
		System.out.println(f.getCanonicalPath());
		System.out.println(f.getAbsolutePath());
		//f.createNewFile();
		System.out.println(f.createNewFile());
	}

}
