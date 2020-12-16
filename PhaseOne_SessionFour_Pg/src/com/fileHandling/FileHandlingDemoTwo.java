package com.fileHandling;

import java.io.File;

//Delete file 

public class FileHandlingDemoTwo {

	public static void main(String[] args) {
		
		File file = new File("C:\\java program\\data.txt");
		file.delete();
		System.out.println("File Deleted Sucsessfully....");

	}

}
