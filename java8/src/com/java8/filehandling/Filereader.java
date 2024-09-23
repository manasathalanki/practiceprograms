package com.java8.filehandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Filereader {

	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("C:\\Users\\006299\\PracticePrograms\\java8\\textfiles\\sample.txt");

	//	System.out.println(fr.read());
		//whenever reading from filereader it will returns ascii values of that character 
		//System.out.println(fr.read());
		
		FileReader f=new FileReader("C:\\\\Users\\\\006299\\\\PracticePrograms\\\\java8\\\\textfiles\\\\h.txt");
		
		BufferedReader br=new BufferedReader(f);
	
		String line=br.readLine();
		while(line!=null)
		{
			System.out.println(line);
			line=br.readLine();
		}
		System.out.println(br.read());
		System.out.println(br.readLine());
	}

}
