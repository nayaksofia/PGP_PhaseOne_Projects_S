package com.serialization;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class DeserializationExample {

	public static void main(String[] args) {
		Employee emp = null; 
		
		try {
			FileInputStream fileIn = new FileInputStream("employee.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			emp = (Employee) in.readObject(); //Type Casting
			System.out.println("Deserialization Completed Successfully.... ");
			System.out.println(emp);
			in.close();
			fileIn.close();
			
		} catch (Exception e) {
			
		}
	}

}

//Note: You can notice null in the employeeDesg because of using transient keyword used in Class Employee in that name 
