package com.filehandlingsofi;
import java.io.File; //Import File Class
import java.io.IOException; //import IOException to handle the error


//Write a program in Java to create a new file

public class CreateFile {

	public static void main(String[] args) throws IOException {
		
		try {
// note: to create a file in a specific directory requires permission, so specify the path of the file and use double backslashes"\\"
			File file = new File("C:\\java program\\sofi_txt1");
//And to create a new file we use, createNewFile() method
			file.createNewFile();
			System.out.println("An empty file created successfully......");
		     }catch(IOException ex) {
			 System.out.println(ex.getMessage());
			 ex.printStackTrace();
		}
	}

}
