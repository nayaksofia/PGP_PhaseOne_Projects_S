package com.filehandlingsofi;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

//Writ a program in java to append to a file
//I use FileOutPutStream to append data to a file 
//append meaning: to add something to the end of a piece of writing [dictionary]
public class AppendFile {

	public static void main(String[] args) throws IOException { 
		//WE can replace catch block with throws keyword
		try {
			OutputStream os = new FileOutputStream (new File("C:\\java program\\sofi_txt1"), true);
			//true defines that the file is ready to append
			String data = "Happy Learning!!!!!!!!!";
			os.write(data.getBytes(),0,data.length() );
			os.close();
			System.out.println("File appended successfully...........");
		} catch(IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

}
