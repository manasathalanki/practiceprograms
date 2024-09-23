package com.java8.filehandling;

import java.io.FileOutputStream;

public class FileoutputStream {
    public static void main(String[] args) {
        
        String data = "This is a line of text inside the file.";

        try {
            FileOutputStream output = new FileOutputStream("C:\\\\Users\\\\006299\\\\PracticePrograms\\\\java8\\\\textfiles\\\\h1.txt");

            byte[] array = data.getBytes();

            // Writes byte to the file
            output.write(array);

            output.close();
        }

        catch(Exception e) {
            e.getStackTrace();
        }
    }
}