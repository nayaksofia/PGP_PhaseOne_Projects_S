package com.fileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

//Write operation 

public class FileHandlingDemoFour {

	public static void main(String[] args) throws IOException{
		
		try {
			//File file = new File("D:\\data.txt");
			// OutputStream os = new FileOutputStream(new File("D:\\data.txt"));
			OutputStream os = new FileOutputStream(new File("C:\\java program\\data.txt"));
			String data = "Hello World...";
			os.write(data.getBytes(),0,data.length());
			System.out.println("File write operation completed succesfully....");
		 } catch(Exception e) {
			System.out.println(e.getMessage());
		 }
		

	}

}
