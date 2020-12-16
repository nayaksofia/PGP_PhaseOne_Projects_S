package models_studentdemo;

//Marks Class 
public class Marks extends Information {
	// No need to use here too : Scanner scan = new Scanner(System.in);
	protected float objectiveMarks;
	protected float subjectiveMarks;
	
	
	 void acceptDetails() {
		super.acceptDetails();
		System.out.print("Enter Your Objective Marks: ");
		this.objectiveMarks = scan.nextFloat();
		System.out.print("Enter Your Subjective Marks: ");
		this.subjectiveMarks = scan.nextFloat();		
	}
	
	
	void displayDetails() {
		super.displayDetails();
		System.out.println("Objective Marks: " + this.objectiveMarks);
		System.out.println("Subjective Marks: " + this.subjectiveMarks);
	}
	
}