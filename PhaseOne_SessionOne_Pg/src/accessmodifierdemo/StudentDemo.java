package accessmodifierdemo;
import models_studentdemo.*;
import java.util.Scanner;  //Import Package For Scanner 

public class StudentDemo {

	public static void main(String[] args) {
		
		// create an object of the class Information
//		Information obj = new Information();
//		obj.acceptDetails();
//		obj.displayDetails();
      //System.out.println(obj.name);
		
		// create an object of the Mark Class
//		Marks mrk = new Marks();
//		mrk.acceptDetails1();
//		mrk.displayDetails1();

// To use inheritance, we have to create object of the latest child class 
		
		Result obj = new Result();	
		obj.acceptDetails();
		obj.displayDetails();
		obj.calculate();
		
		

	}

}
