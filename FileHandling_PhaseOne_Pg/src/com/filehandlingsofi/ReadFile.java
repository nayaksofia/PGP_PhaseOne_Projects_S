package com.filehandlingsofi;

import java.io.File;
import java.io.FileNotFoundException; //import this class to handle error
import java.util.Scanner;

//Write a program in java to read file 
//Using Scanner class to read the context of the text file 

public class ReadFile {

	public static void main(String[] args) throws FileNotFoundException {
		try {
			File rd = new File("C:\\java program\\sofi_txt1");
			Scanner reader = new Scanner(rd);
			while(reader.hasNextLine()) {
				String data = reader.nextLine();
				System.out.println(data);
			}
			reader.close();
		 } catch(FileNotFoundException ex) {
			System.out.println(ex.getMessage());
			ex.printStackTrace();
		}
	}

}
