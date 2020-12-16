package com.filehandlingsofi;

import java.io.FileWriter;
import java.io.IOException;

//Write a program in java to write to a file 

//Using FileWriter class with its write() method to write some text in the file, that i have created already
//When done with writing file , I use close() method to close it. 

public class WriteToFile {

	public static void main(String[] args) throws IOException {
		try {
			FileWriter wt = new FileWriter("C:\\java program\\sofi_txt1");
			wt.write("I am learning file handling.");
			wt.close();
			System.out.println("Succefully i wrote to the file......");
		}catch(IOException ex) {
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}

	}

}
