package com.fileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileHandlingDemoThree {

	public static void main(String[] args) throws IOException {
		//use try...catch 
		
		try {
			File file = new File("C:\\java program\\data.txt"); //creating file 
			FileInputStream fis= new FileInputStream(file);
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);
			String data;
			while((data = br.readLine()) != null) {
					System.out.println(data);
			} 
			br.close();
			
			}catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
			
	}	

}


