package com.java8.filehandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Filewriter {

	

	public static void main(String[] args) throws IOException {

		//if u enable append to true that many times same lines will be added
		FileWriter writer=new FileWriter
				("C:\\Users\\006299\\PracticePrograms\\java8\\textfiles\\sample.txt");
		
		
		writer.write(100);
		writer.write(10);
		writer.write("manasa");
		//to add white space character like go to next line give 10 
		writer.write(10);
		char[] ch={'c','g','f'};
		writer.write(ch);
		writer.flush();
		//System.out.println(writer.append('f'));
		
		
		FileWriter fw=new FileWriter("C:\\Users\\006299\\PracticePrograms\\java8\\textfiles\\h1.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		char[] ch1={'m','k','r'};
		
		bw.write(99);//it will store as c instead of 99
		bw.newLine();
		bw.write(ch1);
		bw.newLine();
		bw.write("mkdir");
		bw.flush();
		bw.close();
		fw.close();
		
		
		PrintWriter pw=new PrintWriter("C:\\\\Users\\\\006299\\\\PracticePrograms\\\\java8\\\\textfiles\\\\h.txt");
		pw.write(23);
		pw.close();
		
	
		

	}

}
