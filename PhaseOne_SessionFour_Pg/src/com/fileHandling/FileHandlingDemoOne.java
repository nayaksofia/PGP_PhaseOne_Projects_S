package com.fileHandling;

import java.io.File;
import java.io.IOException;


public class FileHandlingDemoOne {

	public static void main(String[] args) throws IOException {
		// Creating a new File
		
		try {
			//To create a file in a specific directory (requires permission), specify the path of the file and use double
			//backslashes to escape 
			File file = new File("C:\\java program\\data.txt");
			file.createNewFile();
			System.out.println("File Created Successfully..");
		  }  catch (IOException ex) {
			System.out.println(ex);
		}

	}

}
