package models_studentdemo;

//Import Package For Scanner 
import java.util.Scanner; 

public class Information {
	// Information Class , which contains the information of student	
		Scanner scan = new Scanner(System.in);
		protected String name;
		protected int age;
		
	// Case 1: Use of Default Constructor Without Parameter
//		public Information() {
//			this.name = "Raghab";
//			this.age = 20 ; 
//		}
		
	// Case 2: Use of constructor with passing parameter 
//		public Information(String name , int age) {
//			this.name = name;
//			this.age = age ; 
//		}
		
		
	// Case 3: Take Input from user 
	void acceptDetails() {
			System.out.print("Enter Your Name: ");
			this.name = scan.nextLine();
			System.out.print("Enter Your Age: ");
			this.age = scan.nextInt();		
		}
		
	 void displayDetails() {
			System.out.println("Student Name: " + this.name);
			System.out.println("Student Age: " + this.age);
		}
	}

